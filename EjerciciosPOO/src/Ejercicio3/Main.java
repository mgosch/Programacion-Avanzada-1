package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Docente docente = new Docente("Facu", "Martin", 1234567, 24, 3521);
		docente.presentarse();
		
		Persona persona = new Persona("Vicky", "Gosch", 30023937, 39);
		Persona persona1 = new Persona("Pepe", "Pompin", 30023937, 39);
		Alumno alumno = new Alumno("Juan", "Pompin", 30023937, 39, 5);
		Alumno alumno1 = new Alumno("Jorge", "Pompin", 30023937, 39, 2);
		Docente docente1 = new Docente("Santiago", "Pompin", 30023937, 39, 200012);
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(persona);
		listaPersonas.add(persona1);
		listaPersonas.add(alumno);
		listaPersonas.add(alumno1);
		listaPersonas.add(docente1);
		
		for (Persona per : listaPersonas) {
			per.presentarse();
		}
		
 	}

}
