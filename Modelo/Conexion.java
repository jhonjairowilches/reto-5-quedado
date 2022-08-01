
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection connection;
    //Atributos variable para llamar la clase de la base de datos 
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g55_db";
    //Usuario "ROOT" que se crea por defecto en XAMMP y la contraseña
    String usuario = "root"; // es la ejecucion de los QUERY
    String password = ""; //el que nos va a traer el resultado de la conexion
    
    //Crear el constructor vacio 
    public Conexion() {
        try {
            Class.forName(driver);
            //Llamar el paquete de "Connection" y los 3 parametros para entablar conexion
            connection = DriverManager.getConnection(cadenaConexion, usuario, password);
            // si la conexion es exitosa con la ruta y la bsse no me arroje nulo y en cambio un mensaje
            if(connection != null){
                System.out.println("conexion exitosa con la base de datos");
            }
        //Validar que si no me encontro el nombre de mi clase
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("No se pudo establecer conexion");
        }
        
    }
    
    //Crear una funcion de tipo conexion 
    public Connection getConnection(){
        //Retornar si la conexion fue exitosa o no
        return connection;
    }
}
