/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Compañia;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOCompañia;

/**
 *
 * @author Nallely
 */
public class ServicioCompañia {
   DAOCompañia DAOCompañia1= new DAOCompañia();
   Compañia modificarCompañia, eliminarCompañia;
    
    /**
     * Envia al DAO la información necesaria para crear una compañia, devuelve
     * booleano que muestra si el proceso se realizo correctamente o no.
     * @param nombre
     * @return estado
     * @throws SQLException
     */
    public boolean AgregarCompañia(String nombre) throws SQLException {
        boolean estado= DAOCompañia1.AgregarCompañia(nombre);
        return estado;       
    }
    /**
     * Devulve un arreglo con los nombres de todas las compañias dentro de la 
     * base de datos
     * @return listaCompañias
     * @throws SQLException
     */
    public ArrayList<String> recuperarCompañias() throws SQLException {
        ArrayList<String> listaCompañias=new ArrayList<String>();
        listaCompañias= DAOCompañia1.recuperarCompañias();
        return listaCompañias;
    }

    /**
     *Metodo para modificar una compañia registrada
     * @param id
     * @param nombre
     * @return
     */
    public Compañia modificarCompañia(String id, String nombre) {
       modificarCompañia=DAOCompañia1.modificarCompañia(id,nombre);
       return modificarCompañia;
    }

    /**
     *Recupera Compañias dentro de la base de datos
     * @return
     */
    public ArrayList<String> recuperarCompañia() {
        ArrayList<String> listarecargas1=new ArrayList<String>();
        listarecargas1= DAOCompañia1.recuperarCompañia();
        return listarecargas1;
    }
    
    /*********************************************************************************************SPRINT 3**************************/
    public Compañia eliminarCompañia(String nombre){
        eliminarCompañia = DAOCompañia1.eliminarCompañia(nombre);
        return eliminarCompañia;
    }
}
