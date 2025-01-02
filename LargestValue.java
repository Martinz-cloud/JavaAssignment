import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int largest = 0;
        int secondLargest = 0;

        System.out.println("Enter 10 numbers:");
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number " + counter + ": ");
            int temp = input.nextInt();
            
            if (temp > largest) {
                secondLargest = largest;
                largest = temp;
            } else if (temp > secondLargest && temp != largest) {
                secondLargest = temp;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
