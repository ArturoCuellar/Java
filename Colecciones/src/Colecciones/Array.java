package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
	
		String[] arreglo = {"Mau","Sofi", "Sam", "Abril"};
		
		System.out.println(arreglo[1]);
		
//		for(int i=0; i<arreglo.length;i++) {
//			System.out.println(arreglo[i]);
//		}
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Ferrari");
		
	
			System.out.println(cars.get(1));
			cars.set(1, "window");
			System.out.println(cars.size());
			cars.remove(1);
			System.out.println(cars);
			
			//Acceder a un art?culo
			// cars.get(1);
			//Cambiar un art?culo
			//cars.set(1, "Opel");
			//Eliminar un art?culo
			//cars.remove(0);
			//Tama?o de ArrayList
			//cars.size();
			
//			for(int i=0; i<cars.size();i++) {
//				System.out.println(cars.get(i));
//		}
			Collections.sort(cars);
			for(String i : cars) {
				System.out.println(i);
			}
			

	}

}
