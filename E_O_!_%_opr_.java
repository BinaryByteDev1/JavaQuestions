import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n = input.nextInt();
		
		int d = n / 2;
		int m = d * 2;
		if(n == m){
			
			System.out.print(n+" is Even Number.");
			}
			else{
				System.out.print(n+" is odd Number.");
				
				}
		
		
	}
}