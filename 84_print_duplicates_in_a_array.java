import java.util.*;

class HelloWorld {
    public static int[] findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean isDuplicate = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                isDuplicate = true;
                list.add(arr[i]);       
            } else {
                set.add(arr[i]);
            }
        }
        
        if (isDuplicate) {
            int[] myArray = new int[list.size()]; // Corrected the call to size()
            for (int i = 0; i < list.size(); i++) {
                myArray[i] = list.get(i); // Convert List to array manually
            }
            return myArray;
        }
        
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        int[] duplicates = findDuplicate(arr);

        // Print the duplicates array
        System.out.println(Arrays.toString(duplicates)); // Use Arrays.toString() for readable output
    }
}
