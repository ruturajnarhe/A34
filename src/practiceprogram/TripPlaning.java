package practiceprogram;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class TripPlaning {
	public static void main(String[] args) {
		System.out.println("  Trip Planning  ");
		
		String adhyaksh = "Ramesh";
		ArrayList<String> location = location();
		String[] contactList = {"suresh","ganesh","sakshi","mahesh","neha"};
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ramesh");
		for(int i = 0; i < contactList.length; i++) {
			String name = contactList[i];
			boolean resp = calling(name, location);
			if(resp) {
				names.add(name);
			}
		}
		vehicle(names, location);
	}
	public static void vehicle(ArrayList<String> names, ArrayList<String> location) {
		String [] offerings = offerings();
		System.out.println("Location : " + location);
		System.out.println("Names : " + names);
		System.out.println("Reached ");
		System.out.println(Arrays.toString(offerings));
		System.out.println("Trip completes");
	}
	public static String [] offerings() {
		String prasad = "Modak";
		String flowers = "Hibiscus";
		String grass = "Durva";
		String donation = "101";
		String fruits = "Coconut";
		String prayer = "Jaldi se job dila do";
		
		String [] offerings = { prasad, flowers, grass, donation, fruits, prayer};
		return offerings;
	}
	public static boolean calling(String name, ArrayList<String> location) {
		System.out.println("\nRamesh " + "calling " + name);
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you coming : ");
		String resp = sc.next().toUpperCase();
		if(resp.equals("YES"))
			return true;
		else
			return false;
	}
	public static ArrayList<String> location() {
		String place = "Dagdu Sheth Ganpati";
		String address = "ABC chouk Mandai Road, Pune, MH";
		String timing = "6:00 am";
		String date = "14/01/2026";

		ArrayList<String> venue = new ArrayList<String>();
		venue.add(place);
		venue.add(address);
		venue.add(timing);
		venue.add(date);
		return venue;
	}
}