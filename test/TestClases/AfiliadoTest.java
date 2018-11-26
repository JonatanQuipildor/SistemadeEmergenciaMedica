/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClases;

import clases.generadoras.Afiliado;
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
public class AfiliadoTest {
    GestionHospital gh= new GestionHospital();
    
    public AfiliadoTest() {
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
     public void crearAfiliado() {
        Afiliado afi = new Afiliado(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28),LocalDate.of(2018, 11, 14));
        assertEquals(afi.getNombre(),"Jesus");
     }
   
 @Test
     public void EliminarAfiliado() throws PersonaNoEncontradaException {
       Afiliado afi = new Afiliado(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28),LocalDate.of(2018, 11, 14));
       Afiliado afi1 = new Afiliado(4321,"Carlos", "quipildor",12345678, "Masculino",LocalDate.of(1996, 06, 27),LocalDate.of(2018, 10, 01));
       gh.altaAfiliado(afi);
       gh.altaAfiliado(afi1);
       gh.bajaAfiliado(afi);
       assertEquals(gh.afiliados.size(),1);
     }
    
 @Test
 
 public void BuscarAfiliado() throws PersonaNoEncontradaException{

        Afiliado afi = new Afiliado(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28),LocalDate.of(2018, 11, 14));
        gh.altaAfiliado(afi);
        gh.buscarAfiliado(afi.getDNI());
        assertEquals(gh.buscarAfiliado(afi.getDNI()), afi);//lo pudse para ver si da error
        
     
 }
 @Test
 public void VerificarAbono(){
     Afiliado afi = new Afiliado(1234,"Jesus", "quipildor",98765432, "Masculino",LocalDate.of(2008, 12, 28),LocalDate.of(2018, 11, 14));
     gh.altaAfiliado(afi);
     assertEquals(gh.verificarAbonoAfiliado(afi),true);
    }
}
