import java.util.Scanner;

class HelloWorld {
    public static void bubble_sort(int[] arr, int n) {
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            count++;
            if (!swapped) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNumber of passes: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements do you want to store in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr, n);
    }
}
