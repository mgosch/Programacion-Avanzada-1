/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasepoo;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SerVivo servivo = new SerVivo();
        
        Vaca vaca = new Vaca("Mamifero", "Vaquita", 600);
        
        System.out.println(vaca);
        
        //Vaca vaca = new Vaca("Mamifero", "Vaquita", 600);
        vaca.getDatosSerVivo();
        vaca.emitirSonido();
        vaca.correr();
        vaca.comer();
        
        System.out.println("-------------------");
        
        Pez pez = new Pez("Pez", "Pececito", 1);
        pez.getDatosSerVivo();
        pez.emitirSonido();        
        pez.nadar();
        pez.comer();
        
        System.out.println("-------------------");
        
        Pato pato = new Pato("Ave", "Patito", 2);
        pato.getDatosSerVivo();
        pato.emitirSonido();
        pato.nadar();
        pato.correr();
        pato.comer();
        
    }
    
}
