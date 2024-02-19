import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        reverse_arr(arr,0,k-1);
        reverse_arr(arr,k,n-1);
        Collections.reverse(arr);
        return arr;
    }
    public static ArrayList<Integer> reverse_arr(ArrayList<Integer>ar ,int start,int end)
    {
         List<Integer> sublist = ar.subList(start, end+1);
         Collections.reverse(sublist);
         return new ArrayList<>(sublist);
    }
}
