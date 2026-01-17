import java.util.Scanner;
class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		System.out.println("Count : " + cnt);
	}
}