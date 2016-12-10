/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jm.Dominio.Jm11;

/**
 *
 * @author PC1
 */
class jmRepositorio {
    public void Consulta(Jm11 jm11){
        //validacion
        
		Connection conn;
		String url="jdbc:postgresql://localhost:5432/JM"; 
		String usuario="postgres";
		String clave="1234";	
		try {
  	conn=DriverManager.getConnection(url, usuario, clave);
			PreparedStatement stm=conn.prepareStatement("Select usuario(login,contraseña )VALUES (?,?)");
                        stm.setString(2, jm11.getLogin());
                        stm.setInt(3,jm11.getContraseña());
                   
                       
               
			stm.execute();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
