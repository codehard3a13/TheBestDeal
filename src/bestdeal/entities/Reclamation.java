/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.entities;

/**
 *
 * @author youssef
 */
public class Reclamation {
    private int id_reclamation;
    private String titre;
    private String text;
    private int id_client;
    private String etat_reclamation;

    /**
     * @return the id_reclamation
     */
    public int getId_reclamation() {
        return id_reclamation;
    }

    /**
     * @param id_reclamation the id_reclamation to set
     */
    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    /**
     * @return the etat_reclamation
     */
    public String getEtat_reclamation() {
        return etat_reclamation;
    }

    /**
     * @param etat_reclamation the etat_reclamation to set
     */
    public void setEtat_reclamation(String etat_reclamation) {
        this.etat_reclamation = etat_reclamation;
    }
    
    
    
    
}
