/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOCliente;

/**
 *Esta clase representa al servicio cliente
 * @author lalo
 */
public class ServicioCliente {
        DAOCliente daoCliente=new DAOCliente();
       ArrayList<Cliente> clientes=new ArrayList<Cliente>();
   
    /**
     *Este metodo crea al cliente ypasa 
     * todos los datos del control a la base de datos para agregar un cliente
     * @param nombre
     * @param cantidad
     * @param fecha
     * @return
     * @throws SQLException
     * @throws ParseException
     */
    public boolean agregarCliente(String nombre, double cantidad, String fecha) throws SQLException, ParseException {
        Cliente cliente=new Cliente();
        boolean comprueva;
        cliente.setNombre(nombre);
        cliente.setCantidad(cantidad);
        cliente.setFecha(fecha);
        comprueva=daoCliente.agregaCliente(cliente);
        return comprueva;
    }
       /**
        * Este metodo  recupera en un Array a todos los clientes
        * @return
        * @throws SQLException 
        */
    public ArrayList<Cliente> recuperaClientes() throws SQLException {
            Cliente cliente;
            clientes.clear();
        for(Cliente c:daoCliente.recuperameClientes()){
            cliente=new Cliente();
            cliente.setNombre(c.getNombre());
            cliente.setCantidad(c.getCantidad());
            cliente.setFecha(c.getFecha());
            clientes.add(cliente);
        }
        return clientes;
    }
       /**
        * Este metodo manda a la BD la solicitud d actualizacion
        * @param nombreAntiguo
        * @param nombreNuevo
        * @param cantidad
        * @param fecha
        * @return 
        */
    public boolean actualizaCliente(String nombreAntiguo, String nombreNuevo, Double cantidad, String fecha) {
        boolean retorno;
        retorno=daoCliente.actualizaCliente(nombreAntiguo,nombreNuevo,cantidad,fecha);
        System.out.println(retorno);
        return retorno;
    }
    
}
