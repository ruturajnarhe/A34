package basic;
class BreakExample {
	public static void main(String[] args) {
		System.out.println("execu starts");
		block:
		{
			System.out.println("block execu starts");
			if(!true) {
				System.out.println("hellooo java");
			} else {
				System.out.println("bye java");
				break block;
			}
			System.out.println("block execu ends");
		}
		System.out.println("execu ends");
	}
}