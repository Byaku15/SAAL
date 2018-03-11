
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProducto;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProveedor;

/**
 *Este clase sirve para controlar el flujo del caso de uso inventario
 * @author Alfa-Omega
 */
public class ControlInventario {
    ServicioProveedor servicioProveedor=new ServicioProveedor();
    ServicioProducto servicioProducto=new ServicioProducto();
    VentanaInventarioDatos ventanaInventarioDatos;
    VentanaInventarioCaducidad ventanaCaducidad; 
    String marcaActual;

    /**
     *Este metodo inicia el caso de uso inventario
     * @throws SQLException
     */
    public void iniciaControlInventario() throws SQLException{
        VentanaInventarioPrincipal ventanaInventarioPrincipal= new VentanaInventarioPrincipal(this);
        ventanaInventarioPrincipal.cargaComboBox();
        ventanaInventarioPrincipal.setVisible(true);
    }

    /**
     *Este metodo cierra la ventana Inventario para regresar a la principal
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    /**
     *Este metodo inicializa la pantalla donde se encuentra la tabla de los productos
     */
    public void InciaControlVisualizarDatos() {
       VentanaInventarioDatos ventanaInventarioDatos= new VentanaInventarioDatos(this);
       ventanaInventarioDatos.setVisible(true);
    }

    /**
     *Este metodo inicializa la pantalla donde se encuentran los productos a punto de caducar
     */
    public void InciaControlVisualizarCaducidad() {
       VentanaInventarioCaducidad ventanaInvetnarioCaducidad= new VentanaInventarioCaducidad(this);
       ventanaInvetnarioCaducidad.setVisible(true);
    }
   
    /**
     *Este metodo llena el combo box de la vista inventario principal
     * @return ArrayList con los nombres de los proveedores
     * @throws SQLException
     */
    public ArrayList<String> llenaComboBox() throws SQLException{
        ArrayList<String> listaprovedores=new ArrayList<String>();
        listaprovedores=servicioProveedor.recuperarProveedores();
        return listaprovedores;
   }

    /**
     *Este metodo Inicilaliza el caso de uso inventario
     * @param marca
     * @throws SQLException
     */
    public void mostrarProductos(String marca) throws SQLException {
        marcaActual=marca;
        ventanaInventarioDatos= new VentanaInventarioDatos(this);
        ResultSet rs=servicioProducto.mostrarProductos(marca);
        ventanaInventarioDatos.llenaTabla(rs);
        ventanaInventarioDatos.setVisible(true);
    }

    /**
     *
     * @throws SQLException
     */
    public void muestraProductosPorCaducar() throws SQLException {
        ventanaCaducidad=new VentanaInventarioCaducidad(this);
         ResultSet productosACaducar=servicioProducto.mostrarProductosPorCaducar(marcaActual);
         if(productosACaducar !=null){
         ventanaCaducidad.llenaTablaDeProductosACaducar(productosACaducar);
         ventanaCaducidad.setVisible(true);
         }else{
        VentanaInventarioPrincipal ventanaInventarioPrincipal= new VentanaInventarioPrincipal(this);
        ventanaInventarioPrincipal.cargaComboBox();
        ventanaInventarioPrincipal.setVisible(true);
         }
    }

    
}
