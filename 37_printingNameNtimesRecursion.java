/*
Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG
*/
class Solution {

    void printGfg(int N) {
        
        // code here
        if(N==0)
        {
            return;
        }
        System.out.print("GFG" + " ");
        N-=1;
         printGfg( N);
        
    }
}
