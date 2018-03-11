
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProveedor;

/**
 *
 * @author Byakuya
 */
public class ControlProveedores {
    ServicioProveedor servicioProveedor1= new ServicioProveedor();
    Proveedor agregaProveedor;
    Proveedor modificarProveedor;
   
    /**
     *
     */
    public void iniciaControlProveedores() {
        VentanaProveedores ventanaProveedores = new VentanaProveedores(this);
        ventanaProveedores.setVisible(true);
    }

    void iniciaControlAgregarProveedor() {
       VentanaAgregarProveedor ventanaAgregarProveedor= new VentanaAgregarProveedor(this);
       ventanaAgregarProveedor.setVisible(true);
    }

    void iniciaControlConsultarProveedor() throws SQLException {
       VentanaConsultaProveedor ventanaConsultarProveedor= new VentanaConsultaProveedor(this);
       ventanaConsultarProveedor.cargaComboBox();
       ventanaConsultarProveedor.setVisible(true);
    }

    void iniciaControlModificarProveedor()throws SQLException  {
       VentanaModificaProveedor ventanaModificaProveedor= new VentanaModificaProveedor(this);
       ventanaModificaProveedor.cargaComboBox();
       ventanaModificaProveedor.setVisible(true);
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
    public void mostrarResultadoConsulta(){
        VentanaConsultarProveedorResultado ventanaConsultarProveedorResultado= new VentanaConsultarProveedorResultado(this);
        ventanaConsultarProveedorResultado.setVisible(true);
    }
    
    /**
     *
     */
    public void modificarDatosProveedor(){
       VentanaModificaDatosProveedor  ventanaModificaDatosProveedor= new VentanaModificaDatosProveedor(this);
       ventanaModificaDatosProveedor.setVisible(true);
    }

    /**
     *Metodo para agregar un proveedor
     * 
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     * @throws SQLException
     */
    public Proveedor agregarProveedor(int id, String proveedor, String telefono, String nombre, String tipo) throws SQLException {
       agregaProveedor= servicioProveedor1.agregarProveedor(id, proveedor, telefono, nombre, tipo);
       return agregaProveedor;
    }

    ArrayList<String> llenaComboBox() throws SQLException {
        ArrayList<String> listaproveedores1=new ArrayList<String>();
        listaproveedores1= servicioProveedor1.recuperarProveedores();
        return listaproveedores1;
    }
    
    /**
     *Metodo para mostrar resultado en la consulta
     * 
     * @param nombre
     * @return
     */
    public String mostrarResultadoConsulta(String nombre){
        VentanaConsultarProveedorResultado ventanaConsultarProveedorResultado= new VentanaConsultarProveedorResultado(this);
        ventanaConsultarProveedorResultado.nombre(nombre);
        ventanaConsultarProveedorResultado.setVisible(true);
        return nombre;
    }
  
    Proveedor modificarProveedor(String id, String proveedor, String telefono, String nombre, String tipo) {
        modificarProveedor= servicioProveedor1.modificarProveedor(id, proveedor, telefono, nombre, tipo);
        return modificarProveedor;
    }

    String modificarDatosProveedor(String nombre) {
       VentanaModificaDatosProveedor  ventanaModificaDatosProveedor= new VentanaModificaDatosProveedor(this);
       ventanaModificaDatosProveedor.nombre(nombre);
       ventanaModificaDatosProveedor.setVisible(true);
       return nombre;
    }
}

