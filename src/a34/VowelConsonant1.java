import java.util.Scanner;
class VowelConsonant1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is Vowel.");
		} else {
			System.out.println(ch + " is Consonant.");
		}
	}
}