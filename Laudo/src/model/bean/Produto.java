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
public class Produto {
    private int id_prod;
    private String codint_prod;
    private String codext_prod;
    private String des_prod;
    private String mp1_prod;
    private String mp2_prod;
    private String cor_prod;
    private String apli_prod;
    private String mol_prod;
    private String avi_prod;
    private String fab_prod;
    private String val_prod;
    private String obs_prod;
    private String us_prod;

    public Produto() {
    }

    public Produto(String codint_prod, String codext_prod, String des_prod, String mp1_prod, String mp2_prod, String cor_prod, String apli_prod, String mol_prod, String avi_prod, String fab_prod, String val_prod, String obs_prod, String us_prod) {
        this.codint_prod = codint_prod;
        this.codext_prod = codext_prod;
        this.des_prod = des_prod;
        this.mp1_prod = mp1_prod;
        this.mp2_prod = mp2_prod;
        this.cor_prod = cor_prod;
        this.apli_prod = apli_prod;
        this.mol_prod = mol_prod;
        this.avi_prod = avi_prod;
        this.fab_prod = fab_prod;
        this.val_prod = val_prod;
        this.obs_prod = obs_prod;
        this.us_prod = us_prod;
    }
    
    

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getCodint_prod() {
        return codint_prod;
    }

    public void setCodint_prod(String codint_prod) {
        this.codint_prod = codint_prod;
    }

    public String getCodext_prod() {
        return codext_prod;
    }

    public void setCodext_prod(String codext_prod) {
        this.codext_prod = codext_prod;
    }

    public String getDes_prod() {
        return des_prod;
    }

    public void setDes_prod(String des_prod) {
        this.des_prod = des_prod;
    }

    public String getMp1_prod() {
        return mp1_prod;
    }

    public void setMp1_prod(String mp1_prod) {
        this.mp1_prod = mp1_prod;
    }

    public String getMp2_prod() {
        return mp2_prod;
    }

    public void setMp2_prod(String mp2_prod) {
        this.mp2_prod = mp2_prod;
    }

    public String getCor_prod() {
        return cor_prod;
    }

    public void setCor_prod(String cor_prod) {
        this.cor_prod = cor_prod;
    }

    public String getApli_prod() {
        return apli_prod;
    }

    public void setApli_prod(String apli_prod) {
        this.apli_prod = apli_prod;
    }

    public String getMol_prod() {
        return mol_prod;
    }

    public void setMol_prod(String mol_prod) {
        this.mol_prod = mol_prod;
    }

    public String getAvi_prod() {
        return avi_prod;
    }

    public void setAvi_prod(String avi_prod) {
        this.avi_prod = avi_prod;
    }

    public String getFab_prod() {
        return fab_prod;
    }

    public void setFab_prod(String fab_prod) {
        this.fab_prod = fab_prod;
    }

    public String getVal_prod() {
        return val_prod;
    }

    public void setVal_prod(String val_prod) {
        this.val_prod = val_prod;
    }

    public String getObs_prod() {
        return obs_prod;
    }

    public void setObs_prod(String obs_prod) {
        this.obs_prod = obs_prod;
    }

    public String getUs_prod() {
        return us_prod;
    }

    public void setUs_prod(String us_prod) {
        this.us_prod = us_prod;
    }

    @Override
    public String toString() {
        return getDes_prod(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
