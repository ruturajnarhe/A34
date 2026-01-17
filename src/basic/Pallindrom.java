package basic;
import java.util.Scanner;
class Pallindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int first = num;
		int rev = 0;

		while(num > 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}
		System.out.println(num);
		System.out.println(first);
		System.out.println(rev);
		if(first == rev) {
			System.out.println("The given number is Pallindrom ");
		} else {
			System.out.println("The given number is not Pallindrom ");
		}
	}
}