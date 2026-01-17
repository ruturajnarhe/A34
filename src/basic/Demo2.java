package basic;
class Demo1 {
	static String str = "Var class block";
	static{
		System.out.println("Static block");
	}
	public static void myMethod() {
		System.out.println("Static method");
	}
	static class InnerClass {
		static String str1 = "InnerClass static var";
	}
}
class Demo2 {
	public static void main(String[] args) {
		System.out.println(Demo1.str);
		Demo1.myMethod();
		System.out.println(Demo1.InnerClass.str1);

	}
}