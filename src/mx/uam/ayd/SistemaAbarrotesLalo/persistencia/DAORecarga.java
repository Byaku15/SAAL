
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Recarga;

/**
 *
 * @author nallely
 */
public class DAORecarga {

    ResultSet recargas;
    int montoRecargas = 0, tamaño = 0, montoPasado;
    private conexion conexion;
    conexion BaseDeDatos = new conexion();
    LocalDate fechaActual = LocalDate.now();
    int dia = fechaActual.getDayOfMonth();
    int mes = fechaActual.getMonthValue();
    int año = fechaActual.getYear();
    int contador, suma;
    DAOCompañia daoCompañia1 = new DAOCompañia();

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
         BaseDeDatos.getConexion();
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
        int id = 1+tamaño();
        int dia= recarga1.getFechaActual().getDayOfMonth();
        int mes= recarga1.getFechaActual().getMonthValue();
        int año=recarga1.getFechaActual().getYear();
         statement.execute("INSERT INTO RECARGA (IDRECARGA, MONTO, FECHA, COMPAÑIA) \n"
                + "VALUES (" + id + "," + recarga1.getMonto() + "," + "'"+dia+"-"+mes+"-"+año+"',"+"'"+recarga1.getCompañia()+"'"+")");
        return true;
    }
    /**
    *Recupera el numero de elementos contenidos en la base de datos
    * @return tamaño
     * @throws SQLException
     */
    public int tamaño() throws SQLException{
        BaseDeDatos.getConexion();
            ventas = BaseDeDatos.consulta("SELECT MONTO FROM VENTA");
            while (ventas.next()) {
                contador++;
            }
             return contador;
    }


    /**
    * Devuelve la compañia telefonica con menores ventas dentro de un periodo
     *de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public String recuperaCompañiaMin(String periodo) throws SQLException {
         BaseDeDatos.getConexion();
        ArrayList<String> compañias = new ArrayList<String>();
        ArrayList<String> consulta = new ArrayList<String>();
        String compañia;
        compañias = daoCompañia1.recuperarCompañias();
        int aux = 0, i=0;
        compañia = compañias.get(0);

        if (periodo.equals("Dia")) {
            for (i = 0; i < compañias.size(); i++) {
                recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
                while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            }                
                if (consulta.size() >= aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }

        if (periodo.equals("Mes")) {
            for (i = 0; i < compañias.size(); i++) {
            recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
              while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            } 
                if (consulta.size() >= aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }

        if (periodo.equals("Año")) {
             for (i = 0; i < compañias.size(); i++) {
            recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
               while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            } 
                if (consulta.size() >= aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }
       
       
      return compañia; 
    }

    /**
     *Devuelve la compañia telefonica con mayores ventas dentro de un periodo
     *de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public String recuperaCompañiaMax(String periodo) throws SQLException {
         BaseDeDatos.getConexion();
        ArrayList<String> compañias = new ArrayList<String>();
        ArrayList<String> consulta = new ArrayList<String>();
        String compañia;
        compañias = daoCompañia1.recuperarCompañias();
        int aux =900000, i=0;
        compañia = compañias.get(0);

        if (periodo.equals("Dia")) {
            for (i = 0; i < compañias.size(); i++) {
                recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
                  while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            } 
                if (consulta.size() < aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }

        if (periodo.equals("Mes")) {
            for (i = 0; i < compañias.size(); i++) {
            recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
              while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            } 
                if (consulta.size() < aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }

        if (periodo.equals("Año")) {
             for (i = 0; i < compañias.size(); i++) {
            recargas = BaseDeDatos.consulta("SELECT COMPAÑIA FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "' AND COMPAÑIA LIKE" + "'" + compañias.get(i) + "'");
               while (recargas.next()) {
               consulta.add(recargas.getString("COMPAÑIA")) ;
            } 
                if (consulta.size() < aux) {
                    aux = consulta.size();
                    compañia = compañias.get(i);
                }
            }  
        }
       
       
      return compañia; 
    }

    /**
     *  Devuelve el monto de un periodo de tiempo pasado
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int recuperaMontosPasados(String periodo) throws SQLException {
         BaseDeDatos.getConexion();
       int diaP,mesP, añoP;
        if (periodo.equals("Dia")) {
           if(dia!=1){
               diaP=dia-1;
             recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'" + diaP + "-" + mes + "-" + año + "'");   
           }else{
              diaP= calculafecha("Dia");
              mesP= calculafecha("Mes");
              añoP= calculafecha("Año");
               recargas= BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'" + diaP + "-" + mesP + "-" + añoP + "'");   
           }            
            while (recargas.next()) {
                suma = suma +  recargas.getInt("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        if (periodo.equals("Mes")) {
            mesP= calculafecha("Mes");
            if(mesP==12){
               añoP=año-1;
               recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mesP +"-"+añoP+"'"); 
            }else{
               recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mesP +"-"+año+"'"); 
            }
            
            while ( recargas.next()) {
                suma = suma +  recargas.getInt("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        if (periodo.equals("Año")) {
            añoP=año-1;
             recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-%" + añoP + "'");
            while ( recargas.next()) {
                suma = suma +  recargas.getInt("MONTO");
            }
            montoPasado = suma;
            suma = 0;
        }
        return montoPasado;
    }

    /**
     *Calcula la fecha pasada donde se ven elementos como el numero de dias del mes entre otras
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


