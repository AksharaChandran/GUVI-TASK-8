import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);


        int age = 78;


        // Close the Scanner
        scanner.close();

        // Define the age threshold for senior citizenship
        int seniorCitizenAge = 60;

        // Check if the person is a senior citizen
        if (age >= seniorCitizenAge) {
            System.out.println("Congratulations! You are a senior citizen.");
        } else {
            System.out.println("You are not yet a senior citizen.");
        }
    }
}
