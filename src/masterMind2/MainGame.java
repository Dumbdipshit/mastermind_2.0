package masterMind2;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//FYI ik heb geen try catch gebruikt want bij het user input heb ik een check gemaakt of de input van de user geldig is//

public class MainGame {
	public static void main(String[] args) {
		Calculator calc =new Calculator();	
		Random rand = new Random();
		Scanner input = new Scanner(System.in);	
		String[] kleuren = {"Rd", "Bl", "Gr", "Gl", "Or", "La"};	
		String[] code = {"een", "twee", "drie", "vier"};
		String[] poging = {"een", "twee", "dire", "vier"};
		int rounds = 1;
		boolean cont = false;
		boolean won = false;
		
	
		//hier genereed de code//	
		for (int i = 0; i < 4; i++) {
			code[i] = calc.generate();
			}

		
		while (rounds <= 10 && cont == false) {
			System.out.println("");
			System.out.println("Ronde: "+rounds);
			
			if(cont == false) {
				//hier is het begin input//
			for (int i = 0; i < 4; i++) {
				String string = poging[i];
				System.out.println("Raad de kleur van de"+ " " +(i+1)+ "e" + " "+ "positie.");
				System.out.println("Kies uit: Rd, Bl, Gr, Gl, Or, La");
				poging[i] = input.nextLine();
				
			//hier checkt het of de input geldig is//
				while (!poging[i].equals("Rd") && !poging[i].equals("Bl") && !poging[i].equals("Gr") && !poging[i].equals("Gl") && !poging[i].equals("Or") && !poging[i].equals("La")) {
				System.out.println("Kies asjeblieft een mogelijke kleur van de lijst.");
				poging[i] = input.nextLine();
			}
				
				//hier zegt de systeem jouwe input//
		}		calc.yourInput(poging);

				System.out.println("");
				//hier checkt het systeem of jij iets goed geraden hebt//
				for (int i = 0; i < 4; i++) {
					calc.check(poging, code, i);
				}
				rounds = rounds + 1;
				//hier checkt het systeem of jij gewonen hebt//
				if (poging[0].equals(code[0]) && poging[1].equals(code[1]) && poging[2].equals(code[2]) && poging[3].equals(code[3])) {
					System.out.println("Goed gedaan je hebt gewonnen");
					rounds = 10;
					cont = true;
					won = true;
				}	
				if (rounds == 10 && won == false) {
					cont = true;
					System.out.println("Je hebt verloren");
					System.out.println("");
					System.out.println("De code was");
					System.out.println(code[0]+" "+code[1]+" "+code[2]+" "+code[3]);
					System.out.println("");
					System.out.println("Volgende keer beter");
				}
			}
		}
}
}
