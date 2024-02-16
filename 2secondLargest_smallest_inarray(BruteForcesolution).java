 import java.util.Arrays;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int largest= a[n-1];
        int count=0;
        int arr[]=new int[2];
        for(int i=n-2;i>=0;i++)
        {
            if(a[i]!= largest && a[i]<largest)
            {
                arr[count]=a[i];
                count++;
                break;
            }
        }
        int small= a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]!= small && a[i]>small)
            {
                arr[count]=a[i];
                count++;
                break;
            }
        }

        return arr;
    }
}
