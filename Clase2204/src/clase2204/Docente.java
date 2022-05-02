/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2204;

/**
 *
 * @author User
 */
public class Docente extends Persona{
    
    private String legajo;
    private String[] materias;
    private String[] aulas;
    private String[] carreras;
    private String[] sedes;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String[] getAulas() {
        return aulas;
    }

    public void setAulas(String[] aulas) {
        this.aulas = aulas;
    }

    public String[] getCarreras() {
        return carreras;
    }

    public void setCarreras(String[] carreras) {
        this.carreras = carreras;
    }

    public String[] getSedes() {
        return sedes;
    }

    public void setSedes(String[] sedes) {
        this.sedes = sedes;
    }
    
    
    
}
