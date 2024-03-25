import java.util.Arrays; 

class Solution {
    public boolean isAnagram(String s, String t) {
        //convert the strings into a character array to sort
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        //sort the characters in the string to make for easy comparison
        Arrays.sort(string1);
        Arrays.sort(string2);

        //convert back into a string
        String sortedString1 = new String(string1);
        String sortedString2 = new String(string2);

        //compare the strings
        if (sortedString1.compareTo(sortedString2)==0){
            return true;
        }else{return false;}

    }
    //Accepted on leetcode with the following feedback: Your last submission beat 75% of other submissions' runtime.
    //TODO: Add a main and the provided test cases
}