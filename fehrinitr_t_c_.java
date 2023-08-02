import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Fehrinite = ");
		float fehrinite = input.nextFloat();
		
		float celcius = (fehrinite - 32) * 5/9;
		System.out.println("Celcius = " + celcius);
		
		
	}
}