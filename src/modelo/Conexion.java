package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    public static Connection getconexion(){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=ProyectoAlgo;" 
                + "user=sa;"
                + "password=Contrasena1;"
                + "loginTimeout=30;";
        
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
            
        } catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }

}