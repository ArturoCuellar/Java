package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa el diametro del circulo: ");
		double diameter = s.nextDouble();
		
		double radio = diameter/2;
		double cuadrado = radio * radio;
		
		double area2 = Math.PI * cuadrado;
		double area = Math.PI *diameter;
		
		System.out.println("El area del circulo es: " + area2);
		System.out.println("El perimetro del circulo es: "+ area);
	}

}
