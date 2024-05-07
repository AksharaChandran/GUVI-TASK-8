import java.math.BigInteger;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        int number = 3; // The number whose factorial to compute

        // Initialize a BigInteger object with value 1 to store the factorial
        BigInteger factorial = BigInteger.ONE;

        // Compute the factorial using a loop
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Print the factorial
        System.out.println("Factorial of " + number + " is:");
        System.out.println(factorial);
    }
            }





