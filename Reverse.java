import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number :- ");
		int num = input.nextInt();
		
		int reverse = 0;
		int store = 0;
		
		for(int i = num; i > 0; i = i /10){
	
				reverse = i % 10;
				store = store * 10 + reverse;		
			}
			System.out.print("Reverse Number = " +store);
		
		
	}
}