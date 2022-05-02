/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2204;

/**
 *
 * @author User
 */
public class Alumno extends Persona{
    
    private int numeroLibreta;
    private String carrera;
    private String[] materias;
    private int materiasAprobadas;
    
    public Alumno(){
        //super("nombre", "apellido");
        this.setNombre("nombre");
        this.setApellido("Apellido");
    }

    public int getNumeroLibreta() {
        
        this.nombre = "";
        
        this.metodoProtegido();
        
        return numeroLibreta;
    }

    public void setNumeroLibreta(int numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    
    
    
}
