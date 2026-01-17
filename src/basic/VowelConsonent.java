package basic;

import java.util.Scanner;

class VowelConsonent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel");
		}
		if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			System.out.println(ch + " is a Consonent");
		}

	}
}