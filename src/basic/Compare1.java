package basic;
import java.util.Scanner;
class Compare1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0, prod = 1;

		while(num > 0) {
			int last = num % 10;
			sum = sum + last;
			prod = prod * last;
			num /= 10;
		}
		if(sum == prod) {
			System.out.println("Sum and Product of the digit is same ");
		} else {
			System.out.println("Sum and Product of the digit is not same ");
		}
	}
}