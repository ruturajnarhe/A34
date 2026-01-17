package basic;

import java.util.Scanner;
class Army {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		System.out.println("Enter a height : ");
		int height = sc.nextInt();
		System.out.println("Enter a weight : ");
		int weight = sc.nextInt();

		if(age > 18 && height > 162 && weight > 56) {
			System.out.println("Yes! You can join army");
		} else {
			System.out.println("You cannot join army");
		}
	}
}