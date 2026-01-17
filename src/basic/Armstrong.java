package basic;

class Armstrong {
	public static void main(String[] args) {
		for(int a = 1; a <= 10000; a++) {
			int num = a, len = 0, sum = 0;

		for(int i = num; i != 0; i /= 10)
			len++;

		for(int i = num; i != 0; i /= 10) {
			int pow = 1;
			for(int j = 1; j <= len; j++) pow*=(i%10);
			sum += pow;
		}
		if(sum == num)
			System.out.print(num + " ");
		}
	}
}