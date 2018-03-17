/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Cliente;

/**
 *Esta clase se encarga del manejo permanente de la entidad cliente
 * @author lalo
 */
public class DAOCliente {
    conexion BaseDeDatos=new conexion();
    ArrayList<Cliente> clientes=new ArrayList<Cliente>();
    PreparedStatement stmt = null;
    
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
            /**
             * Este metodo ayuda a recuperar todos los clientes en la lista de fiar
             * @return
             * @throws SQLException 
             */
    public ArrayList<Cliente> recuperameClientes() throws SQLException {
        BaseDeDatos.getConexion();
        Cliente cliente;
        clientes.clear();
        ResultSet rs=BaseDeDatos.consulta("SELECT NOMBRECLIENTE,DEUDA,FECHADEUDA FROM CLIENTE ");
        while(rs.next()){
            cliente=new Cliente();
            cliente.setNombre(rs.getString(1));
            cliente.setCantidad(rs.getDouble(2));
            cliente.setFecha(rs.getString(3));
            clientes.add(cliente);
        } 
       // for(Cliente c:clientes){
         //   System.out.println(c.getNombre());
        //}
        return clientes;
    }
        /**
         * Este metodo actualiza al cliente del que se desee modificar los cambion
         * @param nombreAntiguo
         * @param nombreNuevo
         * @param cantidad
         * @param fecha
         * @return 
         */
    public boolean actualizaCliente(String nombreAntiguo, String nombreNuevo, Double cantidad, String fecha) {
        BaseDeDatos.getConexion();
        int retorno;
        retorno = BaseDeDatos.modificaCliente(nombreAntiguo,nombreNuevo,cantidad,fecha);
        if(retorno>0){
            return true;
        }else{
            return false;
        }
    }
}
