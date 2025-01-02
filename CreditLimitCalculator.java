import java.util.Scanner;
public class CreditLimitCalculator{
public static void main(String[] marz){
Scanner input = new Scanner(System.in);
int accountNumber = 1112;

int initialBalance = 7000;

int itemsCharged = 4000;

int creditsApplied = 5000;

int allowedCreditLimit = 10000;

int newBalance = 0;


System.out.print("Enter your account number: ");
accountNumber = input.nextInt();

if (accountNumber == 1112){
System.out.print("Enter amount charged for items: ");
itemsCharged = input.nextInt();

System.out.print("Enter amount of credit applied: ");
creditsApplied = input.nextInt();

newBalance = initialBalance + itemsCharged - creditsApplied;
System.out.printf("%s%d","Your new balance is:", +newBalance);

if (newBalance <= allowedCreditLimit){
System.out.println("GRANTED");
}
if (newBalance <= 0){
System.out.print("Credit limit exceeded");}
}else {
System.out.println("Invalid account number.");}



      }




}