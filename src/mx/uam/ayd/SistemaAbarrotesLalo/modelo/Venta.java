/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author alumnos
 */
public class Venta {
    private double monto;
    private LocalDate fecha;

    public Venta(double monto, LocalDate fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }    
    
    
}