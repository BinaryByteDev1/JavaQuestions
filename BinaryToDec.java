import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		int binary_num = input.nextInt();
		
		int result = 0;
		int power = 1;
		int unit_digit = 0;
			while(binary_num > 0){
				
				unit_digit = binary_num % 10;
				result = result+(unit_digit * power);
				binary_num = binary_num / 10;
				power = power * 2;
				
				
			}
			System.out.print("Binary =  " + result);
		
		
	}
}