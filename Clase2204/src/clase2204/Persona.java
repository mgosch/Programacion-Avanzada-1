package clase2204;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Persona{

    protected String nombre;
    private String apellido;
    private int dni;
    private Date fechaDeNacimiento;
    private String genero;
    private String direccion;
    private float altura;
    private Number peso;
    
    @Override //sobreescribiendo el metodo de la clase padre (Object)
    public String toString(){
        return null;
    }

    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

    protected void metodoProtegido() {
        System.out.println("Metodo protegido");
    }

    public Persona() {
        this.nombre = "";
    }

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Number getPeso() {
        return peso;
    }

    public void setPeso(Number peso) {
        this.peso = peso;
    }

}
