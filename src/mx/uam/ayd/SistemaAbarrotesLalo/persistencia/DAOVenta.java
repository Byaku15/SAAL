
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Venta;

/**
 *
 * @author nallely
 */
public class DAOVenta {
 ResultSet ventas;
    int tamaño=0;
    double montoVentas = 0, suma;
    double montoPasado=0;
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
        BaseDeDatos.getConexion();
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
        int id=1+tamaño();
        int dia= venta1.getFecha().getDayOfMonth();
        int mes= venta1.getFecha().getMonthValue();
        int año=venta1.getFecha().getYear();
         statement.execute("INSERT INTO VENTA (IDVENTA, MONTO, FECHA) \n"
                + "VALUES (" + id + "," + venta1.getMonto() + "," + "'"+dia+"-"+mes+"-"+año+"')");
        return true;
    }
    
    public int tamaño() throws SQLException{
        BaseDeDatos.getConexion();
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA");
            while (ventas.next()) {
                contador++;
            }
             return contador;
    }

    /**
     * Recupera los montos pasados dentro de un periodo de tiempo
     * @param periodo
     * @return montoPasado
     * @throws SQLException
     */
    public double recuperaMontosPasados(String periodo) throws SQLException {
        int diaP,mesP, añoP, caso;
        BaseDeDatos.getConexion();
        if (periodo.equals("Dia")) {
           if(dia!=1){
               diaP=dia-1;
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'" + diaP + "-" + mes + "-" + año + "'");   
           }else{
              diaP= calculafecha("Dia");
              mesP= calculafecha("Mes");
              añoP= calculafecha("Año");
              ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'" + diaP + "-" + mesP + "-" + añoP + "'");   
           }            
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        if (periodo.equals("Mes")) {
            mesP= calculafecha("Mes");
            if(mesP==12){
               añoP=año-1;
              ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-" + mesP +"-"+añoP+"'"); 
            }else{
              ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-" + mesP +"-"+año+"'"); 
            }
            
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        if (periodo.equals("Año")) {
            añoP=año-1;
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA WHERE FECHA LIKE" + "'%-%" + añoP + "'");
            while (ventas.next()) {
                suma = suma + ventas.getDouble("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        return montoPasado;
    }

    /**
     * Calcula la fecha pasada donde se ven elementos como el numero de dias del mes entre otras
     * @param periodo
     * @return nueva fecha
     */
    public int calculafecha(String periodo) {
        int nuevaFecha=0;
      if(periodo.equals("Dia")){
          switch(mes){
               case 1:
                  //regreso los dias de diciembre
                   nuevaFecha=31;
                     break;
            case 2:
                //regreso los dias de enero
                 nuevaFecha=31;
                     break;
            case 3:
                //regreso los dias de febrero
                 nuevaFecha=28;
                     break;
            case 4:
                //regreso los dias de marzo
                 nuevaFecha=31;
                     break;
            case 5: 
                //regreso los dias de abril
                 nuevaFecha=30;
                     break;
            case 6:  
                //regreso los dias de mayo
                 nuevaFecha=31;
                     break;
            case 7:
                //regreso los dias de junio
                 nuevaFecha=30;
                     break;
            case 8: 
                //regreso los dias de julio
                 nuevaFecha=31;
                     break;
            case 9: 
                //regreso los dias de agosto
                 nuevaFecha=31;
                     break;
            case 10:
                //regreso los dias de septiembre
                 nuevaFecha=30;
                     break;
            case 11: 
                //regreso los dias de octubre
                 nuevaFecha=31;
                     break;
            case 12: 
              //regreso los dias de noviembre
                 nuevaFecha=30;
                    break;
            }

        }
        if (periodo.equals("Mes")) {
            if (mes == 1) {
                nuevaFecha = 12;
            } else {
                nuevaFecha = mes - 1;
            }

        }
        if (periodo.equals("Año")) {
            if (mes == 1&&dia==1) {
                nuevaFecha = año-1;
            } else {
                nuevaFecha = año;
            }

        }
      return nuevaFecha; 
    }
}
