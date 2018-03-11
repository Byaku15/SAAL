
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOProducto;

/**
 *Esta clase se encarga de realizar los procesos y las reglas de negocio de la entidad productos
 * @author lalo
 */
public class ServicioProducto {
    DAOProducto daoProducto1=new DAOProducto();
    double precioProducto;
    ResultSet rs;
    double precioProducto2;
    int existencia;
    Producto agregaProducto;
    Producto modificarProducto;

    /**
     *Este metodo busca los productos por nombre en la base de datos
     * @param nombreProducto
     * @return
     * @throws SQLException
     */
    public double buscaProducto(String nombreProducto) throws SQLException {
       precioProducto=daoProducto1.recuperaProductoPorNombre(nombreProducto);
        return precioProducto;
    }
    
    /**
     *Este metodo se encarga de recuperar los productos segun la marca seleccionada
     * @param marca
     * @return
     * @throws SQLException
     */
    public ResultSet mostrarProductos(String marca) throws SQLException {
         rs=daoProducto1.recuperaProductos(marca);
         return rs;
    }

    /**
     *
     * @param marcaActual
     * @return
     */
    public ResultSet mostrarProductosPorCaducar(String marcaActual) {
        if("pepsi".equals(marcaActual)||"coca-cola".equals(marcaActual)){
            JOptionPane.showMessageDialog(null,"Este proveedor no acepta cambios");
            return null;
        }else{
            Calendar fechaActual=new GregorianCalendar();
            Calendar fechaLimite=new GregorianCalendar();
            int año=fechaActual.get(Calendar.YEAR);
            int mes=fechaActual.get(Calendar.MONTH);
            int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
            System.out.println(año+" "+mes+" "+dia); 
            fechaLimite.add(Calendar.DATE, 7);
             int añoMaximo=fechaLimite.get(Calendar.YEAR);
            int mesMaximo=fechaLimite.get(Calendar.MONTH);
            int diaMaximo=fechaLimite.get(Calendar.DAY_OF_MONTH);
            System.out.println(añoMaximo+" "+mesMaximo+" "+diaMaximo);
           ResultSet productosACaducar=daoProducto1.recuperaProductosAcaducar(año,mes,dia,añoMaximo,mesMaximo,diaMaximo,marcaActual);
           return productosACaducar;
        }
    }
        
    /**
     *
     * @param nombreProducto
     * @param existencias
     * @return
     * @throws SQLException
     */
    public double buscaProductoYExistencias(String nombreProducto, int existencias) throws SQLException {
       precioProducto2=daoProducto1.recuperaProductoPorNombre(nombreProducto);
       if(precioProducto2!=-1){
         existencia=daoProducto1.recuperaExistencias(nombreProducto);  
         if(existencias>existencia){
             return -2;
         }
       }        
       
        return precioProducto2;
    }
    
    /**
     *
     * @param productos
     * @param cantidades
     * @return
     * @throws SQLException
     */
    public boolean actualizaExistencias(ArrayList<String> productos, ArrayList<Integer> cantidades) throws SQLException {
     boolean estado= daoProducto1.ModificaExistencias(productos, cantidades);
      return estado;
    }
    
    /**
     *
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     * @throws SQLException
     */
    public Producto agregarProducto(int id, String nombre, String caducidad, int existencias, double precio, String marca) throws SQLException {
       agregaProducto=daoProducto1.agregaProducto(id,nombre, caducidad, existencias, precio, marca);
       return agregaProducto;
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperarProductos() throws SQLException {
        ArrayList <String> listaproductos=new  ArrayList <String>();
        listaproductos=daoProducto1.recuperaProductos();
        return listaproductos;
    }

    /**
     *
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     */
    public Producto modificarProducto(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
       modificarProducto=daoProducto1.modificarProducto(id,nombre, caducidad, existencias, precio, marca);
       return modificarProducto;
    }
}
