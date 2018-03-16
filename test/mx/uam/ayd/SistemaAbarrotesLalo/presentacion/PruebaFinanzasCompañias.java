package PruebasFinanzas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.ControlRecargas;
import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.VentanaRecargas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel AnG
 */
public class PruebaFinanzasCompañias {

    ControlRecargas con1;
    VentanaRecargas ven1;

    public PruebaFinanzasCompañias() throws SQLException {
        con1 = new ControlRecargas();
        ven1 = new VentanaRecargas(con1);
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

     @Test
     public void AgregarRecargas() {
    int esperado;
       String nombre;
       //caso 1 numero entero
       nombre="1234"; 
       esperado=0;
       int resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
       
       
      //caso 2 numero decimal
      nombre="12.34"; 
       esperado=2;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
    
     //caso 3 vacio
      nombre=""; 
       esperado=1;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
     
      //caso 4 cadena
      
       nombre="Telcel"; 
       esperado=2;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
     }
}
