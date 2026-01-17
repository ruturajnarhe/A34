import java.util.Scanner;
class ProductOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int prod = 1;

		while(num > 0) {
			int last = num % 10;
			prod = prod * last;
			num /= 10;
		}
		System.out.println("Product of the digit : " + prod);
	}
}