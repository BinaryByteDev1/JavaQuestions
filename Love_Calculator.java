import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Name :- ");
		String your_name = input.next();
		
		System.out.print("Enter your Lover Name :- ");
		String lover_name = input.next();
		
		int persnt = (int)(Math.random()*100);
		
		System.out.print(lover_name+" love " + persnt + "%" + " with "+your_name);
	}
}