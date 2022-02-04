package poo;

public class Gatito {
	
	private String nombre;
	private String color;
	private String raza;
	private int edad;
	
	public Gatito(String nombre,String color, String raza, int edad) {
		this.nombre=nombre;
		this.color=color;
		this.raza=raza;
		this.edad=edad;
	}
	
	public Gatito() {
		this.nombre="";
		this.color="";
		this.raza= "";
		this.edad=0;

	}
		
	public void establecerNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public void establecerRaza(String raza) {
		this.raza= raza;
	}
	
	public void establecerColor(String color) {
		this.color= color;
	}
	
	public void establecerEdad(int edad) {
		this.edad= edad;
	}

	public String consultarNombre (){ //Consultamos el nombre
	    return nombre;
	}

	public String consultarColor() { //Consultamos el color
		return color;
	}

	public String consultarRaza (){ //Consultamos la raza
	    return raza;
	}

	public int consultarEdad (){ //Consultamos la edad
	    return edad;
	}
	
	public static void main(String[] args) {
			Gatito gatito = new Gatito();
			
			gatito.establecerNombre("PICHU");
			gatito.establecerColor("Blanco con Negro");
			gatito.establecerRaza("Calle");
			gatito.establecerEdad(2);
			
			
			System.out.println("El nombre de mi gato es "+gatito.consultarNombre());
			
			
	}
	
	}


