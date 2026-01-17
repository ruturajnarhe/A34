import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int original = num;
		int rev = 0;

		while(num > 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}
		if(original == rev) {
			System.out.println("The number is a Palindrome ");
		} else {
			System.out.println("The number is NOT a Pallindrom ");
		}
	}
}