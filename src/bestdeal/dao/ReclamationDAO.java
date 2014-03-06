/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Reclamation;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author youssef
 */
public class ReclamationDAO {
    
    
    public List<Reclamation> DisplayReclamation (){


        List<Reclamation> listereclamation = new ArrayList<Reclamation>();

        String requete = "select * from reclamation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Reclamation rec =new Reclamation();
                rec.setId_reclamation(resultat.getInt(1));
                rec.setTitre(resultat.getString(2));
                rec.setText(resultat.getString(3));
                rec.setId_client(resultat.getInt(4));
                rec.setEtat_reclamation(resultat.getString(5));
                
                listereclamation.add(rec);
            }
            return listereclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
            return null;
        }
    }
    
    public void ajouterReclamation(Reclamation r)
    {
        String requete="insert into reclamation(titre,text) values(?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getTitre());
            ps.setString(2, r.getText());
            ps.setInt(3, r.getId_client());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
    }
    
    public void updateRec_ToResolu(Reclamation r){
        String requete = "update reclamation set etat_reclamation='Resolu' where id_reclamation=? ";
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getEtat_reclamation());
                        
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    
            
    
}
