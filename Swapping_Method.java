import java.util.Scanner;
public class Main {
	
	public static void swapping(int x , int y){
		int temp = x;
			   x = y;
			   y = temp;
			   
			   System.out.println("value of x = "+x);	
			   System.out.println("value of y = "+y);
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value of X :- ");
		int x = input.nextInt();
		System.out.print("Enter value of Y :- ");
		int y = input.nextInt();
		
		swapping(x  , y);
	}
}