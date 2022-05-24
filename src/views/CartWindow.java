package views;

import controllers.interfaceListeners.ConfirmOrderActionListener;
import controllers.interfaceListeners.RemoveProductActionListener;
import controllers.viewsControllers.CartCheckoutWindowController;
import controllers.viewsControllers.CartWindowController;
import models.Order;
import models.OrderDetails;
import models.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.UUID;


public class CartWindow extends javax.swing.JFrame {

    private GridBagLayout layout = new GridBagLayout();
    private PanelCart panelCart;
    private String customarID;
    private CartCheckoutWindow checkoutWindow;
    private boolean isDisposed = false;
    ArrayList<Product> products = null;


    public CartWindow(String customerID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.customarID = customerID;
        getCart();
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ptc = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel7.setPreferredSize(new java.awt.Dimension(987, 100));

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(5, 5, 78));
        jLabel18.setText("Total amount Price of Items in cart is");

        ptc.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ptc.setForeground(new java.awt.Color(5, 5, 78));
        ptc.setText("Proceed To Checkout");
        ptc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptcjButton12ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(5, 5, 78));
        jLabel19.setText("\"\"");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(ptc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(178, 178, 178))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(218, 15, 23));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jLabel16.setToolTipText("");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ptcjButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptcjButton12ActionPerformed
        if (!(checkoutWindow != null && checkoutWindow.isVisible())) {
            checkoutWindow = new CartCheckoutWindow(customarID, new ConfirmOrderActionListener() {
                @Override
                public void ConfirmOrderListener(String address) {

                    // TODO : "CartWindow class" generate order id (order_id,customarID,,address) and insert orders_done
                    // TODO : "CartWindow class" insert for each product with order_id into table orders
                    // TODO : "CartWindow class" update products info in shop 
                    // TODO : "CartWindow class" clear customer's cart
                    // call Functions from controllers "the controller define above"

                    UUID  id = UUID.randomUUID();

                    Order order = new Order(String.valueOf(id),customarID,address,"",1000);
                    CartWindowController.insertOrder(order);

                    for (Product product : products) {
                        OrderDetails orderDetails = new OrderDetails(String.valueOf(id),product.getId(),product.getPrice(),product.getQuantity());
                        CartWindowController.insertOrderDetails(orderDetails);
                        CartWindowController.update(product.getQuantity(),product.getId());
                        CartWindowController.clear(product.getId());
                    }

                    JOptionPane.showMessageDialog(CartWindow.this, "Your order id submit successfully \n Thank you !!");
                    CartWindow.this.dispose();

                }
            });
            checkoutWindow.setVisible(true);
        }
    }//GEN-LAST:event_ptcjButton12ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if ((checkoutWindow == null || checkoutWindow.disposed())) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ptc;
    // End of variables declaration//GEN-END:variables

    public void getCart() {
        jPanel1.removeAll();
        jPanel1.validate();
        jPanel1.repaint();

        products = CartCheckoutWindowController.getCarBytCustomerId(customarID);

        int counter = 0;
        for (Product product : products) {
            panelCart = new PanelCart(product, new RemoveProductActionListener() {
                @Override
                public void removeProductListener(Product product) {
                    CartWindowController.clear(product.getId());
                    getCart();
                }
            });

            jPanel1.setLayout(layout);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 340 * counter;

            jPanel1.add(panelCart, gbc);

            counter++;
        }

        double sum =0;
        for (Product p: products) {
            sum += p.getPrice();
        }
        jLabel19.setText("" + sum + " $");
    }

    @Override
    public void dispose() {
        isDisposed = true;
        super.dispose();
    }

    public boolean disposed() {
        return isDisposed;
    }
}
