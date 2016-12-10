
package jmRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jm.Dominio.Jm11;
import jm.Dominio.Puntajes;
public class Jm1repository1 {

    public void ingresar(Jm11 jm11){
        //validacion
        
		Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM"; 
		String usuario="postgres";
		String clave="1234";	
		try {
  	conn=DriverManager.getConnection(url, usuario, clave);
			PreparedStatement stm=conn.prepareStatement("INSERT INTO usuario(nombre,login,contraseña,recontraseña )VALUES (?,?,?,?)");
		
                        stm.setString(1,jm11.getNombre());
                        stm.setString(2, jm11.getLogin());
                        stm.setInt(3,jm11.getContraseña());
                        stm.setInt(4,jm11.getRecontraseña());
                       
               
			stm.execute();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//select id_usuario from public.usuario where upper(login)=upper('jm') and contraseña=5678;

//select id_usuario from public.usuario where upper(login)=upper(jm1.getLogin()) and contraseña=jm1.getContraseña();

	}
     
		
//select id_usuario from public.usuario where upper(login)=upper('jm') and contraseña=5678;

//select id_usuario from public.usuario where upper(login)=upper(jm1.getLogin()) and contraseña=jm1.getContraseña();

    // uardag primer nivel
    public void gpuntajes(Puntajes puntaje){
        String sql="insert into puntaje (primer_nivel, segundo_nivel, tercer_nivel) values (?,?,?)";
        
    Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM"; 
		String usuario="postgres";
		String clave="1234";	
		try {
  	conn=DriverManager.getConnection(url, usuario, clave);
			PreparedStatement stm=conn.prepareStatement(sql);
		
                        stm.setInt(1,puntaje.getPrimer_nivel());
                        stm.setInt(2,puntaje.getSegundo_nivel());
                        stm.setInt(3,puntaje.getTercer_nivel());
                        
                                       
			stm.execute();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                }
                
                                         
}
    
    
public List<Puntajes>MostrarPuntajes(){
           List<Puntajes>punt= new ArrayList<>();
                 
    String sql=" select primer_nivel, segundo_nivel, tercer_nivel from puntaje";
    Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM"; 
		String usuario="postgres";
		String clave="1234";	
		try {
            conn=DriverManager.getConnection(url, usuario, clave);
		
                    Statement stm= conn.createStatement();
                    ResultSet rs = stm.executeQuery(sql);
                    
                    while(rs.next()){
                        Puntajes pj= new Puntajes(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                        punt.add(pj);
                    }
                      
                    
                        
                        stm.close();
                        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                }
                    return punt;
                }
    
    
    
    
    
    
	}
     
         

    

   
           
            
        

