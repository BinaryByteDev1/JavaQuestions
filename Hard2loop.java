import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		/*for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row-1; col++){
				System.out.print(" - ");
				
				}
				for(int str = 1; str <= n-row; str++){
					System.out.print(" * ");
					}
					System.out.println();
				
		}
		*/
		
		
		for(int row = 1; row <= n; row++){
			for(int col = 1; col <= n; col++){
				if(col < row){
				System.out.print("   ");
					}
					else{
						System.out.print(" * ");
						}
				}
				System.out.println();
		}
		
	}
}