import java.util.Scanner;
class PalindromeMethod {
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sc.next();
		isPalindrome();
	}
	public static void isPalindrome() {
		int i = 0, j = str.length()-1;
		boolean assumpt = true;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				assumpt = false;
				break;
			}
			i++;
			j--;
		}
		if(assumpt) System.out.println(str + " is palindrome");
		else System.out.println(str + " is not palindrome");
	}
}
		