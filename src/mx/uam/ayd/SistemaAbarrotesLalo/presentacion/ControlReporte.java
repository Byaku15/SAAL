/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioReporte;

/**
 *
 * @author 
 */
public class ControlReporte {
   ServicioReporte servicioReporte1 = new ServicioReporte();   
   Reporte reporte1;  

    /**
     * Parte del flujo alternativo del caso de uso consultar ventas
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte consultarRecargas(String periodo) throws SQLException {
         reporte1=servicioReporte1.generarReporteRecargas(periodo);
         return reporte1;
    }
    
    /**
     *Parte del flujo alternativo del caso de uso consultar ventas
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte consultarProductos(String periodo) throws SQLException {
         reporte1=servicioReporte1.generarReporteProductos(periodo);
         return reporte1;
    }

    /**
     *Parte del flujo principal del caso de uso consultar ventas
     * @param periodo
     * @return
     * @throws SQLException
     */
    public Reporte consultarTodo(String periodo) throws SQLException {
         reporte1=servicioReporte1.generarReporteTodo(periodo);
         return reporte1;
    }
    
}
