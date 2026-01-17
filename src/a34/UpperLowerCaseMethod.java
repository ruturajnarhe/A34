import java.util.Scanner;
class UpperLowerCaseMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();

		toUpperCase(str);
		toLowerCase(str);
	}
	public static void toUpperCase(String str) {
		String output = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 97 && ch <= 122) {
				output += (char)(ch-32);
			} else {
				output += ch;
			}
		}
		System.out.println(str);
		System.out.println("UPPERCASE : " + output);
	}
	public static void toLowerCase(String str) {
		String output = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90) {
				output += (char)(ch+32);
			} else {
				output += ch;
			}
		}
		System.out.println(str);
		System.out.println("lowercase : " + output);
	}

}