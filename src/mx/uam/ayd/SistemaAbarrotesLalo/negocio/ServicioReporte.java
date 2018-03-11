
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
int montoTotalRecargas=0;
int numeroDeRecargas=0, numeroDeVentas=0;
double montoTotalVenta=0;
Reporte reporte1;

    /**
     *
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte generarReporteTodo(String periodo) throws SQLException {
      montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);
      montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      return reporte1= new Reporte(montoTotalVenta,numeroDeVentas,montoTotalRecargas,numeroDeRecargas);      
    }

    /**
     *
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte generarReporteRecargas(String periodo) throws SQLException {
      montoTotalRecargas=servicioRecarga1.dameMontoTotalRecargas(periodo);  
      numeroDeRecargas=servicioRecarga1.dameNumeroDeRecargas(periodo);     
      return reporte1= new Reporte(0,0,montoTotalRecargas,numeroDeRecargas);  
    }

    /**
     *
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte generarReporteProductos(String periodo) throws SQLException {
       montoTotalVenta=servicioventa1.dameMontoTotalVentas(periodo);
      numeroDeVentas=servicioventa1.dameNumeroDeVentas(periodo);
      return reporte1= new Reporte(montoTotalVenta,numeroDeVentas,0,0); 
    }
    
    
}