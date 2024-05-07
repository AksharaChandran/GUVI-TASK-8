public class Q5 {

    public static void main(String[] args) {

        int number = 11;

        boolean isPrime = true;

        // If the number is less than 2, it's not prime
        if (number < 2) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                                        isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}