
/*
Two sum leetcode problem::
 1. Two Sum

Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]




*/

//solution 1:
/*
      here we are solving this problem using brute force approch 
      here its time complexity is ::
        O(N2) because we are running two for loops here so its time complexity is O(N2).
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
        
    }
}




//solution 2:: using hashmap 
//Here its time complexity is  O(N)
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // A map to store the value and its index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // If the complement exists in the map, return the indices
                return new int[] { map.get(complement), i };
            }
            // Add the current value and its index to the map
            map.put(nums[i], i);
        }

      return new int[]{0,0};  //in case no solution is found 
       
    }
}

/*
 Input: nums = [2,7,11,15], target = 9

 intitialyy map is empty here ::
     Map<Integer, Integer> map = new HashMap<>();

 for first iteration   i=0, 
                       complement = target- nums[0];
                                  =9-2
                                  =7
                       if(map.containskey((7))
                       {
                            return new int[] { map.get(complement),i};
                       }
                        it state false because intially map[] is empty.

                        so we put nums[i], and its index 'i' into map 
                        so map:: [2:0]

for second iteration  i=1 
                     complement = target- nums[1];
                                  =9-7
                                  =2
                       if(map.containskey((2))
                       {
                            return new int[] { map.get(complement),i};
                       }

                       here return statement is executed because 2 is present in map [2:0]

---here we are storing array elements as the key of the map and we are storing arrays indexes as the value for the keys present in map.
                       
*/
