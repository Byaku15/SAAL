/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioCliente;

/**
 *Esta clase representa a la entidad controlCliente
 * @author lalo
 */
public class ControlCliente {
     ServicioCliente  servicioCliente1=new ServicioCliente ();
     ArrayList<Cliente> clientes=new ArrayList<Cliente>();
     int numero;
   

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
    
    public void iniciaModificarCLiente() {
        VentanaListaClientes ventanaListaCliente1= new VentanaListaClientes(this);
        ventanaListaCliente1.setVisible(true);
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
    /**
     * Este metodo recurepa todos los clientes guardados en la lista de fiar
     * @throws SQLException 
     */
    
    public void recuperaClientes() throws SQLException {
           Cliente cliente;
             clientes.clear();
           for(Cliente c:servicioCliente1.recuperaClientes()){
            cliente=new Cliente();
            cliente.setNombre(c.getNombre());
            cliente.setCantidad(c.getCantidad());
            cliente.setFecha(c.getFecha());
            clientes.add(cliente);
        }
        VentanaListaClientes ventanaListaCliente1= new VentanaListaClientes(this);
        ventanaListaCliente1.llenaComboBox(clientes);
        ventanaListaCliente1.setVisible(true);
    }
       /**
        * Este metodo permite controlar la HU modificar cliente
        * @param cliente 
        */

    public void modificaCliente(String cliente) {
          VentanaModificaDatosCliente ventanaModificaDatosCliente=new VentanaModificaDatosCliente(this);
          numero=buscaCliente(cliente);
          ventanaModificaDatosCliente.cambiaDatos(clientes.get(numero));
          ventanaModificaDatosCliente.setVisible(true);
    }
        /**
         * regresa el indice donde se encuentra el cliente que queremos
         * @param cliente1
         * @return 
         */
    private int buscaCliente(String cliente1){
        int num=-1;
        for(int i=0;i<clientes.size();i++){
            if(cliente1.equals(clientes.get(i).getNombre())){
                num=i;
                break;
            }
        }
        return num;
    }
         /**
          * Este metodo actualiza con los datos nuevos del cliente
          * @param nombre
          * @param cantidad
          * @param fecha 
          */
    public void actualizaCliente(String nombre, Double cantidad, String fecha) {
        boolean retorno;
        retorno=servicioCliente1.actualizaCliente(clientes.get(numero).getNombre(),nombre,cantidad,fecha);
        if(retorno==true){
            JOptionPane.showMessageDialog(null,"El cliente se modifico correctamente");
            iniciaControlCliente();
        }else{
           JOptionPane.showMessageDialog(null,"ERROR,el cliente no se modifico correctamete");
           iniciaControlCliente();
        }
    }
    
}
