/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProductManagement;

import javax.swing.JPanel;
import model.ProductManagement.Product;
import model.ProductManagement.ProductSummary;
import model.Supplier.Supplier;

/**
 *
 * @author KAILASH
 */
public class ManageProductPerformanceDetail extends javax.swing.JPanel {

    
    JPanel CardSequencePanel;
    Supplier selectedsupplier;
    Product selectedproduct;
    /**
     * Creates new form ManageProductPerformanceDetail
     */
    public ManageProductPerformanceDetail(Product product, JPanel jp) {
        CardSequencePanel = jp;
        this.selectedproduct = product;
        initComponents();
        refreshTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        productFrequencyAboveTargetTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productRevenueTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productFrequencyBelowTargetTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productPricePerformanceTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Product Performance Summary");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 550, -1));

        jLabel3.setText("Product name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        productNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTextFieldActionPerformed(evt);
            }
        });
        add(productNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));
        add(productFrequencyAboveTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jLabel4.setText("Frequency Above Target");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, -1));

        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });
        add(productRevenueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        jLabel5.setText("Sales Revenues");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, -1));
        add(productFrequencyBelowTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 150, -1));

        jLabel6.setText("Frequency Below Target");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 150, -1));

        productPricePerformanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPricePerformanceTextFieldActionPerformed(evt);
            }
        });
        add(productPricePerformanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        jLabel7.setText("Marign around target");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_BackActionPerformed

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void productPricePerformanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField productFrequencyAboveTargetTextField;
    private javax.swing.JTextField productFrequencyBelowTargetTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productPricePerformanceTextField;
    private javax.swing.JTextField productRevenueTextField;
    // End of variables declaration//GEN-END:variables

    public void refreshTable() {

       
        ProductSummary productsummary = new ProductSummary(selectedproduct);

        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText( String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText( String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));

    }
}
