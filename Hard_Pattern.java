import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
	
			//     FIRST PATTERN
			//     FIRST PATTERN
			
			                                  
		/*for(int row = 1; row <= n; row++){
			for(int sp = 1; sp <= n-row; sp++){
				System.out.print("   ");
			}
					
			for(int st = 1; st <= row; st++){
			   	System.out.print(" * ");
			}			
			System.out.println();	
}*/


					//     SECOND PATTERN
				    //     SECOND PATTERN

		for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n-row; col++){
				if(row == 1 || row == n || col == 1){
					System.out.print(" * ");
					
					}else{
						System.out.print("   ");
					}
				
				}
				
				for(int str = 1; str <= row; str++) {
					System.out.print(" * ");
					
					
					}
					System.out.println();
			}

	
	
			//     THIRD PATTERN
			//     THIRD PATTERN
	
	
	int nn = input.nextInt();
	int col2;
	for(int row2 = 1; row2 <= nn; row2++){
		for(col2 = 1; col2 <= nn-row2; col2++) {
			System.out.print(" * ");
			}
			
			for(int sp = 1;  sp <= row2; sp++){
				if(row2 == nn || sp == row2){
					
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