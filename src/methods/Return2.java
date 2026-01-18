package methods;

public class Return2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	public static void m1() {
		System.out.println("m1() hello1");
		System.out.println("m1() hello2");
		if(true)
			return;
		System.out.println("m1() hello3");
		System.out.println("m1() hello4");
	}
}
