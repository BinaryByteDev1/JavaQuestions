
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number :- ");
		int n = input.nextInt();
		
		int reverse = 0;
		int store = 0;
		
		for(int i  = n; i > 0; i = i / 10){
			
			reverse = i % 10;
			store = store * 10 + reverse;
			}
		
		
		if( n == store){
			System.out.print(store+" is a Plandrone Number");
			
			}
		else{
			System.out.print(store+" is Not a Plandrone Number");
			
			}
	}
}