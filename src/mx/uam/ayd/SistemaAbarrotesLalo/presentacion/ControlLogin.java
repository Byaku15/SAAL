/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

/**
 *
 * @author edoarr
 */
public class ControlLogin {
    
    ControlContraseña controlContraseña1;
    

    
    
     public void iniciaControlLogin() {
                     
       VentanaLogin ventanaLogin1 = new VentanaLogin(this);
       ventanaLogin1.setVisible(true);

    }
    
    /**
     *Este metodo inicializa la versión del sistema para Invitado
     */
    public void seleccionInvitado() {

        ControlPrincipalInvitado controlPrincipalInvitado1 = new ControlPrincipalInvitado();
        controlPrincipalInvitado1.iniciaControl();
               /************************************************Sprint 2*****************************************************/
        controlPrincipalInvitado1.recuperaProductosYCaducidad();
    }
    
    /**
    *Este metodo inicializa la versión del sistema para Administrador
    */
    public void seleccionAdministrador() {
        
         controlContraseña1 = new ControlContraseña();
         controlContraseña1.iniciaControlContraseña();
    }
    
}
