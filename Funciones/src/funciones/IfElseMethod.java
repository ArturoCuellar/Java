package funciones;

import java.security.AccessControlContext;
import java.util.Scanner;

public class IfElseMethod {

	static void access(int age) {
		
		if(age < 18) {
			System.out.println("Acceso Denegado");
		}else {
			System.out.println("Acceso Permitido");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int age = s.nextInt();
		
		access(age);
	}

}
