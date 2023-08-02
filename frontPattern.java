import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		/*for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++){
				System.out.print(" * ");
				
				}
				System.out.println();
			}
			
			for(int row = 1; row <= n; row++){
			for(int col = 1; col <= n-row; col++){
				System.out.print(" * ");
				
				}
				System.out.println();
			}*/
			
			
			
			
			//       SECOND PATTERN
			
			
			for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++){
				if(row == 1 || col == 1 || col == row){
				System.out.print(" * ");
				
					}
					else{
						System.out.print("   ");
						}
				}
				System.out.println();
			}
			
			for(int row = 1; row <= n; row++){
			for(int col = 1; col <= n-row; col++){
				if(  col == 1 || col == n-row){
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