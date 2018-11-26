/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Chofer;
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
public class ChoferTest {
    
    GestionHospital gh = new GestionHospital();
    
    public ChoferTest() {
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
    public void CrearChofer () {
        Chofer ch = new Chofer (4321,"Carlos","quipildor",12345678,"Masculino",LocalDate.of(1996, 06,27));
        assertEquals (ch.getNombre(),"Carlos");
    }

@Test
    public void EliminarChofer () throws PersonaNoEncontradaException{
        Chofer ch = new Chofer (4321,"Carlos","quipildor",12345678,"Masculino",LocalDate.of(1996, 06,27));
        Chofer ch1 = new Chofer(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        gh.altaChofer(ch);
        gh.altaChofer(ch1);
        gh.bajaChofer(ch);
        assertEquals (gh.empleados.size(),1);
    }
    
@Test
    public void BuscarChofer () throws PersonaNoEncontradaException{
        Chofer ch = new Chofer (4321,"Carlos","quipildor",12345678,"Masculino",LocalDate.of(1996, 06,27));
        gh.altaChofer(ch);
        gh.buscarChofer(ch.getDNI());
        assertEquals (gh.buscarChofer(ch.getDNI()),ch);
    }
    
@Test
    public void ValidarChofer(){
        Chofer ch = new Chofer (4321,"Carlos","quipildor",12345678,"Masculino",LocalDate.of(1996, 06,27));
        gh.altaChofer(ch);
        assertEquals (gh.validarDni(ch.getDNI()), false);
    }
}
