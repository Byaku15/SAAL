
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Venta;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOVenta;

/**
 *
 * @author lalo
 */
public class ServicioVenta {
    DAOVenta daoVenta1= new DAOVenta();
    int numeroVentas=0;
    double montoTotal=0;
    Venta venta1;
    
    /**
     * Obtiene la suma de montos de ventas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public double dameMontoTotalVentas(String periodo) throws SQLException {
         montoTotal= daoVenta1.recuperaMontos(periodo);    
       return montoTotal;
    }

    /**
     * Obtiene el numero de ventas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int dameNumeroDeVentas(String periodo) throws SQLException {
        numeroVentas=daoVenta1.recuperaTamaño(periodo);
       return numeroVentas;
    }

    /**
     *  Crea una entidad venta
     * @param productos
     * @param monto
     * @param fecha
     * @param cantidades
     * @return
     * @throws SQLException
     */
    public boolean RealizaVenta(ArrayList<String> productos, double monto, LocalDate fecha, ArrayList<Integer> cantidades) throws SQLException {
        venta1= new Venta(monto,fecha);
       boolean estado= daoVenta1.creaVenta(venta1);
       return estado;
    }
    
}

