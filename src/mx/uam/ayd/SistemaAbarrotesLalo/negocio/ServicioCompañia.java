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
    
}
