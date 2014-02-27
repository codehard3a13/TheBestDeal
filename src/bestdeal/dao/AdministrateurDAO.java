/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;


import bestdeal.entities.Administrateur;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jedidi
 */
public class AdministrateurDAO {
    
    /**
     *
     * @return
     */
    public void insertAdmin(Administrateur ad){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into administrateur (login,pwd,nom,prenom,email,telephone,adresse,type_admin) values (?,?,?,?,?,?,?,?)";
         try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getLogin());
            ps.setString(2, ad.getPwd());
            ps.setString(3, ad.getNom());
            ps.setString(4, ad.getPrenom());
            ps.setString(5, ad.getEmail());
            ps.setInt(6, ad.getTelephone());
            ps.setString(7, ad.getAdresse());
            ps.setBoolean(8, ad.isType_admin());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void deleteAdmin(Administrateur ad){
          
          String requete = "delete from administrateur where id_admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, ad.getId_admin());
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateAdmin(Administrateur ad){
        String requete = "update administrateur set login=?, pwd=?, nom=?, prenom=?, email=?, telephone=?, adresse=? where id_admin=5";
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getLogin());
            ps.setString(2, ad.getPwd());
            ps.setString(3, ad.getNom());
            ps.setString(4, ad.getPrenom());
            ps.setString(5, ad.getEmail());
            ps.setInt(6, ad.getTelephone());
            ps.setString(7, ad.getAdresse());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    public void updateAdmin_ToBloque(Administrateur ad){
        String requete = "update administrateur set etat_compte='Bloque' where id_admin=? ";
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getEtat_compte());
            
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    public void updateAdmin_ToNonBloque(Administrateur ad){
        String requete = "update administrateur set etat_compte='Non Bloque' where id_admin=? ";
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getEtat_compte());
                        
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    public List<Administrateur> DisplayAllAdmin (){


        List<Administrateur> listeadmin = new ArrayList<Administrateur>();

        String requete = "select * from administrateur";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Administrateur ad =new Administrateur();
                ad.setId_admin(resultat.getInt(1));
                ad.setNom(resultat.getString(4));
                ad.setPrenom(resultat.getString(5));
                ad.setLogin(resultat.getString(2));
                ad.setPwd(resultat.getString(3));
                ad.setAdresse(resultat.getString(8));
                ad.setEmail(resultat.getString(6));
                ad.setTelephone(resultat.getInt(7));
                ad.setType_admin(resultat.getBoolean(9));
                ad.setEtat_compte(resultat.getString(10));
                listeadmin.add(ad);
            }
            return listeadmin;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
            return null;
        }
    }
    
    
    public Administrateur displayForAdmin(){
           
          Administrateur ad =new Administrateur();
          
          String requete = "select * from administrateur where id_admin=5";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                
                ad.setId_admin(resultat.getInt(1));
                ad.setNom(resultat.getString(4));
                ad.setPrenom(resultat.getString(5));
                ad.setLogin(resultat.getString(2));
                ad.setPwd(resultat.getString(3));
                ad.setAdresse(resultat.getString(8));
                ad.setEmail(resultat.getString(6));
                ad.setTelephone(resultat.getInt(7));
                ad.setType_admin(resultat.getBoolean(9));
            }
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement "+ex.getMessage());
        }
        return ad;
        
    }
}
