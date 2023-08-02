import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose the case which Opeartion do you Perform");
System.out.println("Case 1 Addition (+)");
System.out.println("Case 2 Subtraction (-)");
System.out.println("Case 3 Multiplication (*)");	
System.out.println("Case 4 Division (/)");
System.out.println("Case 5 Modules (%)");

char opr = input.next().charAt(0);
System.out.print("Enter the value of Number 1:-");
int num1 = input.nextInt();
System.out.print("Enter the value of Number 2:-");
int num2 = input.nextInt();


switch(opr){
	case '+' :
		System.out.println("sum of num1 and num2 = "+ (num1 + num2));
		break;
		
		case '-' :
		System.out.println("sub of num1 and num2 = "+ (num1 - num2));
		break;
		
		case '*' :
		System.out.println("Mul of num1 and num2 = "+ (num1 * num2));
		break;
		
		
		case '/' :
		System.out.println("Div of num1 and num2 = "+ (num1 / num2));
		break;
		 
		 case '%' :
		 System.out.println("Mod of num1 % num2 = "+ (num1 % num2));
		
		
		
		
		
		default :
			System.out.println("Please Enter The Valid Operator..");
}		
	
	}
}