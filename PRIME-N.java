import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number :- ");
		int n = input.nextInt();
		boolean check = false;
		
		
		if(n == 1 || n == 2){
			System.out.print(n+" is a Prime Number");
			}
		
		for(int i = 2; i <= n-1; i++){
			if(n % i != 0){
				
				check = true;
				break;
				}
			else{
				System.out.print(n+" is not a Prime Number");
				break;
				
				}
			}
			
			
			if(check == true){
			System.out.print(n+" is a Prime Number");
			
			}
		
	}
}