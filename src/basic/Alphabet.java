package basic;

import java.util.Scanner;
class Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		if((ch >= 65 && ch <= 'Z') || (ch >= 97 && ch <= 'z')) {
			System.out.println(ch + " is an alphabet");
		}
		if(!((ch >= 'A' && ch <= 90) || (ch >= 'a' && ch <= 122))) {
			System.out.println(ch + " is not an alphabet");
		}

	}
}