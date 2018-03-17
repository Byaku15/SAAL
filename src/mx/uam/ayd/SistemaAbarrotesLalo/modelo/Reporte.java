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
    private double gananciaProductos, ganaciaPasada;
    private int numProductosVendidos, numRecargas, gananciaRecargas, gananciaPasadaR;
    private String compañiaMax, compañiaMin;

    //constructor para los reportes las finanzas totales
    public Reporte(int numRecargas,String compañiaMax,String compañiaMin, int gananciaPasadaR,
            int numProductosVendidos, double ganaciaPasada, 
            double gananciaProductos, int gananciaRecargas) {
        this.gananciaProductos = gananciaProductos;
        this.gananciaRecargas=gananciaRecargas;
        this.numProductosVendidos = numProductosVendidos;
        this.numRecargas = numRecargas;
        this.compañiaMax=compañiaMax;
        this.compañiaMin=compañiaMin;
        this.ganaciaPasada=ganaciaPasada;
        this.gananciaPasadaR=gananciaPasadaR;
        
    }
    //contructor para los reportes de productos
    public Reporte(double gananciaProductos, int numProductosVendidos,
            double gananciaPasada) {
        this.gananciaProductos = gananciaProductos;       
        this.numProductosVendidos = numProductosVendidos;   
        this.ganaciaPasada=gananciaPasada;
    }
    
    //constructor para los reportes de recargas
    public Reporte(int gananciaRecargas, int numRecargas, String compañiaMax,
            String compañiaMin, int gananciaPasadaR) {
        this.gananciaRecargas=gananciaRecargas;
        this.numRecargas = numRecargas;
        this.compañiaMax=compañiaMax;
        this.compañiaMin=compañiaMin;
        this.gananciaPasadaR=gananciaPasadaR;
    }

   
    
    //////////////////////////////////////////////////////////////////////////
    //metodos get y set
    
    
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
 public String getCompañiaMax() {
        return compañiaMax;
    }

    public void setCompañiaMax(String compañiaMax) {
        this.compañiaMax = compañiaMax;
    }

    public String getCompañiaMin() {
        return compañiaMin;
    }

    public void setCompañiaMin(String compañiaMin) {
        this.compañiaMin = compañiaMin;
    }

    public double getGanaciaPasada() {
        return ganaciaPasada;
    }

    public void setGanaciaPasada(double ganaciaPasada) {
        this.ganaciaPasada = ganaciaPasada;
    }

    public int getGananciaPasadaR() {
        return gananciaPasadaR;
    }

    public void setGananciaPasadaR(int gananciaPasadaR) {
        this.gananciaPasadaR = gananciaPasadaR;
    }
    

    
    
    
}