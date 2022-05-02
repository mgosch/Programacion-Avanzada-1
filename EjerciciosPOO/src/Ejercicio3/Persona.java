package Ejercicio3;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private int edad; 

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellido, int dni, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void presentarse() {
		System.out.println("Soy " + getNombre() + " " + getApellido() + ", tengo " + getEdad() + " a�os y mi dni es "+ getDni());
	}

}
