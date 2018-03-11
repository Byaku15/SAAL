/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.text.ParseException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOCliente;

/**
 *Esta clase representa al servicio cliente
 * @author lalo
 */
public class ServicioCliente {
        DAOCliente daoCliente=new DAOCliente();

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
    
}
