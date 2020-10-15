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
public class Cores {
    
    private int id;
    private String cod_cor;
    private String des_cor;
    private String us_cor;

    public Cores() {
    }

    public Cores(String cod_cor, String des_cor, String us_cor) {
        this.cod_cor = cod_cor;
        this.des_cor = des_cor;
        this.us_cor = us_cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_cor() {
        return cod_cor;
    }

    public void setCod_cor(String cod_cor) {
        this.cod_cor = cod_cor;
    }

    public String getDes_cor() {
        return des_cor;
    }

    public void setDes_cor(String des_cor) {
        this.des_cor = des_cor;
    }

    public String getUs_cor() {
        return us_cor;
    }

    public void setUs_cor(String us_cor) {
        this.us_cor = us_cor;
    }

    @Override
    public String toString() {
        return getCod_cor(); //To change body of generated methods, choose Tools | Templates.
    }

}
