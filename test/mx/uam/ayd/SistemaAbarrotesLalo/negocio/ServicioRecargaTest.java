/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.time.LocalDate;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Recarga;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAORecarga;
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
public class ServicioRecargaTest {
     LocalDate fechaActual;
     Recarga recarga1;
       DAORecarga dao1=new DAORecarga();
     int montoTotal=-1, numeroRecargas=-1, montoPasado=-1;
String compañiaMax, compañiaMin;
String periodo="Mes";
    public ServicioRecargaTest() {
    }    
        
    @Before
    public void setUp() {      
      fechaActual = LocalDate.now();
    }
    
    @After
    public void tearDown() {
    }

    @Test
   public void AgregarRecarga() throws Exception {
       int monto=200; 
       String compañia="Prueba";
       boolean esperado=true;       
       recarga1=new Recarga(fechaActual, monto,compañia); 
       boolean estado=dao1.AgregaRecarga(recarga1);       
       assertEquals(estado, esperado);
   }
    @Test
   public void dameMontoTotalRecargas() throws Exception {
      montoTotal= dao1.recuperaMontos(periodo);     
      if(montoTotal ==-1){
        fail("No se han obtenido los datos de la base");
        }
   }
    @Test
   public void  dameNumeroDeRecargas() throws SQLException {
        numeroRecargas=dao1.recuperaTamaño(periodo);
        if(numeroRecargas==-1){
        fail("No se han obtenido los datos de la base");
        }
   }
    
   @Test
   public void dameCompañiaMax() throws SQLException {
       compañiaMax = dao1.recuperaCompañiaMax(periodo);
       if(compañiaMax.isEmpty()){
      fail("No se han obtenido los datos de la base");
        }
   }
    @Test
   public void dameCompañiaMin() throws SQLException {
       compañiaMin = dao1.recuperaCompañiaMin(periodo);
       if(compañiaMin.isEmpty()){
        fail("No se han obtenido los datos de la base");
        }
   }
   @Test
   public void dameMontoPasadoRecargas() throws SQLException {
        montoPasado = dao1.recuperaMontosPasados(periodo);
        if( montoPasado  ==-1){
        fail("No se han obtenido los datos de la base");
        }
   }
}
