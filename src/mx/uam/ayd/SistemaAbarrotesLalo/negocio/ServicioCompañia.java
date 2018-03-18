
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Compañia;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOCompañia;

/**
 *
 * @author Nallely
 */
public class ServicioCompañia {
   DAOCompañia DAOCompañia1= new DAOCompañia();
   Compañia modificarCompañia;
    
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
   
    
    public Compañia modificarCompañia(String id, String nombre) {
       modificarCompañia=DAOCompañia1.modificarCompañia(id,nombre);
       return modificarCompañia;
    }

    public ArrayList<String> recuperarCompañia() {
        ArrayList<String> listarecargas1=new ArrayList<String>();
        listarecargas1= DAOCompañia1.recuperarCompañia();
        return listarecargas1;
    }
}
