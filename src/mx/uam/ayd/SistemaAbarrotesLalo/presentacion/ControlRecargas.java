
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioCompañia;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioRecarga;

/**
 *
 * @author Nallely
 */
public class ControlRecargas {

    ServicioCompañia ServicioCompañia1 = new ServicioCompañia();
    ServicioRecarga servicioRecarga1= new ServicioRecarga();
    

    /**
     * Inicializa la ventana referente a los casos de uso de recargas y compañias
     * telefonicas
     */
    void iniciaControlRecargas() {
        VentanaRecargasPrincipal ventanaRecargas = new VentanaRecargasPrincipal(this);
        ventanaRecargas.setVisible(true);
    }
     /**
     *Cuando se termine cualquier caso de uso, este metodo permite volver a mostrar
     * la pantalla principal
     */
    void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }
    /**
     *Permite volver a la pantalla principal del control de recargas
     */
    void finalizaControlSecundario() {
        ControlRecargas controlRecargas1 = new ControlRecargas();
        controlRecargas1.iniciaControlRecargas();
    }
    
     /**
     *Abre la ventana conferente al caso de uso de agregar una compañia
     */
    void AgregarCompañia() {
        VentanaAgregarCompañia ventanaCompañia = new VentanaAgregarCompañia(this);
        ventanaCompañia.setVisible(true);
    }
     /**
     *Abre la ventana conferente al caso de uso de registrar una recarga
     */
    void RegistrarRecarga() throws SQLException {
        VentanaRecargas ventanaRecargas2 = new VentanaRecargas(this);
        ventanaRecargas2.setVisible(true);
    }
     /**
     * Agrega una nueva entidad de la clase compañia, solicitando el nombre que
     * esta tendra.
     * @param nombre.
     * @return estado
     */
      boolean AgregarCompañia(String nombre) throws SQLException {
     boolean estado= ServicioCompañia1.AgregarCompañia(nombre);
         return estado;
    }
    /**
     * Agrega una nueva entidad de la clase recargas, solicitando el monto de 
     * la recarga y la fecha en la que se realizo.
     * @param monto, fecha actual.
     * @return estado
     */
        boolean AgregarRecarga(int monto, LocalDate fechaActual, String compañia) throws SQLException {
        boolean estado=servicioRecarga1.AgregarRecarga(monto, fechaActual,compañia);
        return estado;
    }
   /**
     * Regresa un areglo de string para llenar el comboBox con los nombres
     * de las compañias dentro de la base de datos
     * @throws SQLException
     * @return listaCompañias
     */
    ArrayList<String> llenaComboBox() throws SQLException {
        ArrayList<String> listaCompañias=new ArrayList<String>();
        listaCompañias= ServicioCompañia1.recuperarCompañias();
        return listaCompañias;
    }
}