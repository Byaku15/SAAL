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
public class ControlContraseña {
    
    
        //ControlLogin controlLogin1; 
        
    public void iniciaControlContraseña() {
        
        VentanaContraseña ventanaContraseña = new VentanaContraseña(this);
        ventanaContraseña.setVisible(true);
            
    }
    
    
    public void iniciaSesionAdministrador(){
        
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
        /************************************************Sprint 2*****************************************************/
        controlPrincipal1.recuperaProductosYCaducidad();
        
        
    }
    
    public void finalizaControl() {
        ControlLogin controlLogin1 = new ControlLogin();
        controlLogin1.iniciaControlLogin();
    }   
    
    
        
    
    
}
