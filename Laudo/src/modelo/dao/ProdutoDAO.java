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
import model.bean.Produto;

/**
 *
 * @author Danilo
 */
public class ProdutoDAO {

    private Connection con = null;

    public ProdutoDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Produto produto) {

        String sql = "INSERT INTO produto (codint_prod, codext_prod, des_prod, mp1_prod, mp2_prod, cor_prod, apli_prod, mol_prod, avi_prod, fab_prod, val_prod, obs_prod, us_prod) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getCodint_prod());
            stmt.setString(2, produto.getCodext_prod());
            stmt.setString(3, produto.getDes_prod());
            stmt.setString(4, produto.getMp1_prod());
            stmt.setString(5, produto.getMp2_prod());
            stmt.setString(6, produto.getCor_prod());
            stmt.setString(7, produto.getApli_prod());
            stmt.setString(8, produto.getMol_prod());
            stmt.setString(9, produto.getAvi_prod());
            stmt.setString(10, produto.getFab_prod());
            stmt.setString(11, produto.getVal_prod());
            stmt.setString(12, produto.getObs_prod());
            stmt.setString(13, produto.getUs_prod());
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public boolean updata(Produto produto) {

        String sql = "UPDATE produto SET codint_prod = ?, codext_prod = ?, des_prod = ?, mp1_prod = ?, mp2_prod = ?, cor_prod = ?, apli_prod = ?, mol_prod = ?, avi_prod = ?, fab_prod = ?, val_prod = ?, obs_prod = ?, us_prod = ? WHERE id_prod = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getCodint_prod());
            stmt.setString(2, produto.getCodext_prod());
            stmt.setString(3, produto.getDes_prod());
            stmt.setString(4, produto.getMp1_prod());
            stmt.setString(5, produto.getMp2_prod());
            stmt.setString(6, produto.getCor_prod());
            stmt.setString(7, produto.getApli_prod());
            stmt.setString(8, produto.getMol_prod());
            stmt.setString(9, produto.getAvi_prod());
            stmt.setString(10, produto.getFab_prod());
            stmt.setString(11, produto.getVal_prod());
            stmt.setString(12, produto.getObs_prod());
            stmt.setString(13, produto.getUs_prod());
            stmt.setInt(14, produto.getId_prod());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
     public List<Produto> findAll() {

        String sql = "SELECT * FROM produto";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto pro = new Produto();
                
                pro.setId_prod(rs.getInt("id_prod"));
                pro.setCodint_prod(rs.getString("codint_prod"));
                pro.setCodext_prod(rs.getString("codext_prod"));
                pro.setDes_prod(rs.getString("des_prod"));
                pro.setMp1_prod(rs.getString("mp1_prod"));
                pro.setMp2_prod(rs.getString("mp2_prod"));
                pro.setCor_prod(rs.getString("cor_prod"));
                pro.setApli_prod(rs.getString("apli_prod"));
                pro.setMol_prod(rs.getString("mol_prod"));
                pro.setAvi_prod(rs.getString("avi_prod"));
                pro.setFab_prod(rs.getString("fab_prod"));
                pro.setVal_prod(rs.getString("val_prod"));
                pro.setObs_prod(rs.getString("obs_prod"));
                pro.setUs_prod(rs.getString("us_prod"));
                produtos.add(pro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
     
     public List<Produto> readId(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produto = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id_prod LIKE ?");
            stmt.setString(1, des);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto pro = new Produto();

                pro.setId_prod(rs.getInt("id_prod"));
                pro.setCodint_prod(rs.getString("codint_prod"));
                pro.setCodext_prod(rs.getString("codext_prod"));
                pro.setDes_prod(rs.getString("des_prod"));
                pro.setMp1_prod(rs.getString("mp1_prod"));
                pro.setMp2_prod(rs.getString("mp2_prod"));
                pro.setCor_prod(rs.getString("cor_prod"));
                pro.setApli_prod(rs.getString("apli_prod"));
                pro.setMol_prod(rs.getString("mol_prod"));
                pro.setAvi_prod(rs.getString("avi_prod"));
                pro.setFab_prod(rs.getString("fab_prod"));
                pro.setVal_prod(rs.getString("val_prod"));
                pro.setObs_prod(rs.getString("obs_prod"));
                pro.setUs_prod(rs.getString("us_prod"));;
                produto.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produto;
    }
     
     public List<Produto> readDes(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produto = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE des_prod LIKE ?");
            stmt.setString(1, des);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto pro = new Produto();

                pro.setId_prod(rs.getInt("id_prod"));
                pro.setCodint_prod(rs.getString("codint_prod"));
                pro.setCodext_prod(rs.getString("codext_prod"));
                pro.setDes_prod(rs.getString("des_prod"));
                pro.setMp1_prod(rs.getString("mp1_prod"));
                pro.setMp2_prod(rs.getString("mp2_prod"));
                pro.setCor_prod(rs.getString("cor_prod"));
                pro.setApli_prod(rs.getString("apli_prod"));
                pro.setMol_prod(rs.getString("mol_prod"));
                pro.setAvi_prod(rs.getString("avi_prod"));
                pro.setFab_prod(rs.getString("fab_prod"));
                pro.setVal_prod(rs.getString("val_prod"));
                pro.setObs_prod(rs.getString("obs_prod"));
                pro.setUs_prod(rs.getString("us_prod"));;
                produto.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produto;
    }
     
     
     public List<Produto> readCod(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produto = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE codint_prod LIKE ?");
            stmt.setString(1, des);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto pro = new Produto();

                pro.setId_prod(rs.getInt("id_prod"));
                pro.setCodint_prod(rs.getString("codint_prod"));
                pro.setCodext_prod(rs.getString("codext_prod"));
                pro.setDes_prod(rs.getString("des_prod"));
                pro.setMp1_prod(rs.getString("mp1_prod"));
                pro.setMp2_prod(rs.getString("mp2_prod"));
                pro.setCor_prod(rs.getString("cor_prod"));
                pro.setApli_prod(rs.getString("apli_prod"));
                pro.setMol_prod(rs.getString("mol_prod"));
                pro.setAvi_prod(rs.getString("avi_prod"));
                pro.setFab_prod(rs.getString("fab_prod"));
                pro.setVal_prod(rs.getString("val_prod"));
                pro.setObs_prod(rs.getString("obs_prod"));
                pro.setUs_prod(rs.getString("us_prod"));;
                produto.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produto;
    }
     
     public void delete(Produto mol) {

        String sql = "DELETE FROM produto WHERE id_prod=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, mol.getId_prod());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
