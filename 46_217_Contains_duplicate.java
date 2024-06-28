/*

when we will solve this problem using brute force approch then its time complexity will be O(n2)

*/
/*
Problem::
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
// solution 1:: using brute force approch 
/*
below solution gives correct result 
but its time complexity will be O(n2)
also it will give error for large number of array elements 
it gives error of "time limit exceeds" for the large number of array elements 
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}

//solution 2:: using built in method of sorting 
/*
   --here supose array is : nums[1,2,3,4,1]
  --here firstly we sort array using Arrays.sort() method then nums will look  like as below::
   Arrays.sort(nums) ;
   nums=[1,1,2,3,4]
 -- then we compare current element with next element based on that return true  or false 
   nums[i]==nums[i+1]
     return true 

  --return false 

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {

          Arrays.sort(nums);
          for(int i=0;i<nums.length-1;i++)
          {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
          }
        return false;
        
    }
}


/*
 --For performing sorting operation using Arrays.sort() will require "O(n)" time complexity .
    and for  below part of code require "(log n)" time complexity .

   for(int i=0;i<nums.length-1;i++)
          {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
          }

 --so overall time complexitty is :: "O(n log n)" 
*/


//solution 3:: using list

     List<Integer>  l2=new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            if(l2.contains(nums[i]))
            {
                return true;
            }
            else
            {
                l2.add(nums[i]);
            }
        }
        return false;
  
