package methods;

import java.util.Scanner;

public class ExampleReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = sc.nextInt();

		String output = findWeekDay4(input);
		System.out.println(output);
	}

	public static String findWeekDay4(int input) {
		if (input < 1 || input > 7)
			return "INVALID INPUT";
		String[] weekDays = { "Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun" };
		return weekDays[input - 1];
	}

	public static String findWeekDay3(int input) {
		String weekDay = switch (input) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thurday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "INVALID INPUT";
		};
		return weekDay;
	}

	public static String findWeekDay2(int input) {
		String weekDay = "";
		switch (input) {
		case 1:
			weekDay = "MONDAY";
			break;
		case 2:
			weekDay = "TUESDAY";
			break;
		case 3:
			weekDay = "WEDNESDAY";
			break;
		case 4:
			weekDay = "THURSDAY";
			break;
		case 5:
			weekDay = "FRIDAY";
			break;
		case 6:
			weekDay = "SATURDAY";
			break;
		case 7:
			weekDay = "SUNDAY";
			break;
		default:
			weekDay = "INVALID INPUT";
		}
		return weekDay;
	}

	public static String findWeekDay1(int input) {
		if (input < 1 || input > 7)
			return "INVALID INPUT";

		String weekDay = "";
		switch (input) {
		case 1:
			weekDay = "MONDAY";
			break;
		case 2:
			weekDay = "TUESDAY";
			break;
		case 3:
			weekDay = "WEDNESDAY";
			break;
		case 4:
			weekDay = "THURSDAY";
			break;
		case 5:
			weekDay = "FRIDAY";
			break;
		case 6:
			weekDay = "SATURDAY";
			break;
		case 7:
			weekDay = "SUNDAY";
			break;
		}
		return weekDay;

	}

}
