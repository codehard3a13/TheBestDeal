/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.entities;

import java.util.Date;

/**
 *
 * @author Jedidi
 */
public class Deal {
     private int id_deal;
     private String nom_deal;
     private String description;
     private float prix;
     private Date date_debut;
     private Date date_fin ;
     private int  remise;
     private int  note;
     private int  quantite;
     private boolean statut_deal;
     private int id_vendeur;
     private String categorie;

    /**
     * @return the id_deal
     */
    public int getId_deal() {
        return id_deal;
    }

    /**
     * @param id_deal the id_deal to set
     */
    public void setId_deal(int id_deal) {
        this.id_deal = id_deal;
    }

    /**
     * @return the nom_deal
     */
    public String getNom_deal() {
        return nom_deal;
    }

    /**
     * @param nom_deal the nom_deal to set
     */
    public void setNom_deal(String nom_deal) {
        this.nom_deal = nom_deal;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the prix
     */
    public float getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }

    /**
     * @return the date_debut
     */
    public Date getDate_debut() {
        return date_debut;
    }

    /**
     * @param date_debut the date_debut to set
     */
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    /**
     * @return the date_fin
     */
    public Date getDate_fin() {
        return date_fin;
    }

    /**
     * @param date_fin the date_fin to set
     */
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    /**
     * @return the remise
     */
    public int getRemise() {
        return remise;
    }

    /**
     * @param remise the remise to set
     */
    public void setRemise(int remise) {
        this.remise = remise;
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
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the statut_deal
     */
    public boolean isStatut_deal() {
        return statut_deal;
    }

    /**
     * @param statut_deal the statut_deal to set
     */
    public void setStatut_deal(boolean statut_deal) {
        this.statut_deal = statut_deal;
    }

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
     * @return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
