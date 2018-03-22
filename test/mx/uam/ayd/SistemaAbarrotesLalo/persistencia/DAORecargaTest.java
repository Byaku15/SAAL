/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel AnG
 */
public class DAORecargaTest {
    int mes=0;
        int dia=0;
        int año=0;
    
    
    /**
     * Calcula fechas pasadas tomando en cuenta aspectos como el numero de dias
     * de un mes, cuando hay que cambiar el año o el mes etc.
     * @param periodo
     * @return
     */
    public int calculafecha(String periodo) {
        int nuevaFecha=0;
      if(periodo.equals("Dia")){
          switch(mes){
               case 1:
                  //regreso los dias de diciembre
                   nuevaFecha=31;
                     break;
            case 2:
                //regreso los dias de enero
                 nuevaFecha=31;
                     break;
            case 3:
                //regreso los dias de febrero
                 nuevaFecha=28;
                     break;
            case 4:
                //regreso los dias de marzo
                 nuevaFecha=31;
                     break;
            case 5: 
                //regreso los dias de abril
                 nuevaFecha=30;
                     break;
            case 6:  
                //regreso los dias de mayo
                 nuevaFecha=31;
                     break;
            case 7:
                //regreso los dias de junio
                 nuevaFecha=30;
                     break;
            case 8: 
                //regreso los dias de julio
                 nuevaFecha=31;
                     break;
            case 9: 
                //regreso los dias de agosto
                 nuevaFecha=31;
                     break;
            case 10:
                //regreso los dias de septiembre
                 nuevaFecha=30;
                     break;
            case 11: 
                //regreso los dias de octubre
                 nuevaFecha=31;
                     break;
            case 12: 
              //regreso los dias de noviembre
                 nuevaFecha=30;
                    break;
            }

        }
        if (periodo.equals("Mes")) {
            if (mes == 1) {
                nuevaFecha = 12;
            } else {
                nuevaFecha = mes - 1;
            }

        }
        if (periodo.equals("Año")) {
            if (mes == 1&&dia==1) {
                nuevaFecha = año-1;
            } else {
                nuevaFecha = año;
            }

        }
      return nuevaFecha; 
    }

    /**
     * Metodo con los diversos casos de prueba para el metodo calculafecha
     */
    @Test
     public void fechas(){
         int esperado,esperado2, resultado;
        //caso 1 mes febrero
        dia=1;
        mes=3;
        resultado= calculafecha("Dia");
        esperado=28;
        assertEquals(esperado,resultado);
        
        //caso 2 dia inicial mes 31 dias 
        dia=1;
        mes=8;
        resultado= calculafecha("Dia");
        esperado=31;
        esperado2=7;
        assertEquals(esperado,resultado);
        resultado= calculafecha("Mes");
        assertEquals(esperado2,resultado);
        
        //caso 3 primer mes del año
        mes=1;
        resultado= calculafecha("Mes");
        esperado2=12;
         assertEquals(esperado2,resultado);
         
        //caso 4 cambio de año
        mes=1;
        dia=1;
        año=2018;
        resultado= calculafecha("Año");
        esperado2=2017;
         assertEquals(esperado2,resultado);
        //caso 5 sin cambio de año
        mes=2;
        dia=1;
        año=2018;
        resultado= calculafecha("Año");
        esperado2=2018;
         assertEquals(esperado2,resultado);
        
     }
}
