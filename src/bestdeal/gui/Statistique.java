/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.*;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Jedidi
 */
public class Statistique extends javax.swing.JFrame {
    private PieDataset objDataset;
    
    /**
     * Creates new form Statistique
     */
    @SuppressWarnings("empty-statement")
    public Statistique() {
        initComponents();
        
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        lbl_date1.setText(sdf1.format(new java.util.Date()));
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        lbl_heure.setText(sdf2.format(new java.util.Date()));
        
        
        final DefaultPieDataset objDataset = new DefaultPieDataset();
        objDataset.setValue("Deal 1",35);
        objDataset.setValue("Deal 2",25);
        objDataset.setValue("Deal 3",20);
        objDataset.setValue("Deal 4",13);
        objDataset.setValue("Deal 5",7);
        
         JFreeChart objChart = ChartFactory.createPieChart (
         "",   //Chart title
         objDataset,          //Chart Data 
         true,               // include legend?
         true,               // include tooltips?
         false               // include URLs?
         );
         
         
         panel_deals.setLayout(new java.awt.BorderLayout());
         panel_clients.setLayout(new java.awt.BorderLayout());
         panel_vendeurs.setLayout(new java.awt.BorderLayout());
         final ChartPanel CP = new ChartPanel(objChart);
         CP.setPreferredSize(new java.awt.Dimension(400,400));
         panel_deals.add(CP,BorderLayout.WEST);
         panel_deals.validate(); 
    
         TabbedPane.addChangeListener(new ChangeListener() {
             @Override
            public void stateChanged(ChangeEvent e) {
                if (TabbedPane.getSelectedIndex() == 0)
                 {
                    ComboBox.removeAllItems();
                    ComboBox.addItem("Best Deal");
                    ComboBox.addItem("Le plus recent");
                    ComboBox.addItem("Le plus consulté");
                    
                    objDataset.clear();
                    objDataset.setValue("Deal 1",35);
                    objDataset.setValue("Deal 2",25);
                    objDataset.setValue("Deal 3",20);
                    objDataset.setValue("Deal 4",13);
                    objDataset.setValue("Deal 5",7);
                    
                    panel_deals.add(CP,BorderLayout.WEST);
                    panel_deals.validate(); 
                    
                 }
                else if (TabbedPane.getSelectedIndex() == 1)
                 {
                    ComboBox.removeAllItems();
                    ComboBox.addItem("Best Vendeur");
                    
                    objDataset.clear();
                    objDataset.setValue("Vendeur 1",60);
                    objDataset.setValue("Vendeur 2",20);
                    objDataset.setValue("Vendeur 3",10);
                    objDataset.setValue("Vendeur 4",5);
                    objDataset.setValue("Vendeur 5",5);
                    
                    panel_vendeurs.add(CP,BorderLayout.WEST);
                    panel_vendeurs.validate(); 
                     
                 }
                else if (TabbedPane.getSelectedIndex() == 2)
                 {
                    ComboBox.removeAllItems();
                    ComboBox.addItem("Best Clients");
                     
                    objDataset.clear();
                    objDataset.setValue("Client 1",40);
                    objDataset.setValue("Client 2",20);
                    objDataset.setValue("Client 3",20);
                    objDataset.setValue("Client 4",15);
                    objDataset.setValue("Client 5",5);
                    
                    panel_clients.add(CP,BorderLayout.WEST);
                    panel_clients.validate(); 
                 }   
                
            }
             });
    }
         
        
         
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        panel_deals = new javax.swing.JPanel();
        btn_deal1 = new javax.swing.JButton();
        btn_deal2 = new javax.swing.JButton();
        btn_deal3 = new javax.swing.JButton();
        btn_deal4 = new javax.swing.JButton();
        btn_deal5 = new javax.swing.JButton();
        lbl_desc_delas = new javax.swing.JLabel();
        panel_vendeurs = new javax.swing.JPanel();
        lbl_desc_vendeurs = new javax.swing.JLabel();
        btn_vendeurs1 = new javax.swing.JButton();
        btn_vendeurs2 = new javax.swing.JButton();
        btn_vendeurs3 = new javax.swing.JButton();
        btn_vendeurs4 = new javax.swing.JButton();
        btn_vendeurs5 = new javax.swing.JButton();
        panel_clients = new javax.swing.JPanel();
        lbl_desc_clients = new javax.swing.JLabel();
        btn_clients1 = new javax.swing.JButton();
        btn_clients2 = new javax.swing.JButton();
        btn_clients3 = new javax.swing.JButton();
        btn_clients4 = new javax.swing.JButton();
        btn_clients5 = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox();
        txt_rechercher = new javax.swing.JTextField();
        lbl_heure = new javax.swing.JLabel();
        lbl_date1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_deal1.setBackground(new java.awt.Color(255, 51, 51));

