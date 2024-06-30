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
Input: nums = [5,7,7,8,8,10], target = 8
  1. low=0
     high= 5
     while ( low<high)
           (0<5)
            mid= low+(high-low)/2;
               =0+(5-0)/2
               =5/2
               =2
           if( nums[mid] <target)
                 7<8 
                 low= mid+1
                    =2+1
                    =3 

    2. low=3
       high=5
       while(3<5)
                 mid= low+(high-low)/2
                    = 3 +(5-3)/2
                    = 3 + 1
                    =4
                    if(nums[4] <target)
                       8<8 
                       high= mid
                           =4
      3. low=3 
         high= 4
         while(3<4)
                  mid= low+ (high-low)/2
                     = 3+ (4-3)/2
                     =3 + (1)/2
                     =3 + (0.5)
                     =3
                  if(nums[mid]<target)
                      8<8
                        {
                        }
                        else
                       {
                          high=3
                       }
     4. low=3
        high =3
        while(3<3){
       }
       //here 3<3 condition state to false .
     5. so here we are checking wheter the element present at low index is equal to target or not .
         
  
