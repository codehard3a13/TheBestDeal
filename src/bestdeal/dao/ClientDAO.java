/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.dao;


import bestdeal.entities.Client;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Modhaffer
 */
public class ClientDAO {
    /*
     *variable d'etat de l'inscription.
     * Selon sa valeur on va afficher un alerte different 
     * success = 0
     * failure != 0
     */
    public static int etatInscription;
    
    public void insertClient(Client c){
        String requete = "insert into Client(login, pwd, nom, prenom, email, etat_compte)"
                + " values (?,?,?,?,?,?)";
        try{
            PreparedStatement ps  = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getLogin());
            ps.setString(2, c.getPwd());
            ps.setString(3, c.getNom());
            ps.setString(4, c.getPrenom());
            ps.setString(5, c.getEmail());
            ps.setBoolean(6, c.isEtat_compte());
            
            ps.executeUpdate();
            etatInscription = 0;
        }catch(SQLException e){
            etatInscription = 1;
        }
    }
    
    
}
