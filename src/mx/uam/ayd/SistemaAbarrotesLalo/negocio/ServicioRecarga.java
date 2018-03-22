
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.time.LocalDate;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Recarga;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAORecarga;

/**
 *
 * @author nallely
 */
public class ServicioRecarga {
DAORecarga daoRecarga1=new DAORecarga();
int montoTotal=0, numeroRecargas=0, montoPasado=0;
String compañiaMax, compañiaMin;
Recarga recarga1;
    
    /**
     *  Devuelve el monto total de recargas dentro de un periodo de tiempo
     * @param periodo
     * @return montoTotal
     * @throws SQLException
     */
    public int dameMontoTotalRecargas(String periodo) throws SQLException {
       montoTotal= daoRecarga1.recuperaMontos(periodo);    
       return montoTotal;
    }

    /**
     * Devuelve el numero de recargas realizadas dentro de un periodo de tiempo
     * @param periodo
     * @return numeroRecargas
     * @throws SQLException
     */
    public int dameNumeroDeRecargas(String periodo) throws SQLException {
       numeroRecargas=daoRecarga1.recuperaTamaño(periodo);
       return numeroRecargas;
    }

    /**
     * Agrega una entidad de recarga dentro de la base de datos
     * @param monto
     * @param fechaActual
     * @param compañia
     * @return
     * @throws SQLException
     */
    public boolean AgregarRecarga(int monto, LocalDate fechaActual, String compañia) throws SQLException {
       recarga1=new Recarga(fechaActual, monto,compañia); 
       boolean estado=daoRecarga1.AgregaRecarga(recarga1);
        return estado;
    }

    /**
     * Devuelve la compañia telefonica con mayores ventas dentro de un periodo
     *de tiempo
     * @param periodo
     * @return compañiaMax
     * @throws SQLException
     */
    String dameCompañiaMax(String periodo) throws SQLException {
        compañiaMax = daoRecarga1.recuperaCompañiaMax(periodo);
        return compañiaMax;
    }

    /**
     * Devuelve la compañia telefonica con menores ventas dentro de un periodo
     *de tiempo
     * @param periodo
     * @return compañiaMin
     * @throws SQLException
     */
    String dameCompañiaMin(String periodo) throws SQLException {
        compañiaMin = daoRecarga1.recuperaCompañiaMin(periodo);
        return compañiaMin;
    }

    /**
     * Devuelve el monto de un periodo de tiempo pasado
     * @param periodo
     * @return montoPasado
     * @throws SQLException
     */
    int dameMontoPasadoRecargas(String periodo) throws SQLException {
        montoPasado = daoRecarga1.recuperaMontosPasados(periodo);
         return montoPasado;
        
    }

}
