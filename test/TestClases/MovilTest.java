/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Movil;
import excepciones.personalizadas.MovilNoEncontradoExeption;
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
public class MovilTest {
    GestionHospital gh= new GestionHospital();
    
    public MovilTest() {
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
    public void CrearMovil (){
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        assertEquals(mv.getMarca(),"Toyota");
    }
    
@Test 
    public void EliminarMovil () throws MovilNoEncontradoExeption{
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        Movil mv1=new Movil ("Renault","Express1960","BBB321",2008);
        gh.AltaMovil(mv1);
        gh.AltaMovil(mv);
        gh.bajaMovil(mv);
        assertEquals(gh.moviles.size(),1);
    }
    
@Test
    public void BuscarMovil (){
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        String patente = "AAA123";
        assertEquals (mv.getPatente(), patente);
    }
}
