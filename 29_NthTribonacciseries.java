/*
  1137. N-th Tribonacci Number
Solved
Easy
Topics
Companies
Hint
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

 

Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537
*/

class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> map=new HashMap<>();
     return trib(n,map);   
    }
    private int trib(int n,HashMap<Integer, Integer> map)
    {
        if(n==0 || n==1)
        {
            return n;

        }
        if(n==2)
        {
            return 1;
        }
        int key=n;
        if(map.containsKey(key))
        {
            return map.get(key);
        }

        int sum= trib((n-1),map)+trib((n-2),map)+trib((n-3),map);
        map.put(key,sum);
        return map.get(key);
    }
}
