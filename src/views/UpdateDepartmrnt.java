package views;

import controllers.interfaceListeners.UpdateDepartmentActionListener;

import javax.swing.*;

import dao.DepartmentDAO;
import model.Department;


public class UpdateDepartmrnt extends javax.swing.JFrame {

    /**
     * Creates new form UpdataDepartmrnt
     */
    private UpdateDepartmentActionListener updateDepartmentActionListener;
    private Department department; 
    private boolean isDisposed = false;
    
    public UpdateDepartmrnt(Department department, UpdateDepartmentActionListener updateDepartmentActionListener) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.department = department;
        textNameDerpartment.setText(department.getName());
        textDescriptionDerpartment.setText(department.getDescription());
    }


    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        textNameDerpartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonUpdata = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescriptionDerpartment = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 15, 23), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(579, 550));

        textNameDerpartment.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        textNameDerpartment.setForeground(new java.awt.Color(5, 5, 78));
        
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 5, 78));
        jLabel5.setText("Name  :  ");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 5, 78));
        jLabel9.setText("Description :");

        buttonUpdata.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        buttonUpdata.setForeground(new java.awt.Color(5, 5, 78));
        buttonUpdata.setText("Update Department");
        buttonUpdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdataActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(5, 5, 78));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
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
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonUpdata, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(10, 10, 10)
                            .addComponent(textNameDerpartment)
                            .addGap(102, 102, 102))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(431, 431, 431))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNameDerpartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdata, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>                        

    private void buttonUpdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdataActionPerformed
        try {
            if ((textNameDerpartment.getText().equals("") || textDescriptionDerpartment.getText().equals(""))) {
                throw new Exception("Watch out !!\n" + "You can not leave behind an empty field");
            }

            String title = textNameDerpartment.getText();
            String description = textDescriptionDerpartment.getText();
            Department de = new Department(department.getId(),title, description);

            if (DepartmentDAO.update(de)) {
                JOptionPane.showMessageDialog(this, "Updating Department successfully");
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Watch out !!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonUpdataActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonUpdata;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
