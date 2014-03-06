/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.dao.ReclamationDAO;
import bestdeal.entities.Administrateur;
import bestdeal.entities.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jedidi
 */
public class ReclamationModel extends AbstractTableModel {
    
    List<Reclamation> listereclamation = new ArrayList<Reclamation>();
    String[] header = {"Id reclamation","Titre","Texte","Id client","Etat reclamation"};
    
    public ReclamationModel () {
          listereclamation = new ReclamationDAO().DisplayReclamation();
    }
    
    @Override
    public int getRowCount() {
        return listereclamation.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
            return listereclamation.get(rowIndex).getId_reclamation();
                case 1:
                return listereclamation.get(rowIndex).getTitre();
                    case 2:
                    return listereclamation.get(rowIndex).getText();
                        case 3:
                        return listereclamation.get(rowIndex).getId_client();
                            case 4:
                            return listereclamation.get(rowIndex).getEtat_reclamation();
                        
                        default:
                           throw new IllegalArgumentException();
        }}
    @Override
    public String getColumnName (int column){
            return header[column] ;
    }
    public void removeRow(int row)
{
    listereclamation.remove(row);
    fireTableRowsDeleted(row, row);
}
    
    
}

