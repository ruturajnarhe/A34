package methods;
import java.util.Scanner;
class MethodExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	
		String binary = toBinaryString(num);
		System.out.println(num + " : " + binary);
		int number = binaryToInteger(binary);
		System.out.println(binary + " : " + number);
	}
	public static int binaryToInteger(String binary) {
		int p = 0, sum = 0;
		for(int i = binary.length()-1; i >= 0; i--) {
			char ch = binary.charAt(i);
			int integer = ch-48;
			int pow = power(2, p);
			sum += (pow * integer);
			p++;
		}
		return sum;
	}
	public static int power(int n, int p) {
		int pow = 1;
		for(int i = 1; i <= p; i++) {
			pow *= n;
		}
		return pow;
	}
	public static String toBinaryString(int num) {
		String binary = "";
		while(num != 0) {
			int rem = num % 2;
			binary = rem + binary;
			num/=2;
		}
		return binary;
	}
}