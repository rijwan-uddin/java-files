

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Mframe11 extends javax.swing.JFrame {
         int result;
    /**
     * Creates new form Mframe11
     */
    public Mframe11() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MedicineName = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MediQuantityTextField = new javax.swing.JTextField();
        MediPriceTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TotalTakaTextField = new javax.swing.JTextField();
        ResetButton3 = new javax.swing.JButton();
        EmployeeInfojButton3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CustomerOwner = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Medicine Price");

        MedicineName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicineName.setMaximumRowCount(18);
        MedicineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Napa", "Parasitamol", "Rynozel", "Sergel", "Emap", "Seklo", "Cavic c", "Ternila", "Azithromycin", "Vicodin", "Lisinopril", "Lipitor", "Amoxicillin", "Simvastatin" }));
        MedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Medicine name");

        MediQuantityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MediQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediQuantityTextFieldActionPerformed(evt);
            }
        });

        MediPriceTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MediPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Medicine quantity");

        jLabel4.setText(" X");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Show Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Total Price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TotalTakaTextField.setEditable(false);
        TotalTakaTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ResetButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton3.setText("Reset");
        ResetButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton3ActionPerformed(evt);
            }
        });

        EmployeeInfojButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EmployeeInfojButton3.setText("Employee Info");
        EmployeeInfojButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeInfojButton3ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("Place Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("Store Information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Online medical store");

        CustomerOwner.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        CustomerOwner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Owner" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MediQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MediPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalTakaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeInfojButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalTakaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(ResetButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(CustomerOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeInfojButton3)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MediPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediPriceTextFieldActionPerformed

    private void MediQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediQuantityTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String a = MedicineName.getItemAt(MedicineName.getSelectedIndex());
      if(a.equals("Napa")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 10 Taka");
      } 
       else if(a.equals("Parasitamol")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 5 Taka");}
      else if(a.equals("Rynozel")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 4 Taka");}
       else if(a.equals("Sergel")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 6 Taka");}
       else if(a.equals("Emap")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 8 Taka");}
       else if(a.equals("Seklo")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 6 Taka");}
       else if(a.equals("Cavic c")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 11 Taka");}
       else if(a.equals("Ternila")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 15 Taka");} 
      else if(a.equals("Azithromycin")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 20 Taka");}
      else if(a.equals("Vicodin")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 25 Taka");}
       else if(a.equals("Lisinopril")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 30 Taka");}
       else if(a.equals("Lipitor")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 35 Taka");}
       else if(a.equals("Amoxicillin")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 40 Taka");}
       else if(a.equals("Simvastatin")){
     JOptionPane.showMessageDialog(this, "Medicine Price is 45 Taka");}
      
      // TODO add your handling code here: Sergel, Emap, Seklo, Cavic c, Ternila
      //Azithromycin, Vicodin, Lisinopril, Lipitor, Amoxicillin, Simvastatin
    }//GEN-LAST:event_jButton1ActionPerformed
       
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int MQ1=0;
     try{   
     MQ1 =Integer.parseInt(MediQuantityTextField.getText());
     }catch(NumberFormatException e){
     JOptionPane.showMessageDialog(this,"Wrong Input");
     }
      int MP2=Integer.parseInt(MediPriceTextField.getText());    
      TotalPrice c1=new TotalPrice(MQ1,MP2);
      result=c1.price();
      saveprice();
     TotalTakaTextField.setText(String.valueOf(result));        
        


// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    void saveprice(){
    try{
          File f = new File("CalculationPrice.txt");
          FileWriter fw = new FileWriter(f,true);
          fw.write(String.valueOf(result));
          fw.write("\r\n");
          fw.close();
      }
      catch (Exception e)
      {
           JOptionPane.showMessageDialog(this,"File not found");
      }
    
    }
    
    private void ResetButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton3ActionPerformed
         MediQuantityTextField.setText(null);
         MediPriceTextField.setText(null); 
         TotalTakaTextField.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButton3ActionPerformed

    private void EmployeeInfojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeInfojButton3ActionPerformed
      String a = CustomerOwner.getItemAt(CustomerOwner.getSelectedIndex());   
      if(a.equals("Customer")){
     JOptionPane.showMessageDialog(this, "Sorry///Customer can not enter in this section");
      } 
       else if(a.equals("Owner")){
     JOptionPane.showMessageDialog(this, "Welcome to the employee info section");
       Frame2 f2=new Frame2();
       f2.setVisible(true);
       dispose();
      
       }  
        
        
                  
    }//GEN-LAST:event_EmployeeInfojButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      M08frame f08=new M08frame();
      f08.setVisible(true);
      dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     Mframe4 f4=new Mframe4();
      f4.setVisible(true);
         dispose();        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Mframe11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mframe11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mframe11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mframe11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mframe11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CustomerOwner;
    private javax.swing.JButton EmployeeInfojButton3;
    private javax.swing.JTextField MediPriceTextField;
    private javax.swing.JTextField MediQuantityTextField;
    private javax.swing.JComboBox<String> MedicineName;
    private javax.swing.JButton ResetButton3;
    private javax.swing.JTextField TotalTakaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
