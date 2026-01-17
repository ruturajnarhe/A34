import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your option : ");
		int op = sc.nextInt();
		
		final int a = 1, b = 2, c = 3, d = 5;
		
		switch(op) {
		 	case a :
		 	{
		 		System.out.println("From case 1");
		 		break;
		 	}
		 	case b : 
		 	{
		 		System.out.println("From case 2");
		 		break;
		 	}
		 	case c :
		 	{
		 		System.out.println("From case 3");
		 		break;
		 	}
		 	case d :
		 	{
		 		System.out.println("From case 5");
		 		break;
		 	}
		}
	}

}