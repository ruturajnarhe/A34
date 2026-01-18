package methods;

public class Return3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() starts");
		m1((int)(Math.random()*10));
		System.out.println("main() ends");
	}
	public static void m1(int dgt) {
		if(dgt < 5) return;
		System.out.println("m1() hello " + dgt);
		return;
	}
}
