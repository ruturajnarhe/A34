import java.util.Scanner;
class Switch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Welcome to QSP Fitness-------------");
		System.out.println("Enter the muscle you like to train : ");
		String mus = sc.next();

		switch(mus) {
			case "Chest" : 
			{
				System.out.println("1. Bench press");
				System.out.println("2. Inclined press");
				System.out.println("3. Declined press");
				System.out.println("4. Inclined Dumble flies");
				System.out.println("5. Pec flies");
				System.out.println("6. Push ups");
				break;
			}
			case "Biceps" : 
			{
				System.out.println("1. Dumble curls");
				System.out.println("2. Scull-rod curls");
				System.out.println("3. Dumble hammer curls");
				System.out.println("4. Cable curls");
				System.out.println("5. Reverse cable curls");
				System.out.println("6. Breacher curls");
				break;
			}
			case "Triceps" : 
			{
				System.out.println("1. Cable extension");
				System.out.println("2. Scull rod extension");
				System.out.println("3. Cable pull");
				System.out.println("4. Rope extension");
				System.out.println("5. Dumble kick");
				System.out.println("6. Diamond push-ups");
				break;
			}
			case "Back" : 
			{
				System.out.println("1. Dead lifts");
				System.out.println("2. Lat pull down");
				System.out.println("3. Seated row");
				System.out.println("4. closed arm lat pull down");
				System.out.println("5. Dumble row");
				break;
			}
			case "Shoulder" : 
			{
				System.out.println("1. Dumble press");
				System.out.println("2. Arnold press");
				System.out.println("3. Front raise");
				System.out.println("4. Side raise");
				System.out.println("5. Shrugs");
				break;
			}
			case "Legs" : 
			{
				System.out.println("1. Squats");
				System.out.println("2. Lunges");
				System.out.println("3. Leg press");
				System.out.println("4. Leg extension");
				System.out.println("5. Leg curls");
				System.out.println("6. Calfs");
				break;
			}
			case "Abs" : 
			{
				System.out.println("1. Crunches");
				System.out.println("2. Leg raise");
				System.out.println("3. Russian twists");
				System.out.println("4. Bicycle");
				System.out.println("5. High knees");
				System.out.println("6. Planks");
				break;
			}
			default :
			{
				System.out.println("Invalid muscle");
			}
		}
	}
}