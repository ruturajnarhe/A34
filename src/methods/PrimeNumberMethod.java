package methods;
import java.util.Scanner;
class PrimeNumberMethod {
	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		isPrime();
	}
	public static void isPrime() {
		boolean assump = true;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				assump = false;
				break;
			}
		}
		if(assump) System.out.println(num + " is Prime");
		else System.out.println(num + " is not prime");
	}
} 