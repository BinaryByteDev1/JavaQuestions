import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		int num = input.nextInt();
		int remender = 0;
	    int binary = 0;
	    int i = 1;
			
			while(num > 0){
				
				remender = num % 2;
				num = num / 2;
				binary = binary + remender * i;
				i = i * 10;	
			}
			System.out.print("Binary =  " + binary);
		
		
	}
}