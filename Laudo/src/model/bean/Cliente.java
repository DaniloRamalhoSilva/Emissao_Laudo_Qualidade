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
public class Cliente {

    private int id_cli;
    private String nome_cli;
    private String cnpj_cli;
    private String email_cli;
    private String tel_cli;
    private String cel_cli;
    private String contato_cli;
    private String obs_cli;
    private String us_cli;

    public Cliente() {
    }

    public Cliente(String nome_cli, String cnpj_cli, String email_cli, String tel_cli, String cel_cli, String contato_cli, String obs_cli, String us_cli) {
        this.nome_cli = nome_cli;
        this.cnpj_cli = cnpj_cli;
        this.email_cli = email_cli;
        this.tel_cli = tel_cli;
        this.cel_cli = cel_cli;
        this.contato_cli = contato_cli;
        this.obs_cli = obs_cli;
        this.us_cli = us_cli;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getCnpj_cli() {
        return cnpj_cli;
    }

    public void setCnpj_cli(String cnpj_cli) {
        this.cnpj_cli = cnpj_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getCel_cli() {
        return cel_cli;
    }

    public void setCel_cli(String cel_cli) {
        this.cel_cli = cel_cli;
    }

    public String getContato_cli() {
        return contato_cli;
    }

    public void setContato_cli(String contato_cli) {
        this.contato_cli = contato_cli;
    }

    public String getObs_cli() {
        return obs_cli;
    }

    public void setObs_cli(String obs_cli) {
        this.obs_cli = obs_cli;
    }

    public String getUs_cli() {
        return us_cli;
    }

    public void setUs_cli(String us_cli) {
        this.us_cli = us_cli;
    }

    
    

    
}
