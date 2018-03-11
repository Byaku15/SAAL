
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioReporte;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProducto;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioReporte;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioVenta;

/**
 *
 * @author ALfa Omega
 */
public class ControlVentas {
  Reporte reporte1;  
 ServicioReporte servicioReporte1 = new ServicioReporte();   
 ServicioProducto servicioProducto1= new ServicioProducto();
 ServicioVenta servicioVenta1= new ServicioVenta();
 //Inicializan cada uno de los casos de uso

    /**
     * Inicializa el caso de uso de consultar venta 
     */
   public void iniciaControlConsultarVenta() {
        VentanaFinanzas ventanaFinanzas = new VentanaFinanzas(this);
        ventanaFinanzas.setVisible(true);
    }

    /**
     * Incia el caso de realizar una venta 
     */
    public void iniciaControlVentas() {
        VentanaRealizarVenta ventanaRealizarVenta= new VentanaRealizarVenta(this);
        ventanaRealizarVenta.setVisible(true);
    }
    
    
//Metodos que cubren las opciones del caso de uso de consultar ventas

    /**
     * Parte del flujo principal del caso de uso consultar venta
     * @param periodo: String . Indica el periodo de tiempo de la consulta
     * @throws SQLException
     */
    public void consultarTodo(String periodo) throws SQLException  {
        VentanaFinanzasTodo ventanaFinanzasTodo = new VentanaFinanzasTodo(this);        
        reporte1=servicioReporte1.generarReporteTodo(periodo);
        ventanaFinanzasTodo.llenaCampos(reporte1);
        ventanaFinanzasTodo.setVisible(true);

        
    }

    /**
     * Este metodo es parte del flujo alternativo del caso de uso consultar venta
     * @param periodo:String . Indica el periodo de tiempo de la consulta
     * @throws SQLException
     */
    public void consultarProductos(String periodo) throws SQLException {
        VentanaFinanzasProductos ventanaFinanzasProductos = new VentanaFinanzasProductos(this);
        reporte1=servicioReporte1.generarReporteProductos(periodo);
        ventanaFinanzasProductos.llenaCampos(reporte1);
        ventanaFinanzasProductos.setVisible(true);
    }

    /**
     *Este metodo es parte del flujo alternativo del caso de uso consultar venta
     * @param periodo:String . Indica el periodo de tiempo de la consulta
     *  @throws SQLException
     */
    public void consultarRecargas(String periodo) throws SQLException {
        VentanaFinanzasRecargas ventanaFinanzasRecargas = new VentanaFinanzasRecargas(this);
        reporte1=servicioReporte1.generarReporteRecargas(periodo);
        ventanaFinanzasRecargas.llenaCampos(reporte1);
        ventanaFinanzasRecargas.setVisible(true);
    }   
    
    /**
     *
     * @param producto: String, indica el nombre del producto que se desea verificar.
     * @param cantidad: int, indica la cantidad del producto que se desea verificar
     * @return precio:double, regresa el precio del producto
     * @throws SQLException
     */
    public double verificaVenta(String producto, int cantidad) throws SQLException {
        double precio=servicioProducto1.buscaProductoYExistencias(producto,cantidad);        
        return precio;
    }
    
    /**
     * Cierra la ventana de finanzas y vuelve al menu principal
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
         controlPrincipal1.iniciaControl();
    }

    /**
     * Manda todos los datos necesarios al servicio, para que este pueda realizar
     * la venta correspondiente
     * @param productos: String, arreglo que contiene los nombres de los productos dentro de la venta
     * @param monto: Double, inidica el costo total de la venta
     * @param fecha: LocalDate Indica el dia en que se realizo la venta 
     * @param cantidades Int, indica las cantidades de cada producto
     * @return
     * @throws SQLException
     */
    public  boolean confirmarVenta(ArrayList<String> productos, double monto, LocalDate fecha, ArrayList<Integer> cantidades) throws SQLException {
       boolean estado= servicioVenta1.RealizaVenta(productos, monto,fecha,cantidades);
       if(estado=true){
        estado=servicioProducto1.actualizaExistencias(productos,cantidades);
       }
       
       return estado;
    }

}
