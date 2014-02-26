/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;


import bestdeal.dao.AdministrateurDAO;
import bestdeal.entities.Administrateur;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jedidi
 */
public class AdminModel extends AbstractTableModel{

    List<Administrateur> admins = new ArrayList<Administrateur>();
    String[] header = {"Id admin","Nom","Prénom","Login", "Mot de passe","E-mail","Téléphone","Adresse","Type administrateur"};
    
    public AdminModel () {
          admins = new AdministrateurDAO().DisplayAllAdmin();
    }

    @Override
    public int getRowCount() {
        return admins.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
            return admins.get(rowIndex).getId_admin();
                case 1:
                return admins.get(rowIndex).getNom();
                    case 2:
                    return admins.get(rowIndex).getPrenom();
                        case 3:
                        return admins.get(rowIndex).getLogin();
                           case 4:
                           return admins.get(rowIndex).getPwd();  
                              case 5:
                              return admins.get(rowIndex).getAdresse(); 
                                  case 6:
                                  return admins.get(rowIndex).getEmail(); 
                                      case 7:
                                      return admins.get(rowIndex).getTelephone(); 
                                          case 8:
                                          return admins.get(rowIndex).isType_admin(); 
                        default:
                           throw new IllegalArgumentException();
        }}
    @Override
    public String getColumnName (int column){
            return header[column] ;
    }
    public void removeRow(int row)
{
    admins.remove(row);
    fireTableRowsDeleted(row, row);
}
    
    
}
