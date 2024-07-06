class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // handle zero and negative numbers
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
