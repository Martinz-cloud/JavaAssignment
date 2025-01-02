import java.util.Scanner;
	public class TriangleArea{
        public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter point1 :");
	double point1 = input.nextDouble();
	 
	System.out.print("Enter point2");
	double point2 = input.nextDouble();

	System.out.print("Enter point3");
        double point3 = input.nextDouble();
	
     	
	double s = (point1 + point2 + point3) / 2;
	System.out.print("s is:" + s);
	double value = s * (s - point1) * (s - point2) * (s - point3);
	
	double area = Math.sqrt(value);
	System.out.println("The area of the triangle is:" + area);


}












}
      
  