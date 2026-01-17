package basic;
import java.util.Scanner;
class PrimeDigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int primeCount = 0, nonPrimeCount = 0;

		while(num > 0) {
			int last = num % 10;

			if(last == 2 || last == 3 || last == 5 || last == 7) {
				primeCount++;
			} else {
				nonPrimeCount++;
			}
			num /= 10;
		}
		System.out.println("Prime digit count :" + primeCount);
		System.out.println("Non-Prime digit count :" + nonPrimeCount);
	}
}