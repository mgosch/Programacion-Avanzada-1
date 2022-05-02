package ejerciciosclase1;

import java.util.Scanner;

public class EjerciciosClase1 {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

    /**
     * Escribe un programa Java que dibuje los números del 1 al 100 que sean
     * divisibles por 3.
     */
    private static void ejercicio1() {
        System.out.println("------Ejercicio-1------ Multiplos de 3");
        //Metodo 1
        int i;
        for (i = 1; i < 100; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        //Metodo 2
        /*
        int j;
        //de esta forma, solo recorro los numeros de a 3,
        //en vez de recorrerlos todos y verificar si es divisible o no
        for(j = 3; j < 100; j +=3){
            System.out.println(j);
        }
         */
        System.out.println("------+++++++++++------");
        System.out.println("");
    }

    /**
     * Crea un programa que dibuje por pantalla si un estudiante ha aprobado o
     * no la asignatura de matemáticas. Tienes que usar las siguientes
     * variables: 1.	notaExamen: de tipo double y que representa el 60% de la
     * nota final. 2.	notaTrabajoGrupo: de tipo double y que representa el 40%
     * de la nota final. 3.	ratioAsistencia: tipo Boolean que indica si el
     * estudiante cumple con el mínimo de asistencia requerido. Los valores de
     * estas variables estarán hardcodeados. Las condiciones para aprobar la
     * asignatura son 2: 1.	Conseguir una media de las dos notas, igual o
     * superior a 7, considerando los pesos de ambas notas. 2.	Cumplir con el
     * ratio mínimo de asistencia requerido.
     *
     */
    private static void ejercicio2() {
        System.out.println("------Ejercicio-2------ Notas de examen");
        //valores a modo de ejemplo
        double notaExamen = 9;
        double notaTrabajoGrupo = 4;
        boolean asistencia = true;

        double notaPonderada = notaExamen * 0.6 + notaTrabajoGrupo * 0.4;

        if (notaPonderada >= 7 && asistencia) {
            System.out.println("El alumno ha aprobado la materia");
        } else {
            System.out.println("El alumno -NO- ha aprobado la materia");
        }

        System.out.println("------+++++++++++------");
        System.out.println("");
    }

    /**
     * Escriba un programa que solicite ingresar un número por teclado y que
     * imprima la serie de Fibonacci (opcional usando recursividad)
     */
    private static void ejercicio3() {
        System.out.println("------Ejercicio-3------ Fibonacci");

        int n0 = 0;
        int n1 = 1;
        int fib = n0 + n1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el termino de fibonacci");
        int n = sc.nextInt();

        for (int i = 2; i < n; ++i) {
            n0 = n1;
            n1 = fib;
            fib = n0 + n1;
        }

        //opcional recursividad
        //fib = fibonacci(n);
        System.out.println("El numero de fibonacci numero " + n + " es " + fib);

        System.out.println("------+++++++++++------");
        System.out.println("");
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Escriba un programa que solicite ingresar un número por teclado e indique
     * lo siguiente •	Si el número es primo? •	Si el número es par o impar? •	Si
     * es un número capicúa (ej 12321) •	Si es un número Armstrong, un número es
     * Armstrong si el mismo es igual a la suma de los cubos de cada digito, por
     * ejemplo 153 = 1*1*1+5*5*5+3*3*3
     */
    private static void ejercicio4() {
        System.out.println("------Ejercicio-4------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " -NO- es primo");
        }
        
        if (esCapicua(n)) {
            System.out.println(n + " es capicua");
        } else {
            System.out.println(n + " -NO- es capicua");
        }

        if (esPar(n)) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " -NO- es par");
        }

        if (esArmstrong(n)) {
            System.out.println(n + " es numero de Armstrong");
        } else {
            System.out.println(n + " -NO- es numero de Armstrong");
        }

        System.out.println("------+++++++++++------");
        System.out.println("");
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
            acum += Math.pow(vecInt, 3); // Math.pow es el método para elevar numeros
        }
        
        return numero == acum;
    }
}
