package ProgramaII;

import java.util.Scanner;

public class ProgramaII {

	public static void main(String[] args) {
		 Scanner entradaEscaner = new Scanner (System.in);

	     System.out.println("Ingrese su edad");
	     int edad = entradaEscaner.nextInt();
	     
	     if (edad>=0 && edad<=5) {
	    	 System.out.println("primera infancia");
	     }
	     if (edad>=6 && edad<=11) {
	    	 System.out.println("infancia");
	     }
	     if (edad>=12 && edad<=18) {
	    	 System.out.println("adolescencia");
	     }
	     if (edad>=19 && edad<=26) {
	    	 System.out.println("juventud");
	     }
	     if (edad>=27 && edad<=59) {
	    	 System.out.println("adultez");
	     }
	     if (edad>=60) {
	    	 System.out.println("vejez");
	     }

	}

}
