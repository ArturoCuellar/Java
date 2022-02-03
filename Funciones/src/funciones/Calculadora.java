package funciones;

import java.util.Scanner;

public class Calculadora {

	static double suma(double a,double b) {
		return a +b;
	}
	
	static double resta(double a,double b) {
		return a - b;
	}
	
	static double multiplicacion(double a,double b) {
		return a *b;
	}
	
	static double division(double a,double b) {
		return a / b;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa el primer numero: ");
		double a=s.nextDouble();
		System.out.println("Ingresa el segundo numero: ");
		double b=s.nextDouble();
		
		System.out.println("La suma es: "+suma(a,b));
		System.out.println("La resta es: " +resta(a,b));
		System.out.println("La multiplicacion es: " +multiplicacion(a,b));
		System.out.println("La division es: "+division(a,b));
	}

}
