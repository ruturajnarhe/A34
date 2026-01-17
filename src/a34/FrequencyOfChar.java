class FrequencyOfChar {
	public static void main(String[] args) {
		String str = "hello world hello java hello ruturaj";
		System.out.println(str);

		for(char ch = 'a'; ch <= 'z'; ch++) {
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				if(ch == str.charAt(i)) cnt++;
			}
			if(cnt > 0) System.out.println(ch + " : " + cnt);
		}
	}
}