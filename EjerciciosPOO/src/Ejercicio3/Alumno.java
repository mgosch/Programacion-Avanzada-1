package Ejercicio3;

public class Alumno extends Persona {
	
	private int cantMateriasAprobadas;
	private static int cantMateriasAlumnosActivos = 0;
	

	public Alumno(String nombre, String apellido, int dni, int edad, int cantMateriasAprobadas) {
		super(nombre, apellido, dni, edad);
		this.cantMateriasAprobadas = cantMateriasAprobadas;
		cantMateriasAlumnosActivos = cantMateriasAlumnosActivos + 1;
	}

	public int getCantMateriasAprobadas() {
		return cantMateriasAprobadas;
	}

	public void setCantMateriasAprobadas(int cantMateriasAprobadas) {
		this.cantMateriasAprobadas = cantMateriasAprobadas;
	}
	
	public void presentarse() {
		System.out.println("Soy " + getNombre() + " " + getApellido() + ", tengo " + getEdad() + " años y mi dni es "+ getDni());
		System.out.println("Soy el alumno número " + cantMateriasAlumnosActivos + " y tengo "+ getCantMateriasAprobadas() + " materias aprobadas");
	}
}
