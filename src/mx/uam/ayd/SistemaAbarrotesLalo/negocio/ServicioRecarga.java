
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
int montoTotal=0, numeroRecargas=0;
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
     * @return
     * @throws SQLException
     */
    public boolean AgregarRecarga(int monto, LocalDate fechaActual) throws SQLException {
       recarga1=new Recarga(fechaActual, monto); 
       boolean estado=daoRecarga1.AgregaRecarga(recarga1);
       return estado;
    }
    
}
