/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eandalin
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(924, 621);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProduct_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        cboCategory = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText(" Product ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        txtProductID.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(txtProductID);
        txtProductID.setBounds(193, 14, 337, 35);

        txtProduct_Name.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(txtProduct_Name);
        txtProduct_Name.setBounds(193, 61, 337, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Categery");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 108, 167, 35);

        txtPrice.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(txtPrice);
        txtPrice.setBounds(193, 155, 337, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 155, 167, 35);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 200, 167, 35);

        txtAmount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(txtAmount);
        txtAmount.setBounds(190, 200, 337, 35);

        cboCategory.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Botle", "Can" }));
        jPanel1.add(cboCategory);
        cboCategory.setBounds(200, 110, 330, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbAccount.setFont(new java.awt.Font("Khmer OS System", 1, 15)); // NOI18N
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Categery", "Price", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccount.getTableHeader().setReorderingAllowed(false);
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccount);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 880, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        txtSearch.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(txtSearch);
        txtSearch.setBounds(190, 10, 337, 35);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(10, 50, 140, 30);

        btnNew.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel3.add(btnNew);
        btnNew.setBounds(10, 10, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked
        /*
        if(evt.getClickCount()==2){
            int index=tbAccount.getSelectedRow();
            //while(mode.getRowCount()>0)
            txtID.setText(tbAccount.getValueAt(index, 0).toString());
            txtName.setText(tbAccount.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbAccount.getValueAt(index,2).toString());
            txtPosition.setText(tbAccount.getValueAt(index,3).toString());
            txtEmail.setText(tbAccount.getValueAt(index,4).toString());
            txtPassword.setText(tbAccount.getValueAt(index,5).toString());
            txtID.setEnabled(true);
            txtName.setEnabled(true);
            cboGender.setEnabled(true);
            txtPosition.setEnabled(true);
            txtEmail.setEnabled(true);
            txtPassword.setEnabled(true);
            btnDelete.setEnabled(true);
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));

        }*/
    }//GEN-LAST:event_tbAccountMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        /*
        try{
            int index=tbAccount.getSelectedRow();
            int id=Integer.parseInt(tbAccount.getValueAt(index,0).toString());
            stm=con.createStatement();
            stm.execute("delete from account where ID="+id);
            showData();
            btnDelete.setEnabled(false);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            clearData();

        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }*/
    }//GEN-LAST:event_btnDeleteActionPerformed
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    public void show(){
        try{
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbAccount.getModel();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from product ");
            
            if(rst.first()){
                do{
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)
                    });
                }while(rst.next());
            }
        }catch(Exception e){}
        
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        try{
            stm=con.createStatement();
            stm.execute("insert into product valeues('"+Integer.parseInt(txtProductID.getText().trim())
                +"','"+txtProduct_Name.getText().trim()
                +"','"+cboCategory.getSelectedItem()
                +"','"+txtPrice.getText().trim()
                +"','"+txtAmount.getText().trim()+"')");
            show();
        }catch(Exception e){}
        /*if(btnNew.getText().equals("New")){
            txtID.setEnabled(true);
            txtName.setEnabled(true);
            cboGender.setEnabled(true);
            txtPosition.setEnabled(true);
            txtEmail.setEnabled(true);
            txtPassword.setEnabled(true);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
        }
        else if(btnNew.getText().equals("Save")){
            //saveData("inertAcount");
            try{
                stm=con.createStatement();
                stm.execute("insert into account values('"+Integer.parseInt(txtID.getText().trim())
                    +"','"+txtName.getText().trim()
                    +"','"+cboGender.getSelectedItem()
                    +"','"+txtPosition.getText().trim()
                    +"','"+txtEmail.getText().trim()
                    +"','"+txtPassword.getText().trim()+"')");

                showData();
                clearData();
            }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e);}
            //JOptionPane.showMessageDialog(this,"Was Saved");
        }
        else{
            try{
                int index=tbAccount.getSelectedRow();
                int id = Integer.parseInt(tbAccount.getValueAt(index,0).toString());
                stm=con.createStatement();
                stm.execute("update account set Nam='"+txtName.getText().trim()
                    +"',Gender='"+cboGender.getSelectedItem()
                    +"',Position='"+txtPosition.getText().trim()
                    +"',Email='"+txtEmail.getText().trim()
                    +"',Password='"+txtPassword.getText().trim()
                    +"'where ID="+id);
                showData();
                btnNew.setText("Update");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                clearData();
            }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
        }
        */
    }//GEN-LAST:event_btnNewActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProduct_Name;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
