/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;
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
public class DAOProveedorTest {
    
    public DAOProveedorTest() {
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
     * Test of recuperaProveedores method, of class DAOProveedor.
     */
    @Test
    public void testRecuperaProveedores() throws Exception {
        System.out.println("recuperaProveedores");
        DAOProveedor instance = new DAOProveedor();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.recuperaProveedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregaProveedor method, of class DAOProveedor.
     */
    @Test
    public void testAgregaProveedor() {
        System.out.println("agregaProveedor");
        int id = 0;
        String proveedor = "";
        String telefono = "";
        String nombre = "";
        String tipo = "";
        DAOProveedor instance = new DAOProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.agregaProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProveedor method, of class DAOProveedor.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("modificarProveedor");
        String id = "";
        String proveedor = "";
        String telefono = "";
        String nombre = "";
        String tipo = "";
        DAOProveedor instance = new DAOProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.modificarProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
