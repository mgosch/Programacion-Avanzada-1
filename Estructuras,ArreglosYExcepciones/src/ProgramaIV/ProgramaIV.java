package ProgramaIV;

import java.util.Scanner;

public class ProgramaIV {

	public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n = entradaEscaner.nextInt();
        
        if (esPrimo(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
        
        if (esCapicua(n)) {
            System.out.println(n + " es capicua");
        } else {
            System.out.println(n + " no es capicua");
        }

        if (esPar(n)) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " no es par");
        }

        if (esArmstrong(n)) {
            System.out.println(n + " es número de Armstrong");
        } else {
            System.out.println(n + " no es número de Armstrong");
        }
	}
	
	private static boolean esPrimo(int numero) {
        
        if(numero <= 1) return false; //0 y 1 no son primos!!
        
        for (int i = 2; i < numero; ++i) {
            if (numero % i == 0) { //si n es divisible por algun numero desde 2 hasta n - 1, significa que no es primo
                return false;
            }
        }
        return true;
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    private static boolean esCapicua(int numero){
        
        String nToString = String.valueOf(numero);//convierto el entero a string
        String vec[] = nToString.split("");//spliteo, divido el string en un array.
        //Al splitear sin delimitador, se separa cada caracter de forma individual en un elemento del array
        
        int n = vec.length;//obtengo la cantidad de elementos del vector
        
        for(int i = 0; i < n/2; ++i){ // recorrer hasta la mitad es suficiente
            if(!vec[i].equals(vec[n-i-1])){ // comparo el primero con el ultimo, el segundo con el anteultimo, etc
                return false;
            }
        }
        
        return true;
    }

    private static boolean esArmstrong(int numero) {
        String nToString = String.valueOf(numero);//convierto el entero a string
        String vec[] = nToString.split("");//spliteo, divido el string en un array.
        //Al splitear sin delimitador, se separa cada caracter de forma individual en un elemento del array
        
        int n = vec.length;//obtengo la cantidad de elementos del vector
        
        int acum = 0;
        
        for(String vecNumero: vec){
            int vecInt = Integer.valueOf(vecNumero);
            acum += Math.pow(vecInt, 3); // Math.pow es el mÃ©todo para elevar numeros
        }
        
        return numero == acum;
    }

}
