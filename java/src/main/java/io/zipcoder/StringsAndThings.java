package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input)
    {
        int length= input.length(); // finding the total length of the string
        int count = 0; // Initialize a counter to count the number of words ending with 'y' or 'z'
        char charAT = input.charAt(i); // Get the  character of the string

        for (int i = 0; i < length; i++) 
        { // Loop through each character in the string
            if (i == length - 1 || !Character.isLetter(input.charAt(i + 1))) 
            { // Check if it's the last character or not followed by a letter
                    if (charAT == 'y' || charAT == 'z') 
                    { // Check if the character is 'y' or 'z'
                    if (i == input.length() - 1 || !Character.isLetter(input.charAt(i + 1)))
                        {    count++; // Increment the counter
                        }
                    }
            } 
        return count; // return final value of count

        }
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove)
    {  
        int i = 0;
        int baseLength = base.length();
        int removeLength = remove.length();
        String string = ""; // result string
    
  
    while (i < baseLength) 
    {
        // Check if the substring starting at i matches the remove string (case-insensitive)
            if (i + removeLength <= baseLength && baseLower.substring(i, i + removeLength).equals(removeLower)) 
            {
            i += removeLength;  // skip this remove substring
            } 
            else {
            string += base.charAt(i);  // add current char to result
            i++;
            }
    }
    
    return string;
}

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int countIs = 0;
        int countNot = 0;
        String lowerInput = input.toLowerCase();
        Int length = lowerInput.length();
        Boolean result;

        for (int i = 0; i < length - 1; i++) 
            { if (lowerInput.substring(i, i + 2).equals("is")) 
            { // Check for "is"
                countIs++;
            } else if (lowerInput.substring(i, i + 3).equals("not")) 
            { // Check for "not"
                countNot++;
            } 
            result = countIs == countNot; // Compare counts
        }
        

        return result;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input)
    {
        String lowerInput = input.toLowerCase();
        int length = lowerInput.length();
        

            for (int i = 0; i < length; i++) 
            {
                if (lowerInput.charAt(i) == 'g') 
            {   if ( lowerInput.charAt(i - 1) != 'g' && lowerInput.charAt(i + 1) != 'g') 
                { // Check if 'g' is not happy
                    return false; // Return false if any 'g' is not happy
                } 
            
            }
        // Return true if all 'g's are happy
        }
         return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0; // Initialize a counter to count the number of triples
        int length = input.length(); // Get the length of the input string
        string lowerInput = input.toLowerCase(); // Convert input to lowercase for case-insensitive comparison
        for (int i = 0; i < length-2; i++) 
        { // Loop through the string, stopping 2 characters before the end
            if (lowerInput.charAt(i) == lowerInput.charAt(i + 1) && lowerInput.charAt(i) == lowerInput.charAt(i + 2)) 
            { // Check if the current character is equal to the next two characters
                count++; // Increment the counter if a triple is found
            }
        }
        return count;
    }
}
