
package reto2;
import Vistas.*;
import Modelo.*;

public class RETO2 {

    
    public static void main(String[] args) {
        //1.Crear una instancia de la clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        // 2. Crear instancia del Jframe Login
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
