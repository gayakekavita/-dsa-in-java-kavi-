/*
we can solve this problem using 1. linear search 
                                2.Binary search

here time complexity of linear search is "O(n)" which is not a good time complexity so we will use binary search here 
-- time complexity of binary search is "O(log n)".

 we will solve this problem using binary search .


 Description::
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
*/

class Solution {
    public int findMin(int[] nums) {

         int low = 0;
         int high = nums.length - 1;
         int minele = nums[0]; // Initialize with the first element
         
         while (low < high) {
             int mid = (low + high) / 2;
             
             if (nums[mid] > nums[high]) {
                 // Minimum element must be to the right of mid
                 low = mid + 1;
             } else {
                 // Minimum element is at mid or to the left of mid
                 high = mid;
             }
         }
         
         // After the loop, low should be the index of the minimum element
         minele = nums[low];
         
         return minele;
    }
}
