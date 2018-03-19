package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Miguel AnG
 */
public class Recarga {
    private LocalDate fechaActual;
    private int monto;
    private String compañia;

    /**
     * Contructor de la clase
     * @param fechaActual
     * @param monto
     * @param compañia
     */
    public Recarga(LocalDate fechaActual, int monto, String compañia) {
      this.fechaActual=fechaActual;
      this.monto=monto;
      this.compañia=compañia;
    }
    
    
    ////////////////////////metodos get y set////////////////////////////////

     public String getCompañia() {
        return compañia;
    }

    
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    } 

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    }

