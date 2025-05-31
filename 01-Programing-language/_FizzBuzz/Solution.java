public class Solution {
    /**
    * Prints numbers from 1 to 100, replacing multiples of 3 with "Fizz",
    * multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
    */
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
    * Main method to run the FizzBuzz program.
    * @param args command line arguments
    */
    public static void main(String[] args) {
        fizzBuzz();
    }

}