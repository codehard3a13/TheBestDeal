/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.dao.ClientAttenteDAO;
import bestdeal.dao.ClientDAO;
import bestdeal.entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ahmed
 */
public class ClientModel extends AbstractTableModel{

      List<Client> clients = new ArrayList<Client>();
    String[] entete = {"Id client", "Login", "Mot de Passe", "Nom", "Prenom", "Email","Etat compte"};
    
    
    @Override
    public int getRowCount() {
   return clients.size();    }

    @Override
    public int getColumnCount() {
          return entete.length;
    }
    
       public ClientModel() {
        clients=new ClientDAO().DisplayAllClients();
        System.out.println(clients);
    }
       
       
   public ClientModel(int a)
    {
        clients=new ClientAttenteDAO().DisplayAllClientsAttente();
        System.out.println(clients);
    }
   
     public ClientModel(int a,String b) {
        clients=new ClientDAO().DisplayAllClientsByName(b);
        System.out.println(clients);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
               
        switch (columnIndex) {
            case 0:
                return clients.get(rowIndex).getId_client();
            case 1:
                return clients.get(rowIndex).getLogin();
            case 2:
                return clients.get(rowIndex).getPwd();
            case 3:
                return clients.get(rowIndex).getNom();
            case 4:
                return clients.get(rowIndex).getPrenom();
            case 5:
                return clients.get(rowIndex).getEmail();
            case 6:
                return clients.get(rowIndex).isEtat_compte();
            
            default:
                throw new IllegalArgumentException();
        
    }}
     public String getColumnName(int column) {
        return entete[column];
    }
     
     
    
}

