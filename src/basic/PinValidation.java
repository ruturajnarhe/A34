package basic;
import java.util.Scanner;
class PinValidation {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int storePin = 1234;
		int duration = 2000;

		outerLoop:
		for( ; ; ) {
			int attempts = 3;
			do {
				System.out.println("\n Enter your pin : ");
				int userPin = sc.nextInt();
				if(storePin == userPin) {
					System.out.println("\n Phone Unlocked \n");
					break outerLoop;
				} else {
					System.out.println("\n Invalid pin");
					System.out.println("Attempt left : " +(attempts-1));
				}
				attempts--;
			} while(attempts != 0);
			System.out.println("\n Phone disabled for " + (duration/1000) + " seconds \n");
			Thread.sleep(duration);
			duration *= 2;
		}
	}
}