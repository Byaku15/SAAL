
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Compañia;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOCompañia;

/**
 *
 * @author Nallely
 */
public class ServicioCompañia {
   DAOCompañia DAOCompañia1= new DAOCompañia();
    
    /**
     * Envia al DAO la información necesaria para crear una compañia, devuelve
     * booleano que muestra si el proceso se realizo correctamente o no.
     * @param nombre
     * @return estado
     * @throws SQLException
     */
    public boolean AgregarCompañia(String nombre) throws SQLException {
        boolean estado= DAOCompañia1.AgregarCompañia(nombre);
         return estado;       
    }
    
}
