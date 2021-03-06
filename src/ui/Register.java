/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dal.Database;
import factory.View;
import factory.ViewFactory;
import javax.swing.JPanel;
import virtaulclassroom.IChangeView;

/**
 *
 * @author sagar
 */
public class Register extends javax.swing.JPanel{

    /**
     * Creates new form Register
     */
    
    IChangeView parent;
    Database db;
    
    public Register() {
        initComponents();
    }
    
    public Register (IChangeView frame){
        this();
        parent = frame;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.ButtonGroup();
        LoginHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LoginBody = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        userIdLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        selectCourseLabel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 137, 212));

        LoginHeader.setBackground(new java.awt.Color(33, 137, 212));
        LoginHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Registration");
        LoginHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 290, 59));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/group_52px_1.png"))); // NOI18N
        LoginHeader.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        LoginBody.setBackground(new java.awt.Color(33, 137, 212));
        LoginBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Full Name");
        LoginBody.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 76, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Password");
        LoginBody.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 173, -1, -1));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextField1.setInputVerifier(new validation.FullNameVerifier());
        LoginBody.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 68, 352, 30));

        jPasswordField1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LoginBody.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 213, 352, 30));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(33, 137, 212));
        jButton1.setText("Register");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginBody.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 380, 150, 44));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Already have an Account? Login");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        LoginBody.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 461, 261, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("I am a");
        LoginBody.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 23, -1, -1));

        userType.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jRadioButton1.setForeground(java.awt.Color.white);
        jRadioButton1.setText("Faculty");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        LoginBody.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 20, -1, -1));

        userType.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jRadioButton2.setForeground(java.awt.Color.white);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Student");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        LoginBody.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Confirm Password");
        LoginBody.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 221, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LoginBody.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 165, 352, 30));

        userIdLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userIdLabel.setForeground(java.awt.Color.white);
        userIdLabel.setText("University Roll no.");
        LoginBody.add(userIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 124, -1, -1));

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextField2.setInputVerifier(new validation.PhoneNumberVerifier());
        LoginBody.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 261, 352, 30));

        courseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        courseLabel.setForeground(java.awt.Color.white);
        courseLabel.setText("Course");
        LoginBody.add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 318, -1, -1));

        selectCourseLabel.setBackground(java.awt.Color.white);
        selectCourseLabel.setForeground(java.awt.Color.white);
        selectCourseLabel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Any One", "Bachelor of Technology", "Polytechnic", "Bachelor of Computers" }));
        LoginBody.add(selectCourseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 309, 246, 34));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Phone Number");
        LoginBody.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 269, -1, -1));

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LoginBody.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 116, 352, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LoginBody, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBody, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         parent.requestView(ViewFactory.getView(parent, View.Login));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        courseLabel.hide();
        selectCourseLabel.hide();
        userIdLabel.setText ("Faculty Id no.");
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        courseLabel.show();
        selectCourseLabel.show();
        userIdLabel.setText ("University Roll no.");
    }//GEN-LAST:event_jRadioButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginBody;
    private javax.swing.JPanel LoginHeader;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> selectCourseLabel;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.ButtonGroup userType;
    // End of variables declaration//GEN-END:variables

    
}
