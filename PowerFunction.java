import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		System.out.print("Enter value of n :- ");
		int n = input.nextInt();
		System.out.print("Enter power :- ");
		int p = input.nextInt();
		int val = 1;
		
		for(int i = 0; i < p; i++){
				val = val * n;	
		}
		System.out.print("Power = " + val);
		
	}
}