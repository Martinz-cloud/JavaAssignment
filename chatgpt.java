import java.util.ArrayList;
import java.util.Scanner;

public class chatgpt {
    public static void main(String[] args) {
        // Create a dynamic array (ArrayList)
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to add to the array. Type 'done' to finish:");

        while (true) {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();

            // Check if the user wants to stop
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Parse the input and add it to the array
                int number = Integer.parseInt(input);
                array.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        // Print the array
        System.out.println("You entered the following integers: " + array);
    }
}
