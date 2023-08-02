import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n = input.nextInt();
		int fac = 1;
		for(int i = 1; i <= n; i++){
			fac = fac * i;
			
			}
			System.out.println("Factorial "+n +" = "+fac);
		
	}
	
}