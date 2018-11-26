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
public class Administrativo extends Empleado{
    public Administrativo(Integer numeroEmpleado, String nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, nombre, apellido, DNI, sexo, fechaNacimiento);
    }
}
