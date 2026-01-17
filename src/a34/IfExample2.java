import java.util.Scanner;
class IfExample2 {
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("Capgemini");
		System.out.println("Did u filled the form : ");
		String response = new Scanner(System.in).next();
		if(response.equals("yes")){
			System.out.println("U will receive next round mail");
		}
		System.out.println("Ends");
	}
}