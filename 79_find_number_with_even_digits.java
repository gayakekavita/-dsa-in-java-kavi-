/*
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
*/
//solution::

class Solution {
    public int findNumbers(int[] nums) {
        
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int n= nums[i];
            while(n>0)
            {
                n=n/10;
                count++;
            }
            if(count%2==0)
            {
                res++;
            }
        }

     return res;   
    }
}

//solution 2
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
/*
Explanation:
String Conversion: Convert each number to a string using String.valueOf(num).
Length Check: Check if the length of the string representation of the number is even using .length() % 2 == 0.
For-Each Loop: Use a for-each loop for more concise and readable code.
This approach leverages the efficiency of string operations in Java and simplifies the digit-counting logic.

*/
