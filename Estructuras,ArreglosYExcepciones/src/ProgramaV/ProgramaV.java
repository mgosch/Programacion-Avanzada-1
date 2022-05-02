package ProgramaV;

import java.util.Scanner;

public class ProgramaV {

	public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n = entradaEscaner.nextInt();
        
        System.out.println("Ingrese otro número:");
        int n2 = entradaEscaner.nextInt();
        
        int suma = n + n2;
        System.out.println("La suma de los números es: " + suma);
        
        int resta = n - n2;
        System.out.println("La resta de los números es: " + resta);
        
        int resto = n%n2;
        int division = (n-resto)/n2;
        System.out.println("La división de los números es: " + division + " con resto: " + resto);
        
        int multiplicacion = n*n2;
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        
        System.out.println("La tabla de múltiplicación de: " + n + " es: " + n + " " + n*2 + " " + n*3 + " " + n*4 + " " + n*5 + " " + n*6 + " " + n*7 + " " + n*8 + " " + n*9 + " " + n*10);
        System.out.println("La tabla de múltiplicación de: " + n2 + " es: " + n2 + " " + n2*2 + " " + n2*3 + " " + n2*4 + " " + n2*5 + " " + n2*6 + " " + n2*7 + " " + n2*8 + " " + n2*9 + " " + n2*10);
	
        System.out.println("El factorial de: " + n + " es: " + factorial(n));
        System.out.println("La factorial de: " + n2 + " es: " + factorial(n2));
        
        int p =  (int) Math.pow(n, n2);
        int p2 =  (int) Math.pow(n2, n);
        System.out.println("La potencia de " + n + " es: " + p);
        System.out.println("La potencia de " + n2 + " es: " + p2);
        
        System.out.println("El número de fibonacci numero " + n + " es: " + fibonacci(n));
        System.out.println("El número de fibonacci numero " + n2 + " es: " + fibonacci(n2));
	}
	
	private static int factorial (int numero) {
		  if (numero==0)
		    return 1;
		  else
		    return numero * factorial(numero-1);
	}
	
	private static int fibonacci(int n) {
		int num0 = 0;
        int num1 = 1;
        int fib = num0 + num1;
        for (int i = 2; i < n; ++i) {
            num0 = num1;
            num1 = fib;
            fib = num0 + num1;
        }
        return fib;
	}

}
