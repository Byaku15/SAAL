/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

/**
 *
 * @author nallely
 */
public class Compañia {
 private String nombre;
 
 Compañia(String nombre){
    this.nombre=nombre; 
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
