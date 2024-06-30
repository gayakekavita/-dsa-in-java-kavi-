/*
34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
*/

//solution 1:: time complexity "O(N)".
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        int firstpos=-1;
        int lastpos=-1;
        for(int i=0;i<n;i++)
        {
            if(firstpos==-1)
            {
              if(nums[i]==target)
              {
                  firstpos=i;

              }
            }
           
              if(nums[i]==target)
              {
                  lastpos=i;
              }
         
        }
        arr[0]=firstpos;
        arr[1]=lastpos;
        return arr;
        
    }
}

//solution 2:: using binary search  time complexity "O(log n)" .
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] res = new int[2];
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        // Find the first occurrence of target
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        // Check if target is not found
        if (nums[low] != target) {
            return new int[] {-1, -1};
        }
        res[0] = low;

        // Find the last occurrence of target
        high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2; // Adjust mid calculation to avoid infinite loop
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        res[1] = high;
        return res;
    }
}


// implementation::
For the input: nums = [5,7,7,8,8,10], target = 8

Finding the first occurrence of the target:

Initial low = 0, high = 5
First iteration:
mid = low + (high - low) / 2 = 0 + (5 - 0) / 2 = 2
nums[mid] = nums[2] = 7
Since nums[mid] < target (7 < 8), update low = mid + 1 = 2 + 1 = 3

    
Second iteration:
low = 3, high = 5
mid = low + (high - low) / 2 = 3 + (5 - 3) / 2 = 4
nums[mid] = nums[4] = 8
Since nums[mid] >= target (8 >= 8), update high = mid = 4

    
Third iteration:
low = 3, high = 4
mid = low + (high - low) / 2 = 3 + (4 - 3) / 2 = 3
nums[mid] = nums[3] = 8
Since nums[mid] >= target (8 >= 8), update high = mid = 3

    
Fourth iteration:
low = 3, high = 3
The while loop terminates since low is not less than high.
Check if the element at low is the target:
nums[low] = nums[3] = 8, which is equal to the target.
Set res[0] = low = 3

    
Finding the last occurrence of the target:

Reset high = 5, keep low = 3
First iteration:
mid = low + (high - low + 1) / 2 = 3 + (5 - 3 + 1) / 2 = 4
nums[mid] = nums[4] = 8
Since nums[mid] <= target (8 <= 8), update low = mid = 4
Second iteration:
low = 4, high = 5
mid = low + (high - low + 1) / 2 = 4 + (5 - 4 + 1) / 2 = 5
nums[mid] = nums[5] = 10
Since nums[mid] > target (10 > 8), update high = mid - 1 = 5 - 1 = 4
Third iteration:
low = 4, high = 4
The while loop terminates since low is not less than high.
Set res[1] = high = 4
So the final result is res = [3, 4]
           
         
         
  
