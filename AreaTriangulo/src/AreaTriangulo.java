//Este es un comentario
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s= new Scanner(System.in);

		   System.out.println ("Ingresa la base");
		   double base= s.nextDouble();

		   System.out.println ("Ingresa el la altura");
		   double altura= s.nextDouble();


		   double area =(base*altura)/2;
		   System.out.println("El area del Triangulo es: " + area);


	}

}
