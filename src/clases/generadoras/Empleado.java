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
public class Empleado extends Persona{
    private Integer numeroEmpleado;

    public Empleado(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.numeroEmpleado = numeroEmpleado;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

}
