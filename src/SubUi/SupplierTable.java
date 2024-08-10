
package SubUi;
import GUI.RootLayout;
import GUI.Supplier;

public class SupplierTable extends javax.swing.JPanel {

    private Supplier supplier;
    public void setParent(Supplier supplier){
    
        this.supplier = supplier;
    }
   
    public SupplierTable() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        index = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        moblie = new javax.swing.JLabel();
        company = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 60));
        setMinimumSize(new java.awt.Dimension(1101, 60));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1101, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1101, 54));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        index.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        index.setText("1");
        index.setMaximumSize(null);
        index.setMinimumSize(new java.awt.Dimension(41, 19));
        index.setPreferredSize(new java.awt.Dimension(41, 19));

        fname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fname.setText("jLabel2");
        fname.setMaximumSize(null);
        fname.setMinimumSize(new java.awt.Dimension(167, 19));
        fname.setPreferredSize(new java.awt.Dimension(167, 19));

        lname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname.setText("jLabel3");
        lname.setMaximumSize(null);
        lname.setMinimumSize(new java.awt.Dimension(176, 19));
        lname.setPreferredSize(new java.awt.Dimension(176, 19));

        moblie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        moblie.setText("jLabel4");
        moblie.setMaximumSize(null);
        moblie.setMinimumSize(new java.awt.Dimension(143, 19));
        moblie.setPreferredSize(new java.awt.Dimension(143, 19));

        company.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        company.setText("jLabel5");
        company.setMaximumSize(null);
        company.setMinimumSize(new java.awt.Dimension(208, 19));
        company.setPreferredSize(new java.awt.Dimension(208, 19));

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setText("jLabel6");
        date.setMaximumSize(null);
        date.setMinimumSize(new java.awt.Dimension(166, 19));
        date.setPreferredSize(new java.awt.Dimension(166, 19));

        gender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gender.setText("jLabel7");
        gender.setMaximumSize(null);
        gender.setMinimumSize(new java.awt.Dimension(69, 19));
        gender.setPreferredSize(new java.awt.Dimension(69, 19));

        status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        status.setText("jLabel8");
        status.setMaximumSize(null);
        status.setMinimumSize(new java.awt.Dimension(64, 19));
        status.setPreferredSize(new java.awt.Dimension(64, 19));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moblie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moblie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

 if(evt.getClickCount()==2){
        
        UpdateSupplierDialogBox updateSupplier = new UpdateSupplierDialogBox(new RootLayout(), true, moblie.getText());
        updateSupplier.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel company;
    private javax.swing.JLabel date;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel index;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel moblie;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

   

    public String getCompany() {
        return company.getText();
    }

    public void setCompany(String value) {
        company.setText(value);
    }

    public void setDate(String value) {
        date.setText(value);
    }

    public String getFname() {
        return fname.getText();
    }

    public void setFname(String value) {
        fname.setText(value);
    }

    public String getGender() {
        return gender.getText();
    }

    public void setGender(String value) {
        gender.setText(value);
    }

    public void setIndex(String value) {
       index.setText(value);
    }

    public String getLname() {
        return lname.getText();
    }

    public void setLname(String value) {
        lname.setText(value);
    }

    public String getMoblie() {
        return moblie.getText();
    }

    public void setMoblie(String value) {
        moblie.setText(value);
    }

    public String getStatus() {
        return status.getText();
    }

    public void setStatus(String value) {
        status.setText(value);
    }
}
