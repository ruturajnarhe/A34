package basic;
import java.util.Scanner;
class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int rev = 0;

		while(num > 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}
		System.out.println("Reverse number is : " + rev);
	}
}