/*
278. First Bad Version
Solved
Easy
Topics
Companies
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1
*/
//solution
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n;
        while(left<right)
        {
             int mid=left + (right-left)/2;
             if(isBadVersion(mid))
             {
                right=mid;
             }
             else
             {
                left=mid+1;
             }
        }
        return left;
        
    }
}

//implementation::
nitial Setup
left = 0
right = 5
Step-by-Step Execution
1. First Iteration
Calculate mid:
java
Copy code
mid = left + (right - left) / 2;
    = 0 + (5 - 0) / 2;
    = 2;
Check if mid is a bad version:
java
Copy code
isBadVersion(2) -> false
Since mid is not a bad version, update left:
java
Copy code
left = mid + 1;
    = 2 + 1;
    = 3;
2. Second Iteration
Calculate mid:
java
Copy code
mid = left + (right - left) / 2;
    = 3 + (5 - 3) / 2;
    = 4;
Check if mid is a bad version:
java
Copy code
isBadVersion(4) -> true
Since mid is a bad version, update right:
java
Copy code
right = mid;
     = 4;
3. Third Iteration
Calculate mid:
java
Copy code
mid = left + (right - left) / 2;
    = 3 + (4 - 3) / 2;
    = 3;
Check if mid is a bad version:
java
Copy code
isBadVersion(3) -> false
Since mid is not a bad version, update left:
java
Copy code
left = mid + 1;
    = 3 + 1;
    = 4;
End of Loop
Now left equals right (left = 4 and right = 4), so the loop terminates.
Conclusion
The first bad version is at index left, which is 4.
Thus, the output is 4.

Summary of Function Calls
isBadVersion(2) -> false
isBadVersion(4) -> true
isBadVersion(3) -> false
This step-by-step breakdown matches the explanation given for Example 1 in the problem statement.
