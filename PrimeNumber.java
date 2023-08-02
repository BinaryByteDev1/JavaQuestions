import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number :- ");
		int num = input.nextInt();
		
		int i = 2;
		
		while(i <= num-1){
			
			if(num % i == 0){
				System.out.print(num +" is Not a Prime Number");
				break;
				}
				else{
					System.out.print(num + " is a Prime Number");
					break;
				}
					
			}
		
		
	}
}