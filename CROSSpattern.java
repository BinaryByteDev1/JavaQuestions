import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n = input.nextInt();
		
		for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n; col++){
				
				if(row == 1 || row == n || row == col || col + row == n+1|| col == 1 || col == n){
				System.out.print(" * ");
				}
				else{
					System.out.print("   ");
					}
				
				}
				System.out.println();
			}
	
	}
		
}