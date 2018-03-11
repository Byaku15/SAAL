
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Recarga;

/**
 *
 * @author lalo
 */
public class DAORecarga {

    ResultSet recargas;
    int montoRecargas = 0, tamaño = 0;
    private conexion conexion;
    conexion BaseDeDatos = new conexion();
    LocalDate fechaActual = LocalDate.now();
    int dia = fechaActual.getDayOfMonth();
    int mes = fechaActual.getMonthValue();
    int año = fechaActual.getYear();
    int contador, suma;

    /**
     *Recupera los montos de recargas contenidas dentro de un periodo de tiempo
     * @param periodo
     * @return montorecargas
     * @throws SQLException
     */
    public int recuperaMontos(String periodo) throws SQLException {

        BaseDeDatos.getConexion();
        if (periodo.equals("Dia")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'"+dia+"-"+mes+"-"+año+"'");
            while (recargas.next()) {
               suma =suma + recargas.getInt("MONTO");
            }
           montoRecargas=suma;
           suma=0;

        }

        if (periodo.equals("Mes")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (recargas.next()) {
                suma =suma + recargas.getInt("MONTO");
            }
            montoRecargas=suma;
           suma=0;
        }
        if (periodo.equals("Año")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (recargas.next()) {
                suma =suma + recargas.getInt("MONTO");
            }
            montoRecargas=suma;
           suma=0;
        }
        return montoRecargas;
    }

    /**
     *Recupera el numero de recargas realizadas dentro de un periodo de tiempo
     * @param periodo
     * @return tamaño
     * @throws SQLException
     */
    public int recuperaTamaño(String periodo) throws SQLException {
        if (periodo.equals("Dia")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "'");
            while (recargas.next()) {
                contador++;
            };
            tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Mes")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (recargas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Año")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (recargas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }
        return tamaño;
    }

    /**
     * Agrega una entidad de la clase Recarga dentro de la base de datos
     * @param recarga1
     * @return estado
     * @throws SQLException
     */
    public boolean AgregaRecarga(Recarga recarga1) throws SQLException {
       Statement statement = BaseDeDatos.getConexion().createStatement();
        Random al= new Random();
        int id = al.nextInt(1000);
        int dia= recarga1.getFechaActual().getDayOfMonth();
        int mes= recarga1.getFechaActual().getMonthValue();
        int año=recarga1.getFechaActual().getYear();
         statement.execute("INSERT INTO RECARGA (IDRECARGA, MONTO, FECHA) \n"
                + "VALUES (" + id + "," + recarga1.getMonto() + "," + "'"+dia+"-"+mes+"-"+año+"')");
        return true;
    }
   
}



