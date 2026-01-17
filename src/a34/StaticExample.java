class Demo {
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
class StaticExample {
	public static void main(String[] args) {
		System.out.println(Demo.str);
		Demo.myMethod();
		System.out.println(Demo.InnerClass.str1);

	}
}