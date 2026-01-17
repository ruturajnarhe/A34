import java.util.Scanner;
class PowerMethod {
	static double num;
	static int pow;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextDouble();
		System.out.println("Enter a power : ");
		pow = sc.nextInt();
		power();
	}
	public static void power() {
		if(pow < 0) {
			num = 1/num;
			pow *= -1;
		}
		double power = 1;
		for(int i = 1; i <= pow; i++) {
			power *= num;
		}
		System.out.println(num + " ^ " +  pow + " = " + power);
	}
}