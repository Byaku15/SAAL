/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOVenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorge
 */
public class ServicioVentaTest {
    DAOVenta daoVenta=new DAOVenta();
    public ServicioVentaTest() {
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
     * prueva del metodo dameMontoTotalVentas
     * entrada:Año
     * salida eserada:double igual a las ventas de todo el año
     */
    @Test
    public void testDameMontoTotalVentas() throws Exception {
        System.out.println("test del metodo dameMontoTotalVentas");
        String periodo = "Año";
        double monto;
        monto=daoVenta.recuperaMontos(periodo);
        ServicioVenta instance = new ServicioVenta();
        double expResult = monto;
        double result = instance.dameMontoTotalVentas(periodo);
        assertEquals(expResult, result, 0.0);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
             fail("The test case is a prototype.");
        }
    }

    /**
     * prueva del metodo dameNumeroDeVentas
     * entrada:Año
     * salida esperada: entero mayor a cero
     */
    @Test
    public void testDameNumeroDeVentas() throws Exception {
        System.out.println("test del metodo dameNumeroDeVentas");
        String periodo = "Año";
        int tamaño;
        tamaño=daoVenta.recuperaTamaño(periodo);
        ServicioVenta instance = new ServicioVenta();
        int expResult = tamaño;
        int result = instance.dameNumeroDeVentas(periodo);
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * prueva d RealizaVenta
     * entradas:mayonesssa-2222gm,22,fechatemp,1
     * salida esperada:true
     * @throws java.lang.Exception
     */
    @Test
    public void testRealizaVenta() throws Exception {
        LocalDate fechatemp = LocalDate.now();
        System.out.println("test del metodo RealizaVenta");
        String p1="mayonesssa-2222gm";
        int c1=1;
        ArrayList<String> productos=new ArrayList<String>();
        productos.add(p1);
        double monto = 22.0;
        LocalDate fecha = fechatemp;
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        cantidades.add(c1);
        ServicioVenta instance = new ServicioVenta();
        boolean expResult = true;
        boolean result = instance.RealizaVenta(productos, monto, fecha, cantidades);
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
             fail("The test case is a prototype.");
        }
    }

    /**
     * prueva del DameMontoPasado
     * entrada:Mes
     * salida esperada: double con las ventas totales del mes anterior
     */
    @Test
    public void testDameMontoPasado() throws Exception {
        System.out.println("test del metodo dameMontoPasado");
        String periodo = "Mes";
        double monto;
        monto=daoVenta.recuperaMontosPasados(periodo);
        ServicioVenta instance = new ServicioVenta();
        double expResult = monto;
        double result = instance.dameMontoPasado(periodo);
        assertEquals(expResult, result, monto);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}

