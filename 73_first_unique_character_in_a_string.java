/*
387. First Unique Character in a String
Easy
Topics
Companies
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
*/

//solution:;
class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int [26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}

//step by step implementation::
Sure! Let's go through the steps to understand how the `firstUniqChar` method works with the input `s = "leetcode"`.

### Step-by-Step Calculation

1. **Initialization:**
   ```java
   int arr[] = new int[26];
   ```
   This creates an array `arr` of size 26 (since there are 26 letters in the English alphabet) and initializes all elements to 0.

2. **First Loop - Count Frequency:**
   ```java
   for (int i = 0; i < s.length(); i++) {
       arr[s.charAt(i) - 'a']++;
   }
   ```
   This loop iterates over each character in the string `s` and updates the count of each character in the `arr` array.

   - For `i = 0`, `s.charAt(i) = 'l'`:
     - `arr['l' - 'a']` → `arr[11]++` → `arr[11]` becomes 1.
   - For `i = 1`, `s.charAt(i) = 'e'`:
     - `arr['e' - 'a']` → `arr[4]++` → `arr[4]` becomes 1.
   - For `i = 2`, `s.charAt(i) = 'e'`:
     - `arr['e' - 'a']` → `arr[4]++` → `arr[4]` becomes 2.
   - For `i = 3`, `s.charAt(i) = 't'`:
     - `arr['t' - 'a']` → `arr[19]++` → `arr[19]` becomes 1.
   - For `i = 4`, `s.charAt(i) = 'c'`:
     - `arr['c' - 'a']` → `arr[2]++` → `arr[2]` becomes 1.
   - For `i = 5`, `s.charAt(i) = 'o'`:
     - `arr['o' - 'a']` → `arr[14]++` → `arr[14]` becomes 1.
   - For `i = 6`, `s.charAt(i) = 'd'`:
     - `arr['d' - 'a']` → `arr[3]++` → `arr[3]` becomes 1.
   - For `i = 7`, `s.charAt(i) = 'e'`:
     - `arr['e' - 'a']` → `arr[4]++` → `arr[4]` becomes 3.

   After the first loop, the `arr` array looks like this:
   ```
   [0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0]
   ```

3. **Second Loop - Find First Unique Character:**
   ```java
   for (int i = 0; i < s.length(); i++) {
       if (arr[s.charAt(i) - 'a'] == 1) {
           return i;
       }
   }
   ```
   This loop iterates over each character in the string `s` again and checks if its frequency in the `arr` array is 1.

   - For `i = 0`, `s.charAt(i) = 'l'`:
     - `arr['l' - 'a']` → `arr[11] == 1` (True) → Return `i = 0`.

Since the character `'l'` at index 0 is the first character with a frequency of 1, the method returns `0`.

### Output

For the input `s = "leetcode"`, the output is `0`, indicating that the first unique character is at index 0.
