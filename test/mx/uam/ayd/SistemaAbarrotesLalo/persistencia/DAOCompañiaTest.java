/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Compañia;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Byakuya
 */
public class DAOCompañiaTest {
    
    public DAOCompañiaTest() {
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

    /**
     * Test of AgregarCompañia method, of class DAOCompañia.
     */
    @Test
    public void testAgregarCompañia() throws Exception {
        System.out.println("AgregarCompa\u00f1ia");
        String nombre = "";
        DAOCompañia instance = new DAOCompañia();
        boolean expResult = true;
        boolean result = instance.AgregarCompañia(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarCompañias method, of class DAOCompañia.
     */
    @Test
    public void testRecuperarCompañias() throws Exception {
        System.out.println("recuperarCompa\u00f1ias");
        DAOCompañia instance = new DAOCompañia();
        ArrayList<String> expResult = instance.recuperarCompañias();
        ArrayList<String> result = instance.recuperarCompañias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCompañia method, of class DAOCompañia.
     */
    @Test
    public void testModificarCompañia() {
        System.out.println("modificarCompa\u00f1ia");
        String id = "";
        String nombre = "";
        DAOCompañia instance = new DAOCompañia();
        Compañia expResult = null;
        Compañia result = instance.modificarCompañia(id, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarCompañia method, of class DAOCompañia.
     */
    @Test
    public void testRecuperarCompañia() {
        System.out.println("recuperarCompa\u00f1ia");
        DAOCompañia instance = new DAOCompañia();
        ArrayList<String> expResult = instance.recuperarCompañia();
        ArrayList<String> result = instance.recuperarCompañia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
        /**
     * Test of eliminarCompañia method, of class DAOCompañia.
     */
    @Test
    public void testEliminarCompañia() {
        
        
        System.out.println("recuperarCompa\u00f1ia");
        DAOCompañia instance = new DAOCompañia();
        Compañia expResult = null;
        Compañia result = instance.eliminarCompañia("prueba");
        assertEquals(expResult, result);
        
        
    }
    
}
