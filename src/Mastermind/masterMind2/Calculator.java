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
	
}

