import java.util.Scanner;

public class MixedInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first string (taking input)
        System.out.println("Enter a String: ");
        String firstString = sc.nextLine();

        // Read the first integer
        System.out.println("Enter an integer: ");
        int firstInt = sc.nextInt();

         sc.nextLine();  // Clear the newline left after the integer input

        // Read second string

        System.out.println("Enter another String: ");
        String secondString = sc.nextLine();

        // Read second integer

        System.out.println("Enter another integer: ");
        int secondInt = sc.nextInt();
        sc.nextLine();  // Clear/eats the newline left after the integer input


        // Output the collected inputs:

        System.out.println("Strings: "+firstString+" and "+ secondString);
        System.out.println("Integers: "+firstInt+" and "+ secondInt);

        sc.close();


    }
}
