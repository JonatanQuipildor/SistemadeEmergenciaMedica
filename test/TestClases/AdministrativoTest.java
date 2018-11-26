/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Administrativo;
import excepciones.personalizadas.PersonaNoEncontradaException;
import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema_de_asistencia_medica.GestionHospital;

/**
 *
 * @author Raul
 */
public class AdministrativoTest {
    GestionHospital gh= new GestionHospital();
    public AdministrativoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CrearAdministrativo() throws PersonaNoEncontradaException{
        Administrativo ad = new Administrativo(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        gh.altaAdmin(ad);
        assertEquals(gh.buscarAdmin(ad.getDNI()),ad);
           
}
    
 
     @Test
     public void EliminarAdministrativo() throws PersonaNoEncontradaException {
          Administrativo ad1 = new Administrativo(4321,"Carlos","quipildor",12345678,"Masculino",LocalDate.of(1996, 06,27));
          Administrativo ad = new Administrativo(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
          gh.altaAdmin(ad1);
          gh.altaAdmin(ad);
          gh.bajaAdmin(ad);
        
          PersonaNoEncontradaException na = new PersonaNoEncontradaException();
          assertEquals(1,gh.empleados.size());
          
     }
    
 @Test
 
 public void BuscarAdministrativo(){

        Administrativo ad = new Administrativo(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        Integer dni = 98765432;
        assertEquals(ad.getDNI(), dni);
     
 }

 @Test
 public void ValidarAdministrativo(){
        Administrativo ad = new Administrativo(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        gh.altaAdmin(ad);
        assertEquals(gh.validarDni(ad.getDNI()), false);
 }
}
