/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.entities;

/**
 *
 * @author Jedidi
 */
public class Vendeur {
    private int id_vendeur;
    private String login;
    private String pwd;
    private String nom;
    private String prenom;
    private int telephone;
    private String adresse;
    private String email;
    private int note;
    private boolean etat_compte;

    /**
     * @return the id_vendeur
     */
    public int getId_vendeur() {
        return id_vendeur;
    }

    /**
     * @param id_vendeur the id_vendeur to set
     */
    public void setId_vendeur(int id_vendeur) {
        this.id_vendeur = id_vendeur;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the note
     */
    public int getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(int note) {
        this.note = note;
    }

    /**
     * @return the etat_compte
     */
    public boolean isEtat_compte() {
        return etat_compte;
    }

    /**
     * @param etat_compte the etat_compte to set
     */
    public void setEtat_compte(boolean etat_compte) {
        this.etat_compte = etat_compte;
    }
}
