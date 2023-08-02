import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		/*for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		*/
		for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++) {
				if(row == 1 || row == n || col == 1 ||col == row){
					System.out.print(" * ");
					
				}
				else{
					System.out.print("   ");	
				}
				
			}
			System.out.println();
		}
		
		
		
		/*for(int row = 65; row <= 72; row++){
			for(int col = 65; col <= row; col++) {
				System.out.printf(" %c " , col);
				
			}
			System.out.println();
		}*/
		
		
	}
}