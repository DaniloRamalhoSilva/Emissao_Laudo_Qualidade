/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import Connection.ConnectionFactory;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.Molde;

/**
 *
 * @author Danilo
 */
public class MoldeDAO {

    private Connection con = null;

    public MoldeDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Molde mol) {

        String sql = "INSERT INTO moldes (cod_mol, des_mol, pes_mol, tol_mol, adim, atol, bdim, btol, cdim, ctol, ddim, dtol, edim, etol, fdim, ftol, gdim, gtol, hdim, htol, idim, itol, jdim, jtol, kdim, ktol, capacidade_mol, tolcapl_mol, cami_mol, ima_mol, obs_mol, us_mol) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, mol.getCod_mol());
            stmt.setString(2, mol.getDes_mol());
            stmt.setDouble(3, mol.getPes_mol());
            stmt.setString(4, mol.getTol_mol());
            stmt.setString(5, mol.getAdim());
            stmt.setString(6, mol.getAtol());
            stmt.setString(7, mol.getBdim());
            stmt.setString(8, mol.getBtol());
            stmt.setString(9, mol.getCdim());
            stmt.setString(10, mol.getCtol());
            stmt.setString(11, mol.getDdim());
            stmt.setString(12, mol.getDtol());
            stmt.setString(13, mol.getEdim());
            stmt.setString(14, mol.getEtol());
            stmt.setString(15, mol.getFdim());
            stmt.setString(16, mol.getFtol());
            stmt.setString(17, mol.getGdim());
            stmt.setString(18, mol.getGtol());
            stmt.setString(19, mol.getHdim());
            stmt.setString(20, mol.getHtol());
            stmt.setString(21, mol.getIdim());
            stmt.setString(22, mol.getItol());
            stmt.setString(23, mol.getJdim());
            stmt.setString(24, mol.getJtol());
            stmt.setString(25, mol.getKdim());
            stmt.setString(26, mol.getKtol());
            stmt.setString(27, mol.getCapacidade_mol());
            stmt.setString(28, mol.getTolcapl_mol());
            stmt.setString(29, mol.getCami_mol());
            try {
                File file = new File(mol.getCami_mol());
                FileInputStream arq;
                arq = new FileInputStream(file);
                stmt.setBinaryStream(30, arq);
            } catch (FileNotFoundException ex) {
                stmt.setString(30, "");
            }
            stmt.setString(31, mol.getObs_mol());
            stmt.setString(32, mol.getUs_mol());
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

    public List<Molde> findAll() {

        String sql = "SELECT * FROM moldes";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Molde> molde = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Molde mol = new Molde();

                mol.setId_mol(rs.getInt("id_mol"));
                mol.setCod_mol(rs.getString("cod_mol"));
                mol.setDes_mol(rs.getString("des_mol"));
                mol.setPes_mol(rs.getDouble("pes_mol"));
                mol.setTol_mol(rs.getString("tol_mol"));
                mol.setAdim(rs.getString("adim"));
                mol.setAtol(rs.getString("atol"));
                mol.setBdim(rs.getString("bdim"));
                mol.setBtol(rs.getString("btol"));
                mol.setCdim(rs.getString("cdim"));
                mol.setCtol(rs.getString("ctol"));
                mol.setDdim(rs.getString("ddim"));
                mol.setDtol(rs.getString("dtol"));
                mol.setEdim(rs.getString("edim"));
                mol.setEtol(rs.getString("etol"));
                mol.setFdim(rs.getString("fdim"));
                mol.setFtol(rs.getString("ftol"));
                mol.setGdim(rs.getString("gdim"));
                mol.setGtol(rs.getString("gtol"));
                mol.setHdim(rs.getString("hdim"));
                mol.setHtol(rs.getString("htol"));
                mol.setIdim(rs.getString("idim"));
                mol.setItol(rs.getString("itol"));
                mol.setJdim(rs.getString("jdim"));
                mol.setJtol(rs.getString("jtol"));
                mol.setKdim(rs.getString("kdim"));
                mol.setKtol(rs.getString("ktol"));
                mol.setCapacidade_mol(rs.getString("capacidade_mol"));
                mol.setTolcapl_mol(rs.getString("tolcapl_mol"));
                mol.setCami_mol(rs.getString("cami_mol"));
                mol.setIma_mol(rs.getBytes("ima_mol"));
                mol.setObs_mol(rs.getString("obs_mol"));
                mol.setUs_mol(rs.getString("us_mol"));
                molde.add(mol);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: read" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return molde;
    }

    public List<Molde> readRef(String ref) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Molde> molde = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM moldes WHERE cod_mol LIKE ?");
            stmt.setString(1, "%" + ref + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Molde mol = new Molde();

                mol.setId_mol(rs.getInt("id_mol"));
                mol.setCod_mol(rs.getString("cod_mol"));
                mol.setDes_mol(rs.getString("des_mol"));
                mol.setPes_mol(rs.getDouble("pes_mol"));
                mol.setTol_mol(rs.getString("tol_mol"));
                mol.setAdim(rs.getString("adim"));
                mol.setAtol(rs.getString("atol"));
                mol.setBdim(rs.getString("bdim"));
                mol.setBtol(rs.getString("btol"));
                mol.setCdim(rs.getString("cdim"));
                mol.setCtol(rs.getString("ctol"));
                mol.setDdim(rs.getString("ddim"));
                mol.setDtol(rs.getString("dtol"));
                mol.setEdim(rs.getString("edim"));
                mol.setEtol(rs.getString("etol"));
                mol.setFdim(rs.getString("fdim"));
                mol.setFtol(rs.getString("ftol"));
                mol.setGdim(rs.getString("gdim"));
                mol.setGtol(rs.getString("gtol"));
                mol.setHdim(rs.getString("hdim"));
                mol.setHtol(rs.getString("htol"));
                mol.setIdim(rs.getString("idim"));
                mol.setItol(rs.getString("itol"));
                mol.setJdim(rs.getString("jdim"));
                mol.setJtol(rs.getString("jtol"));
                mol.setKdim(rs.getString("kdim"));
                mol.setKtol(rs.getString("ktol"));
                mol.setCapacidade_mol(rs.getString("capacidade_mol"));
                mol.setTolcapl_mol(rs.getString("tolcapl_mol"));
                mol.setCami_mol(rs.getString("cami_mol"));

                mol.setIma_mol(rs.getBytes("ima_mol"));
                mol.setObs_mol(rs.getString("obs_mol"));
                mol.setUs_mol(rs.getString("us_mol"));
                molde.add(mol);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro read: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return molde;
    }

    public List<Molde> readDes(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Molde> molde = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM moldes WHERE des_mol LIKE ?");
            stmt.setString(1, "%" + des + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Molde mol = new Molde();

                mol.setId_mol(rs.getInt("id_mol"));
                mol.setCod_mol(rs.getString("cod_mol"));
                mol.setDes_mol(rs.getString("des_mol"));
                mol.setPes_mol(rs.getDouble("pes_mol"));
                mol.setTol_mol(rs.getString("tol_mol"));
                mol.setAdim(rs.getString("adim"));
                mol.setAtol(rs.getString("atol"));
                mol.setBdim(rs.getString("bdim"));
                mol.setBtol(rs.getString("btol"));
                mol.setCdim(rs.getString("cdim"));
                mol.setCtol(rs.getString("ctol"));
                mol.setDdim(rs.getString("ddim"));
                mol.setDtol(rs.getString("dtol"));
                mol.setEdim(rs.getString("edim"));
                mol.setEtol(rs.getString("etol"));
                mol.setFdim(rs.getString("fdim"));
                mol.setFtol(rs.getString("ftol"));
                mol.setGdim(rs.getString("gdim"));
                mol.setGtol(rs.getString("gtol"));
                mol.setHdim(rs.getString("hdim"));
                mol.setHtol(rs.getString("htol"));
                mol.setIdim(rs.getString("idim"));
                mol.setItol(rs.getString("itol"));
                mol.setJdim(rs.getString("jdim"));
                mol.setJtol(rs.getString("jtol"));
                mol.setKdim(rs.getString("kdim"));
                mol.setKtol(rs.getString("ktol"));
                mol.setCapacidade_mol(rs.getString("capacidade_mol"));
                mol.setTolcapl_mol(rs.getString("tolcapl_mol"));
                mol.setCami_mol(rs.getString("cami_mol"));
                mol.setIma_mol(rs.getBytes("ima_mol"));
                mol.setObs_mol(rs.getString("obs_mol"));
                mol.setUs_mol(rs.getString("us_mol"));
                molde.add(mol);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return molde;
    }

    public List<Molde> readId(String des) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Molde> molde = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM moldes WHERE id_mol LIKE ?");
            stmt.setString(1, des);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Molde mol = new Molde();

                mol.setId_mol(rs.getInt("id_mol"));
                mol.setCod_mol(rs.getString("cod_mol"));
                mol.setDes_mol(rs.getString("des_mol"));
                mol.setPes_mol(rs.getDouble("pes_mol"));
                mol.setTol_mol(rs.getString("tol_mol"));
                mol.setAdim(rs.getString("adim"));
                mol.setAtol(rs.getString("atol"));
                mol.setBdim(rs.getString("bdim"));
                mol.setBtol(rs.getString("btol"));
                mol.setCdim(rs.getString("cdim"));
                mol.setCtol(rs.getString("ctol"));
                mol.setDdim(rs.getString("ddim"));
                mol.setDtol(rs.getString("dtol"));
                mol.setEdim(rs.getString("edim"));
                mol.setEtol(rs.getString("etol"));
                mol.setFdim(rs.getString("fdim"));
                mol.setFtol(rs.getString("ftol"));
                mol.setGdim(rs.getString("gdim"));
                mol.setGtol(rs.getString("gtol"));
                mol.setHdim(rs.getString("hdim"));
                mol.setHtol(rs.getString("htol"));
                mol.setIdim(rs.getString("idim"));
                mol.setItol(rs.getString("itol"));
                mol.setJdim(rs.getString("jdim"));
                mol.setJtol(rs.getString("jtol"));
                mol.setKdim(rs.getString("kdim"));
                mol.setKtol(rs.getString("ktol"));
                mol.setCapacidade_mol(rs.getString("capacidade_mol"));
                mol.setTolcapl_mol(rs.getString("tolcapl_mol"));
                mol.setCami_mol(rs.getString("cami_mol"));
                mol.setIma_mol(rs.getBytes("ima_mol"));
                mol.setObs_mol(rs.getString("obs_mol"));
                mol.setUs_mol(rs.getString("us_mol"));
                molde.add(mol);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return molde;
    }

    public void delete(Molde mol) {

        String sql = "DELETE FROM moldes WHERE id_mol=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, mol.getId_mol());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean updata(Molde mol) {

        String sql = "UPDATE moldes SET cod_mol=?, des_mol=?, pes_mol=?, tol_mol=?, adim=?, atol=?, bdim=?, btol=?, cdim=?, ctol=?, ddim=?, dtol=?, edim=?, etol=?, fdim=?, ftol=?, gdim=?, gtol=?, hdim=?, htol=?, idim=?, itol=?, jdim=?, jtol=?, kdim=?, ktol=?, capacidade_mol=?, tolcapl_mol=?, cami_mol=?, ima_mol=?, obs_mol=?, us_mol=? WHERE id_mol=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, mol.getCod_mol());
            stmt.setString(2, mol.getDes_mol());
            stmt.setDouble(3, mol.getPes_mol());
            stmt.setString(4, mol.getTol_mol());
            stmt.setString(5, mol.getAdim());
            stmt.setString(6, mol.getAtol());
            stmt.setString(7, mol.getBdim());
            stmt.setString(8, mol.getBtol());
            stmt.setString(9, mol.getCdim());
            stmt.setString(10, mol.getCtol());
            stmt.setString(11, mol.getDdim());
            stmt.setString(12, mol.getDtol());
            stmt.setString(13, mol.getEdim());
            stmt.setString(14, mol.getEtol());
            stmt.setString(15, mol.getFdim());
            stmt.setString(16, mol.getFtol());
            stmt.setString(17, mol.getGdim());
            stmt.setString(18, mol.getGtol());
            stmt.setString(19, mol.getHdim());
            stmt.setString(20, mol.getHtol());
            stmt.setString(21, mol.getIdim());
            stmt.setString(22, mol.getItol());
            stmt.setString(23, mol.getJdim());
            stmt.setString(24, mol.getJtol());
            stmt.setString(25, mol.getKdim());
            stmt.setString(26, mol.getKtol());
            stmt.setString(27, mol.getCapacidade_mol());
            stmt.setString(28, mol.getTolcapl_mol());
            stmt.setString(29, mol.getCami_mol());
            try {
                File file = new File(mol.getCami_mol());
                FileInputStream arq;
                arq = new FileInputStream(file);
                stmt.setBinaryStream(30, arq);
            } catch (FileNotFoundException ex) {
                stmt.setString(30, "");
            }
            stmt.setString(31, mol.getObs_mol());
            stmt.setString(32, mol.getUs_mol());
            stmt.setInt(33, mol.getId_mol());
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

}
