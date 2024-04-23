/*
Problem statement
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.


Example:
Input: The character is 'a'.

Output: 0
*/

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner sc=new Scanner (System.in);
         char c=sc.next().charAt(0);
         int range=(int)c;
         if(range >= 65 && range<=90)
         {
             System.out.println(1);
         }
         else if(range>=97 && range<=122)
         {
             System.out.println(0);
         }
         else
         {
             System.out.println(-1);
         }

    }
}
