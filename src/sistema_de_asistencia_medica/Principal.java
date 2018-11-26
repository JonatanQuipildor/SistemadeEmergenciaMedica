/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_asistencia_medica;

import IGVP.VentanaPrincipal;
import clases.generadoras.*;
import java.time.LocalDate;

/**
 *
 * @author Raul
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionHospital gh= new GestionHospital();
        VentanaPrincipal principal= new VentanaPrincipal(gh);
        
        Afiliado afi = new Afiliado(1234, "Jonatan", "Quipildor", 38031870, "Masculino", LocalDate.of(1994,06,27),LocalDate.of(2018, 11, 11));
        Movil mv = new Movil("Renault", "Express1960", "ABC123", 2008);
        gh.AltaMovil(mv);
        Doctor doctor = new Doctor(1111, "Jorge", "Cabeza", 12345678, "Masculino", LocalDate.of(1980, 11, 03));
        Chofer chofer = new Chofer(2222, "Julio", "Pasayo", 22222222, "Masculino", LocalDate.of(1974, 01, 23));
        Enfermero enfer = new Enfermero(3333, "Marcela", "Villegas", 33333333, "Femenino", LocalDate.of(1989, 05, 12));
        
        gh.altaDoctor(doctor);
        gh.altaChofer(chofer);
        gh.altaEnfermero(enfer);
        gh.altaAfiliado(afi);
    }
    
}
