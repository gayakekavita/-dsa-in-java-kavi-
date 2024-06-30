// palindrome is a word or phrase or sentence that reads the same backwards as towards.
/*
Problem description::
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

/*
-- here we are converting string into lowercase using toLowerCase() function.
-- then we are creating a variable using StringBuilder class.
--  then we are checking for lowercase letters and numeric characters.
-- at last we are doing operation of checking whether given string is palindrome or not.
 
*/

import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();  //converting given string into lowercase 
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122 ||  s.charAt(i)>=48 && s.charAt(i)<=57)  //storing only lowercase letters and numbers . 
            {
                sb.append(s.charAt(i));
            }
        }
        for(int i=0;i<sb.length()/2;i++)
        {
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i))
            {
                return false ;
            }
        }
        return true;
    }
}
