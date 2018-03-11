
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Venta;

/**
 *
 * @author lalo
 */
public class DAOVenta {
 ResultSet ventas;
    int tamaño=0;
    double montoVentas = 0, suma;
    conexion BaseDeDatos=new conexion();
    LocalDate fechaActual = LocalDate.now();
    int dia = fechaActual.getDayOfMonth();
    int mes = fechaActual.getMonthValue();
    int año = fechaActual.getYear();
    int contador;    
    
    /**
     * Recupera los montos de ventas contenidas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public double recuperaMontos(String periodo) throws SQLException {
           BaseDeDatos.getConexion();
        if (periodo.equals("Dia")) {
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "'");
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoVentas = suma;
            suma = 0;
        }
        if (periodo.equals("Mes")) {

            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoVentas = suma;
            suma = 0;
        }
        if (periodo.equals("Año")) {
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoVentas = suma;
            suma = 0;
        }
        return montoVentas;
    }

    /**
     * Recupera el numero de ventas contenidas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int recuperaTamaño(String periodo) throws SQLException {
        if (periodo.equals("Dia")) {
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "'");
            while (ventas.next()) {
                contador++;
            }
             tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Mes")) {

            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (ventas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Año")) {

            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (ventas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }
        return tamaño;
    }

    /**
     * Crea una nueva instancia de venta y la almacena 
     * @param venta1
     * @return
     * @throws SQLException
     */
    public boolean creaVenta(Venta venta1) throws SQLException {
        Statement statement = BaseDeDatos.getConexion().createStatement();
        int id = 3;
        id = id++;
        int dia= venta1.getFecha().getDayOfMonth();
        int mes= venta1.getFecha().getMonthValue();
        int año=venta1.getFecha().getYear();
         statement.execute("INSERT INTO VENTA (IDVENTA, MONTO, FECHA) \n"
                + "VALUES (" + id + "," + venta1.getMonto() + "," + "'"+dia+"-"+mes+"-"+año+"')");
        return true;
    }
}
