class Solution {
    public boolean isPalindromic(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            String binary = Integer.toBinaryString(value);

            // Add leading zeros until length becomes 8
            while (binary.length() < 8) {
                binary = "0" + binary;
            }

            ans += binary;
        }

        return isPalindrom(ans);
    }

    public boolean isPalindrom(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } 
            left ++;
            right --;
        }

        return true;
    }
}