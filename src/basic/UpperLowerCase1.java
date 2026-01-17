package basic;
import java.util.Scanner;
class UpperLowerCase1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		if(ch >= 65 && ch <= 90) {
			System.out.println(ch + " is UpperCase");
		} else {
			System.out.println(ch + " is LowerCase");
		}
	}
}