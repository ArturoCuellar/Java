package controlDeFlujo;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println("Elige una opcion");
		
		String enter = s.nextLine();
		
		switch (enter) {
		case "1": 
			System.out.println("Elegiste opcion uno");
			break;
			
		case "2":
			System.out.println("Elegiste la opcion dos");
			break;
		
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}

}
