/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import jm.Dominio.Puntajes;

/**
 *
 * @author DANIEL-PC
 */
public class PuntajesRepository {
    
    public void ingresar(int primer_nivel, int segundo_nivel, int tercer_nivel){
        //validacion
        Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM"; 
		String usuario="postgres";
		String clave="1234";
			
		try {
                   conn=DriverManager.getConnection(url, usuario, clave);
  	
			PreparedStatement stm=conn.prepareStatement("insert into puntaje(primer_nivel,segundo_nivel,tercer_nivel )VALUES (?,?,?)");
		
                        stm.setInt(1,primer_nivel);
                        stm.setInt(2, segundo_nivel);
                        stm.setInt(3,tercer_nivel);
                   
                       
               
			stm.execute();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
}
    
      public ArrayList<Puntajes> getPuntajes(){
		ArrayList<Puntajes> puntajes =new  ArrayList<Puntajes>();
		Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM";
		String usuario="postgres";
		String clave="1234";
		
		try {
			
			conn=DriverManager.getConnection(url, usuario, clave);
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from puntaje");
			
			while(rs.next()){
				Puntajes pu = new Puntajes(rs.getInt(2),rs.getInt(3),rs.getInt(4));
				puntajes.add(pu);
				
			}
			rs.close();
			stm.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return puntajes;
	}
    
}