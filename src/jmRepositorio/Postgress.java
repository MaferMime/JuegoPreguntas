package jmRepositorio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgress {
private static Connection cnn;
    public static String url = "jdbc:postgresql://localhost:5432/JM";
    public static String usuario = "postgres";
    public static String clave = "1234";

  
    
    public Connection Open() throws SQLException{
    	cnn=DriverManager.getConnection(url, usuario, clave);
    	return cnn;
    }
    public static void close() throws SQLException{
    	cnn.close();
}    
  /* public Connection conn(){
        Connection conn=null;
       try{
        String url = "jdbc:postgresql://localhost:5432/Jm";
        String user="postgres";
        String pass="1234";
        conn=DriverManager.getConnection(url,user,pass);
       }catch(Exception es){
           System.out.println("Error al obtener la conexion aquiiiiii+ "+es);
       }
        return conn;
    }
    public boolean ComprobarConexionBD(){
        Connection conn=null;
       try{
        String url = "jdbc:postgresql://localhost:5432/Jm";
        String user="postgres"; //CAMBIE EL USUARIO PARA VALIDAR QUE ESTA MAL
        String pass="1234";
        conn=DriverManager.getConnection(url,user,pass);
        return false;
       }catch(Exception es){
           return true;
       }
    }*/
}
