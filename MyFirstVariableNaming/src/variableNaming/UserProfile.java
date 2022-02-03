package variableNaming;

import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dime tu nombre ");
		String name = s.next();
		
		System.out.println("Dime tu edad: ");
		int age = s.nextInt();
		
		System.out.println("Dime tu genero M o F: ");
		String gender = s.next();
		
		System.out.println("En que te gustaria trabajar: ");
		String job = s.next();
		
		System.out.println("Cual es tu Nacionalidad: ");
		String nationality = s.next();
		
		System.out.println("Tipo de sangre: ");
		String blood = s.next();
		
		int born = 2022 - age;
		System.out.println("Naciste en el año: "+ born);
		
		System.out.println("Tu nombre es " + name + " Tu edad es "+ age+ " Tu genero es: "+ gender + " Te gustaria trabajar como " + job + " Tu nacionalidad es " + nationality + " Tu tipo de sangre es " + blood  );
	}

}
