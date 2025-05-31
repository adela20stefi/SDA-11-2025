public class Solution {
    /**
     * Returns true if n is a power of two, false otherwise.
     * @param n the integer to check
     * @return boolean indicating if n is a power of two
     */
    public int isPowerOfTwo(int n) {
        // A power of two has exactly one bit set in its binary representation
        // n > 0 ensures we don't consider negative numbers or zero
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] testCases = {1, 2, 3, 4, 16, 18, 0, -2};
        for (int n : testCases) {
            System.out.println("isPowerOfTwo(" + n + ") = " + sol.isPowerOfTwo(n));
        }
    }
}