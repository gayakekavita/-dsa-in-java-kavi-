 import java.util.HashSet;
 import java.util.Set;
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        Set<Integer> set=new HashSet<>();
        for(int element:arr)
        {
            set.add(element);

        }
        int index=0;
        for(int element :set)
        {
            arr[index]=element;
            index++;
        }
        return index;
    }
}
