/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;
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
public class ServicioReporteTest {
    ServicioRecarga servicioRecarga1=new ServicioRecarga(); 
ServicioVenta servicioventa1= new ServicioVenta();
ServicioProducto servicioProducto1= new ServicioProducto();
int montoTotalRecargas=0, montoPasadoR=0;
int numeroDeRecargas=0, numeroDeVentas=0;
double montoTotalVenta=0, montoPasado=0;
String compañiaMax, compañiaMin;
Reporte reporte1;
String periodo="Año";
    public ServicioReporteTest() {
    }
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     
    @Test
     public void generarReporteTodo() throws SQLException {
         montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);
      montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      compañiaMax=servicioRecarga1.dameCompañiaMax(periodo);
      compañiaMin=servicioRecarga1.dameCompañiaMin(periodo);
      montoPasado= servicioventa1.dameMontoPasado(periodo);  
      montoPasadoR=servicioRecarga1.dameMontoPasadoRecargas(periodo); 
     reporte1= new Reporte( numeroDeRecargas,compañiaMax,compañiaMin,montoPasadoR,
              numeroDeVentas, montoPasado,montoTotalVenta,montoTotalRecargas);  
     if(reporte1==null){
        fail("No se han obtenido los datos de la base");
        }
     }
     @Test
     public void generarReporteRecargas() throws SQLException {
         montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);    
      compañiaMax=servicioRecarga1.dameCompañiaMax(periodo);
      compañiaMin=servicioRecarga1.dameCompañiaMin(periodo);
      montoPasadoR=servicioRecarga1.dameMontoPasadoRecargas(periodo);
     reporte1= new Reporte(montoTotalRecargas,numeroDeRecargas,compañiaMax,compañiaMin,
      montoPasadoR);  
     if(reporte1==null){
        fail("No se han obtenido los datos de la base");
        }
     }
     @Test
     public void generarReporteProductos() throws SQLException {
          montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      montoPasado=servicioventa1.dameMontoPasado(periodo);
      
      reporte1= new Reporte(montoTotalVenta,numeroDeVentas,montoPasado); 
      if(reporte1==null){
        fail("No se han obtenido los datos de la base");
        }
     }
}
