package bestdeal.dao;



import bestdeal.entities.Administrateur;
import bestdeal.entities.Deal;
import bestdeal.entities.Voucher;
import bestdeal.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jedidi
 */
public class VoucherDAO {
    String statDeal [][];
    String statVendeur [][];
    String statClient [][];
    
    
    public VoucherDAO() {
        this.statDeal = null;
        this.statVendeur = null;
        this.statClient = null;
    }
    public String[][] StatDeal(){
           
        String requete = "SELECT d.nom_deal,d.description,d.prix,d.remise,d.quantite,d.date_debut,d.date_fin,d.note,v.id_deal, COUNT( v.id_deal ) FROM voucher v INNER JOIN deal d on v.id_deal=d.id_deal GROUP BY id_deal order by 10 desc";
        int i=100;   
        statDeal = new String[10][i]; 
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            i=0;
            while(rs.next()){
               
                statDeal[0][i] = rs.getString(1);
                statDeal[1][i] = rs.getString(2);
                statDeal[2][i] = rs.getString(3);
                statDeal[3][i] = rs.getString(4);
                statDeal[4][i] = rs.getString(5);
                statDeal[5][i] = rs.getString(6);
                statDeal[6][i] = rs.getString(7);
                statDeal[7][i] = rs.getString(8);
                statDeal[8][i] = rs.getString(9);
                statDeal[9][i] = rs.getString(10);
                
                i++;
            }
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        return statDeal;
    } 
    
    public String[][] StatVendeur(){
             
        String requete = "SELECT k.id_vendeur,k.nom,k.prenom,k.adresse,k.telephone,k.email,k.note, v.id_deal, COUNT( v.id_deal ) FROM voucher v INNER JOIN deal d on v.id_deal=d.id_deal INNER JOIN vendeur k on d.id_vendeur=k.id_vendeur GROUP BY nom order by 9 desc";
        int i=100;   
        statVendeur = new String[9][i]; 
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            i=0;
            while(rs.next()){
               
                statVendeur[0][i] = rs.getString(1);
                statVendeur[1][i] = rs.getString(2);
                statVendeur[2][i] = rs.getString(3);
                statVendeur[3][i] = rs.getString(4);
                statVendeur[4][i] = rs.getString(5);
                statVendeur[5][i] = rs.getString(6);
                statVendeur[6][i] = rs.getString(7);
                statVendeur[7][i] = rs.getString(8);
                statVendeur[7][i] = rs.getString(9);
                i++;
            }
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        return statVendeur;
    }
    
    public String[][] StatClient(){
             
        String requete = "SELECT c.id_client,c.nom,c.prenom, c.email, COUNT( c.id_client) FROM voucher v INNER JOIN client c on v.id_client=c.id_client GROUP BY id_client order by 5 desc";
        int i=100;   
        statClient = new String[5][i]; 
        try {                        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            i=0;
            while(rs.next()){
               
                statClient[0][i] = rs.getString(1);
                statClient[1][i] = rs.getString(2);
                statClient[2][i] = rs.getString(3);
                statClient[3][i] = rs.getString(4);
                statClient[4][i] = rs.getString(5);
                i++;
            }
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        return statClient;
    }
    
    
    
        public void ajouterVoucher(Voucher v)
    {
        String requete="insert into voucher(id_client,id_deal,prix_unitaire,date,quantite) values(?,?,?,?,?)";
      
        try
        {
            PreparedStatement ps;
            ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,v.getId_client());
            ps.setInt(2,v.getId_deal());
            ps.setFloat(3, v.getPrix_unitaire());
            ps.setDate(4, (Date) v.getDate());
            ps.setInt(5, v.getQuantite());
            
            
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(VoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    //}
}
