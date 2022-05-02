package ProgramaIII;

import java.util.Scanner;

public class ProgramaIII {

	public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int fib = n0 + n1;

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el termino de fibonacci");
        int n = entradaEscaner.nextInt();

        System.out.print("La serie finonacci es: "+ n0 + " ");
        System.out.print(n1 + " ");
        System.out.print(fib + " ");
        for (int i = 2; i < n; ++i) {
            n0 = n1;
            n1 = fib;
            fib = n0 + n1;
            System.out.print(fib + " ");
        }

        System.out.println("El número de fibonacci numero " + n + " es " + fib);
	}

}
