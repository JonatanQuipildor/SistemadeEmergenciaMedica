/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Enfermero;
import excepciones.personalizadas.PersonaNoEncontradaException;
import java.time.LocalDate;
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
public class EnfermeroTest {
    
    GestionHospital gh = new GestionHospital();
    
    public EnfermeroTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CrearEnfermero(){
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        assertEquals(en.getNombre(), "Hector");
    }
    
@Test
    public void EliminarEnfermero() throws PersonaNoEncontradaException{
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        Enfermero ad = new Enfermero(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        gh.altaEnfermero(en);
        gh.altaEnfermero(ad);
        gh.bajaEnfermero(en);
        assertEquals(gh.empleados.size(),1);
    }
    
@Test
    public void BuscarEnfermero() throws PersonaNoEncontradaException{
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        gh.altaEnfermero(en);
        gh.buscarEnfermero(en.getDNI());
        assertEquals(gh.buscarEnfermero(en.getDNI()),en);
    }
    
@Test
    public void ValidarEnfermero(){
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        gh.altaEnfermero(en);
        assertEquals(gh.validarDni(en.getDNI()), false);
    }
}
