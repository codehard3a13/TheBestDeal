/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.dao.DealAttenteDAO;
import bestdeal.dao.DealDAO;
import bestdeal.entities.Deal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ahmed
 */
public class DealModel extends AbstractTableModel{
    
    
     List<Deal> Deals = new ArrayList<Deal>();
    String[] entete = {"Id Deal","Nom Deal","Description","Prix","Date Debut","Date Fin","Remise","Note","Quantité","Categorie","Etat Deal","Nom Vendeur"};

        public DealModel() {
        Deals= new DealDAO().DisplayAllDeals();
          System.out.println(Deals);
    }
    
     public DealModel(String a) {
      Deals=new DealAttenteDAO().DisplayAllDealsAttente();
    }

    
    @Override
    public int getRowCount() {
   return Deals.size();    }

    @Override
    public int getColumnCount() {
  return entete.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
             case 0:
                 return Deals.get(rowIndex).getId_deal();
            case 1:
                return Deals.get(rowIndex).getNom_deal();
            case 2:
                return Deals.get(rowIndex).getDescription();
            case 3:
                return Deals.get(rowIndex).getPrix();
            case 4:
                return Deals.get(rowIndex).getDate_debut();
            case 5:
                return Deals.get(rowIndex).getDate_fin();
            case 6:
                return Deals.get(rowIndex).getRemise();
            case 7:
                return Deals.get(rowIndex).getNote();
            case 8:
                return  Deals.get(rowIndex).getQuantite();
            case 9:
                return Deals.get(rowIndex).getCategorie();
            case 10 :
                return Deals.get(rowIndex).isStatut_deal();
            case 11:
                return Deals.get(rowIndex).getNomVendeur();
                
           
            default:
                throw new IllegalArgumentException();
    }}
    
      public String getColumnName(int column) {
        return entete[column];
    }
public boolean isCellEditable(int iRowIndex, int iColumnIndex)
 {
       return true;
 }  
    
    
}
