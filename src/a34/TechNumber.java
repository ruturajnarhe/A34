import java.util.Scanner;
class TechNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		techNumber(num);
	}
	public static void techNumber(int num) {
		int len = getLength(num);
		boolean cndt = isEvenOdd(len);
		
		if(cndt) {
			int div = getDivisor(len/2);
			int fh = num / div;
			int lh = num % div;
			int square = getSquare(fh + lh);
			if(square == num) {
				System.out.println(num + " is a TECH Number");
			} else {
				System.out.println(num + " is not a TECH Number");
			}
		} else {
			System.out.println(num + " is not a TECH Number");
		}
	}
	public static int getSquare(int num) {
		return num * num;
	}
	public static int getDivisor(int len) {
		int div = 1;
		for(int i = 1; i <= len; i++) {
			div = div * 10;
		}
		return div;
	}
	public static boolean isEvenOdd(int len) {
		return len % 2 == 0;
	}
	public static int getLength(int num) {
		int len = 0;
		while(num != 0) {
			len++;
			num /= 10;
		}
		return len;
	}
} 