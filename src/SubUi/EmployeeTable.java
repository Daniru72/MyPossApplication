
package SubUi;
import GUI.Employee;
import GUI.RootLayout;

public class EmployeeTable extends javax.swing.JPanel {

    private Employee employee;
    public void setparent(Employee employee){
    
        this.employee=employee;
    }
    
    
    public EmployeeTable() {
        initComponents();
    }

    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        index = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(5066, 60));
        setMinimumSize(new java.awt.Dimension(1101, 60));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1101, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 54));
        jPanel2.setMinimumSize(new java.awt.Dimension(1101, 54));
        jPanel2.setPreferredSize(new java.awt.Dimension(1101, 54));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        index.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        index.setText("01");
        index.setMaximumSize(null);
        index.setMinimumSize(new java.awt.Dimension(47, 19));
        index.setPreferredSize(new java.awt.Dimension(47, 19));

        fname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fname.setText("jLabel2");
        fname.setMaximumSize(null);
        fname.setMinimumSize(new java.awt.Dimension(150, 19));
        fname.setPreferredSize(new java.awt.Dimension(150, 19));

        lname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname.setText("jLabel3");
        lname.setMaximumSize(null);
        lname.setMinimumSize(new java.awt.Dimension(150, 19));
        lname.setPreferredSize(new java.awt.Dimension(150, 19));

        mobile.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mobile.setText("jLabel4");
        mobile.setMaximumSize(null);
        mobile.setMinimumSize(new java.awt.Dimension(150, 19));
        mobile.setPreferredSize(new java.awt.Dimension(150, 19));

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setText("jLabel5");
        username.setMaximumSize(null);
        username.setMinimumSize(new java.awt.Dimension(150, 19));
        username.setPreferredSize(new java.awt.Dimension(150, 19));

        gender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gender.setText("jLabel6");
        gender.setMaximumSize(null);
        gender.setMinimumSize(new java.awt.Dimension(73, 19));
        gender.setPreferredSize(new java.awt.Dimension(73, 19));

        type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        type.setText("jLabel7");
        type.setMaximumSize(null);
        type.setMinimumSize(new java.awt.Dimension(94, 19));
        type.setPreferredSize(new java.awt.Dimension(94, 19));

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setText("jLabel8");
        date.setMaximumSize(null);
        date.setMinimumSize(new java.awt.Dimension(161, 19));
        date.setPreferredSize(new java.awt.Dimension(161, 19));

        status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        status.setText("jLabel8");
        status.setMaximumSize(null);
        status.setMinimumSize(new java.awt.Dimension(65, 19));
        status.setPreferredSize(new java.awt.Dimension(65, 19));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(index, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

   if(evt.getClickCount()==2){
   
   UpdateEmployeeDialogBox updateEmployee = new UpdateEmployeeDialogBox(new RootLayout() , true, mobile.getText());
   updateEmployee.setVisible(true);
   
   }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel index;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel status;
    private javax.swing.JLabel type;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    public String getDate() {
        return date.getText();
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

    public String getIndex() {
        return index.getText();
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

    public String getMobile() {
        return mobile.getText();
    }

    public void setMobile(String value) {
        mobile.setText(value);
    }

    public String getStatus() {
        return status.getText();
    }

    public void setStatus(String value) {
       status.setText(value);
    }

    public String getType() {
        return type.getText();
    }

    public void setType(String value) {
       type.setText(value);
    }

    public String getUsername() {
        return username.getText();
    }

    public void setUsername(String value) {
        username.setText(value);
    }
}
