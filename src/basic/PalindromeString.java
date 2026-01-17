// import java.util.Scanner;
package basic;

class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;

		while(left < right) {
			if(str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("java"));
		System.out.println(isPalindrome("nitin"));

		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str + " is Palindrome");
		} else { 
			System.out.println(str + " is not Palindrome");
		} */
	}
}
		