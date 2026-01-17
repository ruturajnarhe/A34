package basic;
import java.util.Scanner;
class Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		if(ch >= 48 && ch <= 57) {
			System.out.println(ch + " is an Digit");
		}
		if(!(ch >= 48 && ch <= 57)) {
			System.out.println(ch + " is not an Digit");
		}

	}
}