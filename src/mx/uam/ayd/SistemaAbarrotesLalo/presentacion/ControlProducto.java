
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProducto;

/**
 *Este clase se encarga todo lo relacionado con el producto
 * @author lalo
 */
public class ControlProducto {
    ServicioProducto servicioProducto1= new ServicioProducto(); 
    double precioProducto;
    Producto agregaProducto;
    Producto modificarProducto;
    Producto eliminarProducto;
 
    /**
     *Inicia el menu principal de producto
     */
    
    public void iniciaControlProducto() {
        VentanaProductos ventanaProductos = new VentanaProductos(this);
        ventanaProductos.setVisible(true);
    }
    
    /**
     *Este metodo abre la ventana agregar producto
     */
    public void iniciaControlAgregarProducto() {
        VentanaAgregarProducto ventanaAgregarProducto = new VentanaAgregarProducto(this);
        ventanaAgregarProducto.setVisible(true);
    }

    /**
     *Este metodo abre la ventana modificar producto con una lista de nombres
     * @throws SQLException
     */
    public  void iniciaControlModificarProducto() throws SQLException {
        VentanaModificarProducto ventanaModificarProducto = new VentanaModificarProducto(this);
        ventanaModificarProducto.cargaComboBox();
        ventanaModificarProducto.setVisible(true);
    }

    /**
     *Este metodo inicia la ventana de consultar precio
     */
    public void iniciaControlConsultarProducto() {
       VentanaConsultaDePrecios ventanaConsultaPrecio= new VentanaConsultaDePrecios(this);
        ventanaConsultaPrecio.setVisible(true);
        
    }
    
    /**
     * Este metodo inicia la ventana de eliminar producto con una lista de nombres
     * @throws SQLException
     */
    public void iniciaControlEliminarProducto() throws SQLException {
        VentanaEliminarProducto ventanaEliminarProducto = new VentanaEliminarProducto(this);
        ventanaEliminarProducto.cargaComboBox();
        ventanaEliminarProducto.setVisible(true);
    }
    /**
     *Este metodo termina el menu de producto
     */
    public void iniciaControlProductoAgotado() throws SQLException {
        VentanaProductosAgotados ventanaProductosAgotados =new VentanaProductosAgotados (this);
        ventanaProductosAgotados.cargaComboBox2();
        ventanaProductosAgotados.setVisible(true);
    }
    
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    /**
     *Este metodo inicia la ventana modificar datos
     */
    public void modificarDatosProducto(){
       VentanaModificarDatosProducto ventanaModificarDatosProducto= new VentanaModificarDatosProducto(this);
       ventanaModificarDatosProducto.setVisible(true);
   } 

    /**
     *Este metodo agrega un producto
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
     *Este metodo busca un producto por nombre
     * @param nombreProducto
     * @return 
     * @throws SQLException
     */
    public double buscarProducto(String nombreProducto) throws SQLException {
       precioProducto= servicioProducto1.buscaProducto(nombreProducto);
       return precioProducto;
    }

    /**
     *Este metodo regresa una lista de los productos
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
    
     /**
     *Este metodo modifica un producto
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     * @throws SQLException
     */
    Producto modificarProducto(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
       modificarProducto= servicioProducto1.modificarProducto(id, nombre, caducidad, existencias, precio, marca);
       return modificarProducto;
    }
    /*******************************Sprint
     *Este metodo regresa una lista con nombre y caducidad
     * @return 2*
     * @throws java.sql.SQLException*************************************/
    
    public ArrayList recuperaProductosYCaducidad() throws SQLException{
        ArrayList listaProductosCaducidad = new ArrayList();
        listaProductosCaducidad = servicioProducto1.recuperaProductosYCaducidad();
        return listaProductosCaducidad;
    }   
    /**
     *Este metodo elimina un producto
     * @param nombre
     * */
    Producto iniciaControlEliminar(String nombre) {
       //System.out.println("EL producto es: "+nombre);
       eliminarProducto=servicioProducto1.eliminaProducto(nombre);
       return eliminarProducto;
    }
    
    public ArrayList llenaComboBox2() {
        ArrayList listaProductosCantidad = new ArrayList();
        listaProductosCantidad = servicioProducto1.recuperaProductosYCantidad();
        return listaProductosCantidad;
    }

    
}
