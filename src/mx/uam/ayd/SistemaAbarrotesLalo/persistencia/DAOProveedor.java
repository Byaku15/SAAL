package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;

/**
 *
 * @author Byakuya
 */
public class DAOProveedor {
    conexion BaseDeDatos=new conexion();
    Proveedor agregaProveedor;
    
    /**
     *Metodo para recuperar La compañia de la tabla proveedor
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperaProveedores() throws SQLException {
        ArrayList<String> lista=new ArrayList<String>();
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT COMPAÑIA FROM PROVEEDOR");
        try {
        while (rs.next()) {
        lista.add(rs.getString("COMPAÑIA"));    
           }
       }catch (Exception asd) {
            System.out.println(asd);
        }  
       return lista;
    }

    /**
     *Metodo para agregar un proveedor en la tabla
     * 
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     */
    public Proveedor agregaProveedor(int id, String proveedor, String telefono, String nombre, String tipo){
        BaseDeDatos.getConexion();
        ResultSet Proveedor = BaseDeDatos.agrega1(id, proveedor, telefono, nombre, tipo); 
        return null;
    }

    /**
     *Metodo para modificar un proveedor en la tabla
     * 
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     */
    public Proveedor modificarProveedor(String id, String proveedor, String telefono, String nombre, String tipo) {
        BaseDeDatos.getConexion();
        ResultSet Proveedor = BaseDeDatos.modifica1(id, proveedor, telefono, nombre, tipo); 
        return null;    
    }
}
