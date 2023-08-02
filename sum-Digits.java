import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number :- ");
		int n = input.nextInt();
		int r = 0;
		int sum = 0;
		
		while(n > 0){
				
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		
			}
			
			System.out.print("Sum of Digits of Number = " + sum);
		
		
	}
}