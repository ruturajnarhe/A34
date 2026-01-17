package methods;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		boolean check = isPalindrome(str);
		System.out.println(check);
	}
	public static boolean isPalindrome(String s) {
        String str = "";
        String rev = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122 ||
             s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                char ch = s.charAt(i);
			    if(ch >= 65 && ch <= 90) {
				    str += (char)(ch+32);
			    } else {
				    str += ch;
			    }
            }
        }
        for(int j = str.length()-1; j >= 0; j--) {
            rev += str.charAt(j);
        }
        if(str.equals(rev))
        	return true;
        return false;
    }
}
