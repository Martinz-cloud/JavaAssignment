public class ArrayKata4{
public static void main(String[] args){

int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int total = 0;

System.out.println("THe even numbers are:");

for (int index = 0; index < numbers.length; index++){
if (numbers[index] % 2 == 0){
System.out.printf("%s%d",",", numbers[index]);
total += numbers[index];
}
}
System.out.printf("%nThe total of the even numbers is:%d%n", total);

     }



}