package methods;
import java.util.Scanner;
class MethodExample {
	public static void main(String [] args){
		personalInformation();
	}
 	public static void personalInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Native Place : ");
		String nativePlace = sc.nextLine();
		System.out.println("Contact : ");
		long contact = sc.nextLong();
		System.out.println("Education : ");
		sc.nextLine();
		String education = sc.nextLine();
		System.out.println("CGPA : ");
		double cgpa = sc.nextDouble();
		System.out.println("YOP : ");
		int yop = sc.nextInt();

		System.out.println("*** PERSONAL INFO ***");
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("Education : " + education);
		System.out.println("Native Place : " + nativePlace);
		System.out.println("CGPA : " + cgpa);
		System.out.println("YOP : " + yop);
	}
	
}