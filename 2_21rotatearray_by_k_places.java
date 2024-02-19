
/*
Problem statement
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.



Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.
*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list.add(arr.get(i));
        }

        for (int i = k; i < n; i++) {
            temp.add(arr.get(i));
        }

        int index = 0;
        for (int i = n - k; i < n; i++) {
            temp.add(i, list.get(index));
            index++;
        }

        return new ArrayList<>(temp);
    }
}
