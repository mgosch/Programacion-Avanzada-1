package Ejercicio3;

public class Docente extends Persona {
	
	private int numeroLegajo;


	public Docente(String nombre, String apellido, int dni, int edad, int numeroLegajo) {
		super(nombre, apellido, dni, edad);
		this.numeroLegajo = numeroLegajo;
	}
	
	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}
	
	public void presentarse() {
		System.out.println("Soy " + getNombre() + " " + getApellido() + ", tengo " + getEdad() + " años y mi dni es "+ getDni());
		System.out.println("Soy docente, y mi número de legajo es " + getNumeroLegajo());
	}
	
}
