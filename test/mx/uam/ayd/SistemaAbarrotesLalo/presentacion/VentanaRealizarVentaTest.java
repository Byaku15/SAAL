/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno CBI
 */
public class VentanaRealizarVentaTest {

    public VentanaRealizarVentaTest() {
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
     * Test of main method, of class VentanaRealizarVenta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VentanaRealizarVenta.main(args);

    }

    /**
     * Test of revisarFormato method, of class VentanaRealizarVenta.
     */
    @Test
    public void testRevisarFormato() {
        System.out.println("revisarFormato");
        String producto = "";
        String cantidad = "";
        VentanaRealizarVenta instance = null;
        int expResult = 0;
        // int result = instance.revisarFormato(producto, cantidad);
        // assertEquals(expResult, result);

    }

    /**
     * Test of muestraError method, of class VentanaRealizarVenta.
     */
    @Test
    public void testMuestraError() {
        System.out.println("muestraError");
        int revisarFormato = 0;
        VentanaRealizarVenta instance = null;
        boolean expResult = false;
        //boolean result = instance.muestraError(revisarFormato);
        // assertEquals(expResult, result);

    }

    /**
     * Test of limpiarTabla method, of class VentanaRealizarVenta.
     */
    @Test
    public void testLimpiarTabla() {
        System.out.println("limpiarTabla");
        VentanaRealizarVenta instance = null;
        //  instance.limpiarTabla();

    }

}
