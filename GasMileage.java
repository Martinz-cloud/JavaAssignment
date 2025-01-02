import java.util.Scanner;
public class GasMileage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int totalMiles = 0;
int totalGallons = 0;
int counter =  0;
for (counter += 1; counter <= 10; counter++){

System.out.println("Enter miles:");
int miles = input.nextInt();

System.out.println("Enter gallons");
int gallons = input.nextInt();           
if (gallons != 0){
int milePerGallon = miles / gallons;   
System.out.print("The miles per gallon is:" + milePerGallon);
}else{
System.out.print("Gallon can not be zero");
}
 
while (miles <= 10 && gallons <= 10){ counter +=1;
System.out.print("Total amount of mile & gallons"+miles+" "+gallons);
miles++;
gallons++;
counter++;
}           
}

              }
}
