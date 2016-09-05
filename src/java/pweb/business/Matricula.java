/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

/**
 *
 * @author alumno
 */
public class Matricula {
    
    private String nomcurso;
    private String ciclo;
    private int cred;
    
    public Matricula(){
        nomcurso = "";
        ciclo="";
        cred=0;
    }

    public Matricula(String nomcurso, String ciclo, int cred) {
        this.nomcurso= nomcurso;
        this.ciclo = ciclo;
        this.cred=cred;
        
    }

    /**
     * @return the nomcurso
     */
    public String getNomcurso() {
        return nomcurso;
    }

    /**
     * @param nomcurso the nomcurso to set
     */
    public void setNomcurso(String nomcurso) {
        this.nomcurso = nomcurso;
    }

    /**
     * @return the ciclo
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     * @param ciclo the ciclo to set
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * @return the cred
     */
    public int getCred() {
        return cred;
    }

    /**
     * @param cred the cred to set
     */
    public void setCred(int cred) {
        this.cred = cred;
    }
    
    

}

    
