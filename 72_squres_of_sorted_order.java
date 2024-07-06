/*
Problem Description::
977. Squares of a Sorted Array
Solved
Easy
Topics
Companies
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
*/
//solution 1: brute force approch 

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
          Arrays.sort(nums);
         return nums;
    }
}

//solution

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right = nums.length-1;
        int i= nums.length-1;
        int[] result=new int [nums.length];
        while(left<=right)
        {
            if(Math.abs(nums[left])> Math.abs(nums[right])) {
                result[i]= nums[left]*nums[left];
                left++;
            }
            else
            {
                result[i]=nums[right]*nums[right];
                right--;
            }
            i--;
        }
        return result;
    }
}


//solution:: 2
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n];

        int left = 0, right = n-1, end = n-1;

        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[end--] = nums[left] * nums[left];
                left++;
            }
            else {
                ans[end--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}
