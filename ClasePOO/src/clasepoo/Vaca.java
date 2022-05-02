/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepoo;

/**
 *
 * @author User
 */
public class Vaca extends SerVivo implements Corredor {
    
    private int cantPatas;
    
    public Vaca(String especie, String nombre, int peso){
        super(especie, nombre, peso);
        this.peso = 600;
        this.cantPatas = 4;
    }
    
    public void correr(){
        System.out.println("Soy una vaca y estoy corriendo");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Muuuuuu....");
    }

    @Override
    public void comer() {
        System.out.println("Soy una vaca y como pasto");
    }

}
