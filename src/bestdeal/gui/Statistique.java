/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.gui;

import bestdeal.dao.VoucherDAO;
import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.TextTitle;
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
        
        lbl_log.setIcon((Icon) new ImageIcon("C:\\Users\\Jedidi\\Desktop\\Logo_.png"));
               
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        lbl_date1.setText(sdf1.format(new java.util.Date()));
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        lbl_heure.setText(sdf2.format(new java.util.Date()));
        
        
        final DefaultPieDataset objDataset = new DefaultPieDataset();
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();
        
         objDataset.setValue(stat[0][0],Integer.parseInt(stat[9][0]));
         objDataset.setValue(stat[0][1],Integer.parseInt(stat[9][1]));
         objDataset.setValue(stat[0][2],Integer.parseInt(stat[9][2]));
         objDataset.setValue(stat[0][3],Integer.parseInt(stat[9][3]));
         objDataset.setValue(stat[0][4],Integer.parseInt(stat[9][4]));
                 
         JFreeChart objChart = ChartFactory.createPieChart3D("Best 5 deals", objDataset, true, true, true);
         //String textTitle = "Best 5 deals";
         TextTitle textTitle = objChart.getTitle() ;
         textTitle.setFont(new Font("Arial", Font.BOLD, 15));
         
         
         panel_deals.setLayout(new java.awt.BorderLayout());
         panel_clients.setLayout(new java.awt.BorderLayout());
         panel_vendeurs.setLayout(new java.awt.BorderLayout());
         final ChartPanel CP = new ChartPanel(objChart);
         CP.setPreferredSize(new java.awt.Dimension(600,500));
         panel_deals.add(CP,BorderLayout.WEST);
         panel_deals.validate(); 
    
         TabbedPane.addChangeListener(new ChangeListener() {
             @Override
            public void stateChanged(ChangeEvent e) {
                if (TabbedPane.getSelectedIndex() == 0)
                 {
                                       
                  objDataset.clear();
                  VoucherDAO v2 = new VoucherDAO();
            String [][] stat = v2.StatDeal();
        
            objDataset.setValue(stat[0][0],Integer.parseInt(stat[9][0]));
         objDataset.setValue(stat[0][1],Integer.parseInt(stat[9][1]));
         objDataset.setValue(stat[0][2],Integer.parseInt(stat[9][2]));
         objDataset.setValue(stat[0][3],Integer.parseInt(stat[9][3]));
         objDataset.setValue(stat[0][4],Integer.parseInt(stat[9][4]));
                                
                    panel_deals.add(CP,BorderLayout.WEST);
                    panel_deals.validate(); 
                    
                 }
                else if (TabbedPane.getSelectedIndex() == 1)
                 {
                   
                      objDataset.clear();
                  VoucherDAO v2 = new VoucherDAO();
            String [][] stat = v2.StatVendeur();
        
            objDataset.setValue(stat[1][0],Integer.parseInt(stat[7][0]));
            objDataset.setValue(stat[1][1],Integer.parseInt(stat[7][1]));
            objDataset.setValue(stat[1][2],Integer.parseInt(stat[7][2]));
            objDataset.setValue(stat[1][3],Integer.parseInt(stat[7][3]));
            objDataset.setValue(stat[1][4],Integer.parseInt(stat[7][4]));
            
                    panel_vendeurs.add(CP,BorderLayout.WEST);
                    panel_vendeurs.validate(); 
                     
                 }
                else if (TabbedPane.getSelectedIndex() == 2)
                 {
                    
                    objDataset.clear();
                    VoucherDAO v2 = new VoucherDAO();
                    String [][] stat = v2.StatClient();
        
            objDataset.setValue(stat[1][0],Integer.parseInt(stat[4][0]));
            objDataset.setValue(stat[1][1],Integer.parseInt(stat[4][1]));
            objDataset.setValue(stat[1][2],Integer.parseInt(stat[4][2]));
            objDataset.setValue(stat[1][3],Integer.parseInt(stat[4][3]));
            objDataset.setValue(stat[1][4],Integer.parseInt(stat[4][4]));
            
                    panel_clients.add(CP,BorderLayout.WEST);
                    panel_clients.validate(); 
                 }
                else if (TabbedPane.getSelectedIndex() == 3)
                 {
                
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_deal = new javax.swing.JTextArea();
        panel_vendeurs = new javax.swing.JPanel();
        btn_vendeurs1 = new javax.swing.JButton();
        btn_vendeurs2 = new javax.swing.JButton();
        btn_vendeurs3 = new javax.swing.JButton();
        btn_vendeurs4 = new javax.swing.JButton();
        btn_vendeurs5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_vendeur = new javax.swing.JTextArea();
        panel_clients = new javax.swing.JPanel();
        btn_clients1 = new javax.swing.JButton();
        btn_clients2 = new javax.swing.JButton();
        btn_clients3 = new javax.swing.JButton();
        btn_clients4 = new javax.swing.JButton();
        btn_clients5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarea_client = new javax.swing.JTextArea();
        lbl_heure = new javax.swing.JLabel();
        lbl_date1 = new javax.swing.JLabel();
        lbl_log = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistiques");

        TabbedPane.setFont(new java.awt.Font("Utsaah", 1, 18)); // NOI18N

        btn_deal1.setBackground(new java.awt.Color(255, 51, 51));
        btn_deal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal1ActionPerformed(evt);
            }
        });

        btn_deal2.setBackground(new java.awt.Color(0, 0, 255));
        btn_deal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal2ActionPerformed(evt);
            }
        });

        btn_deal3.setBackground(new java.awt.Color(0, 255, 0));
        btn_deal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal3ActionPerformed(evt);
            }
        });

        btn_deal4.setBackground(new java.awt.Color(255, 255, 0));
        btn_deal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal4ActionPerformed(evt);
            }
        });

        btn_deal5.setBackground(new java.awt.Color(255, 0, 255));
        btn_deal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deal5ActionPerformed(evt);
            }
        });

        txtarea_deal.setColumns(20);
        txtarea_deal.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtarea_deal.setRows(5);
        txtarea_deal.setEnabled(false);
        txtarea_deal.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane1.setViewportView(txtarea_deal);

        javax.swing.GroupLayout panel_dealsLayout = new javax.swing.GroupLayout(panel_deals);
        panel_deals.setLayout(panel_dealsLayout);
        panel_dealsLayout.setHorizontalGroup(
            panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dealsLayout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addGroup(panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_deal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deal5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel_dealsLayout.setVerticalGroup(
            panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dealsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dealsLayout.createSequentialGroup()
                        .addComponent(btn_deal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_deal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_deal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(panel_dealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dealsLayout.createSequentialGroup()
                                .addComponent(btn_deal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addComponent(btn_deal5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        TabbedPane.addTab("Deals", panel_deals);

        btn_vendeurs1.setBackground(new java.awt.Color(0, 255, 255));
        btn_vendeurs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendeurs1ActionPerformed(evt);
            }
        });

        btn_vendeurs2.setBackground(new java.awt.Color(255, 204, 204));
        btn_vendeurs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendeurs2ActionPerformed(evt);
            }
        });

        btn_vendeurs3.setBackground(new java.awt.Color(102, 102, 102));
        btn_vendeurs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendeurs3ActionPerformed(evt);
            }
        });

        btn_vendeurs4.setBackground(new java.awt.Color(153, 0, 0));
        btn_vendeurs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendeurs4ActionPerformed(evt);
            }
        });

        btn_vendeurs5.setBackground(new java.awt.Color(0, 0, 153));
        btn_vendeurs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendeurs5ActionPerformed(evt);
            }
        });

        txtarea_vendeur.setColumns(20);
        txtarea_vendeur.setRows(5);
        txtarea_vendeur.setEnabled(false);
        txtarea_vendeur.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane2.setViewportView(txtarea_vendeur);

        javax.swing.GroupLayout panel_vendeursLayout = new javax.swing.GroupLayout(panel_vendeurs);
        panel_vendeurs.setLayout(panel_vendeursLayout);
        panel_vendeursLayout.setHorizontalGroup(
            panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_vendeursLayout.createSequentialGroup()
                .addContainerGap(723, Short.MAX_VALUE)
                .addGroup(panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_vendeurs2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_vendeurs1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_vendeurs3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_vendeurs4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_vendeurs5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(93, 93, 93)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel_vendeursLayout.setVerticalGroup(
            panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_vendeursLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_vendeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_vendeursLayout.createSequentialGroup()
                        .addComponent(btn_vendeurs1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_vendeurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_vendeurs3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_vendeurs4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_vendeurs5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        TabbedPane.addTab("Vendeurs", panel_vendeurs);

        btn_clients1.setBackground(new java.awt.Color(255, 204, 0));
        btn_clients1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clients1ActionPerformed(evt);
            }
        });

        btn_clients2.setBackground(new java.awt.Color(51, 153, 0));
        btn_clients2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clients2ActionPerformed(evt);
            }
        });

        btn_clients3.setBackground(new java.awt.Color(204, 0, 204));
        btn_clients3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clients3ActionPerformed(evt);
            }
        });

        btn_clients4.setBackground(new java.awt.Color(0, 153, 153));
        btn_clients4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clients4ActionPerformed(evt);
            }
        });

        btn_clients5.setBackground(new java.awt.Color(0, 0, 0));
        btn_clients5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clients5ActionPerformed(evt);
            }
        });

        txtarea_client.setColumns(20);
        txtarea_client.setRows(5);
        txtarea_client.setEnabled(false);
        txtarea_client.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane3.setViewportView(txtarea_client);

        javax.swing.GroupLayout panel_clientsLayout = new javax.swing.GroupLayout(panel_clients);
        panel_clients.setLayout(panel_clientsLayout);
        panel_clientsLayout.setHorizontalGroup(
            panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientsLayout.createSequentialGroup()
                .addContainerGap(726, Short.MAX_VALUE)
                .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clients2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clients1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clients3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clients4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clients5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel_clientsLayout.setVerticalGroup(
            panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clientsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(panel_clientsLayout.createSequentialGroup()
                        .addComponent(btn_clients2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_clients1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_clients3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btn_clients4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_clients5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        TabbedPane.addTab("Clients", panel_clients);

        lbl_heure.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbl_date1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Get Yours Now !!!");

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(lbl_log, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(lbl_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_log, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      
    private void btn_deal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal2ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();   
        txtarea_deal.setText("Id deal :"+ stat[8][1]+" \nNom deal : "+ stat[0][1] +" \nDescription : "+ stat[1][1] +" \n \n \n \nPrix : "+ stat[2][1] +"\nRemise : "+ stat[3][1] +"\nQuantité : "+ stat[4][1] +"\nDate début : "+ stat[5][1] +"\nDate fin : "+ stat[6][1] +"\nNote :"+ stat[7][1] +"");
    }//GEN-LAST:event_btn_deal2ActionPerformed

    private void btn_deal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal1ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();   
        txtarea_deal.setText("Id deal :"+ stat[8][0]+" \nNom deal : "+ stat[0][0] +" \nDescription : "+ stat[1][0] +" \n \n \n \nPrix : "+ stat[2][0] +"\nRemise : "+ stat[3][0] +"\nQuantité : "+ stat[4][0] +"\nDate début : "+ stat[5][0] +"\nDate fin : "+ stat[6][0] +"\nNote :"+ stat[7][0] +"");
    }//GEN-LAST:event_btn_deal1ActionPerformed

    private void btn_deal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal3ActionPerformed
         VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();   
        txtarea_deal.setText("Id deal :"+ stat[8][2]+" \nNom deal : "+ stat[0][2] +" \nDescription : "+ stat[1][2] +" \n \n \n \nPrix : "+ stat[2][2] +"\nRemise : "+ stat[3][2] +"\nQuantité : "+ stat[4][2] +"\nDate début : "+ stat[5][2] +"\nDate fin : "+ stat[6][2] +"\nNote :"+ stat[7][2] +""); 
    }//GEN-LAST:event_btn_deal3ActionPerformed

    private void btn_deal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal4ActionPerformed
         VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();   
        txtarea_deal.setText("Id deal :"+ stat[8][3]+" \nNom deal : "+ stat[0][3] +" \nDescription : "+ stat[1][3] +" \n \n \n \nPrix : "+ stat[2][3] +"\nRemise : "+ stat[3][3] +"\nQuantité : "+ stat[4][3] +"\nDate début : "+ stat[5][3] +"\nDate fin : "+ stat[6][3] +"\nNote :"+ stat[7][3] +"");   
    }//GEN-LAST:event_btn_deal4ActionPerformed

    private void btn_deal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deal5ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatDeal();   
        txtarea_deal.setText("Id deal :"+ stat[8][4]+" \nNom deal : "+ stat[0][4] +" \nDescription : "+ stat[1][4] +" \n \n \n \nPrix : "+ stat[2][4] +"\nRemise : "+ stat[3][4] +"\nQuantité : "+ stat[4][4] +"\nDate début : "+ stat[5][4] +"\nDate fin : "+ stat[6][4] +"\nNote :"+ stat[7][4] +"");   
        
    }//GEN-LAST:event_btn_deal5ActionPerformed

    private void btn_vendeurs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendeurs1ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatVendeur();   
        txtarea_vendeur.setText("Id vendeur :"+ stat[0][0]+" \nNom : "+ stat[1][0] +" \nPrenom : "+ stat[2][0] +" \nAdresse : "+ stat[3][0] +"\nTelephone : "+ stat[4][0] +"\nAdresse E-mail : "+ stat[5][0] +"\nNote : "+ stat[6][0] +"");   
    }//GEN-LAST:event_btn_vendeurs1ActionPerformed

    private void btn_vendeurs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendeurs2ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatVendeur();   
        txtarea_vendeur.setText("Id vendeur :"+ stat[0][1]+" \nNom : "+ stat[1][1] +" \nPrenom : "+ stat[2][1] +" \nAdresse : "+ stat[3][1] +"\nTelephone : "+ stat[4][1] +"\nAdresse E-mail : "+ stat[5][1] +"\nNote : "+ stat[6][1] +"");   
    }//GEN-LAST:event_btn_vendeurs2ActionPerformed

    private void btn_vendeurs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendeurs3ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatVendeur();   
        txtarea_vendeur.setText("Id vendeur :"+ stat[0][2]+" \nNom : "+ stat[1][2] +" \nPrenom : "+ stat[2][2] +" \nAdresse : "+ stat[3][2] +"\nTelephone : "+ stat[4][2] +"\nAdresse E-mail : "+ stat[5][2] +"\nNote : "+ stat[6][2] +"");   
    
    }//GEN-LAST:event_btn_vendeurs3ActionPerformed

    private void btn_vendeurs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendeurs4ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatVendeur();   
        txtarea_vendeur.setText("Id vendeur :"+ stat[0][3]+" \nNom : "+ stat[1][3] +" \nPrenom : "+ stat[2][3] +" \nAdresse : "+ stat[3][3] +"\nTelephone : "+ stat[4][3] +"\nAdresse E-mail : "+ stat[5][3] +"\nNote : "+ stat[6][3] +"");   
    
    }//GEN-LAST:event_btn_vendeurs4ActionPerformed

    private void btn_vendeurs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendeurs5ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatVendeur();   
        txtarea_vendeur.setText("Id vendeur :"+ stat[0][4]+" \nNom : "+ stat[1][4] +" \nPrenom : "+ stat[2][4] +" \nAdresse : "+ stat[3][4] +"\nTelephone : "+ stat[4][4] +"\nAdresse E-mail : "+ stat[5][4] +"\nNote : "+ stat[6][4] +"");   
    
    }//GEN-LAST:event_btn_vendeurs5ActionPerformed

    private void btn_clients2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clients2ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatClient();   
        txtarea_client.setText("Id client :"+ stat[0][0]+" \nNom : "+ stat[1][0] +" \nPrenom : "+ stat[2][0] +"\nAdresse E-mail : "+ stat[3][0] +"");   
    
    }//GEN-LAST:event_btn_clients2ActionPerformed

    private void btn_clients1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clients1ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatClient();   
        txtarea_client.setText("Id client :"+ stat[0][1]+" \nNom : "+ stat[1][1] +" \nPrenom : "+ stat[2][1] +"\nAdresse E-mail : "+ stat[3][1] +"");   
    
    }//GEN-LAST:event_btn_clients1ActionPerformed

    private void btn_clients3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clients3ActionPerformed
       VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatClient();   
        txtarea_client.setText("Id client :"+ stat[0][2]+" \nNom : "+ stat[1][2] +" \nPrenom : "+ stat[2][2] +"\nAdresse E-mail : "+ stat[3][2] +"");   
    
    }//GEN-LAST:event_btn_clients3ActionPerformed

    private void btn_clients4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clients4ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatClient();   
        txtarea_client.setText("Id client :"+ stat[0][3]+" \nNom : "+ stat[1][3] +" \nPrenom : "+ stat[2][3] +"\nAdresse E-mail : "+ stat[3][3] +"");   
    
    }//GEN-LAST:event_btn_clients4ActionPerformed

    private void btn_clients5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clients5ActionPerformed
        VoucherDAO v2 = new VoucherDAO();
        String [][] stat = v2.StatClient();   
        txtarea_client.setText("Id client :"+ stat[0][4]+" \nNom : "+ stat[1][4] +" \nPrenom : "+ stat[2][4] +"\nAdresse E-mail : "+ stat[3][4] +"");   
    
    }//GEN-LAST:event_btn_clients5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_date1;
    private javax.swing.JLabel lbl_heure;
    private javax.swing.JLabel lbl_log;
    private javax.swing.JPanel panel_clients;
    private javax.swing.JPanel panel_deals;
    private javax.swing.JPanel panel_vendeurs;
    private javax.swing.JTextArea txtarea_client;
    private javax.swing.JTextArea txtarea_deal;
    private javax.swing.JTextArea txtarea_vendeur;
    // End of variables declaration//GEN-END:variables
}
