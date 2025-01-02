import java.util.Scanner;
public class Divide{
public static void main(String[] marz){
int count = 2;
System.out.println("Enter Two float digits:");

Scanner input  = new Scanner(System.in);

float number = input.nextFloat();
float number1 = input.nextFloat();


if (number1 == 0){
System.out.print('0');
}else{
	float division = number/number1;
	System.out.printf("%s %f %n","Result:", division);
}


}






}