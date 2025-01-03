/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Supplier;

import java.awt.CardLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.Supplier.Supplier;

/**
 *
 * @author akshayrajchevala
 */
public class AdjustTargetPriceLowerJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private Supplier supplier;
     

    public AdjustTargetPriceLowerJPanel(JPanel upc, Supplier supplier) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = supplier;
        populateTable();
    }

    private void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) tblProductsBelowTarget.getModel();
//    model.setRowCount(0); // Clear existing rows
//
//    // Iterate through supplier's product list
//    for (Product product : supplier.getProductCatalog().getProductList()) {
//        ProductSummary summary = new ProductSummary(product);
//
//        // Check if the product's sales are below target
//        if (summary.getNumberBelowTarget() > 0) {
//            Object[] row = new Object[4];
//            row[0] = product.getProductName();
////            row[1] = summary.getNumberAboveTarget();
//            row[2] = summary.getNumberBelowTarget();
//            row[3] = product.getTargetPrice(); // Original target price
//
//            model.addRow(row);
//        }
//    }
DefaultTableModel model = (DefaultTableModel) tblProductsBelowTarget.getModel();
    model.setRowCount(0); // Clear existing rows

    // Iterate through supplier's product list
    for (Product product : supplier.getProductCatalog().getProductList()) {
        int belowTargetSales = product.getNumberOfProductSalesBelowTarget();

        // Check if the product's sales are below target
        if (belowTargetSales > 0) {
            Object[] row = new Object[3];
            row[0] = product.getName();
            row[1] = belowTargetSales; // Number of sales below target
            row[2] = product.getTargetPrice(); // Original target price

            model.addRow(row);
        }
    }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductsBelowTarget = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDecrease = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblProductsBelowTarget.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Below Target", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblProductsBelowTarget);

        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDecrease.setText("Apply Decrease");
        btnDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecreaseActionPerformed(evt);
            }
        });

        jLabel1.setText("Adjust Target Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnBack)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecrease)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDecrease)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecreaseActionPerformed
       DefaultTableModel model = (DefaultTableModel) tblProductsBelowTarget.getModel();

    // Iterate through each row in the table
    for (int i = 0; i < model.getRowCount(); i++) {
        Product product = supplier.getProductCatalog().getProductList().get(i); // Find product by index
        double currentPrice = product.getTargetPrice();
        double newPrice = currentPrice * 0.90; // Reduce price by 10%

        // Round to 2 decimal places
        BigDecimal roundedPrice = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);

        // Update product's target price
        product.setTargetPrice((int) roundedPrice.doubleValue());

        // Update the table with the new price
        model.setValueAt(roundedPrice.doubleValue(), i, 2);
    }
    JOptionPane.showMessageDialog(this, "Prices have been decreased by 10% for below-target products.");
    }//GEN-LAST:event_btnDecreaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecrease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductsBelowTarget;
    // End of variables declaration//GEN-END:variables
}
