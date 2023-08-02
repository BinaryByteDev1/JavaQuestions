import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//       METHOD   1
		
		int n = input.nextInt();
		
		/*for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n-row; col++){
				System.out.print("   ");
				}

				
				for(int str = 1; str <= row; str++){
					System.out.print(" * ");
					}
				
				
				
			for(int str2 = 1; str2 <= row-1; str2++){
			

				System.out.print(" * ");
				

			}
				System.out.println();
				System.out.println();
			}*/
			
			
			//    METHOD 2
			
			
			/*for(int row = 1; row<=n; row++){
				for(int col = 1; col <= n-row; col++){
					System.out.print("   ");
					
					}
					for(int str = 1; str <= 2*row-1; str++){
						System.out.print(" * ");
						
						}
					
					System.out.println();
					System.out.println();
				}*/
				
				
				//		METHOD  3
				
				for(int row = 1; row <= n; row++) {
					for(int col = 1; col <= n-row; col++){
					if(col <= n-row){
						System.out.print("   ");
						}
						else{
							System.out.printf(" * ");
							}	
				}
				for(int str = 1; str <= 2*row-1; str++){
						System.out.printf(" * ");
						}
						System.out.println();
						System.out.println();
					}
				
				
				
			
			
			
			
			

					
	}
}