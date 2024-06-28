/*
Problem Description::

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1

Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        char[] c=columnTitle.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            int num= c[i]-65+1;
            result= result*26+num;
        }
        return result;
        
    }
}

/*
  suppose columnTitle="AB"
  char[] c= columnTitle.toCharArray();
  c=[A,B]

  result=0
  num = 65-65+1
  result=0*26+1
        1

  num=66-65+1;
  result=1*26+2


  return result ;
  //result value is =28

  //1.here we are taking 65 for substraction to get its current position in number format 
   asci value of A is 65 so 
   65-65=0;
   but column number cant be 0 so its column position is 1 so we are adding 1 to it to find its position

   2. also we are calculating result as 
     result= result*26 + num
            because there are total 26 alphabets so we are multiplying by 26 and adding num for second ... n number of character 

   
   
*/
