import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Input :- ");
		char chr = input.next().charAt(0);
		
		if(chr >= 65 && chr <= 90){
			System.out.printf("%c is Character and UpperCase Letter",chr);
		}
		else if(chr >= 97 && chr <= 122){
			System.out.printf("%c is Character and LowerCase Letter",chr);
			
			}
			else if(chr >= 48 && chr <= 57){
				
				System.out.printf("%c is Number",chr);
				
			}
			
			else if(chr >= 0 && chr <= 47 || chr >= 58 && chr <= 64 || chr >= 91 && chr <= 96 || chr >= 123 && chr <= 127){
					System.out.printf("%c is Special Symbol",chr);				
				}
				
				else{
					
					System.out.print("please enter valid input.");
					}
		
	}
}