/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import model.bean.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @Test
    public void inserir() {
        
        Usuario use = new Usuario("Pedro", "pedro", "567", "user");
        UsuarioDAO dao = new UsuarioDAO();
        
        if(dao.save(use)){
            System.out.println("Salvo com sucesso!");
        }else{
          fail("Erro ao salvar");
    }
        
    }
    
    @Test
    public void listar(){
        
        UsuarioDAO dao = new UsuarioDAO();
        
        for(Usuario u: dao.findAll()){
            
            System.out.println("Nome: "+u.getNome_log());
            System.out.println("Login: "+u.getUsuario_log());
            System.out.println("Permição: "+u.getPermica_log());
            
        }
        
    }
    
}
