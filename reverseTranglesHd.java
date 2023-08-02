import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		/*for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n; col++){
				
				if(col < row){
					System.out.print("   ");
					
					}
			else{
				System.out.print(" * ");
				
			}
				}
				
				//System.out.println();
				
				
				for(int str = 1; str <= n-row; str++){
					System.out.print(" * ");
					
					}
					System.out.println();
					System.out.println();
			}
			*/
			
			
		/*	for(int row = 1; row <= n; row++){
				for(int col = 1; col <= row; col++){
					System.out.print("   ");
					
					}
					
					for(int str_1 = 1; str_1 <= n-row; str_1++ ){
						System.out.print(" * ");
						
						}
					for(int str_2 = 1; str_2 <= n-row-1; str_2++){
						System.out.print(" * ");
						
						}
						System.out.println();
						System.out.println();	
				}*/
			
			
			
			for(int row = 1; row <= n; row++){
				for(int col = 1; col <= row; col++){
					System.out.print("   ");
					
					}
					
					for(int str_1 = 1; str_1<= 2*(n-row)-1; str_1++ ){
						System.out.print(" * ");
						
						}
		
						System.out.println();
						System.out.println();	
				}
			
			
			
			
			
			
			
	}
}