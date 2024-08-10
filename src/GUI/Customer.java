/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Model.MySQL;
import SubUi.CustomerTable;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author danir
 */
public class Customer extends javax.swing.JPanel {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        
        kButton2.setEnabled(false);
       loadCustomers("SELECT * FROM `customer` ORDER BY `cus_registered_date` DESC");
    }

        private void reSet(){
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            kButton2.setEnabled(false);
            kButton1.setEnabled(true);
            jTextField1.setEnabled(true);
         
        }
        
        
  
    private boolean validation(){
        
       boolean valide = false;
       String mobile = jTextField1.getText();
       String fname = jTextField2.getText();
       String lname = jTextField3.getText();
       
       if(!mobile.matches("^07[1,2,4,5,6,7,8,0][0-9]{7}$")){
          JOptionPane.showMessageDialog(this, "Invalide Mobile Number","Warning",JOptionPane.WARNING_MESSAGE);
       }else if(fname.isBlank()){
          JOptionPane.showMessageDialog(this, "Enter First Name","Warning",JOptionPane.WARNING_MESSAGE);
       }else if(!fname.matches("[a-zA-Z]+")){
           JOptionPane.showMessageDialog(this, "First Name must contain only letters", "Warning", JOptionPane.WARNING_MESSAGE);
           // Validate first name for being non-blank and alphabetic only
           
       }else if(lname.isBlank()){
          JOptionPane.showMessageDialog(this, "Enter Last Name","Warning",JOptionPane.WARNING_MESSAGE);
       }else if(!lname.matches("[a-zA-Z]+")){
           JOptionPane.showMessageDialog(this, "First Name must contain only letters", "Warning", JOptionPane.WARNING_MESSAGE);
           // Validate last name for being non-blank and alphabetic only
       }else{
       
       valide = true;
       
       }
       
      return valide;
               
    }
    
    
    private void loadCustomers(String query){
       customerTableScroll.removeAll();
        try {
            ResultSet resultset = MySQL.execute(query);
            int count = 0;
            
            while(resultset.next()){
               count++;
               CustomerTable cTable = new CustomerTable();
               cTable.setParent(this);
               cTable.setIndex(String.valueOf(count));
               cTable.setFname(resultset.getString("cus_fname"));
               cTable.setLname(resultset.getString("cus_lname"));
               cTable.setMobile(resultset.getString("cus_mobile"));
               cTable.setDate(resultset.getString("cus_registered_date"));
               
               customerTableScroll.add(cTable);
            }
            
            jLabel15.setText("  Customers ("+String.valueOf(count)+")");
             SwingUtilities.updateComponentTreeUI(customerTableScroll);
//            customerTableScroll.repaint();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    
    }
    
    
    public void setFeilds(String mobile,String fname,String lname){
        
        kButton2.setEnabled(true);
        jTextField1.setText(mobile);
        jTextField2.setText(fname);
        jTextField3.setText(lname);
        kButton1.setEnabled(false);
        jTextField1.setEnabled(false);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        customerTableScroll = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1113, 779));
        setPreferredSize(new java.awt.Dimension(1113, 779));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 4, 126));
        kGradientPanel1.setkGradientFocus(400);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(725, 31));
        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("   Customers (12)");
        jPanel1.add(jLabel15, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Customer Registration");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("&");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Search");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Mobile");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Last Name");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        kButton1.setText("Add");
        kButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 0, 102));
        kButton1.setkStartColor(new java.awt.Color(0, 51, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Update");
        kButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(102, 0, 102));
        kButton2.setkStartColor(new java.awt.Color(0, 51, 153));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Clear");
        kButton3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton3.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(102, 0, 102));
        kButton3.setkStartColor(new java.awt.Color(0, 51, 153));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setText("Print Report");
        kButton4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        kButton4.setkEndColor(new java.awt.Color(255, 102, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(204, 51, 0));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(153, 0, 0));
        kButton4.setkStartColor(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(61, 61, 61))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(766, 42));
        jPanel3.setPreferredSize(new java.awt.Dimension(766, 42));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("#");
        jLabel10.setMaximumSize(null);
        jLabel10.setMinimumSize(new java.awt.Dimension(41, 22));
        jLabel10.setPreferredSize(new java.awt.Dimension(41, 22));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("First Name");
        jLabel11.setMaximumSize(null);
        jLabel11.setMinimumSize(new java.awt.Dimension(162, 19));
        jLabel11.setPreferredSize(new java.awt.Dimension(162, 19));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Last Name");
        jLabel12.setMaximumSize(null);
        jLabel12.setMinimumSize(new java.awt.Dimension(167, 19));
        jLabel12.setPreferredSize(new java.awt.Dimension(167, 19));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Mobile");
        jLabel13.setMaximumSize(null);
        jLabel13.setMinimumSize(new java.awt.Dimension(145, 19));
        jLabel13.setPreferredSize(new java.awt.Dimension(145, 19));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Registered Date");
        jLabel14.setMaximumSize(null);
        jLabel14.setMinimumSize(new java.awt.Dimension(208, 19));
        jLabel14.setPreferredSize(new java.awt.Dimension(208, 19));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jPanel4.setMinimumSize(new java.awt.Dimension(731, 672));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(731, 672));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(731, 672));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(731, 672));

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 4, 126));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(731, 672));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(731, 672));

        customerTableScroll.setMinimumSize(new java.awt.Dimension(731, 672));
        customerTableScroll.setOpaque(false);
        customerTableScroll.setPreferredSize(new java.awt.Dimension(731, 672));
        customerTableScroll.setLayout(new javax.swing.BoxLayout(customerTableScroll, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(kGradientPanel2);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

      boolean v = validation();
      
      if(v){
       String mobile = jTextField1.getText();
       String fname = jTextField2.getText();
       String lname = jTextField3.getText();
       
          try {
              
               ResultSet resultSet = MySQL.execute("SELECT * FROM `customer` WHERE `cus_mobile`='"+mobile+"' OR `cus_fname`= '"+fname+"' AND `cus_lname`= '"+lname+"'");
            if(resultSet.next()){
            
            JOptionPane.showMessageDialog(this, "Customer already registered", "Warning", JOptionPane.WARNING_MESSAGE);
            
            }else{
             
                Date dateTime = new Date();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm;ss");
               
            
            MySQL.execute("INSERT INTO `customer` (`cus_mobile`,`cus_fname`,`cus_lname`,`cus_registered_date`)"
                    + " VALUES('"+mobile+"','"+fname+"','"+lname+"','"+format.format(dateTime)+"')");
            
            JOptionPane.showMessageDialog(this, "Registered Successfull", "Success", JOptionPane.OK_OPTION);
            
            reSet();
            loadCustomers("SELECT * FROM `customer` ORDER BY `cus_registered_date` DESC");
            
            }
              
          } catch (Exception e) {
              e.printStackTrace();
          }
      
      }


        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed

reSet();
 loadCustomers("SELECT * FROM `customer` ORDER BY `cus_registered_date` DESC");

        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed


        boolean v = validation();
      
      if(v){
       String mobile = jTextField1.getText();
       String fname = jTextField2.getText();
       String lname = jTextField3.getText();
       
          try {
              
              ResultSet resultSet = MySQL.execute("SELECT * FROM `customer` WHERE `cus_mobile` = '"+mobile+"' AND `cus_fname`= '"+fname+"' AND `cus_lname`= '"+lname+"'");
              
              if(resultSet.next()){
                JOptionPane.showMessageDialog(this, "Customer already registered", "Warning", JOptionPane.WARNING_MESSAGE);
                
              }else{
              
                MySQL.execute("UPDATE `customer` SET `cus_fname`='"+fname+"' ,`cus_lname`='"+lname+"' WHERE `cus_mobile`='"+mobile+"'");
                
                 JOptionPane.showMessageDialog(this, "Update Successfull", "Success", JOptionPane.OK_OPTION);
                
                  reSet();
                 loadCustomers("SELECT * FROM `customer` ORDER BY `cus_registered_date` DESC");
              
              }
              
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        String mobile = jTextField1.getText();
        
        loadCustomers("SELECT * FROM `customer` WHERE `cus_mobile` LIKE '"+mobile+"%'");

        reSet();
        jTextField1.setText(mobile);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customerTableScroll;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
