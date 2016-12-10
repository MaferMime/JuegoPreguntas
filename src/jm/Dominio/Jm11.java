/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm.Dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jmRepositorio.Postgress;

/**
 *
 * @author a
 */
public class Jm11 {
        private int id_usuario;
        private String nombre;
        private String login;
        private int contraseña;
        private int recontraseña;
    public Jm11(){
        
    }
    public Jm11(int id_usuario, String nombre, String login, int contraseña, int recontraseña) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.login = login;
        this.contraseña = contraseña;
        this.recontraseña = recontraseña;
    }

    public Jm11(int i, String login, int contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jm11(String login, int contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getRecontraseña() {
        return recontraseña;
    }

    public void setRecontraseña(int recontraseña) {
        this.recontraseña = recontraseña;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    

