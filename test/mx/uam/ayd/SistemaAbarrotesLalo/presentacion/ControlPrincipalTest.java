package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;


import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOProducto;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Edoardo
 */
public class ControlPrincipalTest {
    
    public ControlPrincipalTest() {
    }
    
   
    @Test
    public void recuperaProductosYCaducidadTest() throws SQLException {
        System.out.println("Recupera Productos y Caducidad");
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        DAOProducto daoProducto1 = new DAOProducto();
        
        String esperado = "";
        for(int i = 0; i < daoProducto1.recuperaProductosYCaducidad().size(); i++){
            String cadena = daoProducto1.recuperaProductosYCaducidad().get(i).toString();
            esperado += cadena+"\n";
        }

        Assert.assertNotNull(esperado);
        
    }


}
