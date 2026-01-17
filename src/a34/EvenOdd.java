class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num = new java.util.Scanner(System.in).nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is Even.");
		}
		if(num % 2 != 0) {
			System.out.println(num + " is Odd.");
		}

		
		if(num/2 == num/2.0) {
			System.out.println(num + " is Even.");
		}
		if(num/2 != num/2.0) {
			System.out.println(num + " is Odd.");
		}


		if((num/2)*2 == num) {
			System.out.println(num + " is Even.");
		}
		if(!((num/2)*2 == num)) {
			System.out.println(num + " is Odd.");
		}

	}
}