import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		
		
			for(int row = 1; row <= n; row++){
			
			for(int col = 1; col <= n-row; col++){
				System.out.print("   ");
				}

				
				for(int str = 1; str <= row; str++){
				
				if(row == 1 || row == n || str == 1|| str == n){
					System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					
					}
				}
				
				
				
			for(int str2 = 1; str2 <= row-1; str2++){
			
			if(row == 1|| row == n || str2 == row-1){
				System.out.print(" * ");
				}
				else{
					System.out.print("   ");
					
				}
			}
				System.out.println();
				System.out.println();
			}
		
		
	}
}