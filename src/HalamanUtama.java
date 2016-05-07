
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public static HalamanUtama utama;
    boolean temp = false;
    public HalamanUtama() {
        initComponents();
        utama = this;
        setContentPane(new JLabel(new ImageIcon("MiniMarket4.jpg62c8305e-6521-4583-a633-cb309810b52cLarger.jpg")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        notlog();
        
    }
    //kondisi ketika tidak ada yang login
    private void notlog(){
        jMenu2.setVisible(false);
        jMenu3.setVisible(false);
        menuLogin.setText("Login");
        
    }
    //kondisi ketika admin login
    public static void adminLoged(){
        utama.jMenu2.setVisible(true);
        utama.jMenu3.setVisible(true);
        utama.menuLogin.setText("Logout");
        utama.temp = true;
    }
    //kondisi ketika sales login
    public static void salesLoged(){
        utama.jMenu3.setVisible(true);
        utama.menuLogin.setText("Logout");
        utama.temp = true;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuProduct = new javax.swing.JMenuItem();
        menuCustomer = new javax.swing.JMenuItem();
        menuEmployee = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuDoTransaction = new javax.swing.JMenuItem();
        menuViewTransaction = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(getMaximumSize());

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");
        menuFile.setName(""); // NOI18N

        menuLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuLogin.setText("Login");
        menuLogin.setName("menuLogin"); // NOI18N
        menuLogin.setDisplayedMnemonicIndex(0);
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        menuFile.add(menuLogin);
        menuFile.add(jSeparator1);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Exit");
        menuExit.setName("menuExit"); // NOI18N
        menuExit.setDisplayedMnemonicIndex(0);
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        jMenu2.setText("Master");

        menuProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuProduct.setText("Product");
        menuProduct.setName("menuProduct"); // NOI18N
        menuProduct.setDisplayedMnemonicIndex(0);
        menuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductActionPerformed(evt);
            }
        });
        jMenu2.add(menuProduct);

        menuCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuCustomer.setText("Customer");
        menuCustomer.setName("menuCustomer"); // NOI18N
        menuCustomer.setDisplayedMnemonicIndex(0);
        menuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustomerActionPerformed(evt);
            }
        });
        jMenu2.add(menuCustomer);

        menuEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuEmployee.setText("Employee");
        menuEmployee.setName("menuEmployee"); // NOI18N
        menuEmployee.setDisplayedMnemonicIndex(1);
        menuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(menuEmployee);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaction");

        menuDoTransaction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuDoTransaction.setText("Do Transaction");
        menuDoTransaction.setName("menuDoTransaction"); // NOI18N
        menuDoTransaction.setDisplayedMnemonicIndex(0);
        menuDoTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDoTransactionActionPerformed(evt);
            }
        });
        jMenu3.add(menuDoTransaction);

        menuViewTransaction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuViewTransaction.setText("View Transaction");
        menuViewTransaction.setName("menuViewTransaction"); // NOI18N
        menuViewTransaction.setDisplayedMnemonicIndex(0);
        menuViewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewTransactionActionPerformed(evt);
            }
        });
        jMenu3.add(menuViewTransaction);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDoTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDoTransactionActionPerformed
        // TODO add your handling code here:
        //memanggil menu do transaction
        DoTransactionForm dt = new DoTransactionForm();
        this.add(dt);
        dt.setVisible(true);
    }//GEN-LAST:event_menuDoTransactionActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        //memanggil login form
        LoginForm lg = new LoginForm();
        this.add(lg);
        lg.setVisible(true);
        if(utama.temp==true){
            notlog();
        }
        
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductActionPerformed
        // TODO add your handling code here:
        //memanggil master product
        MasterProductForm mp = new MasterProductForm();
            this.add(mp);
            mp.setVisible(true);

        
        
    }//GEN-LAST:event_menuProductActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
       //membuat agar menu exit dapat menutup frame
        System.exit(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustomerActionPerformed
        // TODO add your handling code here:
        //memanggil master customer form
        MasterCustomerForm mf = new MasterCustomerForm();
        this.add(mf);
        mf.setVisible(true);
        mf.show();
    }//GEN-LAST:event_menuCustomerActionPerformed

    private void menuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmployeeActionPerformed
        // TODO add your handling code here:
        //memanggil master employe form 
        MasterEmployeeForm me = new MasterEmployeeForm();
        this.add(me);
        me.setVisible(true);
        
    }//GEN-LAST:event_menuEmployeeActionPerformed

    private void menuViewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewTransactionActionPerformed
        // TODO add your handling code here:
        //memanggil view transaction
        ViewTransactionForm vt = new ViewTransactionForm();
        this.add(vt);
        vt.setVisible(true);
    }//GEN-LAST:event_menuViewTransactionActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCustomer;
    private javax.swing.JMenuItem menuDoTransaction;
    private javax.swing.JMenuItem menuEmployee;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuProduct;
    private javax.swing.JMenuItem menuViewTransaction;
    // End of variables declaration//GEN-END:variables
}