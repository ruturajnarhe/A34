package methods;
import java.util.Scanner;
class FactorialMethod {
	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		factorial();
	}
	public static void factorial() {
		int fact = 1;
		for(int i = num; i >= 1; i--) {
			fact *= i;
		}
		System.out.println(num + " factorial is : " + fact);
	}
}