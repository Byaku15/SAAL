
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;



/**
 *Esta clase se encarga del flujo de la ventana principal
 * @author Alfa-Omega
 */
public class ControlPrincipal {
   // VentanaPrincipal ventanaPrincipal1=new VentanaPrincipal();

    /**
     * Este metodo incia el control principal, es usado cuando se finaliza algun caso 
     * de uso y se requiere mostrar de nuevo la ventana principal
     */
   public void iniciaControl() {
        VentanaPrincipal ventanaPrincipal1 = new VentanaPrincipal(this);
        ventanaPrincipal1.setVisible(true);
    }
    ControlVentas controlVentas1;
    ControlProducto controlProducto1;
    ControlProveedores controlProveedores1;
    ControlRecargas controlRecargas1;
    ControlInventario controlInventario1;
    ControlCliente controlCliente1;

    /**
     *inizializa la historia de usuario ""Cliente"
     */
    public void revisarCliente(){
       controlCliente1=new ControlCliente();
       controlCliente1.iniciaControlCliente();
    }
    /**
     * Incializa el caso de uso Consultar venta
     */
    public void consultarVenta() {
        controlVentas1=new ControlVentas();
        controlVentas1.iniciaControlConsultarVenta();
    }

    /**
     *Este metodo inicializa el caso de uso Inventario
     * @throws java.sql.SQLException
     */
    public void revisarInventario() throws SQLException {
      controlInventario1=new ControlInventario();
       controlInventario1.iniciaControlInventario();
    }

    /**
     * Este metodo inicializa el caso de uso Agregar Producto
     */
    public void agregarProducto() {
        controlProducto1 = new ControlProducto();
        controlProducto1.iniciaControlAgregarProducto();
    }

    /**
     *Este metodo inicializa el caso de uso realizar venta
     */
    public void realizarVenta() {
        controlVentas1=new ControlVentas();
        controlVentas1.iniciaControlVentas();
    }

    /**
     * Este metodo incializa el caso de uso de realizar recargas
     */
    public void realizarRecarga() {
        controlRecargas1=new ControlRecargas();
        controlRecargas1.iniciaControlRecargas();
    }

    /**
     * Este metodo inicializa el caso de uso modificar producto
     * @throws java.sql.SQLException
     */
    public void modificarProducto() throws SQLException {
       controlProducto1=new ControlProducto();
       controlProducto1.iniciaControlModificarProducto();
    }

    /**
     *Este metodo inicializa el caso de uso inventario
     */
    public void revisarProveedor() {
      controlProveedores1=new ControlProveedores();
        controlProveedores1.iniciaControlProveedores();
    }
    
    /**
    *Este metodo inicializa el caso de uso consultar precios
    */
    public void cosultarPrecios() {
         controlProducto1=new ControlProducto();
         controlProducto1.iniciaControlConsultarProducto();
    }
    
     public void cerrarSesion(){
        ControlLogin controlLogin1 = new ControlLogin();
        controlLogin1.iniciaControlLogin();
    }
}
