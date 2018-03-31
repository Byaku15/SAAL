/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.text.SimpleDateFormat;
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
     * Prueva de la clase AgregarCliente de la clase servicioCliente
     * precondiciones:no importan
     * salida esperada: true
     * Test of agregarCliente method, of class ServicioCliente.
     */
    @Test
    public void testAgregarCliente() throws Exception {
        System.out.println("test del metodo agregarCliente");
        String nombre = "jorge2222";
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
    /**
     * Prueva de la clase AgregarCLiente se la clase ServicioCLiente
     * precondiciones: no importan
     * salida esperada:true
     * @throws Exception 
     */
     @Test
    public void testAgregarCliente2() throws Exception {
        System.out.println("test del metodo aceptacion de enteros");
        String nombre = "carlos333";
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

    /**
     * Prueva RecuperaCliente de la clase servicioCliente
     * precondiciones: hay al menos un cliente en la lista de fiar
     * salida esperada:Arraylist<Cliente> no vacio
     * Test of recuperaClientes method, of class ServicioCliente.
     */
    @Test
    public void testRecuperaClientes() throws Exception {
        System.out.println("test del metodo recuperaClientes");
        ServicioCliente instance = new ServicioCliente();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.recuperaClientes();
        if(result ==null){
              fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizaCliente method, of class ServicioCliente.
     */
    @Test
    public void testActualizaCliente() {
        System.out.println("actualizaCliente");
        String nombreAntiguo = "jorge2222";
        String nombreNuevo = "jorge444";
        Double cantidad = 0.0;
        String fecha = "2018/03/02";
        ServicioCliente instance = new ServicioCliente();
        boolean expResult = true;
        boolean result = instance.actualizaCliente(nombreAntiguo, nombreNuevo, cantidad, fecha);
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    
}
