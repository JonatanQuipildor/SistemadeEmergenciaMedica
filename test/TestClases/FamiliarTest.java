/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Afiliado;
import clases.generadoras.Familiar;
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
public class FamiliarTest {
    GestionHospital gh = new GestionHospital();
    
    public FamiliarTest() {
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
    public void CrearFamiliar(){
        Familiar fa = new Familiar ("Maria", "Nieva", 23715946, "Femenino", LocalDate.of(2004,07,24), "Hijo");
        assertEquals(fa.getNombre(),"Maria");
    }
    
@Test
    public void BuscarFamiliar() throws PersonaNoEncontradaException{
            Familiar fa = new Familiar ("Maria", "Nieva", 23715946, "Femenino", LocalDate.of(2004,07,24), "Hijo");
            Afiliado afi = new Afiliado(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28),LocalDate.of(2018, 11, 14));
            afi.agregarFamiliar(fa);
            gh.altaAfiliado(afi);
            assertEquals(gh.buscarAfiliado(afi.getDNI()).buscarFamiliar(fa.getDNI()), fa);
        }
}
