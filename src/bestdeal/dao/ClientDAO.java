/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.dao;


import bestdeal.entities.Client;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
     public List<Client> DisplayAllClients (){

        List<Client> listeClients = new ArrayList<Client>();
         //where etat_compte=1
        String requete = "select * from client where etat_compte=1";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          //  DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
                Client client =new Client();
                client.setId_client(resultat.getInt(1));
               client.setLogin(resultat.getString(2));
                client.setPwd(resultat.getString(3));
               client.setNom(resultat.getString(4));
              client.setPrenom(resultat.getString(5));
              client.setEmail(resultat.getString(6));
              listeClients.add(client);
             
            }
            return listeClients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }
     
      public ResultSet UpdateTable()
    {
        try{
            String sql ="select * from client";
         PreparedStatement ps = MyConnection.getInstance().prepareStatement(sql);
          ResultSet rest = ps.executeQuery(sql);
         // tbcustomar.setModel(DbUtils.resultSetToTableModel(rest));
          return rest;

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
     
        public void deleteClient(Client c){

          String requete = "delete from client where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getId_client()+"");
            ps.executeUpdate();
            System.out.println("Suppression de client effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression de client "+ex.getMessage());
        }
    }
    
          public void updateClient_ToInvalide(Client dl){
        String requete = "update client set etat_compte=0 where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_client());
            ps.executeUpdate();
            System.out.println("Client Non valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de InValidation de Client "+ex.getMessage());
        }
    }
             public void updateClient_ToValide(Client dl){
        String requete = "update client set etat_compte=1 where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, dl.getId_client());
            ps.executeUpdate();
            System.out.println("Client Valide effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de Validation de Client "+ex.getMessage());
        }
    }
        
        
      public List<Client> DisplayAllClientsByName (String st){

        List<Client> listeClients = new ArrayList<Client>();
        
        String requete = "select * from client where nom='"+st+"'" ;
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
          //  DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
                Client client =new Client();
                client.setId_client(resultat.getInt(1));
               client.setLogin(resultat.getString(2));
                client.setPwd(resultat.getString(3));
               client.setNom(resultat.getString(4));
              client.setPrenom(resultat.getString(5));
              client.setEmail(resultat.getString(6));
              listeClients.add(client);
            }
            return listeClients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du Recherche des clients "+ex.getMessage());
            return null;
        }
    }
    
    
}
