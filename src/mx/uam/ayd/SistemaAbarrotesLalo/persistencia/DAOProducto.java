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
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;

/**
 *Esta clase se encarga da la recuperacion y almacenamiento de datos de la entidad Producto
 * @author alumnos
 */
public class DAOProducto {
    conexion BaseDeDatos=new conexion();
    double precio=-1;
    String prec;

    /**
     *Este metodo se encarga de buscar un producto por su nombre en la base de datos
     * @param nombreProducto
     * @return
     * @throws SQLException
     */
    public double recuperaProductoPorNombre(String nombreProducto) throws SQLException {
        BaseDeDatos.getConexion();
        try{
            ResultSet producto = BaseDeDatos.consulta("SELECT PRECIO FROM PRODUCTO WHERE NOMBRE='" + nombreProducto + "'"); 
            while (producto.next()) {
                prec = producto.getString("PRECIO");
                precio = Double.parseDouble(prec);
            }
        }catch(SQLException | NumberFormatException e){
                return precio=-1;     
        }
        return precio;
    }
    
    /**
     *Este metodo Recupera todos los productos de la marca seleccionada
     * @param marca
     * @return
     * @throws SQLException
     */
    public ResultSet recuperaProductos(String marca) throws SQLException{
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT NOMBRE,PRECIO,EXISTENCIAS,CADUCIDAD FROM PRODUCTO " +
          "WHERE MARCA='"+marca+"' ORDER BY NOMBRE");  
        return rs;
    }

    /**
     * Recupera los productos que van a caducar proximamente
     * @param año
     * @param mes
     * @param dia
     * @param añoMaximo
     * @param mesMaximo
     * @param diaMaximo
     * @param marcaActual
     * @return
     */
    public ResultSet recuperaProductosAcaducar(int año, int mes, int dia, int añoMaximo, int mesMaximo, int diaMaximo, String marcaActual) {
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT NOMBRE,CADUCIDAD FROM PRODUCTO WHERE MARCA='"+marcaActual+"' AND"+
" CADUCIDAD BETWEEN '"+año+"-"+mes+"-"+dia+"' AND '"+añoMaximo+"-"+mesMaximo+"-"+diaMaximo+"'");  
        return rs;
    }
             
    /**
     * Recupera las existencias de un producto por su nombre
     * @param nombreProducto
     * @return
     * @throws SQLException
     */
    public int recuperaExistencias(String nombreProducto)throws SQLException{
         ResultSet existencias = BaseDeDatos.consulta("SELECT EXISTENCIAS FROM PRODUCTO WHERE NOMBRE='" + nombreProducto + "'");
         int existencia=0;
         while(existencias.next()){
             existencia=existencias.getInt("EXISTENCIAS");
         }
       return existencia;  
    }

    /**
     * Modifica las existencias de un producto por su nombre
     * @param productos
     * @param cantidades
     * @return
     * @throws SQLException
     */
    public boolean ModificaExistencias(ArrayList<String> productos, ArrayList<Integer> cantidades) throws SQLException {
        Statement statement = BaseDeDatos.getConexion().createStatement();
        int resultado = 0;
        for (int i = 0; i < productos.size(); i++) {
            resultado = statement.executeUpdate("UPDATE PRODUCTO SET EXISTENCIAS=" + cantidades.get(i) + "WHERE NOMBRE='" + productos.get(i) + "'");
        }
        if (resultado == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Agrega una entidad de producto dentro de la base
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     */
    public Producto agregaProducto(int id, String nombre, String caducidad, int existencias, double precio, String marca){
        BaseDeDatos.getConexion();
        ResultSet producto = BaseDeDatos.agrega(id, nombre, caducidad, existencias, precio, marca); 
        return null;
    }
    
    /**
     * Recupera un arreglo de producto
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperaProductos() throws SQLException {
        ArrayList<String> lista=new ArrayList<String>();
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT NOMBRE FROM PRODUCTO");
        try {
        while (rs.next()) {
        lista.add(rs.getString("NOMBRE"));    
           }
       }catch (Exception asd) {
            System.out.println(asd);
        }  
       return lista;
    }

    /**
     * Modifica los datos de un producto
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     */
    public Producto modificarProducto(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
        BaseDeDatos.getConexion();
        ResultSet producto = BaseDeDatos.modifica(id, nombre, caducidad, existencias, precio, marca); 
        return null;    
    }
    
}
