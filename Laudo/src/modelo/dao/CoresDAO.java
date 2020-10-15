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
import model.bean.Cores;

/**
 *
 * @author Danilo
 */
public class CoresDAO {

    private Connection con = null;

    public CoresDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Cores cores) {

        String sql = "INSERT INTO cores (cod_cor, des_cor, us_cor) VALUES (?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cores.getCod_cor());
            stmt.setString(2, cores.getDes_cor());
            stmt.setString(3, cores.getUs_cor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public boolean updata(Cores cores) {

        String sql = "UPDATE cores SET cod_cor=?, des_cor=?, us_cor=? WHERE id_cores=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cores.getCod_cor());
            stmt.setString(2, cores.getDes_cor());
            stmt.setString(3, cores.getUs_cor());
            stmt.setInt(4, cores.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Cores> findAll() {

        String sql = "SELECT * FROM cores";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cores> cores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cores cor = new Cores();

                cor.setId(rs.getInt("id_cores"));
                cor.setCod_cor(rs.getString("cod_cor"));
                cor.setDes_cor(rs.getString("des_cor"));
                cor.setUs_cor(rs.getString("us_cor"));
                cores.add(cor);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cores;
    }

    public void delete(Cores cor) {

        String sql = "DELETE FROM cores WHERE id_cores=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cor.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

     public List<Cores> readcod(String cod) {

        

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cores> cores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cores WHERE cod_cor LIKE ?");
            stmt.setString(1, "%"+cod+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cores cor = new Cores();

                cor.setId(rs.getInt("id_cores"));
                cor.setCod_cor(rs.getString("cod_cor"));
                cor.setDes_cor(rs.getString("des_cor"));
                cor.setUs_cor(rs.getString("us_cor"));
                cores.add(cor);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cores;
    }
     
     
     public List<Cores> readdes(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cores> cores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cores WHERE des_cor LIKE ?");
            stmt.setString(1, "%"+des+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cores cor = new Cores();

                cor.setId(rs.getInt("id_cores"));
                cor.setCod_cor(rs.getString("cod_cor"));
                cor.setDes_cor(rs.getString("des_cor"));
                cor.setUs_cor(rs.getString("us_cor"));
                cores.add(cor);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cores;
    }
}
