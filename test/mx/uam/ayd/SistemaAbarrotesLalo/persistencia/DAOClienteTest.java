/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;
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
public class DAOClienteTest {
    
    public DAOClienteTest() {
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
     * Prueva de la clase AgregaCLiente en el ServicioCLiente
     * Test of agregaCliente method, of class DAOCliente.
     */
    @Test
    public void testAgregaCliente() throws Exception {
        System.out.println("agregaCliente");
        Cliente c=new Cliente();
        c.setNombre("jorge");
        c.setCantidad(2.5);
        c.setFecha("2017/09/20");
        Cliente cliente = c;
        DAOCliente instance = new DAOCliente();
        boolean expResult = true;
        boolean result = instance.agregaCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * prueva de la clase RecuperaClientes de la clase DAOClientes
     * Test of recuperameClientes method, of class DAOCliente.
     */
    @Test
    public void testRecuperameClientes() throws Exception {
        System.out.println("recuperameClientes");
        DAOCliente instance = new DAOCliente();
        ArrayList<Cliente> result = instance.recuperameClientes();
        if(result==null){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
}
