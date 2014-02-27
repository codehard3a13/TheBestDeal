/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Deal;
import bestdeal.entities.Vendeur;
import bestdeal.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class DealDAO {
    
     public List<Deal> DisplayAllDeals (){

        List<Deal> listeDeals = new ArrayList<Deal>();

        String requete = "select d.id_deal,d.nom_deal,d.description,d.prix,d.date_debut,d.date_fin,d.remise,d.note,d.quantite,d.categorie,d.statut_deal,v.nom  from deal d join vendeur v on d.id_vendeur=v.id_vendeur where d.statut_deal=1";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
             Deal deal=new Deal();
             Vendeur v=new Vendeur();
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
    
      public void deleteClient(Deal c){

          String requete = "delete from deal where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getId_deal()+"");
            ps.executeUpdate();
            System.out.println("Suppression de deal effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression de deal "+ex.getMessage());
        }
    }
    
     
         public void insertDeal(Deal dl){

         String requete = "insert into deal (nom_deal,description,prix,date_debut,date_fin,remise,note,quantite,statut_deal,id_vendeur,categorie) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, dl.getNom_deal());
             ps.setString(2, dl.getDescription());
              ps.setFloat(3, dl.getPrix());
               ps.setDate(4, (Date)dl.getDate_debut());
                ps.setDate(5, (Date)dl.getDate_fin());
                 ps.setInt(6, dl.getRemise());
                   ps.setInt(7, dl.getNote());
                     ps.setInt(8, dl.getQuantite());
                       ps.setBoolean(9, dl.isStatut_deal());
                       ps.setInt(10, 1);
                       ps.setString(11, dl.getCategorie());
               
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
         
           public List<Vendeur> FillCombo (){
         List<Vendeur> listeVendeur = new ArrayList<Vendeur>();
        String requete = "select * from vendeur ";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
             Vendeur v1 = new Vendeur();
            while(resultat.next()){
               
              v1.setLogin(resultat.getString(2));
             // v1.setPrenom(resultat.getString(5));
             
             // System.out.println(" fill combo ");
              listeVendeur.add(v1);
            }
           return listeVendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des nom de vendeur "+ex.getMessage());
            return null;
        }
    }
           
       
      
      public void updateDeal_ToValide(Deal dl){
        String requete = "update deal set statut_deal=1 where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_deal());
            ps.executeUpdate();
            System.out.println("Deal valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de Validation de deal "+ex.getMessage());
        }
    }
        public void updateDeal_ToInvalide(Deal dl){
        String requete = "update deal set statut_deal=0 where id_deal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_deal());
            ps.executeUpdate();
            System.out.println("Deal valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de Validation de deal "+ex.getMessage());
        }
    }
           
           
           
    
    
}
