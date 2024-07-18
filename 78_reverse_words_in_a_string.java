/*
problem description::
151. Reverse Words in a String
Medium
Topics
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.



*/

//solution 
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
             sb.append(str[i]);
             sb.append(" ");
        }
        return sb.toString().trim();
    }
}

-- here we are splitiing string into string array using split function where we passed regex " +".
  -- This regex specifies that split string based on not only single space in the string but also it splits string based on the number of available spaces in the string .
  -- then we create a string var usnig stringbuilder class then we append it .
  -- for converting sb into string we use toString() functin and to remove trailing spaces we use trim function which removes spaces available at start and end of the string.
