package ProgramaI;

import java.util.Scanner;

public class ProgramaI {

	public static void main(String[] args) {
		 Scanner entradaEscaner = new Scanner (System.in);

	     System.out.println("Ingrese su nombre");
	     String nombre = entradaEscaner.nextLine();
	     
	     System.out.println("Bienvenido " + nombre);

	}

}
