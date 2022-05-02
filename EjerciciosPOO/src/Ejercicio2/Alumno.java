package Ejercicio2;

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
	
	@Override
	public void presentarse() {
		super.presentarse();
		System.out.println("Soy el alumno número " + cantMateriasAlumnosActivos + " y tengo "+ getCantMateriasAprobadas() + " materias aprobadas");
	}
}
