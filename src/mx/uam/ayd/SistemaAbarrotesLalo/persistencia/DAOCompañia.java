/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Compañia;


/**
 *
 * @author Nallely
 */
public class DAOCompañia {

    conexion BaseDeDatos = new conexion();
     ResultSet rs;

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

    /**
     * Devulve un arreglo con los nombres de todas las compañias dentro de la 
     * base de datos
     * @return compañias
     * @throws SQLException
     */
    public ArrayList<String> recuperarCompañias() throws SQLException {
       ArrayList<String> compañias=new ArrayList<String>();
        BaseDeDatos.getConexion();
        rs=BaseDeDatos.consulta("SELECT NOMBRE FROM COMPAÑIA");
        try {
        while (rs.next()) {
        compañias.add(rs.getString("NOMBRE"));    
           }
       }catch (Exception asd) {
            System.out.println(asd);
        }  
       return compañias;
    }

    /**
     * Metodo para modificar la compañia
     * @param id
     * @param nombre
     * @return
     */
    public Compañia modificarCompañia(String id, String nombre) {
        BaseDeDatos.getConexion();
        ResultSet compañia = BaseDeDatos.modifica2(id, nombre); 
        return null;
}

    /**
     *Regresa una lista de compañias telefonicas de la base de datos
     * @return
     */
    public ArrayList<String> recuperarCompañia() {
    ArrayList<String> lista=new ArrayList<String>();
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT NOMBRE FROM COMPAÑIA");
        try {
        while (rs.next()) {
        lista.add(rs.getString("NOMBRE"));    
           }
       }catch (Exception asd) {
            System.out.println(asd);
        }  
       return lista;
    }
    
    /*************************************************************************************************SPRINT 3***********************************/
    /**
     * Método necesario para borrar compañía
     * @param nombre
     * @return
     * 
     */
    public Compañia eliminarCompañia(String nombre){
        BaseDeDatos.getConexion();
        ResultSet rs = BaseDeDatos.eliminaCompañia(nombre);
        return null;
        
    }
    
}
