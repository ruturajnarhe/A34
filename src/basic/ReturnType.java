package basic;
class ReturnType {
	public static void main(String[] args) {
		System.out.println("main start"); // 1
		ramesh();
		System.out.println("main ends"); // 9
	}
	public static void ramesh() {
		System.out.println("ramesh start"); // 2
		int num = 2;
		int sqr = suresh(num);
		System.out.println(sqr); // 5
		ganesh();
		System.out.println("ramesh ends"); // 8
	}
	public static int suresh(int num) {
		System.out.println("suresh start"); // 3
		int sqr = num * num;
		System.out.println("suresh ends");  // 4
		return sqr;
	}
	public static void ganesh() {
		System.out.println("ganesh start"); // 6
		System.out.println("ganesh ends"); // 7
		return;
	}
}