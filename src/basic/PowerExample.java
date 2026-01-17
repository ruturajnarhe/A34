package basic;
import java.util.Scanner;
class PowerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		double num = sc.nextDouble();
		System.out.println("Enter a power : ");
		int pow = sc.nextInt();

		if(pow < 0) {
			num = 1/num;
			pow *=-1;
		}
	
		double power = 1;
		for(int i = 1; i <= pow; i++) {
			power *= num;
		}
		System.out.println(num + " ^ " + pow + " = " + power);
		System.out.println(Math.pow(num, pow));
	}
}