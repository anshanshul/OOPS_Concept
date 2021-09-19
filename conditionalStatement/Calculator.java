package conditionalStatement;
import java .util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		System.out.println("Enter the second Number");
		int b=sc.nextInt();
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0); 
		int result=0;
		switch(operation) {
		case '+':
			result =a+b;
			break;
		case '-':
			result=a-b;
			 break;
		case'*':
			result=a*b;
			break;
	
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("Invalid Opeartion");
		}
		System.out.println("the Result is: " + result);

	}

}
