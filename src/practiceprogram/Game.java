package practiceprogram;
import java.util.Scanner;
class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for( ; ; ) {
			System.out.println("\n    Welcome   ");
			System.out.println("    Stone-Paper-Scissor   ");

		// code imp for bot response 
		int botResponse = 0;
		for( ; ; ) {
			botResponse = (int)(Math.random()*10);
			if(botResponse >= 1 && botResponse <= 3) break;
		}

		String bot = "";
		if(botResponse == 1) bot = "STONE";
		else if(botResponse == 2) bot = "PAPER";
		else bot = "SCISSOR";
			
		// code imp for user response
		System.out.println("\n 1. STONE  2. PAPER  3. SCISSOR");
		System.out.println("Enter your response : ");
		int opt = sc.nextInt();
		if(opt < 1 || opt > 3) {
			System.out.println("\n INVALID RESPONSE \n");
			continue;
		}
		String user = "";   // empty String
		if(opt == 1) user = "STONE";
		else if(opt == 2) user = "PAPER";
		else user = "SCISSOR";

		System.out.printf("%n %10s %10s %n", "BOT", "USER");  // print bot responcse

		System.out.printf("%13s %10s %n", bot, user);  // print user response


		// calculate winner
		if(user.equals("STONE") && bot.equals("SCISSOR") || 
		   user.equals("PAPER") && bot.equals("STONE") ||
		   user.equals("SCISSOR") && bot.equals("PAPER")) {
			System.out.println("/n ***** USER HAS WON ***** /n");
		} else if(user.equals("STONE") && bot.equals("PAPER") ||
			  user.equals("PAPER") && bot.equals("SCISSOR") ||
			  user.equals("SCISSOR") && bot.equals("STONE")) {
			System.out.println("/n ***** BOT HAS WON ***** /n");
		} else {
			System.out.println("/n ***** IT WAS A DRAW ***** /n");
		}

		}
	}
}
	













