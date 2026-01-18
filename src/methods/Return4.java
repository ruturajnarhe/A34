package methods;

public class Return4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		m1();
		System.out.println("ends");
	}
	public static void m1() {
		System.out.println("hello 1");
		if(true) {
			System.out.println("task");
			return;
		}
		System.out.println("hello 2");
		return;
	}
}
