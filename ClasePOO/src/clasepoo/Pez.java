/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepoo;

/**
 *
 * @author User
 */
public class Pez extends SerVivo implements Nadador {
    
    public Pez(String especie, String nombre, int peso){
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public void nadar(){
        System.out.println("Soy un pez y estoy nadando");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Glup glup...");
    }

    @Override
    public void comer() {
        System.out.println("Soy un pez y como pececitos mas chiquitos y moluscos");
    }
    
    
}
