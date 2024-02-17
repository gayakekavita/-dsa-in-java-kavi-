/* 
 input:
 arr=4,5,6,8,9
 after one space rotate 
 output:
 arr=5,6,8,9,4
*/
import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;

    }



 /*  
 
 time complexity:O(N)
 space complexity:O(N)+O(1)
 where O(1) is extra space required to solve the problem.
 
 
 */
}
