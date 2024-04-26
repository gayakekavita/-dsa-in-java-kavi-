import java.util.*;
public class Solution {
public static void find(int n) {
    int num = n;
    int reversed = 0;
    int original = n;

    // Reverse the number
    while (n != 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n = n / 10;
    }

    // Check if the original number is equal to the reversed number
    if (original == reversed) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		find(n);
		
	}
}
