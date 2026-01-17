package basic;
import java.util.Scanner;
class ZeroInDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		while(num > 0) {
			int last = num % 10;
			if(last == 0) {
				System.out.println("Zero is present in number ");
				break;
			}
			num /= 10;
		}
		if(num == 0) {
			System.out.println("Zero is not present ");
		}
	}
}