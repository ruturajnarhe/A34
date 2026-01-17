package basic;
import java.util.Scanner;

 class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		int perc =-1  ;

		if(marks < 0 || marks > 500) {
			System.out.println("Invalid Marks");
		} else {
			perc =  marks/5;
			System.out.println(perc);
		}
		if(perc <= 100 && perc > 90) {
			System.out.println("Outstanding");
		} else if(perc <= 90 && perc > 75) {
			System.out.println("Firstclass Distiction"); 
          }else if(perc >=60 && perc<=75 ) {
        	  System.out.println("first class");
          }else if(perc >=50 && perc<=59 ) {
        	  System.out.println("higher second class");
          }else if(perc >=35 && perc<=49 ) {
        	  System.out.println("Second class");
          }else if(perc >=0 && perc<=34 ) {
        	  System.out.println("fail");
          }
	}

}
