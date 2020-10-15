/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Danilo
 */
public class Usuario {
    
    private int id_us;
    private String nome_log;
    private String Usuario_log;
    private String senha_log;
    private String permica_log;

    public Usuario() {
    }

    public Usuario(String nome_log, String Usuario_log, String senha_log, String permica_log) {
        this.nome_log = nome_log;
        this.Usuario_log = Usuario_log;
        this.senha_log = senha_log;
        this.permica_log = permica_log;
    }

 
         
    
    public int getId_us() {
        return id_us;
    }

    public void setId_us(int id_us) {
        this.id_us = id_us;
    }

    public String getNome_log() {
        return nome_log;
    }

    public void setNome_log(String nome_log) {
        this.nome_log = nome_log;
    }

    public String getUsuario_log() {
        return Usuario_log;
    }

    public void setUsuario_log(String Usuario_log) {
        this.Usuario_log = Usuario_log;
    }

    public String getSenha_log() {
        return senha_log;
    }

    public void setSenha_log(String senha_log) {
        this.senha_log = senha_log;
    }

    public String getPermica_log() {
        return permica_log;
    }

    public void setPermica_log(String permica_log) {
        this.permica_log = permica_log;
    }

    @Override
    public String toString() {
        return getNome_log(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   

    
    
}
