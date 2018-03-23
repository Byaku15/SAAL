/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.ResultSet;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;
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
public class ServicioProductoTest {
    
    public ServicioProductoTest() {
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
     * Test of buscaProducto method, of class ServicioProducto.
     */
    @Test
    public void testBuscaProducto() throws Exception {
        System.out.println("buscaProducto");
        String nombreProducto = "";
        ServicioProducto instance = new ServicioProducto();
        double expResult = 0.0;
        double result = instance.buscaProducto(nombreProducto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarProductos method, of class ServicioProducto.
     */
    @Test
    public void testMostrarProductos() throws Exception {
        System.out.println("mostrarProductos");
        String marca = "";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        ResultSet result = instance.mostrarProductos(marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarProductosPorCaducar method, of class ServicioProducto.
     */
    @Test
    public void testMostrarProductosPorCaducar() {
        System.out.println("mostrarProductosPorCaducar");
        String marcaActual = "";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        ResultSet result = instance.mostrarProductosPorCaducar(marcaActual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaProductoYExistencias method, of class ServicioProducto.
     */
    @Test
    public void testBuscaProductoYExistencias() throws Exception {
        System.out.println("buscaProductoYExistencias");
        String nombreProducto = "";
        int existencias = 0;
        ServicioProducto instance = new ServicioProducto();
        double expResult = 0.0;
        double result = instance.buscaProductoYExistencias(nombreProducto, existencias);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizaExistencias method, of class ServicioProducto.
     */
    @Test
    public void testActualizaExistencias() throws Exception {
        System.out.println("actualizaExistencias");
        ArrayList<String> productos = null;
        ArrayList<Integer> cantidades = null;
        ServicioProducto instance = new ServicioProducto();
        boolean expResult = false;
        boolean result = instance.actualizaExistencias(productos, cantidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProducto method, of class ServicioProducto.
     */
    @Test
    public void testAgregarProducto() throws Exception {
        System.out.println("agregarProducto");
        int id = 0;
        String nombre = "";
        String caducidad = "";
        int existencias = 0;
        double precio = 0.0;
        String marca = "";
        ServicioProducto instance = new ServicioProducto();
        Producto expResult = null;
        Producto result = instance.agregarProducto(id, nombre, caducidad, existencias, precio, marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarProductos method, of class ServicioProducto.
     */
    @Test
    public void testRecuperarProductos() throws Exception {
        System.out.println("recuperarProductos");
        ServicioProducto instance = new ServicioProducto();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.recuperarProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProducto method, of class ServicioProducto.
     */
    @Test
    public void testModificarProducto() {
        System.out.println("modificarProducto");
        String id = "";
        String nombre = "";
        String caducidad = "";
        String existencias = "";
        String precio = "";
        String marca = "";
        ServicioProducto instance = new ServicioProducto();
        Producto expResult = null;
        Producto result = instance.modificarProducto(id, nombre, caducidad, existencias, precio, marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperaProductosYCaducidad method, of class ServicioProducto.
     */
    @Test
    public void testRecuperaProductosYCaducidad() throws Exception {
        System.out.println("recuperaProductosYCaducidad");
        ServicioProducto instance = new ServicioProducto();
        ArrayList expResult = null;
        ArrayList result = instance.recuperaProductosYCaducidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaProducto method, of class ServicioProducto.
     */
    @Test
    public void testEliminaProducto() {
        System.out.println("eliminaProducto");
        String nombre = "";
        ServicioProducto instance = new ServicioProducto();
        Producto expResult = null;
        Producto result = instance.eliminaProducto(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
