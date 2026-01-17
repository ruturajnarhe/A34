class DuplicateDigit {
	public static void main(String[] args) {
		long num = 656780275379l;
		System.out.println(num);

		for(int i = 0; i <= 9; i++) {
			int cnt = 0;
			for(long j = num; j != 0; j /= 10) {
				if(i == j%10) cnt++;
			}
			if(cnt > 1) 
				System.out.print(i + " ");
		}
	}
}