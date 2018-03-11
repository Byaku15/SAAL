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
