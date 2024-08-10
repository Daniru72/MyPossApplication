
package SubUi;

import GUI.Customer;


public class CustomerTable extends javax.swing.JPanel {

    private Customer customer;
    public void setParent(Customer customer){
    
        this.customer=customer;
    }
  
    public CustomerTable() {
        initComponents();
    }

    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        index = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 55));
        setMinimumSize(new java.awt.Dimension(766, 55));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(766, 55));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(729, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(729, 49));

        index.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        index.setText("1");
        index.setMaximumSize(null);
        index.setMinimumSize(new java.awt.Dimension(41, 22));
        index.setPreferredSize(new java.awt.Dimension(41, 22));

        fname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fname.setText("jLabel2");
        fname.setMaximumSize(null);
        fname.setMinimumSize(new java.awt.Dimension(162, 19));
        fname.setPreferredSize(new java.awt.Dimension(162, 19));

        lname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname.setText("jLabel3");
        lname.setMaximumSize(null);
        lname.setMinimumSize(new java.awt.Dimension(167, 19));
        lname.setPreferredSize(new java.awt.Dimension(167, 19));

        mobile.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mobile.setText("jLabel4");
        mobile.setMaximumSize(null);
        mobile.setMinimumSize(new java.awt.Dimension(145, 19));
        mobile.setPreferredSize(new java.awt.Dimension(145, 19));

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setText("jLabel5");
        date.setMaximumSize(null);
        date.setMinimumSize(new java.awt.Dimension(208, 19));
        date.setPreferredSize(new java.awt.Dimension(208, 19));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(index, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        if(evt.getClickCount()==2){
        
           this.customer.setFeilds(mobile.getText(),fname.getText(),lname.getText());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel index;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mobile;
    // End of variables declaration//GEN-END:variables

    

    public void setDate(String value) {
       date.setText(value);
    }

   

    public void setFname(String value) {
       fname.setText(value);
    }

   public String getFname() {
        return fname.getText();
    }

    public void setIndex(String value) {
        index.setText(value);
    }



    public void setLname(String value) {
        lname.setText(value);
    }

   public String getLname() {
        return lname.getText();
    }

    public void setMobile(String value) {
        mobile.setText(value);
    }
    
    public String getMobile() {
        return mobile.getText();
    }
    
}
