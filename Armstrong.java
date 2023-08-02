import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of n :- ");
		int n = input.nextInt();
		int r = 0;
		int Arm = 0; 
		int val = n;
		
		while(n > 0)
		{
			r = n % 10;
			Arm = (r * r * r)+Arm;
			n = n / 10;
			
		}
		if(Arm == val){
			
			System.out.print(Arm+" is a Armstrong Number");
			}
		else{
			System.out.print(Arm +" is not a Armstrong Number");
			
			}
		
		
		
	}
}