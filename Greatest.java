import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a = 100;
		int b = 600;
		int c = 300;
		int d = 500;
		 	
		   if(a > b && a > c && a > d){
		   	System.out.println(a +" is Greatest Number");
		   	}
		   else if(b > a && b > c && b > d){
		   	System.out.println( b +" is Greatest Number");
		   	
		   	}
		   	
		   else if(c > a && c > b && c > d){
		   	System.out.println(c +" is Greatest Numbet");
		   	}
		   else{
		   	System.out.println(d + " is Greatest Number");
		   	
		   	}

		}
}