import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		//             FIRST PATTERN 
		
	 	for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n; col++) {
				if(row ==1 || row == n || col == 1 || col == n || row == col || row + col == n+1){
				System.out.print(" * ");
				
				}
				else{
					System.out.print("   ");
					}
			}
				System.out.println();
			}
			
			     
			     
			     //    SECOND PATTERN
			     
			     
	/*	for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n; col++) {
				if(row ==1 || row == n || col == 1 || col == n || row == col || row + col == n+1 || row == n/2 || col == n/2){
				System.out.print(" * ");
				
				}
				else{
					System.out.print("   ");
					}
			}
				System.out.println();
			}
			
			
			
			
			//        THIRD PATTERN
			
			
			
	}
	
}
