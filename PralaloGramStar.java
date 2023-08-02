import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		
		/*for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++){

				System.out.print("     ");				
				
				}
				
				for(int str1 = 1; str1 <= n-row; str1++){
					
					System.out.print("  *  ");
					
					}
					for(int str2 = 1; str2 <= row; str2++){
						
						System.out.print("  *  ");
						
						}
						System.out.println();
						System.out.println();
			}*/
			
			
			
			/*for(int row = 1; row <= n; row++){
			for(int col = 1; col <= n-1; col++){
					
				if(col == row || col == n || row == 1 || col == n){
					System.out.print(" * ");
					}
					else{
						System.out.print("   ");
						}
					}
						
						for(int str =1; str <= row; str++){
							System.out.print(" * ");
				}
					System.out.println();		
		}*/
			

			for(int row = 1; row <= n; row++){
			for(int col = 1; col <= n; col++){
					
				if(row == col || row == n){
					System.out.print("   ");
								
					}
					else{
						 System.out.print(" * ");
						 }
			}
						for(int str =1; str <= row; str++){
							System.out.print(" * ");
				}
					System.out.println();		
		}
			
			
			
			
				
	}
}