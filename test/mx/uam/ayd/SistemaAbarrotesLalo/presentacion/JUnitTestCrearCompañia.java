/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCrearCompañia;

import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.ControlRecargas;
import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.VentanaAgregarCompañia;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Miguel AnG
 */
public class JUnitTestCrearCompañia {
    ControlRecargas con1= new ControlRecargas();
   VentanaAgregarCompañia ven1= new VentanaAgregarCompañia(con1);
   
     @Test
    public void AgregarCompañia() {
       int esperado;
       String nombre;
       //caso 1 numero entero
       nombre="1234"; 
       esperado=2;
       int resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
       
       
      //caso 2 numero decimal
      nombre="12.34"; 
       esperado=3;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
    
     //caso 3 vacio
      nombre=""; 
       esperado=1;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
     
      //caso 4 cadena
      
       nombre="Telcel"; 
       esperado=0;
      resultado=ven1.RevisarFormato(nombre);
       assertEquals(esperado,resultado);
    }
}
