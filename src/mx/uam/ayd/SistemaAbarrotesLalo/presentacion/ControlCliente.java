/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioCliente;

/**
 *Esta clase representa a la entidad controlCliente
 * @author lalo
 */
public class ControlCliente {
     ServicioCliente  servicioCliente1=new ServicioCliente ();

    /**
     *Este metodo da inicio al controlcliente y habre la vista del menu para fiar
     */
    public void iniciaControlCliente() {
        VentanaListaFiar ventanaListaFiar= new VentanaListaFiar(this);
        ventanaListaFiar.setVisible(true);
    }
    
    /**
     *Con este metodo se terminan las historias de usuario relacionadas con lista de fiar
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    /**
     *Este metodo inizialisa especificamnte la historia de usuario agregar cliente
     */
    public void iniciaAgregarCliente() {
        VentanaAgregarCliente ventanaAgregarCliente1= new VentanaAgregarCliente(this);
        ventanaAgregarCliente1.setVisible(true);
    }

    /**
     *Con este metodo se inicializa especificamente el caso de uso consultar lista de fiar
     */
    public void iniciaTablaFiar() {
          VentanaTablaFiar ventanaTablaFiar = new VentanaTablaFiar(this);
          ventanaTablaFiar.setVisible(true);
    }

    /**
     *Este metodo manda al servicio Cliente los datos verificados de
     * un nuevo cliente para agregarlo a la base de datos
     * @param nombre
     * @param cantidad
     * @param fecha
     * @throws SQLException
     * @throws ParseException
     */
    public void AgregaDatosBuenos(String nombre, double cantidad, String fecha) throws SQLException, ParseException {
        boolean comprueva;
        comprueva=servicioCliente1.agregarCliente(nombre,cantidad,fecha);
        if(comprueva==true){
            JOptionPane.showMessageDialog(null,"los datos de "+nombre+"\nhan sido guardados exitosamente");
        }else{
            JOptionPane.showMessageDialog(null,"error, datos no guardados");
        }
    }
}
