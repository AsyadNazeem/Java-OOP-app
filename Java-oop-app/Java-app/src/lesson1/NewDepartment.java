
package lesson1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.BufferedReader;

        

public class NewDepartment extends javax.swing.JFrame {

    File myFile;
    
    public NewDepartment() {
        try { 
       myFile = new File ("D:\\myFile\\New Department.txt");
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDepartmentDiscription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtMonthlyBudget = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDepartmentId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Add New Department ");

        jLabel2.setText("Department Name");

        jLabel3.setText("Department Discription");

        txtDepartmentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentNameActionPerformed(evt);
            }
        });

        txtDepartmentDiscription.setColumns(20);
        txtDepartmentDiscription.setRows(5);
        jScrollPane1.setViewportView(txtDepartmentDiscription);

        jLabel4.setText("Monthly Budget Allocation ");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Department ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 47, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMonthlyBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonthlyBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(101, 101, 101))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartmentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentNameActionPerformed
        
    }//GEN-LAST:event_txtDepartmentNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       try {
           boolean valid = true;
           if  (txtDepartmentName.getText().isEmpty() ||
                   txtDepartmentName.getText().isEmpty() ||
                   txtDepartmentDiscription.getText().isEmpty()||
                   txtMonthlyBudget.getText().isEmpty())
           {
          
               JOptionPane.showMessageDialog(null,"Field cannot be empty","student form",JOptionPane.ERROR_MESSAGE);
               valid = false;
    
           }
           
   if (valid)
   {
       String DepartmentId = txtDepartmentId.getText();
       String DepartmentName = txtDepartmentName.getText();
       String DepartmentDiscription = txtDepartmentDiscription.getText();
       String MonthlyBudget = txtMonthlyBudget.getText();
       
       String Record = DepartmentId + " " + DepartmentName + " " + DepartmentDiscription + " " + MonthlyBudget;
       
       FileWriter writer = new FileWriter (myFile,true);
       BufferedWriter buffer = new BufferedWriter (writer);
       
       if (checkIdAvailibility())
       {
           JOptionPane.showMessageDialog(rootPane, "The Department is already available",
                   "student form",JOptionPane.ERROR_MESSAGE);
       }
       else
       {
           buffer.write(Record);
           buffer.newLine();
           buffer.close();
           writer.close();
           
           
           JOptionPane.showMessageDialog(rootPane,"successfully wrote to the file");
       }
   }
 }
       catch (IOException e) {
           System.out.println (" An error occurred savuing values " +e);
           
       }
     
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        HRManager obj = new HRManager();
                        obj.show();
                        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean checkIdAvailibility()
    {
        boolean idFound = false;
        try
        {
            String[]words=null;
            FileReader fileR= new FileReader(myFile);
            BufferedReader br = new BufferedReader (fileR);
            String FindLine;
            String input = txtDepartmentId.getText();
            
            while ((FindLine=br.readLine())!=null)
            {
                words=FindLine.split(" ");
                for (String word : words )
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
        catch (Exception e){
            System.out.println("An error occurred" );
        }
        return idFound;
    }
    
   
    public static void main(String args[]) {

      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDepartmentDiscription;
    private javax.swing.JTextField txtDepartmentId;
    private javax.swing.JTextField txtDepartmentName;
    private javax.swing.JTextField txtMonthlyBudget;
    // End of variables declaration//GEN-END:variables
}
