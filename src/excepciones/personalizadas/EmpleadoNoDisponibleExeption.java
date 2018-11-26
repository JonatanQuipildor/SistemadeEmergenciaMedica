/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.personalizadas;

/**
 *
 * @author Raul
 */
public class EmpleadoNoDisponibleExeption extends Exception{
    public EmpleadoNoDisponibleExeption(String mensaje){
        super(mensaje);
    }
}
