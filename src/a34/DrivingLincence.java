import java.util.Scanner;
class DrivingLincence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter RTO test marks : ");
		int marks = sc.nextInt();

		if(age >= 18) {
			if(marks > 60) {
				System.out.println("You are eligible for a driving licence");
			} else {
				System.out.println("You must re-appear fro the RTO test");
			}
		} else {
			System.out.println("You are under 18. Not eligible for driving license");
		}
	}	
}