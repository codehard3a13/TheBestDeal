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
public class Voucher {
    private int id_voucher;
    private int id_deal;
    private int id_client;
    private float prix_unitaire;
    private Date date;
    private int quantite;

    /**
     * @return the id_voucher
     */
    public int getId_voucher() {
        return id_voucher;
    }

    /**
     * @param id_voucher the id_voucher to set
     */
    public void setId_voucher(int id_voucher) {
        this.id_voucher = id_voucher;
    }

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
     * @return the prix_unitaire
     */
    public float getPrix_unitaire() {
        return prix_unitaire;
    }

    /**
     * @param prix_unitaire the prix_unitaire to set
     */
    public void setPrix_unitaire(float prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
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
}
