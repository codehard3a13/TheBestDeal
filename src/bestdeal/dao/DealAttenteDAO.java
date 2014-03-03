/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Deal;
import bestdeal.entities.Vendeur;
import bestdeal.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class DealAttenteDAO {
    public List<Deal> DisplayAllDealsAttente (){
        
  List<Deal> listeDeals = new ArrayList<Deal>();

        String requete = "select d.id_deal,d.nom_deal,d.description,d.prix,d.date_debut,d.date_fin,d.remise,d.note,d.quantite,d.categorie,d.statut_deal,v.nom  from deal d join vendeur v on d.id_vendeur=v.id_vendeur where d.statut_deal=0";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
             Deal deal=new Deal();
         
            while(resultat.next()){
                
                deal.setId_deal(resultat.getInt(1));
                deal.setNom_deal(resultat.getString(2));
                deal.setDescription(resultat.getString(3));
                deal.setPrix(resultat.getFloat(4));
                deal.setDate_debut(resultat.getDate(5));
                deal.setDate_fin(resultat.getDate(6));
                deal.setRemise(resultat.getInt(7));
                deal.setNote(resultat.getInt(8));
                deal.setQuantite(resultat.getInt(9));
                deal.setCategorie(resultat.getString(10));
                deal.setStatut_deal(resultat.getBoolean(11));
               // v.setNom(resultat.getString(12));
                deal.setNomVendeur(resultat.getString(12));
                
              listeDeals.add(deal);
            }
           return listeDeals;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Deals "+ex.getMessage());
            return null;
        }
      
    }
    
    
    
}
