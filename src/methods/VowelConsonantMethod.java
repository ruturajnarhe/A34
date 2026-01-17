package methods;
import java.util.Scanner;
class VowelConsonantMethod {
	static char ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		ch = sc.next().toUpperCase().charAt(0);
		vowelConsonant();
	}
	public static void vowelConsonant() {
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is Consonant");
		}
	}
}