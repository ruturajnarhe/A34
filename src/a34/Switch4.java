import java.util.Scanner;
class Switch4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0);

		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

		switch(ch) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
			{
				System.out.println(ch + " is a Vowel!");
				break;
			}
			default  :
			{
				System.out.println(ch + " is a consonant!");
			}
		}

		} else {
			System.out.println(ch + " is not an alphabet!");
		}
	}
}