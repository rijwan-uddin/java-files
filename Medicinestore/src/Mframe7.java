
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
public class Mframe7 extends javax.swing.JFrame {

    /**
     * Creates new form Mframe7
     */
    public Mframe7() {
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
        jLabel2 = new javax.swing.JLabel();
        NumberTextField1 = new javax.swing.JTextField();
        TotalAmmountTextField2 = new javax.swing.JTextField();
        PayAmexButton1 = new javax.swing.JButton();
        BackButton2 = new javax.swing.JButton();
        PlaceOrderButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Phone Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total Ammount");

        NumberTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TotalAmmountTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PayAmexButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PayAmexButton1.setText("Pay");
        PayAmexButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayAmexButton1ActionPerformed(evt);
            }
        });

        BackButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        BackButton2.setText("Back");
        BackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2ActionPerformed(evt);
            }
        });

        PlaceOrderButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PlaceOrderButton3.setText("Place order");
        PlaceOrderButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumberTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(TotalAmmountTextField2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(PlaceOrderButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(BackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(PayAmexButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TotalAmmountTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(PayAmexButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton2)
                    .addComponent(PlaceOrderButton3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButton3ActionPerformed
    Mframe3 f3= new Mframe3();
    f3.setVisible(true);
    dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_PlaceOrderButton3ActionPerformed

    private void BackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2ActionPerformed
    Mframe5 f5= new Mframe5();
    f5.setVisible(true);
    dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_BackButton2ActionPerformed

    private void PayAmexButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayAmexButton1ActionPerformed
      String phone=NumberTextField1.getText().toString();
     String totalamount=TotalAmmountTextField2.getText().toString();
    
    
      try
      {
      FileWriter writer=new FileWriter("AmexCardPaymentDetailes.txt",true);
      writer.write(phone);
      writer.write(System.getProperty("line.separator"));
      writer.write(totalamount);
      writer.close();
      JOptionPane.showMessageDialog(null,"Payment Successful.Now place order.Please give your phone number correctly");
      /*writer.write(System.getProperty("line.separator"));
      Writer.close();
       JOptionPane.showMessageDialog(null,"success");
      setVisible(false);
      new InsertData().setVisible(true);*/
      }
     catch(Exception e)
     {
      JOptionPane.showMessageDialog(null,"Error");
     }
        


     // TODO add your handling code here:
    }//GEN-LAST:event_PayAmexButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mframe7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mframe7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mframe7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mframe7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mframe7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton2;
    private javax.swing.JTextField NumberTextField1;
    private javax.swing.JButton PayAmexButton1;
    private javax.swing.JButton PlaceOrderButton3;
    private javax.swing.JTextField TotalAmmountTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
