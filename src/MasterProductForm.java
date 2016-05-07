
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MasterProductForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form MasterProductForm
     */
    
    Koneksi kon = new Koneksi();
    Vector atas,isi;
    ResultSet rs;
    DefaultTableModel dm = new DefaultTableModel();
    int temp =0;
    File fl,f ;
    JFileChooser fc = new JFileChooser();
    //untuk menampilkan tabel
    private void tabel(){
        try{
            rs = kon.exec("SELECT * FROM MsProduct");
            isi = kon.getVec1();
            atas = new Vector();
            atas.add("Product ID");
            atas.add("Product Name");
            atas.add("Product Detail");
            atas.add("Product Price");
            atas.add("Product Stock");
            atas.add("Product Image");
            dm.setDataVector(isi,atas);
            jTable1.setModel(dm);
        }catch(Exception e){
            
        }
    }
    public MasterProductForm() {
        initComponents();
        tabel();
        normalCondition();
    }
    //kondisi form ketika pertama kali dibuka
    private void normalCondition(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jSpinner1.setValue(0);
        jButton1.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jSpinner1.setEnabled(false);
        insertBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        saveBtn.setEnabled(false);
        CancelBtn.setEnabled(false);
    }
    //kondisi form saat pertama kali meneka tombol
    private void enabledButton(){
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField6.setEnabled(true);
        jButton1.setEnabled(true);
        jSpinner1.setEnabled(true);
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        insertBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        CancelBtn.setEnabled(true);
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Master ProductForm");
        jPanel3.add(jLabel8);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setEnabled(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 150));
        jPanel4.add(jLabel9);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(789, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(775, 250));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Product");
        jPanel5.add(jLabel7);

        jPanel2.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel7.setLayout(new java.awt.GridLayout(3, 4, 3, 3));

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Product ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(76, 14));
        jPanel7.add(jLabel1);

        jTextField1.setEnabled(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(76, 14));
        jPanel7.add(jTextField1);

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Product Price");
        jPanel7.add(jLabel2);
        jPanel7.add(jTextField4);

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Product Name");
        jPanel7.add(jLabel3);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField2);

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Product Stock");
        jPanel7.add(jLabel4);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jPanel7.add(jSpinner1);

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Product Detail");
        jPanel7.add(jLabel5);
        jPanel7.add(jTextField3);

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Image");
        jPanel7.add(jLabel6);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTextField6.setText("No Image ");
        jPanel12.add(jTextField6);

        jPanel11.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 35));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Choose File");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton1);

        jPanel11.add(jPanel13);

        jPanel7.add(jPanel11);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(211, 70));
        jPanel8.setVerifyInputWhenFocusTarget(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(211, 32));

        insertBtn.setForeground(new java.awt.Color(51, 51, 255));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        jPanel9.add(insertBtn);

        updateBtn.setForeground(new java.awt.Color(51, 51, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel9.add(updateBtn);

        deleteBtn.setForeground(new java.awt.Color(51, 51, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel9.add(deleteBtn);

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(137, 15));

        saveBtn.setForeground(new java.awt.Color(51, 51, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel10.add(saveBtn);

        CancelBtn.setForeground(new java.awt.Color(51, 51, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel10.add(CancelBtn);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        temp=1;
        //mensettext field menjadi kosong
        jTextField1.setText("");
        //mensettext field menjadi kosong
        jTextField2.setText("");
        //mensettext field menjadi kosong
        jTextField3.setText("");
        //mensettext field menjadi kosong
        jTextField4.setText("");
        //mensettext field menjadi kosong
        jTextField6.setText("No Image");
        //mensetlabel image icon menjadi kosong
        jLabel9.setIcon(new ImageIcon(""));
        jSpinner1.setValue(0);
        ResultSet rs2;
        int lastId = 0;
        //menggenerate product id
        rs2 = kon.exec("SELECT * FROM MsProduct ORDER BY ProductID DESC");
        try {
            if(rs2.next()){
                lastId = Integer.parseInt(rs2.getString(1).substring(2));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterEmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        lastId++;
        String d = String.format("%03d", lastId);
        jTextField1.setText("PR"+d);
        enabledButton();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        temp=2;     
        enabledButton();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        //menkonfirmasi apakah mau mendelete atau tidak
        int dialog =JOptionPane.showConfirmDialog(rootPane, "are you sure to delete "+jTextField1.getText(),"delete",JOptionPane.YES_NO_OPTION);
        if(dialog ==JOptionPane.YES_OPTION){
            //mendelete query
            kon.Update("DELETE FROM MsProduct WHERE ProductID = '"+jTextField1.getText()+"'");
            tabel();
        }
        normalCondition();

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        boolean coba = false;
       //mengecek apakah product price ada huruf atau tidak
       for(int h = 0;h<jTextField4.getText().length();h++){
            if(Character.isDigit(jTextField4.getText().charAt(h))){
                coba =true;
            }else{
                coba = false;
                 if(!coba){
                    break;
                }
            }
        }
       //melakukan validasi semua jtextfield telah terisi
       if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField6.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "All text fields must be filled.", "error",JOptionPane.ERROR_MESSAGE);         

       }else{
           //validasi product stock harus lebih dari 0
            if(jSpinner1.getValue().equals(0)){
                 JOptionPane.showMessageDialog(rootPane, "Product Stock must be greater than 0.", "error",JOptionPane.ERROR_MESSAGE); 
            //validasi apakah product price ada huruf atau tidak
            }else if(coba == false){
                 JOptionPane.showMessageDialog(rootPane, "Product Price must be numeric.", "error",JOptionPane.ERROR_MESSAGE);         
            }else{
                  if(temp==1){
                     int a = Integer.parseInt(jTextField4.getText());
                     //menginsert query
                     kon.Update("insert into MsProduct (ProductID, ProductName, ProductDetail, ProductPrice, Stock, Image) values ('"+jTextField1.getText()+"', '"+jTextField2.getText()+"', '"+jTextField3.getText()+"', '"+a+"', '"+jSpinner1.getValue()+"', '"+jTextField6.getText()+"')");
                     tabel();
                 }else if(temp==2){
                     int a = Integer.parseInt(jTextField4.getText());
                     //mengupdate query
                     kon.Update("UPDATE MsProduct SET ProductName = '"+jTextField2.getText()+"',ProductDetail = '"+jTextField3.getText()+"',ProductPrice ='"+a+"',Stock = '"+jSpinner1.getValue()+"',Image = '"+jTextField6.getText()+"' WHERE ProductID = '"+jTextField1.getText()+"'");
                     tabel();
                 }
                 normalCondition();
            }
       }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        normalCondition();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int nilai = fc.showOpenDialog(this);
        if (nilai == JFileChooser.APPROVE_OPTION) {
            fl = fc.getSelectedFile();
            //validasi jpg dan png
            if(fl.getName().endsWith(".jpg") || fl.getName().endsWith(".png")){
                try {
                    //menyimpan ke textfiled
                    jTextField6.setText(fl.getName());
                    //menampilkan gambar
                   
                    jLabel9.setIcon(new ImageIcon(fl.getAbsolutePath()));
                    jLabel9.setText("");
                } catch (Exception ex) {

                }
            }
            else
                //validasi juga gambar tidak berextension jpg atau png
                 JOptionPane.showMessageDialog(rootPane, "Image extension must be jpg or png", "error",JOptionPane.ERROR_MESSAGE);         
        }

            
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try {
            int baris = jTable1.getSelectedRow();
            String tc = jTable1.getModel().getValueAt(baris, 0).toString();
            rs = kon.exec("SELECT * FROM MsProduct WHERE ProductID='"+tc+"'");
            if(rs.next()){
                //memasukan database ke dalam textfield
                jTextField1.setText(rs.getString(1));
                //memasukan database ke dalam textfield
                jTextField2.setText(rs.getString(2));
                //memasukan database ke dalam textfield
                jTextField3.setText(rs.getString(3));
                //memasukan database ke dalam textfield
                jTextField4.setText(rs.getString(4));
                String a= rs.getString(5);
                //memasukan database ke dalam jspinner
                int b = Integer.parseInt(a);
                jSpinner1.setValue(b);
                //memasukan database ke dalam textfield
                jTextField6.setText(rs.getString(6));
                //menentukan lokasi gambar
                ImageIcon ic = new ImageIcon("Gambar/"+rs.getString(6));
                //membuat gambar sesuai dengan tampilan di layar
                Image ig = ic.getImage().getScaledInstance(741, 101, java.awt.Image.SCALE_SMOOTH);
                //menset label menjadi gambar
                jLabel9.setIcon(new ImageIcon(ig));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}