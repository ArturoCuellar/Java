package funciones;

public class OveraMethod {

	static int myMethod(int age) {
		return age;
	}
	
	static float myMethod(float height) {
		return height;
	}
	
	static double myMethod(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Mi edad es: "+ myMethod(26));
		System.out.println("Mi estatura es : "+myMethod(1.70f));
		System.out.println("La suma de dos numeros aleatorios es: "+ myMethod(5,2));
	}

}
