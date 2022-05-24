package views;

import controllers.interfaceListeners.InsertNewDepartmentActionListener;
import models.Department;

import javax.swing.*;


public class AddNewDepartment extends javax.swing.JFrame {

    /**
     * Creates new form AddNewDepartment
     */
    private InsertNewDepartmentActionListener insertNewDepartmentActionListener;
    private boolean isDisposed = false;

    public AddNewDepartment(InsertNewDepartmentActionListener insertNewDepartmentActionListener) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.insertNewDepartmentActionListener = insertNewDepartmentActionListener;
    }


    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        textNameDerpartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        buttonAddDerpatment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescriptionDerpartment = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(5, 5, 78));
        jTextArea2.setRows(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(218, 15, 23), 2, true));

        textNameDerpartment.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        textNameDerpartment.setForeground(new java.awt.Color(5, 5, 78));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 5, 78));
        jLabel5.setText("Name  :  ");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 5, 78));
        jLabel9.setText("Description :");

        cancel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(5, 5, 78));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        buttonAddDerpatment.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        buttonAddDerpatment.setForeground(new java.awt.Color(5, 5, 78));
        buttonAddDerpatment.setText("Add new Department");
        buttonAddDerpatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDerpatmentActionPerformed(evt);
            }
        });

        textDescriptionDerpartment.setColumns(20);
        textDescriptionDerpartment.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        textDescriptionDerpartment.setForeground(new java.awt.Color(5, 5, 78));
        textDescriptionDerpartment.setRows(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textDescriptionDerpartment, org.jdesktop.beansbinding.ELProperty.create("true"), textDescriptionDerpartment, org.jdesktop.beansbinding.BeanProperty.create("lineWrap"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textDescriptionDerpartment, org.jdesktop.beansbinding.ELProperty.create("true"), textDescriptionDerpartment, org.jdesktop.beansbinding.BeanProperty.create("wrapStyleWord"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(textDescriptionDerpartment);

        jLabel16.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(218, 15, 23));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jLabel16.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addComponent(textNameDerpartment, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonAddDerpatment, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNameDerpartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddDerpatment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void buttonAddDerpatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDerpatmentActionPerformed
        try {
            if (!(textNameDerpartment.getText().equals("") || textDescriptionDerpartment.getText().equals(""))) {
                String title = textNameDerpartment.getText();
                String description = textDescriptionDerpartment.getText();
                Department department = new Department(title, description);

                boolean SuccessesAddedDepartment =  insertNewDepartmentActionListener.insertNewDepartmentListener(department);

                if (! SuccessesAddedDepartment ) {
                    throw new Exception("Sorry : Added Department Fail !!!");
                }

                JOptionPane.showMessageDialog(this, "Added Department successfully.");

            } else {
                throw new Exception("Watch out !!\n" + "You can not leave behind an empty field");
            }

            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Watch out !!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAddDerpatmentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddDerpatment;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea textDescriptionDerpartment;
    private javax.swing.JTextField textNameDerpartment;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        isDisposed = true;
        super.dispose();
    }

    public boolean disposed() {
        return isDisposed;
    }
}
