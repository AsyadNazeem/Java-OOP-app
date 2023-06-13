package lesson1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import lesson1.HRManager;


/**
 *
 * @author Abdul
 */
public class departments_sesignations extends javax.swing.JFrame {
    File myFile;
    public departments_sesignations() {
         try { 
       myFile = new File ("D:\\myFile\\EmployeeDetails.txt");
        
       if (myFile.createNewFile())
       {
           System.out.println("File creted: " + myFile.getName());
       }
       else
       {
           System.out.println("File already exists.");
       } 
        }

         catch (IOException e){
             System.err.println("An error occurred creatig file "+e);
         }
          initComponents();
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEPFId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmbDep = new javax.swing.JComboBox<>();
        btn1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EPF Id");

        txtEPFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPFIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee Name ");

        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel4.setText("Department");

        cmbDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR", "MARKETING", "IT", "FINANCE" }));
        cmbDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepActionPerformed(evt);
            }
        });

        btn1.setText("Submit");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(cmbDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEPFId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn1)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEPFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void txtEPFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPFIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEPFIdActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void cmbDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        try
        {
            boolean valid=true;
            if(txtEPFId.getText().isEmpty()||
                    txtEmployeeName.getText().isEmpty()||
                    txtAddress.getText().isEmpty()||
                    cmbDep.getSelectedItem().toString().isEmpty())
            
            {
 JOptionPane.showMessageDialog(null,"Field can't be blank",
         "Student form",JOptionPane.ERROR_MESSAGE);
         valid=false;
            }
           
            if(valid)
            {
     
        String EPFId = txtEPFId.getText();
        String EmployeeName = txtEmployeeName.getText();
        String Address = txtAddress.getText();
        
        String Department = cmbDep.getSelectedItem().toString();
        String Record = EPFId +" "+EmployeeName+" "+Address+" "+Department; 
        
        FileWriter writer = new FileWriter(myFile,true);
        BufferedWriter buffer = new BufferedWriter (writer);
              
        if(checkIdAvailability())
        {
         
            JOptionPane.showMessageDialog(rootPane, "it is already available",
                    "student form",JOptionPane.ERROR_MESSAGE);
           
        }
        else 
        {
         buffer.write(Record);
         buffer.newLine();
         buffer.close();
         writer.close();
         
         JOptionPane.showMessageDialog(rootPane,"successfully wrote to the file "); 
        }
       }  
            
    }//GEN-LAST:event_btn1ActionPerformed

                catch (IOException e) {
        System.out.println("An error occurred saving values" +e);
    }
    }
        
    public boolean checkIdAvailability()
    {
         boolean idFound=false;
     try
               {
         String[]words=null;
         FileReader fileR = new FileReader(myFile);
         BufferedReader br = new BufferedReader (fileR);
         String FindLine;
         String input=txtEPFId.getText();
         
         while ((FindLine=br.readLine())!=null)
         {
             words=FindLine.split(" "); 
             for (String word : words)
             {
                 if (word.equals(input))
                 {
                 idFound=true;
                 }
         }
    }
         fileR.close();
         br.close();
             }
     catch (Exception e) {
         System.out.println("An error occurred."+e);
     }
     return idFound;
    }
            
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        HRManager obj=new HRManager();
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
            java.util.logging.Logger.getLogger(departments_sesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(departments_sesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(departments_sesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(departments_sesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departments_sesignations().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbDep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEPFId;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables

    private void setEPFId(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEmployeeName(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDepartment(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAddress(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
