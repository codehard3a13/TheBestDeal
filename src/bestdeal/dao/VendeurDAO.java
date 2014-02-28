/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.dao;

import bestdeal.entities.Client;
import bestdeal.entities.Vendeur;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Modhaffer
 */
public class VendeurDAO {

    public static int etatInscription;
    String requete = "insert into Vendeur(login, pwd, nom, prenom, Telephone, adresse, email, etat_compte)"
            + " values (?,?,?,?,?,?,?,?)";
    public void insertVendeur(Vendeur v){
        try{
            PreparedStatement ps  = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, v.getLogin());
            ps.setString(2, v.getPwd());
            ps.setString(3, v.getNom());
            ps.setString(4, v.getPrenom());
            ps.setLong(5, v.getTelephone());
            ps.setString(6, v.getAdresse());
            ps.setString(7, v.getEmail());
            ps.setBoolean(8, v.isEtat_compte());
            
            ps.executeUpdate();
            etatInscription = 0;
        }catch (SQLException e){
            etatInscription = 1;
        }
    }
    
    
    
         public List<Vendeur> DisplayAllVendeurs (){

        List<Vendeur> listeVendeur = new ArrayList<Vendeur>();
         //where etat_compte=1
        String requete = "select * from vendeur where etat_compte=1";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          //  DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
                Vendeur v=new Vendeur();
                v.setId_vendeur(resultat.getInt(1));
               v.setLogin(resultat.getString(2));
                v.setPwd(resultat.getString(3));
               v.setNom(resultat.getString(4));
              v.setPrenom(resultat.getString(5));
              v.setTelephone(resultat.getInt(6));
              v.setAdresse(resultat.getString(7));
              v.setEmail(resultat.getString(8));
              v.setNote(resultat.getInt(9));
              v.setEtat_compte(resultat.getBoolean(10));
              listeVendeur.add(v);
             
            }
            return listeVendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des vendeurs "+ex.getMessage());
            return null;
        }
    }
         
             public void deleteVendeur (Vendeur c){

          String requete = "delete from vendeur where id_vendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getId_vendeur()+"");
            ps.executeUpdate();
            System.out.println("Suppression de vendeur effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression de vendeur "+ex.getMessage());
        }
    }
             
               public void updateVendeur_ToInvalide(Vendeur dl){
        String requete = "update vendeur set etat_compte=0 where id_vendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_vendeur());
            ps.executeUpdate();
            System.out.println("Vendeur Non valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de Bloquage de Vendeur "+ex.getMessage());
        }
    }
               
                    public void updateVendeur_Tovalide(Vendeur dl){
        String requete = "update vendeur set etat_compte=1 where id_vendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_vendeur());
            ps.executeUpdate();
            System.out.println("Vendeur Non valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de Bloquage de Vendeur "+ex.getMessage());
        }
    }
                    
     public List<Vendeur> DisplayAllVendeursAttente (){

        List<Vendeur> listeVendeur = new ArrayList<Vendeur>();
         //where etat_compte=1
        String requete = "select * from vendeur where etat_compte=0";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          //  DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
                Vendeur v=new Vendeur();
                v.setId_vendeur(resultat.getInt(1));
               v.setLogin(resultat.getString(2));
                v.setPwd(resultat.getString(3));
               v.setNom(resultat.getString(4));
              v.setPrenom(resultat.getString(5));
              v.setTelephone(resultat.getInt(6));
              v.setAdresse(resultat.getString(7));
              v.setEmail(resultat.getString(8));
              v.setNote(resultat.getInt(9));
              v.setEtat_compte(resultat.getBoolean(10));
              listeVendeur.add(v);
             
            }
            return listeVendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des vendeurs en Attente "+ex.getMessage());
            return null;
        }
    }
    
     public List<Vendeur> DisplayAllVendeurssByName (String st){

        List<Vendeur> listeVendeur = new ArrayList<Vendeur>();
        
        String requete = "select * from vendeur where nom='"+st+"'" ;
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          //  DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
               Vendeur v=new Vendeur();
                v.setId_vendeur(resultat.getInt(1));
               v.setLogin(resultat.getString(2));
                v.setPwd(resultat.getString(3));
               v.setNom(resultat.getString(4));
              v.setPrenom(resultat.getString(5));
              v.setTelephone(resultat.getInt(6));
              v.setAdresse(resultat.getString(7));
              v.setEmail(resultat.getString(8));
              v.setNote(resultat.getInt(9));
              v.setEtat_compte(resultat.getBoolean(10));
              listeVendeur.add(v);
            }
            return listeVendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du Recherche des Vendeurs "+ex.getMessage());
            return null;
        }
    }
    
    
}
