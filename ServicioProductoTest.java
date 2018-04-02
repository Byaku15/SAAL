/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
     * @throws java.lang.Exception
     */
    @Test
    public void testBuscaProducto() throws Exception {
    System.out.println("Test de buscaProducto");
        String nombreProducto = "Bombones";
        ServicioProducto instance = new ServicioProducto();
        double expResult =  -1;
        double result = instance.buscaProducto(nombreProducto);
        assertEquals(expResult, result,-1 );
        if(result !=expResult){
         //TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
       }
    }

    /**
     * Test of mostrarProductos method, of class ServicioProducto.
          */
    @Test
    public void testMostrarProductos() throws Exception {
        System.out.println("Test de mostrarProductos");
        String marca = "Marinela";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        ResultSet result = instance.mostrarProductos(marca);
        if(result==null){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrarProductosPorCaducar method, of class ServicioProducto.
     */
    @Test
    public void testMostrarProductosPorCaducar() {
        System.out.println("Test de mostrarProductosPorCaducar");
        String marcaActual = "Marinela";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        ResultSet result = instance.mostrarProductosPorCaducar(marcaActual);
        if (result==null ){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscaProductoYExistencias method, of class ServicioProducto.
     */
    @Test
    public void testBuscaProductoYExistencias() throws Exception {
        System.out.println("test de buscaProductoYExistencias");
        String nombreProducto = "Compus";
        int existencias = 0;
        ServicioProducto instance = new ServicioProducto();
        double expResult = -1.0;
        double result = instance.buscaProductoYExistencias(nombreProducto, existencias);
        assertEquals(expResult, result, -1.0);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizaExistencias method, of class ServicioProducto.
     */
    //@Test
    //public void testActualizaExistencias() throws Exception {
      //  System.out.println("test de actualizaExistencias");
        //ArrayList<String> productos = null;
        //ArrayList<Integer> cantidades = null;
        //ServicioProducto instance = new ServicioProducto();
        //boolean expResult = false;
        //boolean result = instance.actualizaExistencias(productos, cantidades);
        //assertEquals(expResult, result);
        //if (result = expResult){
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //}
    //}

    /**
     * Test of agregarProducto method, of class ServicioProducto.
     */
    @Test
    public void testAgregarProducto() throws Exception {
        System.out.println("test de agregarProducto");
        int id = 11;
        String nombre = "Doritos";
        String caducidad = "12/Diciembre2018";
        int existencias = 0;
        double precio = 15.0;
        String marca = "Barcel";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        Producto result = instance.agregarProducto(id, nombre, caducidad, existencias, precio, marca);
        assertEquals(expResult, result);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of recuperarProductos method, of class ServicioProducto.
     */
    @Test
    public void testRecuperarProductos() throws Exception {
        System.out.println("Test de recuperarProductos");
        ServicioProducto instance = new ServicioProducto();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.recuperarProductos();
        if (result==null){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificarProducto method, of class ServicioProducto.
     */
    @Test
    public void testModificarProducto() {
        System.out.println("Tes de modificarProducto");
        String id = "8";
        String nombre = "chocolates";
        String caducidad = "22/Diciembre/2018";
        String existencias = "2";
        String precio = "15";
        String marca = "choco";
        ServicioProducto instance = new ServicioProducto();
        ResultSet expResult = null;
        Producto result = instance.modificarProducto(id, nombre, caducidad, existencias, precio, marca);
        assertEquals(expResult, result);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of recuperaProductosYCaducidad method, of class ServicioProducto.
     */
    @Test
    public void testRecuperaProductosYCaducidad() throws Exception {
        System.out.println("Test de recuperaProductosYCaducidad");
        ServicioProducto instance = new ServicioProducto();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.recuperaProductosYCaducidad();
        if (result==null){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminaProducto method, of class ServicioProducto.
     */
    @Test
    public void testEliminaProducto() {
        System.out.println("Tes de eliminaProducto");
        String nombre = "cacahuates";
        ServicioProducto instance = new ServicioProducto();
        Producto expResult = null;
        Producto result = instance.eliminaProducto(nombre);
        assertEquals(expResult, result);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    }
}