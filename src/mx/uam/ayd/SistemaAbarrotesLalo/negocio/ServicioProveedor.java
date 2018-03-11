

package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOProveedor;

/**
 *
 * @author Byakuya
 */
public class ServicioProveedor {
    
    DAOProveedor daoProveedores=new DAOProveedor();
    Proveedor agregaProveedor;
    Proveedor modificarProveedor;
    
    /**
     * Metodo para recupera datos de la base de datos
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperarProveedores() throws SQLException {
        ArrayList <String> listaprovedores=new  ArrayList <String>();
        listaprovedores=daoProveedores.recuperaProveedores();
        return listaprovedores;
    }

    /**
     *Metodo para agregar un proveedor 
     * 
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     * @throws SQLException
     */
    public Proveedor agregarProveedor(int id, String proveedor, String telefono, String nombre, String tipo) throws SQLException {
       agregaProveedor=daoProveedores.agregaProveedor(id, proveedor, telefono, nombre, tipo);
       return agregaProveedor;
    }

    /**
     *Metodo para modificar un proveedor
     * 
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     */
    public Proveedor modificarProveedor(String id, String proveedor, String telefono, String nombre, String tipo) {
       modificarProveedor=daoProveedores.modificarProveedor(id, proveedor, telefono, nombre, tipo);
       return modificarProveedor;
    }

}
