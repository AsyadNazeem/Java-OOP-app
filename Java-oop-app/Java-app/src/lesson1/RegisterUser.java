package lesson1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import lesson1.HRManager;

public class RegisterUser extends javax.swing.JFrame {

    File myFile;
    public RegisterUser() {
        try{
               myFile = new File ("D:\\myFile\\register details.txt");
               
               if (myFile.createNewFile())
               {
                   System.out.println("File Created: " + myFile.getName());
               }
               else
               {
                   System.out.println("File already exist");
                 
               }
                }
                catch (IOException e) {
                    System.out.println("An error occurred." +e);
                  
                }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        txtConformPass = new javax.swing.JPasswordField();
        btnAlreadyHaveAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Conform Password");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("User Type");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Register");

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "HR Manager", "HR Assistent" }));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnAlreadyHaveAccount.setText("Already Have an Account");
        btnAlreadyHaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlreadyHaveAccountActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnRegister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAlreadyHaveAccount))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserName)
                                .addComponent(txtPassword)
                                .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConformPass, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConformPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlreadyHaveAccount)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       boolean valid =true;
       if ( txtUserName.getText().isEmpty () ||
               txtPassword.getText().isEmpty()|| 
               txtConformPass.getText().isEmpty() ||
               cmbUserType.getSelectedItem().toString().isEmpty())
       
       {
           JOptionPane.showInternalMessageDialog(null," field cannot be blank "," Register form ",
           JOptionPane.ERROR_MESSAGE); 
           valid = false;
       }
       
       else
       {
           if(txtPassword.getText().length() < 8)
           {
              JOptionPane.showInternalMessageDialog(null ,"password must have 8 characters","Register form",
              JOptionPane.ERROR_MESSAGE );
               valid = false;
           }
           
           else if (!txtPassword.getText().equals(txtConformPass.getText()))
           {
               JOptionPane.showInternalMessageDialog(null,"Password and conform password should match","Register form",
                       JOptionPane.ERROR_MESSAGE);
               valid = false;
           }
       }
         
       if (valid)
       {
           String UserName = txtUserName.getText();
           String Password = txtPassword.getText();
           String UserType = cmbUserType.getSelectedItem() .toString();
           String Record = null;
           Record = UserName + " " + Password + " " + UserType ;
           
           try 
           {
               FileWriter writer = new FileWriter(myFile,true);
               BufferedWriter buffer = new BufferedWriter (writer);
               
               myFile.canWrite();
               buffer.write(Record);
               buffer.newLine();
               buffer.close();
               
               System.out.println("successfullt wrote to the file");
               writer.close();
           }
           catch (IOException e){
               System.out.println("An erroer occurred. " + e);
           }
       

       }   
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnAlreadyHaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlreadyHaveAccountActionPerformed
       login obj = new login();
                   obj.show();
                   this.dispose();
       
    }//GEN-LAST:event_btnAlreadyHaveAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        Admin obj = new Admin();
                    obj.show();
                    this.dispose();
       
    }//GEN-LAST:event_btnBackActionPerformed


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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlreadyHaveAccount;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConformPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
