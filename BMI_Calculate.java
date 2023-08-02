import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight;
		double height;
		double BMI;
		
		System.out.print("Enter the value of weight in Kilograms :- ");
		weight = input.nextDouble();
		System.out.print("Enter the value of height in meters :- ");
		height = input.nextDouble();
		
		BMI = weight / (height * height);
		System.out.println("Your BMI = "+ BMI);
		
		
	}
}