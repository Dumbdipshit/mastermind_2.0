package masterMind2;

import java.util.Random;
import java.util.Scanner;

public class Calculator extends MainGame {

	public String generate() {
		String code;
		String[] kleuren = {"Rd", "Bl", "Gr", "Gl", "Or", "La"};	
		Random rand = new Random();
		
			code = kleuren[rand.nextInt(4)];

		return code;
	}
	
	public void check(String[] poging, String code[], int i) {
		if (poging[i].equals(code[i])) {
			System.out.println("Positie "+(i+1)+" is goed");
		}else if(poging[i].equals(code[0])  || poging[i].equals(code[1])|| poging[i].equals(code[2])|| poging[i].equals(code[3])){
			System.out.println("Positie "+(i+1)+" is bijna goed");
		}else {
			System.out.println("Positie "+(i+1)+" is niet goed");
		}
	}
	
	
	public void yourInput(String[] poging) {
		System.out.println("Dit is jouw keuze.");
		System.out.println("--------------------------");
		System.out.println(poging[0]+" "+poging[1]+" "+poging[2]+" "+poging[3]);
	}
	
	public String checkPlayerInput(int i) {
		Scanner input = new Scanner(System.in);	
		String poging ="none";
		
		String string = poging;
		System.out.println("Raad de kleur van de"+ " " +(i+1)+ "e" + " "+ "positie.");
		System.out.println("Kies uit: Rd, Bl, Gr, Gl, Or, La");
		poging = input.nextLine();
		
	//hier checkt het of de input geldig is//
		while (!poging.equals("Rd") && !poging.equals("Bl") && !poging.equals("Gr") && !poging.equals("Gl") && !poging.equals("Or") && !poging.equals("La")) {
		System.out.println("Kies asjeblieft een mogelijke kleur van de lijst.");
		poging = input.nextLine();
		}return poging;
	}
	
	public boolean replay() {
		Scanner input = new Scanner(System.in);	
		String play;
		
		System.out.println("");
		System.out.println("Do you want to play again?");
		System.out.println("Type: Y or N");
		play = input.nextLine();
		
		while (!play.equals("Y") && !play.equals("N")) {
			System.out.println("Please input a Value that is listed above.");
			play = input.nextLine();
		}
		
		return play.equals("Y");
	}
	
}


