/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.dao.VendeurDAO;
import bestdeal.entities.Vendeur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ahmed
 */
public class VendeurModel extends AbstractTableModel{
    
      List<Vendeur> Vendeurs = new ArrayList<Vendeur>();
    String[] entete = {"Id Vendeur", "Login", "Mot de Passe", " Nom ", " Prenom ", "Telephone","Adresse","Email","Note","Etat Compte"};

    public VendeurModel() {
        
       Vendeurs=new VendeurDAO().DisplayAllVendeurs();
       System.out.println("vendeur afficher"+Vendeurs);
    }
   
    public VendeurModel(int a) {
        
       Vendeurs=new VendeurDAO().DisplayAllVendeursAttente();
       System.out.println("vendeur afficher"+Vendeurs);
    }
    
    public VendeurModel(int a,String v) {
        
       Vendeurs=new VendeurDAO().DisplayAllVendeurssByName(v);
      
    }
    

    
    @Override
    public int getRowCount() {
       return Vendeurs.size();     }

    @Override
    public int getColumnCount() {
         return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                   
        switch (columnIndex) {
            case 0:
                return Vendeurs.get(rowIndex).getId_vendeur();
            case 1:
                return Vendeurs.get(rowIndex).getLogin();
            case 2:
                return Vendeurs.get(rowIndex).getPwd();
            case 3:
                return Vendeurs.get(rowIndex).getNom();
            case 4:
                return Vendeurs.get(rowIndex).getPrenom();
            case 5:
                return Vendeurs.get(rowIndex).getTelephone();
            case 6:
                return Vendeurs.get(rowIndex).getAdresse();
                   case 7:
                return Vendeurs.get(rowIndex).getEmail();
                   case 8:
                return Vendeurs.get(rowIndex).getNote();
                   case 9:
                return  Vendeurs.get(rowIndex).isEtat_compte();
            default:
                throw new IllegalArgumentException();
    }}
    
      public String getColumnName(int column) {
        return entete[column];
    }
    
    
}
