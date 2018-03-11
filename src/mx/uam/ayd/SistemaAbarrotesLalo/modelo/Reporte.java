/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

/**
 *
 * @author alumnos
 */
public class Reporte {
    private double gananciaProductos;
    private int numProductosVendidos, numRecargas, gananciaRecargas;

    public Reporte(double gananciaProductos, int numProductosVendidos, int gananciaRecargas, int numRecargas) {
        this.gananciaProductos = gananciaProductos;
        this.gananciaRecargas=gananciaRecargas;
        this.numProductosVendidos = numProductosVendidos;
        this.numRecargas = numRecargas;
    }

    public double getGananciaProductos() {
        return gananciaProductos;
    }

    public void setGananciaProductos(double gananciaProductos) {
        this.gananciaProductos = gananciaProductos;
    }

    public int getNumProductosVendidos() {
        return numProductosVendidos;
    }

    public void setNumProductosVendidos(int numProductosVendidos) {
        this.numProductosVendidos = numProductosVendidos;
    }

    public int getNumRecargas() {
        return numRecargas;
    }

    public void setNumRecargas(int numRecargas) {
        this.numRecargas = numRecargas;
    }

    public int getGananciaRecargas() {
        return gananciaRecargas;
    }

    public void setGananciaRecargas(int gananciaRecargas) {
        this.gananciaRecargas = gananciaRecargas;
    }

    
    
    
}