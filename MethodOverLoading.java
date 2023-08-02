import java.util.Scanner;
public class Main {
	
	public static int sum(int a , int b) {
			return a + b;
			
		}
	public static double sum(double x , double y){
			return x + y;
		}
	static int sum(int a , int b , int c){
			return a + b + c;
		}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 10;
		int b = 20;
		System.out.println("sum = "+ sum(a , b));
		
		double x = 30.55;
		double y = 12.55;
		System.out.println("sum = "+ sum(x , y));
		
		
		System.out.println("sum = "+sum(22 , 10 , 100));
	}
}