import java.util.Scanner;
public class  CompoundInterestCalculator{
public static void main(String... args ){

Scanner input = new Scanner(System.in);


System.out.print("Enter initial Investment: ");
 int initialInvestment = input.nextInt();

System.out.print("Enter monthly contribution: ");
int monthlyContribution = input.nextInt();

System.out.print("Enter length of time in years: ");
int timeInYears = input.nextInt();

System.out.print("Enter estimated interest rate:");
int estimatedInterestRate = input.nextInt();

System.out.print("Enter interest rate variance range: ");
int interestRateVarianceRange = input.nextInt();

String[] compoundFrequency = {"Daily", "Weekly", "Monthly", "yearly"};
int[] amountPerFrequency = {365, 48, 12, 1};
System.out.println("""


	0 = daily.
	1 = weekly.
	2 = monthly.
	3 = yearly. 

""");
    int compoundFrequencyIndex = input.nextInt();

    int amountPerFrequencyChoosen = amountPerFrequency[compoundFrequencyIndex];
System.out.println("ENTER PREFERED INTEREST RATE: ");
double interestRate = input.nextInt();


double totalAmount = initialInvestment;
for (int year = 0; year < timeInYears; year++){
totalAmount += totalAmount * interestRate / amountPerFrequencyChoosen;

totalAmount += monthlyContribution * 12;

}
System.out.println("Total return for " + interestRate + "  is  " + totalAmount);

    }






}