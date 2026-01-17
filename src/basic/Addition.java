package basic;

class Addition {
	public static void main(String[] args) {
		System.out.println("main start");
		addition(10,20,30);
		System.out.println("main ends");
	}
	public static void addition(int num1, int num2, int num3) {
		System.out.println("add start");
		int output = num1 + num2 + num3;
		System.out.println(output);
		System.out.println("add ends");
	}
}