/*
744. Find Smallest Letter Greater Than Target
Easy
Topics
Companies
Hint
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
*/
//solution 1

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low=0;
        int high=letters.length -1;
        while(low<=high)
        {
            int mid= low+(high-low)/2;
            if((int)letters[mid] > (int)target)
            {
                 high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
         // Since the array is circular, we return the first element if low is out of bounds.
        return letters[low % letters.length];
    }
}

/*Explanation*

  Sure, let's go through the step-by-step calculation of the corrected code for the test case where `letters = ["c", "f", "j"]` and `target = "c"`.

### Initial Setup
- `letters = ["c", "f", "j"]`
- `target = "c"`
- `low = 0`
- `high = 2` (since `letters.length - 1 = 2`)

### Iteration 1
1. **Calculate `mid`:**
   - `mid = low + (high - low) / 2`
   - `mid = 0 + (2 - 0) / 2`
   - `mid = 1`

2. **Compare `letters[mid]` with `target`:**
   - `letters[mid] = letters[1] = "f"`
   - `target = "c"`
   - Since `"f" > "c"`, update `high`:
     - `high = mid - 1`
     - `high = 1 - 1`
     - `high = 0`

### Iteration 2
1. **Calculate `mid`:**
   - `mid = low + (high - low) / 2`
   - `mid = 0 + (0 - 0) / 2`
   - `mid = 0`

2. **Compare `letters[mid]` with `target`:**
   - `letters[mid] = letters[0] = "c"`
   - `target = "c"`
   - Since `"c" <= "c"`, update `low`:
     - `low = mid + 1`
     - `low = 0 + 1`
     - `low = 1`

### End of Loop
- The loop ends because `low` is no longer less than or equal to `high` (`low = 1` and `high = 0`).

### Return Statement
- Since `low` is within bounds, we return `letters[low % letters.length]`:
  - `letters[1 % 3]`
  - `letters[1] = "f"`

Thus, the function returns `"f"`.

### Summary of Steps:
1. Initial setup: `low = 0`, `high = 2`
2. Iteration 1: `mid = 1`, `letters[1] = "f"`, update `high = 0`
3. Iteration 2: `mid = 0`, `letters[0] = "c"`, update `low = 1`
4. End of loop: `low = 1`, return `letters[1] = "f"`

The output is `"f"` as expected. */
