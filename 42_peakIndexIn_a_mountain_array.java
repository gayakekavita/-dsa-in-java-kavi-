/*
852. Peak Index in a Mountain Array
Solved
Medium
Topics
Companies
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peakindex=-1;
        
        for (int i=0;i<arr.length-1;i++)
        {

                if (arr[i] > arr[i + 1]) {
                peakindex = i;
                break; // Break out of the loop as soon as peak is found
            }
        }
        return peakindex;
    }
}


//solution 2::

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int  i=0;
        
         while(arr[i]<arr[i+1])
         {
                i++;
         }
        return i;
    }
}


//Time complexity of both the solution is O(n) 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // Peak is in the left half (including mid)
                high = mid;
            } else {
                // Peak is in the right half (excluding mid)
                low = mid + 1;
            }
        }
        // When low == high, we have found the peak index
        return low;
    }
}
