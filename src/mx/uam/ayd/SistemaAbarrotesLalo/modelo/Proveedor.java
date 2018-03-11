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
public class Proveedor {
    private String nombre, marca, tipo;
    private int telefono;
    
Proveedor(String nombre,String marca,String tipo, int telefono){
   this.marca=marca;
   this.nombre=nombre;
   this.tipo=tipo;
   this.telefono=telefono;   
}    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
