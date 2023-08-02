import java.util.Scanner;
public class Main {
	
	public static void add(int a , int b) {
			
			int c =  a + b;
			System.out.println("Sum of "+a+" + "+b+" = "+c);
			
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a :- ");
		int a  = input.nextInt();
		System.out.println("Enter value of b :- ");
		int b = input.nextInt();
		
		add(a , b);
		//System.out.println("Sum of a + b = "+add(a , b));
		
		add(100 , 19);
			
		
	}
}