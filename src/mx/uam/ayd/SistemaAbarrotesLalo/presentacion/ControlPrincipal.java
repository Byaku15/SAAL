
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;


    /***************************************************Sprint 2. HU - Alertas productos a caducar***********************************************************/

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
      /***************************************************Sprint 2. HU - Alertas productos a caducar***********************************************************/
    /**
     * Este metodo se encarga de recuperar los datos de los productos próximos a caducar
     */
    public String recuperaProductosYCaducidad(){
        controlProducto1 = new ControlProducto();
        ArrayList lista = new ArrayList();
        String fechaActual;
        Date dateActual, dateCaducidad;
        int diferenciaFechas;
        int dias = 4;
        
        try {
           lista = controlProducto1.recuperaProductosYCaducidad();
        }catch (SQLException ex) {
           Logger.getLogger(ControlPrincipalInvitado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        String output = "";
        if(lista.isEmpty()){
            output = "Productos por caducar:\n\tNo hay productos para mostrar";  
        }else{          
             for(int i = 0; i<lista.size(); i++){
                
                String cadena = lista.get(i).toString();
                
                String[] parte = cadena.split("\\|");
                String producto = parte[0]; // Nombre del Producto
                String fechaCaducidad = parte[1]; // dd-mm-YYYY
                
                fechaActual = getFechaActual();
                dateActual = deStringToDate(fechaActual);
                dateCaducidad = deStringToDate(fechaCaducidad);
                
                diferenciaFechas = diferenciasDeFechas(dateActual, dateCaducidad);
                
                if(diferenciaFechas <= dias)
                    output += cadena+"\n";

             } 
        
        }
        return output;
    }
    
    /*
    * Los siguientes métodos permiten hacer las operaciones entre fechas
    *
    */
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MMMMM-yyyy");
        return formateador.format(ahora);
    }
    
    public static synchronized java.util.Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MMMMM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }
          /***************************************************Termina Sprint 2. HU - Alertas productos a caducar***********************************************************/
     
}
