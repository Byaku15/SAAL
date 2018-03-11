
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProducto;

/**
 *
 * @author lalo
 */
public class ControlProducto {
    ServicioProducto servicioProducto1= new ServicioProducto(); 
    double precioProducto;
    Producto agregaProducto;
    Producto modificarProducto;
 
    /**
     *
     */
    public void iniciaControlAgregarProducto() {
        VentanaAgregarProducto ventanaAgregarProducto = new VentanaAgregarProducto(this);
        ventanaAgregarProducto.setVisible(true);
    }

    /**
     *
     * @throws SQLException
     */
    public  void iniciaControlModificarProducto() throws SQLException {
        VentanaModificarProducto ventanaModificarProducto = new VentanaModificarProducto(this);
        ventanaModificarProducto.cargaComboBox();
        ventanaModificarProducto.setVisible(true);
    }

    /**
     *
     */
    public void iniciaControlConsultarProducto() {
       VentanaConsultaDePrecios ventanaConsultaPrecio= new VentanaConsultaDePrecios(this);
        ventanaConsultaPrecio.setVisible(true);
        
    }

    /**
     *
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    /**
     *
     */
    public void modificarDatosProducto(){
       VentanaModificarDatosProducto ventanaModificarDatosProducto= new VentanaModificarDatosProducto(this);
       ventanaModificarDatosProducto.setVisible(true);
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
       agregaProducto= servicioProducto1.agregarProducto(id, nombre, caducidad, existencias, precio, marca);
       return agregaProducto;
    }
    /**
     *
     * @param nombreProducto
     * @return 
     * @throws SQLException
     */
    public double buscarProducto(String nombreProducto) throws SQLException {
       precioProducto= servicioProducto1.buscaProducto(nombreProducto);
       return precioProducto;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<String> llenaComboBox() throws SQLException{
        ArrayList<String> listaproductos=new ArrayList<String>();
        listaproductos= servicioProducto1.recuperarProductos();
        return listaproductos;
   }

    String modificarDatosProducto(String nombre) {
       VentanaModificarDatosProducto ventanaModificarDatosProducto= new VentanaModificarDatosProducto(this);
       ventanaModificarDatosProducto.nombre(nombre);
       ventanaModificarDatosProducto.setVisible(true);
       return nombre;
    }

    Producto modificarProducto(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
       modificarProducto= servicioProducto1.modificarProducto(id, nombre, caducidad, existencias, precio, marca);
       return modificarProducto;
    }
   
}
