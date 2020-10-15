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
public class Molde {
    
    
    private int id_mol;
    private String cod_mol;
    private String des_mol;
    private double pes_mol; 
    private String tol_mol;
    private String adim;
    private String atol;
    private String bdim;
    private String btol;
    private String cdim;
    private String ctol;
    private String ddim;
    private String dtol;
    private String edim;
    private String etol;
    private String fdim;
    private String ftol;
    private String gdim;
    private String gtol;
    private String hdim;
    private String htol;
    private String idim;
    private String itol;
    private String jdim;
    private String jtol;
    private String kdim;
    private String ktol; 
    private String capacidade_mol;
    private String tolcapl_mol;
    private String cami_mol;
    private byte[] ima_mol;
    private String obs_mol;
    private String us_mol; 

    public Molde() {
    }

    public Molde(String cod_mol, String des_mol, double pes_mol, String tol_mol, String adim, String atol, String bdim, String btol, String cdim, String ctol, String ddim, String dtol, String edim, String etol, String fdim, String ftol, String gdim, String gtol, String hdim, String htol, String idim, String itol, String jdim, String jtol, String kdim, String ktol, String capacidade_mol, String tolcapl_mol, String cami_mol, byte[] ima_mol, String obs_mol, String us_mol) {
        this.cod_mol = cod_mol;
        this.des_mol = des_mol;
        this.pes_mol = pes_mol;
        this.tol_mol = tol_mol;
        this.adim = adim;
        this.atol = atol;
        this.bdim = bdim;
        this.btol = btol;
        this.cdim = cdim;
        this.ctol = ctol;
        this.ddim = ddim;
        this.dtol = dtol;
        this.edim = edim;
        this.etol = etol;
        this.fdim = fdim;
        this.ftol = ftol;
        this.gdim = gdim;
        this.gtol = gtol;
        this.hdim = hdim;
        this.htol = htol;
        this.idim = idim;
        this.itol = itol;
        this.jdim = jdim;
        this.jtol = jtol;
        this.kdim = kdim;
        this.ktol = ktol;
        this.capacidade_mol = capacidade_mol;
        this.tolcapl_mol = tolcapl_mol;
        this.cami_mol = cami_mol;
        this.ima_mol = ima_mol;
        this.obs_mol = obs_mol;
        this.us_mol = us_mol;
    }

    
    
    public int getId_mol() {
        return id_mol;
    }

    public void setId_mol(int id_mol) {
        this.id_mol = id_mol;
    }

    public String getCod_mol() {
        return cod_mol;
    }

    public void setCod_mol(String cod_mol) {
        this.cod_mol = cod_mol;
    }

    public String getDes_mol() {
        return des_mol;
    }

    public void setDes_mol(String des_mol) {
        this.des_mol = des_mol;
    }

    public double getPes_mol() {
        return pes_mol;
    }

    public void setPes_mol(double pes_mol) {
        this.pes_mol = pes_mol;
    }

    public String getTol_mol() {
        return tol_mol;
    }

    public void setTol_mol(String tol_mol) {
        this.tol_mol = tol_mol;
    }

    public String getAdim() {
        return adim;
    }

    public void setAdim(String adim) {
        this.adim = adim;
    }

    public String getAtol() {
        return atol;
    }

    public void setAtol(String atol) {
        this.atol = atol;
    }

    public String getBdim() {
        return bdim;
    }

    public void setBdim(String bdim) {
        this.bdim = bdim;
    }

    public String getBtol() {
        return btol;
    }

    public void setBtol(String btol) {
        this.btol = btol;
    }

    public String getCdim() {
        return cdim;
    }

    public void setCdim(String cdim) {
        this.cdim = cdim;
    }

    public String getCtol() {
        return ctol;
    }

    public void setCtol(String ctol) {
        this.ctol = ctol;
    }

    public String getDdim() {
        return ddim;
    }

    public void setDdim(String ddim) {
        this.ddim = ddim;
    }

    public String getDtol() {
        return dtol;
    }

    public void setDtol(String dtol) {
        this.dtol = dtol;
    }

    public String getEdim() {
        return edim;
    }

    public void setEdim(String edim) {
        this.edim = edim;
    }

    public String getEtol() {
        return etol;
    }

    public void setEtol(String etol) {
        this.etol = etol;
    }

    public String getFdim() {
        return fdim;
    }

    public void setFdim(String fdim) {
        this.fdim = fdim;
    }

    public String getFtol() {
        return ftol;
    }

    public void setFtol(String ftol) {
        this.ftol = ftol;
    }

    public String getGdim() {
        return gdim;
    }

    public void setGdim(String gdim) {
        this.gdim = gdim;
    }

    public String getGtol() {
        return gtol;
    }

    public void setGtol(String gtol) {
        this.gtol = gtol;
    }

    public String getHdim() {
        return hdim;
    }

    public void setHdim(String hdim) {
        this.hdim = hdim;
    }

    public String getHtol() {
        return htol;
    }

    public void setHtol(String htol) {
        this.htol = htol;
    }

    public String getIdim() {
        return idim;
    }

    public void setIdim(String idim) {
        this.idim = idim;
    }

    public String getItol() {
        return itol;
    }

    public void setItol(String itol) {
        this.itol = itol;
    }

    public String getJdim() {
        return jdim;
    }

    public void setJdim(String jdim) {
        this.jdim = jdim;
    }

    public String getJtol() {
        return jtol;
    }

    public void setJtol(String jtol) {
        this.jtol = jtol;
    }

    public String getKdim() {
        return kdim;
    }

    public void setKdim(String kdim) {
        this.kdim = kdim;
    }

    public String getKtol() {
        return ktol;
    }

    public void setKtol(String ktol) {
        this.ktol = ktol;
    }

    public String getCapacidade_mol() {
        return capacidade_mol;
    }

    public void setCapacidade_mol(String capacidade_mol) {
        this.capacidade_mol = capacidade_mol;
    }

    public String getTolcapl_mol() {
        return tolcapl_mol;
    }

    public void setTolcapl_mol(String tolcapl_mol) {
        this.tolcapl_mol = tolcapl_mol;
    }

    public String getCami_mol() {
        return cami_mol;
    }

    public void setCami_mol(String cami_mol) {
        this.cami_mol = cami_mol;
    }

    public byte[] getIma_mol() {
        return ima_mol;
    }

    public void setIma_mol(byte[] ima_mol) {
        this.ima_mol = ima_mol;
    }

    public String getObs_mol() {
        return obs_mol;
    }

    public void setObs_mol(String obs_mol) {
        this.obs_mol = obs_mol;
    }

    public String getUs_mol() {
        return us_mol;
    }

    public void setUs_mol(String us_mol) {
        this.us_mol = us_mol;
    }

    @Override
    public String toString() {
        return getDes_mol(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
    
}
