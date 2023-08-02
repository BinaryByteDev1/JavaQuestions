import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
					//1 Pattern
		/*for(int row = 0; row <= n; row++){
			for(int col = n; col >= row; col--){
				System.out.print(" * ");
				}
				System.out.println();
		    }*/
							//   OR
	/*	for(int row = 0; row <= n; row++){
			for(int col = 0; col <= n-row; col++){
				System.out.print(" * ");
				}
				System.out.println();
		    }*/
		
		
		
		//					2 Pattern
		/*for(int row = 0; row <= n; row++){
			for(int col = n; col >= row; col--){
				
				if(row == 0 || row == n || col == n || col == row){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				System.out.println();
		    }*/
		    
		    
		    for(int row = 0; row <= n; row++){
			for(int col = 0; col <= n-row; col++){
				if(row == 0 || row == n || row == n/2 || col == 0 || col == n-row || col == n/2) {
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