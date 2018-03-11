/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

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
public class ControlProveedoresTest {
    
    public ControlProveedoresTest() {
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
     * Test of iniciaControlProveedores method, of class ControlProveedores.
     */
    @Test
    public void testIniciaControlProveedores() {
        System.out.println("iniciaControlProveedores");
        ControlProveedores instance = new ControlProveedores();
        instance.iniciaControlProveedores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciaControlAgregarProveedor method, of class ControlProveedores.
     */
    @Test
    public void testIniciaControlAgregarProveedor() {
        System.out.println("iniciaControlAgregarProveedor");
        ControlProveedores instance = new ControlProveedores();
        instance.iniciaControlAgregarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciaControlConsultarProveedor method, of class ControlProveedores.
     */
    @Test
    public void testIniciaControlConsultarProveedor() throws Exception {
        System.out.println("iniciaControlConsultarProveedor");
        ControlProveedores instance = new ControlProveedores();
        instance.iniciaControlConsultarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciaControlModificarProveedor method, of class ControlProveedores.
     */
    @Test
    public void testIniciaControlModificarProveedor() throws Exception {
        System.out.println("iniciaControlModificarProveedor");
        ControlProveedores instance = new ControlProveedores();
        instance.iniciaControlModificarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizaControl method, of class ControlProveedores.
     */
    @Test
    public void testFinalizaControl() {
        System.out.println("finalizaControl");
        ControlProveedores instance = new ControlProveedores();
        instance.finalizaControl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultadoConsulta method, of class ControlProveedores.
     */
    @Test
    public void testMostrarResultadoConsulta_0args() {
        System.out.println("mostrarResultadoConsulta");
        ControlProveedores instance = new ControlProveedores();
        instance.mostrarResultadoConsulta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatosProveedor method, of class ControlProveedores.
     */
    @Test
    public void testModificarDatosProveedor_0args() {
        System.out.println("modificarDatosProveedor");
        ControlProveedores instance = new ControlProveedores();
        instance.modificarDatosProveedor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProveedor method, of class ControlProveedores.
     */
    @Test
    public void testAgregarProveedor() throws Exception {
        System.out.println("agregarProveedor");
        int id = 0;
        String proveedor = "";
        String telefono = "";
        String nombre = "";
        String tipo = "";
        ControlProveedores instance = new ControlProveedores();
        Proveedor expResult = null;
        Proveedor result = instance.agregarProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenaComboBox method, of class ControlProveedores.
     */
    @Test
    public void testLlenaComboBox() throws Exception {
        System.out.println("llenaComboBox");
        ControlProveedores instance = new ControlProveedores();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.llenaComboBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultadoConsulta method, of class ControlProveedores.
     */
    @Test
    public void testMostrarResultadoConsulta_String() {
        System.out.println("mostrarResultadoConsulta");
        String nombre = "";
        ControlProveedores instance = new ControlProveedores();
        String expResult = "";
        String result = instance.mostrarResultadoConsulta(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProveedor method, of class ControlProveedores.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("modificarProveedor");
        String id = "";
        String proveedor = "";
        String telefono = "";
        String nombre = "";
        String tipo = "";
        ControlProveedores instance = new ControlProveedores();
        Proveedor expResult = null;
        Proveedor result = instance.modificarProveedor(id, proveedor, telefono, nombre, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatosProveedor method, of class ControlProveedores.
     */
    @Test
    public void testModificarDatosProveedor_String() {
        System.out.println("modificarDatosProveedor");
        String nombre = "";
        ControlProveedores instance = new ControlProveedores();
        String expResult = "";
        String result = instance.modificarDatosProveedor(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
