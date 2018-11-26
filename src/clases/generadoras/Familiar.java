/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.generadoras;

import java.time.LocalDate;

/**
 *
 * @author Raul
 */
public class Familiar extends Persona{
    private String relacion; 
    
    public Familiar(String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento, String relacion) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.relacion= relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
}
