/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author Danilo
 */
public class UsuarioDAO {

    private Connection con = null;

    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Usuario usuario) {

        String sql = "INSERT INTO usuario (nome_log, usuario_log, senha_log, permicao_log) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome_log());
            stmt.setString(2, usuario.getUsuario_log());
            stmt.setString(3, usuario.getSenha_log());
            stmt.setString(4, usuario.getPermica_log());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public boolean updata(Usuario usuario) {

        String sql = "UPDATE usuario SET nome_log = ?, usuario_log = ?, senha_log = ?, permicao_log = ? WHERE id_us = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome_log());
            stmt.setString(2, usuario.getUsuario_log());
            stmt.setString(3, usuario.getSenha_log());
            stmt.setString(4, usuario.getPermica_log());
            stmt.setInt(5, usuario.getId_us());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Usuario> findAll() {

        String sql = "SELECT * FROM usuario";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId_us(rs.getInt("id_us"));
                usuario.setNome_log(rs.getString("nome_log"));
                usuario.setUsuario_log(rs.getString("Usuario_log"));
                usuario.setSenha_log(rs.getString("senha_log"));
                usuario.setPermica_log(rs.getString("permicao_log"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public void delete(Usuario usuario) {

        String sql = "DELETE FROM usuario WHERE id_us = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getId_us());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        } catch (SQLException ex) {
            System.err.println("Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
     
}
