/*
167. Two Sum II - Input Array Is Sorted
Medium
Topics
Companies
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 

Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
*/

//solution 1: Bruete Force Approch  Time complexity: O(N2)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
           for(int i=0;i<numbers.length;i++)
           {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                { 
                    return new int[]{i+1,j+1};
                }
            }
           }
           return new int[]{-1,-1};
    }
}

/* implementation 
Sure, let's go through the code and understand how it calculates the output for the given input step-by-step.

### Input
- `numbers = [2, 7, 11, 15]`
- `target = 9`

### Code Explanation

1. **Outer Loop (`i` Loop)**: Iterate over each element in the `numbers` array.
2. **Inner Loop (`j` Loop)**: For each element at index `i`, iterate over each subsequent element in the `numbers` array.
3. **Check Condition**: If the sum of `numbers[i]` and `numbers[j]` equals the `target`, return the indices `i+1` and `j+1` (1-based index).
4. **Return Default**: If no such pair is found, return `[-1, -1]`.

### Steps

1. Initialize `i` to 0 (first element in the array):
    - `numbers[i] = 2`

2. Enter the inner loop with `j` starting from `i+1` (next element):
    - `j = 1`
    - `numbers[j] = 7`

3. Check if `numbers[i] + numbers[j] == target`:
    - `numbers[0] + numbers[1] == 2 + 7 == 9`
    - Since `9` equals the target `9`, the condition is true.

4. Return the indices `i+1` and `j+1`:
    - `i+1 = 0+1 = 1`
    - `j+1 = 1+1 = 2`
    - The result is `[1, 2]`

### Output
- The function returns `[1, 2]`.

### Visualization of the Process

| Step | `i` | `numbers[i]` | `j` | `numbers[j]` | `numbers[i] + numbers[j]` | Result |
|------|-----|--------------|-----|--------------|---------------------------|--------|
| 1    | 0   | 2            | 1   | 7            | 9                         | [1, 2] |

Since the condition is met in the first comparison, the function returns `[1, 2]` without continuing further.
*/

//solution 2:: better solution  Time complexity :O(N)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<numbers.length;i++)
           {
             if(map.containsKey(numbers[i]))
             {
                       return new int[]{map.get(numbers[i])+1, i+1};
             }
             else
             {
                 map.put(target-numbers[i],i);
             }
           }
           return new int[]{-1,-1};
    }
}
