import java.util.Scanner;
class SpecialCharacter1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		if(!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))) {
			System.out.println(ch + " is a Special Character");
		} else {
			System.out.println(ch + " is not a Special Character");
		}
	}
}