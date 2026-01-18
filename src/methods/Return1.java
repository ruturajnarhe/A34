package methods;

public class Return1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		if(evenOdd(num)) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
	}
	public static boolean evenOdd(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}

}
