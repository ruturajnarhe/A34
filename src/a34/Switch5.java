import java.util.Scanner;
class Switch5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month : ");
		String month = sc.next();

		switch(month) {
			case "January" :
			case "December" :
			case "February" :
			{
				System.out.println("It is a winter!");
				break;
			}
			case "March" :
			case "May" :
			case "April" :
			{
				System.out.println("It is a summer!");
				break;
			}
			case "June" :
			case "July" :
			case "August" :
			case "September" :
			{
				System.out.println("It is a rainy!");
				break;
			}
			case "October" :
			case "November" :
			{
				System.out.println("Autumn!");
				break;
			}
			default :
			{
				System.out.println("Invalid months");
			}
		}
	}
}