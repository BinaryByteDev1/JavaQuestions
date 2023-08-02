import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of number 1 :- ");
		num1 = input.nextInt();
		System.out.print("Enter the value of number 2 :- ");
		num2  = input.nextInt();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Value of number 1 = " + num1);
		System.out.println("Value of number 2 = " + num2);
		
		 		//Swaping//
		 	num1 = num1 + num2;
		 	num2 = num1 - num2;
		 	num1 = num1 - num2;
		 	
		System.out.println(" ");
		System.out.println(" ");
		 	
		System.out.println("Value of number 1 = " + num1);
		System.out.println("Value of number 2 = " + num2);
		 	
		 
		
	}
}