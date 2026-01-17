package practiceprogram;
import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome to Taza Hotel----------");
		
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		
		System.out.println("Enter your option : ");
		int op = sc.nextInt();
		
		switch(op) {
			case 1 :{
				System.out.println("---------Veg Menu---------");
				System.out.println("1. Poha  ----------- 20.0");
				System.out.println("2. Upma  ----------- 20.0");
				System.out.println("3. Idli  ----------- 30.0");
				System.out.println("4. Dosa  ----------- 60.0");
				System.out.println("5. Medu vada ------- 60.0");
				System.out.println("6. Veg Kolhapuri --- 140.0");
				System.out.println("7. Veg Maratha ----- 140.0");
				System.out.println("8. Veg Hydrabadi --- 140.0");
				System.out.println("9. Matar Paneer ---- 160.0");
				System.out.println("10. Paneer Masala -- 160.0");
				System.out.println("11. Palak Paneer --- 160.0");
				System.out.println("12. Kadai Paneer --- 160.0");
				System.out.println("13. Kaju Masala ---- 180.0");
				System.out.println("14. Kaju Curry ----- 180.0");
				System.out.println("15. Kaju Butter ---- 180.0");
				
				System.out.println("Enter your option : ");
				int ip = sc.nextInt();
				
				switch(ip) {
					case 1 :
					case 2 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 20;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					case 3 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 30;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					case 4 :
					case 5 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 60;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					case 6 :
					case 7 :
					case 8 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 140;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					case 9 :
					case 10 :
					case 11 :
					case 12 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 160;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					case 13 :
					case 14 :
					case 15 :
					{
						System.out.println("Enter the quantity : ");
						int no = sc.nextInt();
						
						double billAmt = no * 180;
						System.out.println("Total bill : " + billAmt);
						break;
					}
					default :
					{
						System.out.println("Item is not in veg Menu");
					}
				}
			}
			break;
			
			case 2 :
			{
				System.out.println("----------Non-Veg Menu-----------");
				System.out.println("1. Chicken 65  --------- 150.0");
				System.out.println("2. Chicken Lolipop ----- 150.0");
				System.out.println("3. Chicken Fry --------- 150.0");
				System.out.println("4. Mutton Chops -------- 270.0");
				System.out.println("5. Mutton Fry ---------- 270.0");
				System.out.println("6. Fish Ukad ----------- 170.0");
				System.out.println("7. Fish Fry ------------ 170.0");
				System.out.println("8. Egg Masala ---------- 120.0");
				System.out.println("9. Egg Curry ----------- 120.0");
				System.out.println("10. Chicken Handi ------ 350.0");
				System.out.println("11. Mutton Handi ------- 450.0");
				System.out.println("12. Egg Thali ---------- 180.0");
				System.out.println("13. Fish Thali --------- 270.0");
				System.out.println("14. Chicken Thali ------ 330.0");
				System.out.println("15. Mutton Thali ------- 450.0");
				System.out.println("16. Chicken Biryani ---- 240.0");
				System.out.println("17. Mutton Biryani ----- 360.0");
				
				System.out.println("Enter your option : ");
				int ip = sc.nextInt();
				
				switch(ip) {
				 	case 1 :
				 	case 2 :
				 	case 3 : 
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*150;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 4 :
				 	case 5 : 
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*270;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 6 :
				 	case 7 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*170;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 8 :
				 	case 9 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*120;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 10 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*350;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 11 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*450;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 12 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*180;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 13 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*270;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 14 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*330;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 15 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*450;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
					case 16 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*240;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	case 17 :
				 	{
				 		System.out.println("Enter the quantity : ");
				 		int no = sc.nextInt();
				 		
				 		double billAmt = no*360;
				 		System.out.println("Total bill : " + billAmt);
				 		break;
				 	}
				 	default :
				 	{
				 		System.out.println("Item is not in non-veg menu");
				 	}
				}
				break;
			}
			default : 
			{
				System.out.println("Order something what every human eats");
			}
		}
	}

}
