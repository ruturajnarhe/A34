package leetcode;

class HappyNumber {
	public static void main(String[] args) {
		int num = 12312, dup = num ;
		int sum ;
		for( ; ; ) {
			sum = 0;
			for(int i = num; i != 0; i /= 10) {
				int rem = i % 10;
				int sqr = rem * rem;		
				sum = sum + sqr;
			}
			if(sum < 10) break;
			num = sum;


		}
		System.out.println(sum == 1 ? dup + " is Happy Number" : dup + " is Unhappy Number");
	}
}