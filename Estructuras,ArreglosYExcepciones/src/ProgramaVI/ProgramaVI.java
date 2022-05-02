package ProgramaVI;

import java.util.Scanner;

public class ProgramaVI {

	public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = entradaEscaner.nextLine();
        
        System.out.println("La cantidad de caracteres del texto es: " + texto.length());
        
        System.out.println("La cantidad de puntuación del texto es: " + cantidadPuntuacion(texto));
        
        cantidadVocalesyConsonantes(texto);
        
        String textoSBlanco = texto.replace(" ", "");
        System.out.println("Texto sin blancos: " + textoSBlanco);
        
        System.out.println("Ingrese un caracter:");
        String ch = entradaEscaner.nextLine();
        String textoCAsterico = texto.replace(ch, "*");
        System.out.println("Texto sin blancos: " + textoCAsterico);
        
	}

	private static int cantidadPuntuacion(String texto) {
		int countp = 0;
        for (int i = 0; i < texto.length(); i++) {
			char ch = texto.charAt(i);
			if (ch == '.' ) {
				countp++;
			}
		}
        return countp;
	}
	
	private static void cantidadVocalesyConsonantes(String texto) {
		int countv = 0;
		int countc = 0;
        for (int i = 0; i < texto.length(); i++) {
			char ch = texto.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countv++;
			} else if (ch >= 'a' && ch <= 'z') {
				countc++;
			}
		}
        System.out.println("La cantidad de vocales del texto es: " + countv);
        System.out.println("La cantidad de consonates del texto es: " + countc);
	}
	
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }

}
