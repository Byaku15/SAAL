/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;

/**
 *Esta clase se encarga del manejo permanente de la entidad cliente
 * @author lalo
 */
public class DAOCliente {
    conexion BaseDeDatos=new conexion();
    
    /**
     *Este metodo agrega al cliente pasado a la base de datos y asegura su permanencia
     * @param cliente
     * @return
     * @throws SQLException
     */
    public boolean agregaCliente(Cliente cliente) throws SQLException {
     BaseDeDatos.getConexion();
     boolean comprueva;
     comprueva= BaseDeDatos.agregaCliente(cliente.getNombre(),cliente.getCantidad(),cliente.getFecha()); 
      return comprueva;
    }
}
