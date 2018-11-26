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
public class DNIException extends Exception{

    public static final String LONGITUD_NO_CORRECTA = "La longitud de su dni debe ser de 8 digitos";
    public static final String PARTE_NUMERICA_NO_CORRECTA = "El dni solo puede estar formado por numeros ";


    public DNIException(String mensaje){
        super(mensaje);
    }
}
