package basic;
class SwitchExample1 {
	public static void main(String[] args) {
		System.out.println("Enter a character : ");
		char ch = new java.util.Scanner(System.in).next().charAt(0);

		// Vowel or Consonant
		switch(ch) {
			case 'A', 'E', 'I', 'O', 'U' : System.out.println(ch + " is a Vowel"); break;
			default : System.out.println(ch + " is a Consonant");
		}
	}
}