package lesson1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.BufferedReader;



public class login extends javax.swing.JFrame {
File myFile;


    public login() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnDontHaveAccount = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Password");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnDontHaveAccount.setText("Don't Have an Account");
        btnDontHaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDontHaveAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassword))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnDontHaveAccount)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDontHaveAccount)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
        
        boolean valid = true ;
          if ( txtUserName.getText().isEmpty()|| txtPassword.getText()
                  .isEmpty())
                  {
                      JOptionPane.showMessageDialog(null,
                              "text field cannot be empty","Login form",
                              JOptionPane.ERROR_MESSAGE);
                      valid = false;
                  }
        if(valid)
        {
         String username = txtUserName.getText();
         String password = txtPassword.getText();
            
        
         FileReader fr = new FileReader (myFile);
         BufferedReader br = new BufferedReader (fr);
         
         String line, user, pass , usertype ;
         
         boolean isLoginSuccess = false;
         while ((line = br.readLine()) !=null)
         {
             user=line.split(" ")[0];
             pass=line.split(" ")[1];
             usertype=line.split(" ")[2];
              System.out.println(user);
              System.out.println(pass);
              
              if (user.equals(username) && pass.equals (password))
              {
                  isLoginSuccess = true;
                  JOptionPane.showInternalMessageDialog(null,
                          "Login successfull" + usertype);
                  
                  if (usertype.equals("HR Manager"))
                  {
                      HRManager obj=new HRManager();
                      obj.show();
                      this.dispose();
                  }
                  else if (usertype.equals("Admin"))
                  {
                      Admin obj=new Admin();
                      obj.show();
                      this.dispose();
                  }
                  else if (usertype.equals("HRAssistent"))
                  {
                      HRAssistent obj=new HRAssistent();
                      obj.show();
                      this.dispose();
                  }
              }
              
         }
         
         if (!isLoginSuccess){
             JOptionPane.showInternalMessageDialog(null,"USERNAME OR PASSWORD IS INCORRECT ","WARNING!!",
                     JOptionPane.WARNING_MESSAGE );
           
         }
         fr.close();
         br.close();
       
         }
      }
        catch(Exception e){
            JOptionPane.showInternalMessageDialog(null,"error validating login","Login foem",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDontHaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDontHaveAccountActionPerformed
  
        RegisterUser obj = new RegisterUser();
                           obj.show();
                           this.dispose();
        
    }//GEN-LAST:event_btnDontHaveAccountActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDontHaveAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
