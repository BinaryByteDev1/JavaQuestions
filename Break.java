import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			if(i == 10){
				System.out.print(" -- ");
				continue;
		}
			System.out.print("  " + i);
			}
	
		
	}
}