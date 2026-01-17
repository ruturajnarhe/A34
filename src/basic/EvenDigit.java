package basic;
import java.util.Scanner;
class EvenDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
		int num = sc.nextInt();
		int hasEvenDigit = 0;

		while(num > 0) {
			int last = num % 10;
			if(last % 2 == 0) {
				hasEvenDigit++;
			}
			num /= 10;
		}
		if(hasEvenDigit > 1) {
			System.out.println("The number contains an even digit.");
		} else {
			System.out.println("The number does NOT contain any even digit.");
		}
	}
}