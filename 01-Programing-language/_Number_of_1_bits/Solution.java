public class Solution {
    /**
     * Returns true if n is a power of two, false otherwise.
     * @param n the integer to check
     * @return boolean indicating if n is a power of two
     */
    public static int countOnes1(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static int countOnes2(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static int countOnes3(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOnes1(2));
        System.out.println(countOnes1(21));
        System.out.println(countOnes2(1));
        System.out.println(countOnes3(1));
    }
}