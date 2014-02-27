/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Client;
import bestdeal.entities.Deal;
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
 * @author ahmed
 */
public class ClientAttenteDAO {
    
    public ResultSet UpdateTableClientAttente()
    {
        try{
            String sql ="select * from client where etat_compte=0";
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
    
       public List<Client> DisplayAllClientsAttente (){

        List<Client> listeClients = new ArrayList<Client>();

        String requete = "select * from client where etat_compte=0";
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
    
    
}
