/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Doctor;
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
public class DoctorTest {
    
    GestionHospital gh = new GestionHospital();
    
    public DoctorTest() {
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
    public void CrearDoctor(){
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        assertEquals (d.getNombre(), "Melisa");
    }
    
@Test
    public void EliminarDoctor() throws PersonaNoEncontradaException{
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        Doctor ad = new Doctor(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28));
        gh.altaDoctor(ad);
        gh.altaDoctor(d);
        gh.bajaDoctor(d);
        assertEquals (gh.empleados.size(),1);
    }
    
@Test
    public void BuscarDoctor() throws PersonaNoEncontradaException{
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        gh.altaDoctor(d);
        gh.buscarDoctor(d.getDNI());
        assertEquals(gh.buscarDoctor(d.getDNI()),d);
    }
    
@Test
    public void ValidarDoctor(){
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        gh.altaDoctor(d);
        assertEquals(gh.validarDni(d.getDNI()), false);
    }
}
