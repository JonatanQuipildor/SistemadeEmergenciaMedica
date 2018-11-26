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
public class Metodos {

    
    public static void validarDNI(Integer DNI) throws DNIException {
        String dni = String.valueOf(DNI);
        
        //Comprobamos la longitud del dni
        if (!(dni.length() >= 8 && dni.length() <= 8)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
      
        
       String parte_numerica = dni.substring(0, dni.length());     
               int numeroDNI = 0;

        try {
            
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }

    } 
}
