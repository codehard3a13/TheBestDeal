/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Administrateur;
import bestdeal.entities.Deal;
import bestdeal.entities.Voucher;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jedidi
 */
public class VoucherDAO {
   int stat [][];

    public VoucherDAO() {
        this.stat = null;
    }
    public int[][] StatDeal(){
        
             
        String requete = "SELECT id_deal, COUNT( id_deal ) FROM voucher GROUP BY id_deal";
        int i=5;   
        stat = new int[2][i]; 
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            i=0;
            while(rs.next()){
               
                stat[0][i] = rs.getInt(1);
                stat[1][i] = rs.getInt(2);
                
                
                i++;
            }
            
            
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        return stat;
        
        

    }
}
