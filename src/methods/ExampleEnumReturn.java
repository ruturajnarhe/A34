package methods;

import java.util.Scanner;

enum Month {
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
}

public class ExampleEnumReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int monthNum = sc.nextInt(); 
		Month monthName = findMonth(monthNum);
		System.out.println(monthName);
	}
	public static Month findMonth(int monthNum) {
		Month monthName = null;
		switch(monthNum) {
			case 1 -> monthName = Month.JAN;
			case 2 -> monthName = Month.FEB;
			case 3 -> monthName = Month.MAR;
			case 4 -> monthName = Month.APR;
			case 5 -> monthName = Month.MAY;
			case 6 -> monthName = Month.JUN;
			case 7 -> monthName = Month.JUL;
			case 8 -> monthName = Month.AUG;
			case 9 -> monthName = Month.SEP;
			case 10 -> monthName = Month.OCT;
			case 11 -> monthName = Month.NOV;
			case 12 -> monthName = Month.DEC;
		}
		return monthName;

	}

}
