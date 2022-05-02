/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepoo;

/**
 *
 * @author User
 */
public abstract class SerVivo implements Comedor {
    
    protected int peso;
    protected String nombre;
    protected String especie;
    
    protected SerVivo(){
        
    }
    
    protected SerVivo(String especie, String nombre, int peso){
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public void getDatosSerVivo(){
        System.out.println("Soy un " + nombre + " de la especie " + especie + " y peso " + peso + " kg");
    }
    
    public abstract void emitirSonido();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
}
