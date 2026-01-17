import java.util.Scanner;
class GiveDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println("Enter a digit : ");
		int digit = sc.nextInt();

		while(num > 0) {
			int last = num % 10;
			if(last == digit) {
				System.out.println("Digit Found");
				break;
			}
			num /= 10;
		}
		if(num == 0) {
			System.out.println("Digit not found");
		}	
	}
}
bn