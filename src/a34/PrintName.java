import java.util.Scanner;
class PrintName {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String name = sc.next();

		for(int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
			Thread.sleep(2000);
		}
	}
}