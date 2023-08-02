import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Celcius = ");
		float celcius = input.nextFloat();
		
		float fehrinite = (celcius * 9/5) + 32;
		System.out.println("Fehrinitr = " + fehrinite);
		
		
	}
}