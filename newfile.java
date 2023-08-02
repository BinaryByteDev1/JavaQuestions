import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value end of loop :- ");
		int n = input.nextInt();
		
			 for(int i = 1; i <= n; i++){
			 	//System.out.println(i);
				for(int j = 1; j <= i++; j++){
				System.out.print("  "+i);
				}
				System.out.println("\n");
				}
				
	/*	int i = 10;
			do{
				System.out.print("\t" + i);
				
				i++;
				}			
			while(i <=0);*/
				
	
	}
}