        btn_deal2.setBackground(new java.awt.Color(0, 0, 255));
        btn_deal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal2ActionPerformed(evt);
            }
        });

        btn_deal3.setBackground(new java.awt.Color(0, 255, 0));

        btn_deal4.setBackground(new java.awt.Color(255, 255, 0));

        btn_deal5.setBackground(new java.awt.Color(255, 0, 255));

        lbl_desc_delas.setText("Description :");
        lbl_desc_delas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel_dealsLayout = new javax.swing.GroupLayout(panel_deals);
        panel_deals.setLayout(panel_dealsLayout);
        panel_dealsLayout.setHorizontalGroup(
            panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dealsLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addGroup(panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deal2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deal3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deal4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deal5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lbl_desc_delas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        panel_dealsLayout.setVerticalGroup(
            panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dealsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_desc_delas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dealsLayout.createSequentialGroup()
                        .addComponent(btn_deal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deal2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deal3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deal4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_deal5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Deals", panel_deals);

        lbl_desc_vendeurs.setText("Description :");
        lbl_desc_vendeurs.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_vendeurs1.setBackground(new java.awt.Color(0, 255, 255));

        btn_vendeurs2.setBackground(new java.awt.Color(255, 204, 204));

        btn_vendeurs3.setBackground(new java.awt.Color(102, 102, 102));

        btn_vendeurs4.setBackground(new java.awt.Color(153, 0, 0));

        btn_vendeurs5.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout panel_vendeursLayout = new javax.swing.GroupLayout(panel_vendeurs);
        panel_vendeurs.setLayout(panel_vendeursLayout);
        panel_vendeursLayout.setHorizontalGroup(
            panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_vendeursLayout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addGroup(panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_vendeurs1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vendeurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vendeurs3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vendeurs4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vendeurs5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lbl_desc_vendeurs, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panel_vendeursLayout.setVerticalGroup(
            panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vendeursLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_vendeursLayout.createSequentialGroup()
                        .addComponent(btn_vendeurs1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vendeurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vendeurs3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vendeurs4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_vendeurs5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_desc_vendeurs, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Vendeurs", panel_vendeurs);

        lbl_desc_clients.setText("Description :");
        lbl_desc_clients.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_clients1.setBackground(new java.awt.Color(255, 204, 0));

        btn_clients2.setBackground(new java.awt.Color(51, 153, 0));

        btn_clients3.setBackground(new java.awt.Color(204, 0, 204));

        btn_clients4.setBackground(new java.awt.Color(0, 153, 153));

        btn_clients5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_clientsLayout = new javax.swing.GroupLayout(panel_clients);
        panel_clients.setLayout(panel_clientsLayout);
        panel_clientsLayout.setHorizontalGroup(
            panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clientsLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_clients1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_clientsLayout.createSequentialGroup()
                        .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clientsLayout.createSequentialGroup()
                                .addComponent(btn_clients2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(panel_clientsLayout.createSequentialGroup()
                                .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_clients3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_clients4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_clients5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lbl_desc_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        panel_clientsLayout.setVerticalGroup(
            panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clientsLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_desc_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_clientsLayout.createSequentialGroup()
                        .addComponent(btn_clients2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clients1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clients3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clients4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clients5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        TabbedPane.addTab("Clients", panel_clients);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Best Deal", "Le plus recent", "Le plus consulté\t" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        txt_rechercher.setText("Rechercher ...");

        lbl_heure.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbl_date1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(lbl_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txt_rechercher))
                .addGap(18, 18, 18)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void btn_deal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deal2ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JPanel Panel;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btn_clients1;
    private javax.swing.JButton btn_clients2;
    private javax.swing.JButton btn_clients3;
    private javax.swing.JButton btn_clients4;
    private javax.swing.JButton btn_clients5;
    private javax.swing.JButton btn_deal1;
    private javax.swing.JButton btn_deal2;
    private javax.swing.JButton btn_deal3;
    private javax.swing.JButton btn_deal4;
    private javax.swing.JButton btn_deal5;
    private javax.swing.JButton btn_vendeurs1;
    private javax.swing.JButton btn_vendeurs2;
    private javax.swing.JButton btn_vendeurs3;
    private javax.swing.JButton btn_vendeurs4;
    private javax.swing.JButton btn_vendeurs5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel lbl_date1;
    private javax.swing.JLabel lbl_desc_clients;
    private javax.swing.JLabel lbl_desc_delas;
    private javax.swing.JLabel lbl_desc_vendeurs;
    private javax.swing.JLabel lbl_heure;
    private javax.swing.JPanel panel_clients;
    private javax.swing.JPanel panel_deals;
    private javax.swing.JPanel panel_vendeurs;
    private javax.swing.JTextField txt_rechercher;
    // End of variables declaration//GEN-END:variables
}
