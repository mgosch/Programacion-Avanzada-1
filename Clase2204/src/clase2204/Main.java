/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2204;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();

        Persona alumno = new Alumno();
        alumno.setNombre("Alumno");
        
        Persona docente = new Docente();
        docente.setNombre("Docente");
        
        Persona personas[] = new Persona[2];
        
        personas[0] = alumno;
        personas[1] = docente;
        
        for(int i = 0; i < 2; i++){
            System.out.println(personas[i].getNombre());
            //System.out.println(personas[i].getMaterias());
        }
        
        
    }
   
}