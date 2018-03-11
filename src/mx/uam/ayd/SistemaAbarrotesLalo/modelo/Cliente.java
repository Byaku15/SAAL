/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

import java.util.Date;

/**
 *
 * @author lalo
 */
public class Cliente {
    String nombre;
    Double cantidad;
    String fecha;

    public void setNombre(String nombre){
     this.nombre=nombre; 
    }
    public void setCantidad(double cantidad){
         this.cantidad=cantidad;
    }
    public void setFecha(String fecha){
     this.fecha=fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCantidad(){
        return cantidad;
    }
    public String getFecha(){
        return fecha;
    }
}