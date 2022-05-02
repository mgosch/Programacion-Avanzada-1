/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepoo;

/**
 *
 * @author User
 */
public class Pato extends SerVivo implements Nadador, Corredor {
    
    public Pato(String especie, String nombre, int peso){
        super(especie, nombre, peso);
    }
    
    @Override
    public void nadar(){
        System.out.println("Soy un pato y estoy nadando");
    }
    
    @Override
    public void correr(){
        System.out.println("Soy un pato y estoy corriendo");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Quack quack...");
    }

    @Override
    public void comer() {
        System.out.println("Soy un pato y como semillas y algas");
    }
}
