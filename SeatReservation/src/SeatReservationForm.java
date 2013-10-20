/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Philip
 */
public class SeatReservationForm extends javax.swing.JFrame {

    /**
     * Creates new form SeatReservationForm
     */
    public SeatReservationForm() {
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
        classInput = new javax.swing.JTextField();
        classSubmitButton = new javax.swing.JButton();
        airplaneImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seatOutput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        classOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to the NHCC Airline seat reservation system");

        jLabel2.setText("Please enter 1 for first class or 2 for economy");

        classInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classInputActionPerformed(evt);
            }
        });

        classSubmitButton.setText("Submit");
        classSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classSubmitButtonActionPerformed(evt);
            }
        });

        airplaneImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images[3].jpg"))); // NOI18N

        jLabel4.setText("Your seat number is:");

        seatOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatOutputActionPerformed(evt);
            }
        });

        jLabel5.setText("The class you selected is:");

        classOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classInput)
                            .addComponent(classSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(airplaneImage)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(seatOutput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(classInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classSubmitButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(airplaneImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(seatOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(classOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classOutputActionPerformed

    private void classSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classSubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classSubmitButtonActionPerformed

    private void classInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classInputActionPerformed

    private void seatOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatOutputActionPerformed

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
            java.util.logging.Logger.getLogger(SeatReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatReservationForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplaneImage;
    private javax.swing.JTextField classInput;
    private javax.swing.JTextField classOutput;
    private javax.swing.JButton classSubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField seatOutput;
    // End of variables declaration//GEN-END:variables
}