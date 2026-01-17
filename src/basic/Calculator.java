package basic;
import java.util.Scanner;
class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a operand1 : ");
		double op1 = sc.nextDouble();
		System.out.println("Enter an operator : ");
		char opr = sc.next().charAt(0);
		System.out.println("Enter a operand2 : ");
		double op2 = sc.nextDouble();

		boolean assump = true;
		double output = 0;

		if(opr == '+') {
			output = op1 + op2;
		} else if(opr == '-') {
			output = op1 - op2;
		} else if(opr == '*') {
			output = op1 * op2;
		} else if(opr == '/') {
			output = op1 / op2;
		} else if(opr == '%') {
			output = op1 % op2;
		} else {
			System.out.println("Invalid operator");
			assump = false;
		}
		if(assump) {
			System.out.println(op1 + " "+opr+" "+op2+" = " + output);
			System.out.printf("%n%.2f %c %.2f = %.3f %n", op1,opr,op2,output);
		}
	}	
}