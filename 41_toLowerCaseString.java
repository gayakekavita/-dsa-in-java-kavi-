/*
 709. To Lower Case
Solved
Easy
Topics
Companies
Hint
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
*/
//solution 1: using built in function
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}


//solution 2: without using built in function:
   /*
     by convertiong string into array 
     here firstly we are convertng a string into array 
     input :: "Hello"
     
    after conversion of string into array it looks like :
     [H,e,l,l,o]

   then it will check for whether the given character is small or capital
   A=65
   Z=90 


   suppose given character is : A 
   if we want to convert it into lowercase then we have to add 32 in it because 
    A=65 
    a=97 
   so diff= 97-65=32 

  at last it converts array into string and then it returns string .
*/
class Solution {
    public String toLowerCase(String s) {
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>=65 && c[i]<=90)
            {
               c[i]= (char)(c[i]+32);
            }
        }
        return String.valueOf(c);
    }
}
