package masterMind2;

import java.util.Random;

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
}


