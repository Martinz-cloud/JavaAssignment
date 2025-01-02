import java.util.Scanner;
        public class LargestAndSmallest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
        System.out.print("Prompt user to enter first integer:");
    	int integer1  = input.nextInt();
	
        System.out.print("Prompt user to enter second integer:");
    	int integer2  = input.nextInt();

        System.out.print("Prompt user to enter third integer:");
    	int integer3  = input.nextInt();

      	System.out.print("Prompt user to enter fourth integer:");
    	int integer4  = input.nextInt();

        System.out.print("Prompt user to enter fifth integer:");
    	int integer5  = input.nextInt();

	int largest = integer1;
	int smallest = integer1;

	if (integer2 > largest){ largest = integer2;
	if (integer3 > largest){ largest = integer3;
	if (integer4 > largest){ largest = integer4;
	      }
}
}
else{ integer4 = largest;

        if (integer2 < smallest){ smallest = integer2;
	if (integer3 < smallest){ smallest = integer3;
	if (integer4 < smallest){ smallest = integer4;

	}
}
}
}
       	System.out.println("Largest Integer:" + largest);
	System.out.println("Smallest Integer:" + smallest);







}
















}



