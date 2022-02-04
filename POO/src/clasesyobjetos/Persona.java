package clasesyobjetos;

public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Persona persona1 = new Persona("Arturo", "Cuellar",26);
		System.out.println("El nombre de la persona es= "+persona1.getNombre());
		System.out.println("El apellido de la persona es= "+persona1.getApellido());
		System.out.println("La edad de la persona es= "+persona1.getEdad());
		
		Persona persona2 = new Persona();
		
		
		persona2.setNombre("Linda");
		persona2.setApellido("Olmedo");
		persona2.setEdad(24);
		
		System.out.println("El nombre de la persona es= "+persona2.getNombre());
		System.out.println("El apellido de la persona es= "+persona2.getApellido());
		System.out.println("La edad de la persona es= "+persona2.getEdad());
	}




	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	
	public Persona() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}

	

}
