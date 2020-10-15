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
import model.bean.Cliente;
import model.bean.Cores;

/**
 *
 * @author Danilo
 */
public class ClienteDAO {
    
    private Connection con = null;

    public ClienteDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Cliente clientes) {

        String sql = "INSERT INTO cliente (nome_cli, cnpj_cli, email_cli, tel_cli, cel_cli, contato_cli, obs_cli, us_cli) VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, clientes.getNome_cli());
            stmt.setString(2, clientes.getCnpj_cli());
            stmt.setString(3, clientes.getEmail_cli());
            stmt.setString(4, clientes.getTel_cli());
            stmt.setString(5, clientes.getCel_cli());
            stmt.setString(6, clientes.getContato_cli());
            stmt.setString(7, clientes.getObs_cli());
            stmt.setString(8, clientes.getUs_cli());
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
    
    public List<Cliente> findAll() {

        String sql = "SELECT * FROM cliente";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId_cli(rs.getInt("id_cli"));
                cli.setNome_cli(rs.getString("nome_cli"));
                cli.setCnpj_cli(rs.getString("cnpj_cli"));
                cli.setEmail_cli(rs.getString("email_cli"));
                cli.setTel_cli(rs.getString("tel_cli"));
                cli.setCel_cli(rs.getString("cel_cli"));
                cli.setContato_cli(rs.getString("contato_cli"));
                cli.setObs_cli(rs.getString("obs_cli"));
                cli.setUs_cli(rs.getString("us_cli"));
                cliente.add(cli);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
    
    
     public void delete(Cliente cli) {

        String sql = "DELETE FROM cliente WHERE id_cli=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cli.getId_cli());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
 
      public List<Cliente> readcod(String cod) {

        String sql = "SELECT * FROM cliente WHERE id_cli=?";
          
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cod);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId_cli(rs.getInt("id_cli"));
                cli.setNome_cli(rs.getString("nome_cli"));
                cli.setCnpj_cli(rs.getString("cnpj_cli"));
                cli.setEmail_cli(rs.getString("email_cli"));
                cli.setTel_cli(rs.getString("tel_cli"));
                cli.setCel_cli(rs.getString("cel_cli"));
                cli.setContato_cli(rs.getString("contato_cli"));
                cli.setObs_cli(rs.getString("obs_cli"));
                cli.setUs_cli(rs.getString("us_cli"));
                cliente.add(cli);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
     
       public boolean updata(Cliente cliente) {

        String sql = "UPDATE cliente SET nome_cli=?, cnpj_cli=?, email_cli=?, tel_cli=?, cel_cli=?, contato_cli=?, obs_cli=?, us_cli=? WHERE id_cli=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome_cli());
            stmt.setString(2, cliente.getCnpj_cli());
            stmt.setString(3, cliente.getEmail_cli());
            stmt.setString(4, cliente.getTel_cli());
            stmt.setString(5, cliente.getCel_cli());
            stmt.setString(6, cliente.getContato_cli());
            stmt.setString(7, cliente.getObs_cli());
            stmt.setString(8, cliente.getUs_cli());
            stmt.setInt(9, cliente.getId_cli());
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
       
       
       public List<Cliente> readNome(String id) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome_cli LIKE ?");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId_cli(rs.getInt("id_cli"));
                cli.setNome_cli(rs.getString("nome_cli"));
                cli.setCnpj_cli(rs.getString("cnpj_cli"));
                cli.setEmail_cli(rs.getString("email_cli"));
                cli.setTel_cli(rs.getString("tel_cli"));
                cli.setCel_cli(rs.getString("cel_cli"));
                cli.setContato_cli(rs.getString("contato_cli"));
                cli.setObs_cli(rs.getString("obs_cli"));
                
                cliente.add(cli);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
       
       
       public List<Cliente> readCnpj(String id) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cnpj_cli LIKE ?");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId_cli(rs.getInt("id_cli"));
                cli.setNome_cli(rs.getString("nome_cli"));
                cli.setCnpj_cli(rs.getString("cnpj_cli"));
                cli.setEmail_cli(rs.getString("email_cli"));
                cli.setTel_cli(rs.getString("tel_cli"));
                cli.setCel_cli(rs.getString("cel_cli"));
                cli.setContato_cli(rs.getString("contato_cli"));
                cli.setObs_cli(rs.getString("obs_cli"));
                
                cliente.add(cli);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
}
