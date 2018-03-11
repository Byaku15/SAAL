/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

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
public class ServicioProveedorTest {
    
    public ServicioProveedorTest() {
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
     * Test of recuperarProveedores method, of class ServicioProveedor.
     */
    @Test
    public void testRecuperarProveedores() throws Exception {
        System.out.println("recuperarProveedores");
        ServicioProveedor instance = new ServicioProveedor();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.recuperarProveedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProveedor method, of class ServicioProveedor.
     */
    @Test
    public void testAgregarProveedor() throws Exception {
        System.out.println("agregarProveedor");
        int id = 2;
        String proveedor = "Sam";
        String telefono = "56789098";
        String nombre = "FGO";
        String tipo = "Juegos";
        ServicioProveedor instance = new ServicioProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.agregarProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProveedor method, of class ServicioProveedor.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("modificarProveedor");
        String id = "1";
        String proveedor = "ádd";
        String telefono = "4453";
        String nombre = "df";
        String tipo = "dfs";
        ServicioProveedor instance = new ServicioProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.modificarProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
