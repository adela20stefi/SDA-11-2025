public class Solution {
    /**
     * Returns true if n is a power of two, false otherwise.
     * @param n the integer to check
     * @return boolean indicating if n is a power of two
     */
    public static void printTriangle(int noOfRows) {
        int count = 1;
        for (int row = 1; row <= noOfRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        int noOfRows = 9; 
        printTriangle(noOfRows);
    }
}