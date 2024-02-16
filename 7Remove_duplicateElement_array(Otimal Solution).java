 import java.util.HashSet;
 import java.util.Set;
 import java.util.Arrays;
///here we are using two pointer concept  index  starts from 0 and moving forward based on condition and second pointer is j which iterate the array.
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int index=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=arr[index])
            {
                arr[index+1]=arr[j];
                index++;
            }
        }
        return index+1;
    }
}
