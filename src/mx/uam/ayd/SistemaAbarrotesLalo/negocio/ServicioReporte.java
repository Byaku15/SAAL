
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;

/**
 *
 * @author lalo
 */
public class ServicioReporte {
ServicioRecarga servicioRecarga1=new ServicioRecarga(); 
ServicioVenta servicioventa1= new ServicioVenta();
ServicioProducto servicioProducto1= new ServicioProducto();
int montoTotalRecargas=0, montoPasadoR=0;
int numeroDeRecargas=0, numeroDeVentas=0;
double montoTotalVenta=0, montoPasado=0;
String compañiaMax, compañiaMin;
Reporte reporte1;

    /**
     * Genera una entidad de la clase reporte para consultar finanzas totales
     * @param periodo
     * @return Reporte
     * @throws SQLException
     */
    public Reporte generarReporteTodo(String periodo) throws SQLException {
      montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);
      montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      compañiaMax=servicioRecarga1.dameCompañiaMax(periodo);
      compañiaMin=servicioRecarga1.dameCompañiaMin(periodo);
      montoPasado= servicioventa1.dameMontoPasado(periodo);  
      montoPasadoR=servicioRecarga1.dameMontoPasadoRecargas(periodo); 
      return reporte1= new Reporte( numeroDeRecargas,compañiaMax,compañiaMin,montoPasadoR,
              numeroDeVentas, montoPasado,montoTotalVenta,montoTotalRecargas);      
    }

    /**
     * Genera una entidad de la clase reporte para consultar las finanzas 
     * referentes a las recargas
     * @param periodo
     * @return Reporte
     * @throws SQLException
     */
    public Reporte generarReporteRecargas(String periodo) throws SQLException {
      montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);    
      compañiaMax=servicioRecarga1.dameCompañiaMax(periodo);
      compañiaMin=servicioRecarga1.dameCompañiaMin(periodo);
      montoPasadoR=servicioRecarga1.dameMontoPasadoRecargas(periodo);
      return reporte1= new Reporte(montoTotalRecargas,numeroDeRecargas,compañiaMax,compañiaMin,
      montoPasadoR);  
    }

    /**
     * Genera una entidad de la clase reporte para consultar las finanzas 
     * referentes a las ventas de productos
     * @param periodo
     * @return Reporte
     * @throws SQLException
     */
    public Reporte generarReporteProductos(String periodo) throws SQLException {
       montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      montoPasado=servicioventa1.dameMontoPasado(periodo);
      
      return reporte1= new Reporte(montoTotalVenta,numeroDeVentas,montoPasado); 
    }
    
    
}