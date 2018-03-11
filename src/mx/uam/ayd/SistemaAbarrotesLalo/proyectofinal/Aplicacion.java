
package mx.uam.ayd.SistemaAbarrotesLalo.proyectofinal;

import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.ControlLogin;
import mx.uam.ayd.SistemaAbarrotesLalo.presentacion.ControlPrincipal;

public class Aplicacion {

    /**
     *Aqui comienza el sistema SAAL 
     * @param args
     */
    public static void main(String[] args) {
 /*     ControlPrincipal controlPrincipal1= new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }*/
    
    ControlLogin controlLogin1 = new ControlLogin();
        controlLogin1.iniciaControlLogin();
    }
}
