import java.util.Scanner;
class ExampleIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.print("HiFive");
		}
		if(num % 2 == 0) {
			System.out.println("HiTwo");
		}


		if(num % 5 == 0 && num % 2 != 0) {
			System.out.println("HiFive");
		}
		if(num % 2 == 0 && num % 5 != 0) {
			System.out.println("HiTwo");
		}
		if(num % 2 == 0 && num % 5 == 0) {
			System.out.println("HiFiveHiTwo");
		}



		if(num % 5 == 0 && num % 2 == 0) {
			System.out.println("HiFiveHiTwo");
			return;
		}
		if(num % 2 == 0) {
			System.out.println("HiTwo");
		}
		if(num % 5 == 0) {
			System.out.println("HiFive");
		}
	}
}