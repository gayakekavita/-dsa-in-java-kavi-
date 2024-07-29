class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;

        while (start < end) {
            if (!isVowel(str[start])) {
                start++;
            } else if (!isVowel(str[end])) {
                end--;
            } else {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }

        return new String(str);  // Return the modified string
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
