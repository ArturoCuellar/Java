package Colecciones;
import java.util.HashMap;

public class Collections2 {

	public static void main(String[] args) {
	

	    HashMap <String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    for (String i : capitalCities.keySet()) { System.out.println(i); }
	    for (String i : capitalCities.values()) { System.out.println(i); }
	    for (String i : capitalCities.keySet()) {  System.out.println("key: " + i + " value: " + capitalCities.get(i));}

	    
	    System.out.println(capitalCities.get("England"));
	    capitalCities.remove("Germany");
	    System.out.println(capitalCities.size());
	    capitalCities.clear();
	    System.out.println(capitalCities.size());
//	    Acceder a un artículo
//	    capitalCities.get("England");
//	    Eliminar un artículo
//	    capitalCities.remove("England");
//	    Para eliminar todos los elementos
//	    capitalCities.clear();
//	    Tamaño de HashMap
//	    capitalCities.size();
//	    Recorrer un HashMap
//	    for (String i : capitalCities.keySet()) { System.out.println(i); }
//	    for (String i : capitalCities.values()) { System.out.println(i); }
//	    for (String i : capitalCities.keySet()) {  System.out.println("key: " + i + " value: " + capitalCities.get(i));}
//

	}

}
