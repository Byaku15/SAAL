package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *Esta clase se encarga de conectar todos los daos con la base de datos derby
 * @author lalo
 */
public class conexion {
   
    Connection con=null;
    PreparedStatement stmt = null;
    
    /**
     *
     * @return
     */
    public Connection getConexion(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/TiendaLalo");
            //JOptionPane.showMessageDialog(null,"Conexion en Linea");
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return con;
    }
    
    /**
     *
     * @param consulta
     * @return
     */
    public ResultSet consulta(String consulta){
        ResultSet rs=null;
        try{
            PreparedStatement ps=con.prepareStatement(consulta);
            rs=ps.executeQuery();
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return rs;
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
    public ResultSet agrega(int id,String nombre, String caducidad, int existencias, double precio, String marca){
        ResultSet rs=null;
        try{
            stmt = con.prepareStatement("INSERT INTO Producto(IDPRODUCTO, NOMBRE, CADUCIDAD, EXISTENCIAS,PRECIO,MARCA)VALUES (?,?,?,?,?,?)");
            stmt.setInt(1,id);
            stmt.setString(2,nombre);
            stmt.setString(3,caducidad);
            stmt.setInt(4,existencias);
            stmt.setDouble(5,precio);
            stmt.setString(6,marca);
            
            
            int retorno = stmt.executeUpdate();
            if (retorno>0)
            {
            JOptionPane.showMessageDialog(null,"Tu Producto ha sido agregado");
            System.out.println("Insertado correctamente");
            }
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return null;
     
    }
    
    /**
     *
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     */
    public ResultSet agrega1(int id, String proveedor, String telefono, String nombre, String tipo){
        ResultSet rs=null;
        try{
            stmt = con.prepareStatement("INSERT INTO Proveedor(IDPROVEEDOR, NOMBREPROVEEDOR, TELEFONO, COMPAÑIA, TIPO_PRODUCTO)VALUES (?,?,?,?,?)");
            stmt.setInt(1,id);
            stmt.setString(2,nombre);
            stmt.setString(3,telefono);
            stmt.setString(4,proveedor);
            stmt.setString(5,tipo);
           
            int retorno = stmt.executeUpdate();
            if (retorno>0)
            {
            JOptionPane.showMessageDialog(null,"Tu Proveedor ha sido agregado");
            System.out.println("Insertado correctamente");
            }
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return null;
     
    }    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        conexion c=new conexion();
        c.getConexion();
    }

    ResultSet modifica(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
        ResultSet rs=null;
        try{
            stmt = con.prepareStatement("UPDATE Producto  SET NOMBRE=?, CADUCIDAD=?, EXISTENCIAS=?,PRECIO=?,MARCA=?"
            + "WHERE IDPRODUCTO =?");
            stmt.setString(1,id);
            stmt.setString(2,nombre);
            stmt.setString(3,caducidad);
            stmt.setString(4,existencias);
            stmt.setString(5,precio);
            stmt.setString(6,marca);
            
            
            int retorno = stmt.executeUpdate();
            if (retorno>0)
            {
            JOptionPane.showMessageDialog(null,"Tu Producto ha sido modificado ");
            System.out.println("Modificado correctamente");
            }
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return null;  
    }
    
      ResultSet modifica1(String id, String proveedor, String telefono, String nombre, String tipo) {
        ResultSet rs=null;
        try{
            stmt = con.prepareStatement("UPDATE Proveedor  SET NOMBRE=?, TELEFONO=?, COMPAÑIA=?, TIPO_PRODUCTO=?"
            + "WHERE IDPROVEEDOR =?");
            stmt.setString(1,id);
            stmt.setString(2,proveedor);
            stmt.setString(3,telefono);
            stmt.setString(4,nombre);
            stmt.setString(5,tipo);
            
            
            int retorno = stmt.executeUpdate();
            if (retorno>0)
            {
            JOptionPane.showMessageDialog(null,"Tu Proveedor ha sido modificado ");
            System.out.println("Modificado correctamente");
            }
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
        }
        return null;  
    }
    
    /**
     *Este metodo hace un insert de un cliente en la entidad CLiente
     * @param nombre
     * @param cantidad
     * @param fecha
     * @return true si todo esta bien, false si no
     */
    public boolean agregaCliente(String nombre,double cantidad,String fecha){
        boolean comprueva = false;
        try{
            stmt = con.prepareStatement("INSERT INTO CLIENTE(NOMBRECLIENTE,DEUDA,FECHADEUDA)VALUES (?,?,?)");
            stmt.setString(1,nombre);
            stmt.setDouble(2,cantidad);
            stmt.setString(3, fecha);
            
            int retorno = stmt.executeUpdate();
            if (retorno>0)
            {
            comprueva= true;
            }  
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error"+ex.getMessage());
             comprueva=false;
        }
        return comprueva;
    }
    
    
}
