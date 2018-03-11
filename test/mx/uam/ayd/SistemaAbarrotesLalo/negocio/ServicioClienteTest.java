/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lalo
 */
public class ServicioClienteTest {
    
    public ServicioClienteTest() {
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
     * Test of agregarCliente method, of class ServicioCliente.
     */
    @Test
    public void testAgregarCliente() throws Exception {
        System.out.println("agregarCliente");
        String nombre = "jorge";
        double cantidad = 4.0;
        String fecha = "2018/03/02";
        ServicioCliente instance = new ServicioCliente();
        boolean expResult = true;
        boolean result = instance.agregarCliente(nombre, cantidad, fecha);
        assertEquals(expResult, result);
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    
     @Test
    public void testAgregarCliente2() throws Exception {
        System.out.println("aceptacion de enteros");
        String nombre = "carlos";
        double cantidad = 5;
        String fecha = "2018/03/02";
        ServicioCliente instance = new ServicioCliente();
        boolean expResult = true;
        boolean result = instance.agregarCliente(nombre, cantidad, fecha);
        assertEquals(expResult, result);
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
        
    }
    
}
