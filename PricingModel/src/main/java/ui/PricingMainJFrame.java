/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.MarketingManagement.MarketingPersonProfile;
import model.Personnel.EmployeeProfile;
import model.Personnel.Profile;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import ui.AdminRole.AdminWorkAreaJPanel;
import ui.workSpaceProfiles.BusinessManagerWorkAreaJPanel;
import ui.workSpaceProfiles.MarketingManagerWorkAreaJPanel;
import ui.workSpaceProfiles.SalesPersonWorkAreaJPanel;

/**
 *
 * @author KAILASH
 */
public class PricingMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PricingMainJFrame
     */
    Business business;
    
    SupplierDirectory supplierDirectory;
    
    public PricingMainJFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        supplierDirectory = business.getSupplierDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnMarketing = new javax.swing.JButton();
        CardSequencePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actionsidejpanel.setBackground(new java.awt.Color(185, 0, 20));

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSupplier.setText("Supplier");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnMarketing.setText("Marketing");
        btnMarketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarketingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsidejpanelLayout = new javax.swing.GroupLayout(actionsidejpanel);
        actionsidejpanel.setLayout(actionsidejpanelLayout);
        actionsidejpanelLayout.setHorizontalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionsidejpanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin))
                    .addGroup(actionsidejpanelLayout.createSequentialGroup()
                        .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnSupplier))
                            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMarketing)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        actionsidejpanelLayout.setVerticalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnAdmin)
                .addGap(54, 54, 54)
                .addComponent(btnSupplier)
                .addGap(49, 49, 49)
                .addComponent(btnMarketing)
                .addContainerGap(436, Short.MAX_VALUE))
        );

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setBackground(new java.awt.Color(241, 252, 249));
        CardSequencePanel.setLayout(new java.awt.CardLayout());
        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 3, 1030, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(CardSequencePanel, supplierDirectory);
        CardSequencePanel.add("AdminWorkAreaJPanel",awajp);
        CardLayout layout = (CardLayout)CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnMarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarketingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarketingActionPerformed

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
            java.util.logging.Logger.getLogger(PricingMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PricingMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PricingMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PricingMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricingMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnMarketing;
    private javax.swing.JButton btnSupplier;
    // End of variables declaration//GEN-END:variables
}
