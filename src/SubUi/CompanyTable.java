
package SubUi;
import GUI.Company;

public class CompanyTable extends javax.swing.JPanel {

    private Company company;
    public void setParent(Company company){
      this.company=company;
    }
   
    public CompanyTable() {
        initComponents();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        index = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        hotline = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 54));
        setMinimumSize(new java.awt.Dimension(761, 54));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(761, 54));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(761, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(761, 49));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        index.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        index.setText("1");

        cname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cname.setText("jLabel2");

        hotline.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hotline.setText("jLabel3");

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cname, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hotline, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index)
                    .addComponent(cname)
                    .addComponent(hotline)
                    .addComponent(date))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        if(evt.getClickCount()==2){
        
        this.company.setFields(cname.getText(),hotline.getText());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cname;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hotline;
    private javax.swing.JLabel index;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public String getCname() {
        return cname.getText();
    }

    public void setCname(String value) {
        cname.setText(value);
    }

    public void setDate(String value) {
        date.setText(value);
    }

    public String getHotline() {
        return hotline.getText();
    }

    public void setHotline(String value) {
       hotline.setText(value);
    }

    public String getIndex() {
        return index.getText();
    }

    public void setIndex(String value) {
        index.setText(value);
    }
}
