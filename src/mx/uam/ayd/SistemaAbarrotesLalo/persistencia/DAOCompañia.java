package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nallely
 */
public class DAOCompañia {

    conexion BaseDeDatos = new conexion();

    /**
     * Almacena una compañia dentro de la base de datos, devuelve un booleano 
     * que muestra si el proceso se realizo correctamente o no.
     * @param nombre
     * @return estado
     * @throws SQLException
     */
    public boolean AgregarCompañia(String nombre) throws SQLException  {
 Statement statement = BaseDeDatos.getConexion().createStatement();
  Random al= new Random();
        int id = al.nextInt(1000);
        try {
            statement.execute("INSERT INTO COMPAÑIA (IDCOMPAÑIA, NOMBRE) \n"
                    + "VALUES (" + id + ","+"'" + nombre +"'"+")");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCompañia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
         
    }

}
