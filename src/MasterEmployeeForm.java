
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MasterEmployeeForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form MasterProductForm
     */
    Koneksi kon = new Koneksi();
    Vector atas,isi,data;
    ResultSet rs;
    DefaultTableModel dm = new DefaultTableModel();
    int temp =0;
   
    public MasterEmployeeForm() {
        initComponents();
        tabel();
        normalCondition();
    }
    //method tabel yang ada di dalam form
    private void tabel(){
        try{
            rs = kon.exec("SELECT * FROM MsEmployee ");
            isi = kon.getVec1();
            atas = new Vector();
            atas.add("Employee ID");
            atas.add("Employee Password");
            atas.add("Employee Name");
            atas.add("Employee Address");
            atas.add("Employee Gender");
            atas.add("Birth Date");
            atas.add("Employee Phone");
            atas.add("Employee position");
            dm.setDataVector(isi,atas);
            jTable1.setModel(dm);
        }catch(Exception e){
            
        }
    }
    //method kondisi normal saat pertama kali form dijalankan
    private void normalCondition(){
        jTextField1.setText("");
        jPasswordField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextArea1.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jTextField1.setEnabled(false);
        jPasswordField1.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextArea1.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        insertBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        saveBtn.setEnabled(false);
        CancelBtn.setEnabled(false);
    }
    //method yang terjadi bila kita memencet tombol
    private void enabledButton(){
        jPasswordField1.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextArea1.setEnabled(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jComboBox3.setEnabled(true);
        jComboBox4.setEnabled(true);
        deleteBtn.setEnabled(false);
        insertBtn.setEnabled(false);
        updateBtn.setEnabled(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(900, 690));

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

        jPanel1.add(jPanel6, java.awt.BorderLayout.SOUTH);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Master Employee");
        jPanel5.add(jLabel7);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.GridLayout(4, 4, 5, 5));

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Employee ID");
        jPanel7.add(jLabel1);

        jTextField1.setEditable(false);
        jPanel7.add(jTextField1);

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Employee Gender");
        jPanel7.add(jLabel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Female");
        jPanel4.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Male");
        jPanel4.add(jRadioButton2);

        jPanel7.add(jPanel4);

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Employee Password");
        jPanel7.add(jLabel2);
        jPanel7.add(jPasswordField1);

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Birth Date");
        jPanel7.add(jLabel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jComboBox1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jComboBox2);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(jComboBox3);

        jPanel7.add(jPanel3);

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Employee Name");
        jPanel7.add(jLabel4);
        jPanel7.add(jTextField4);

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Employee Phone");
        jPanel7.add(jLabel9);
        jPanel7.add(jTextField3);

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Employee address");
        jPanel7.add(jLabel6);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(80, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(80, 60));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane2);

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Employee Posistion");
        jPanel7.add(jLabel10);

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jComboBox4.insertItemAt("", 0);
        jComboBox4.insertItemAt("Sales", 1);
        jComboBox4.insertItemAt("Admin", 2);
        jPanel7.add(jComboBox4);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Employee");
        jPanel11.add(jLabel8);

        jPanel2.add(jPanel11, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        temp=1;
        //mensettext area menjadi kosong
        jTextArea1.setText("");
        //mensettext field menjadi kosong
        jTextField1.setText("");
        //mensettext field menjadi kosong
        jTextField3.setText("");
        //mensettext field menjadi kosong
        jTextField4.setText("");
        //menset password field menjadi kosong
        jPasswordField1.setText("");
        //menghilangkan seleksi pada button group
        buttonGroup1.clearSelection();
        int lastId = 0;
        //menggenerate ID
        ResultSet rs2;
        rs2 = kon.exec("SELECT * FROM MsEmployee ORDER BY EmployeeID DESC");
        try {
            if(rs2.next()){
                lastId = Integer.parseInt(rs2.getString(1).substring(2));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterEmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        //menambahkan ID
        lastId++;
        //membuat string sesuai dengan format
        String d = String.format("%03d", lastId);
        jTextField1.setText("EM"+d);
       
        
        enabledButton();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        temp=2;
        enabledButton();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        normalCondition();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        //menkonfirmasi apakah mau mendelete atau tidak
        int dialog =JOptionPane.showConfirmDialog(rootPane, "are you sure to delete "+jTextField1.getText(),"delete",JOptionPane.YES_NO_OPTION);
        if(dialog ==JOptionPane.YES_OPTION){
        //mendelete query
            kon.Update("DELETE FROM MsEmployee WHERE EmployeeID = '"+jTextField1.getText()+"'");
            tabel();
        }
        normalCondition();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String test = jTextField3.getText();
        boolean coba = false;
        boolean coba2 = false;
        //mengetahui apakah radio button 1 atau 2 yang di selected
          if(jRadioButton1.isSelected()||jRadioButton2.isSelected()){
           coba2=true;
       }
       //mengetahui apakah semua string adalah angka
        for(int h = 0;h<test.length();h++){
            if(Character.isDigit(test.charAt(h))){
                coba =true;
            }else{
                coba = false;
                if(!coba){
                    break;
                }
            }
        }
        //validasi semua textfield telah terisi
        if(jTextField1.getText().equals("")||jTextArea1.getText().equals("")||jTextField4.getText().equals("")||coba2==false||jTextField3.getText().equals("")||jComboBox4.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "All text fields must be filled.", "error",JOptionPane.ERROR_MESSAGE);         
        }else{
            //validasasi address harus memiliki street
            if(!jTextArea1.getText().contains("street")){
                JOptionPane.showMessageDialog(rootPane, "Customer Address must contain ‘street’", "error",JOptionPane.ERROR_MESSAGE);
            }
            //validasi nomor telephone harus memiliki 7 digits
            else if(jTextField3.getText().length()!=7){
                JOptionPane.showMessageDialog(rootPane, "Customer Phone must be contains 7 digits.", "error",JOptionPane.ERROR_MESSAGE);
            }
            //validasi nomor telephone harus angka
            else if(coba == false){
                JOptionPane.showMessageDialog(rootPane, "Customer Phone must be numeric (minus values are not allowed).", "error",JOptionPane.ERROR_MESSAGE);
            }else{
                if (temp == 1) {
                    String a ="";
                    //menentukan jradiobutton mana yang di pilih
                    for(int i=0;i<buttonGroup1.getButtonCount();i++){
                        //jika jradibutton1 yang dipilih
                        if(jRadioButton1.isSelected()){
                            a = jRadioButton1.getText();
                            break;
                        }
                        //jika jradiobutton2 yang dipilih
                        else if(jRadioButton2.isSelected()){
                            a = jRadioButton2.getText();
                            break;
                        }
                    }
                    //memasukan data dari combobox ke database
                    String b;
                    b = (String) jComboBox1.getSelectedItem()+"/"+jComboBox2.getSelectedItem()+"/"+jComboBox3.getSelectedItem();
                    //menginsert query
                    kon.Update("insert into MsEmployee (EmployeeID, Password, EmployeeName, EmployeeAddress, EmployeeGender, BirthDate, EmployeePhone, EmployeePosition) values ('"+jTextField1.getText()+"', '"+jPasswordField1.getText()+"', '"+jTextField4.getText()+"', '"+jTextArea1.getText()+"', '"+a+"', '"+b+"', '"+jTextField3.getText()+"', '"+jComboBox4.getSelectedItem()+"') ");
                    tabel();

                } else if (temp == 2) {
                    String a ="";
                    //menentukan jradiobutton mana yang di pilih
                    for(int i=0;i<buttonGroup1.getButtonCount();i++){
                        if(jRadioButton1.isSelected()){
                            a = jRadioButton1.getText();
                            break;
                        }else if(jRadioButton2.isSelected()){
                            a = jRadioButton2.getText();
                            break;
                        }
                    }

                    //memasukan data ke dalam combobox
                    String b;
                    b = (String) jComboBox1.getSelectedItem()+"/"+jComboBox2.getSelectedItem()+"/"+jComboBox3.getSelectedItem();
                    String query = "UPDATE MsEmployee SET Password = '"+jPasswordField1.getText()+"', EmployeeName = '"+jTextField4.getText()+"', EmployeeAddress = '"+jTextArea1.getText()+"', EmployeeGender = '"+a+"', BirthDate = '"+b+"', EmployeePhone = '"+jTextField3.getText()+"' , EmployeePosition = '"+jComboBox4.getSelectedItem()+"' where EmployeeID = '"+jTextField1.getText()+"'";
                    kon.Update(query);
                    tabel();

                }
                normalCondition();
            }
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //menentukan apa yang di klik saat mengklik di mouse di table
        try {
            int baris = jTable1.getSelectedRow();
            String tc = jTable1.getModel().getValueAt(baris, 0).toString();
            rs = kon.exec("SELECT * FROM MsEmployee WHERE EmployeeID ='"+tc+"'");
            if(rs.next()){
                jTextField1.setText(rs.getString(1));
                jPasswordField1.setText(rs.getString(2));
                jTextField4.setText(rs.getString(3));
                jTextArea1.setText(rs.getString(4));
                //menentukan radio button mana yang dipilih
                for(int i=0;i<buttonGroup1.getButtonCount();i++){
                    //jika jradibutton1 yag benar
                   if(jRadioButton1.getText().equals(rs.getString(5))){
                        jRadioButton1.setSelected(true);
                        break;
                        
                    }
                   //jika jradibutton 2 yang benar
                   else if(jRadioButton2.getText().equals(rs.getString(5))){
                        jRadioButton2.setSelected(true);
                        break;
                    }
                }
                //mengambil string dari database
                String a = rs.getString(6);
                //memecahkan string
                String b []=a.split("-");
                String c [] = b[2].split(" "); 
                //menginput data ke combobox
                jComboBox1.setSelectedItem(c[0]);
                //menginput data ke combobox
                jComboBox2.setSelectedItem(b[1]);
                //menginput data ke combobox
                jComboBox3.setSelectedItem(b[0]);
                //menginput data ke textfield
                jTextField3.setText(rs.getString(7));
                //menginput data ke combobox
                jComboBox4.setSelectedItem(rs.getString(8));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterEmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}