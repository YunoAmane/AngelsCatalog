package Vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.PropertyStateEvent;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Principal extends javax.swing.JFrame {

    static String username;
    static int articulos;
    static DefaultTableModel modelo = new DefaultTableModel();
 protected java.sql.Connection con = null;
  protected Statement st = null;
  protected ResultSet rs = null;
  protected boolean reg = true;
  protected ResultSetMetaData rsMt;
  protected String jdbc = "com.mysql.jdbc.Driver";
  protected String url = "jdbc:mysql://";
  protected int col;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/Img/42349585.jpg")).getImage());
        dialogLogin.setSize(420, 250);
        dialogLogin.setLocationRelativeTo(this);
        dialogLogin.setVisible(true);
        // connect("root", "root", "localhost:3306", "AngelCatalogo" + "?characterEncoding=UTF-8&useSSL=false");
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        dialogLogin = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spinnerArticulos = new javax.swing.JSpinner();
        buttonIngresar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelArticulos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInput = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JPasswordField();
        txtHost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDbName = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        btnLlenarTabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        dialogLogin.setTitle("Inicio de Sesión");
        dialogLogin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dialogLoginWindowClosing(evt);
            }
        });

        jLabel1.setText("Ingrese su nombre completo:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textFieldUsername, org.jdesktop.beansbinding.ELProperty.create("Nombre de usuario"), textFieldUsername, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Numero de articulos:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, spinnerArticulos, org.jdesktop.beansbinding.ELProperty.create("Cantidad de articulos"), spinnerArticulos, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        buttonIngresar.setText("Ingresar");
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nice_Logo_Login.png"))); // NOI18N

        javax.swing.GroupLayout dialogLoginLayout = new javax.swing.GroupLayout(dialogLogin.getContentPane());
        dialogLogin.getContentPane().setLayout(dialogLoginLayout);
        dialogLoginLayout.setHorizontalGroup(
            dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dialogLoginLayout.createSequentialGroup()
                        .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinnerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addGroup(dialogLoginLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dialogLoginLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(buttonIngresar)))
                .addGap(35, 35, 35))
        );
        dialogLoginLayout.setVerticalGroup(
            dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogLoginLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dialogLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLogo))
                .addGap(21, 21, 21)
                .addComponent(buttonIngresar)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Cliente");

        jLabel4.setText("Articulos:");

        tableInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "cantidad", "codigo", "descripcion", "precio", "subtotal", "total"
            }
        ));
        jScrollPane1.setViewportView(tableInput);

        jLabel5.setText("User");

        txUser.setText("root");

        jLabel6.setText("Password");

        txtPasswd.setText("ADMIN");

        txtHost.setText("localhost:3306");

        jLabel7.setText("Host");

        jLabel8.setText("DB");

        txtDbName.setText("AngelCatalogo");

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDbName, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelArticulos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnConnect.setText("CONECTAR");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectjdbcConnect(evt);
            }
        });

        btnLlenarTabla.setText("GUARDAR");
        btnLlenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarTablaActionPerformed(evt);
            }
        });

        jButton1.setText("IMPRIMIR");

        jButton2.setText("BORRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLlenarTabla)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnect)
                    .addComponent(btnLlenarTabla)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dialogLoginWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogLoginWindowClosing
        System.exit(0);
    }//GEN-LAST:event_dialogLoginWindowClosing

    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed
        username = textFieldUsername.getText();
        articulos = (Integer) spinnerArticulos.getValue();
        if (username.isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Ingrese su nombre por favor", "Error: Inicio de Sesión", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else if ((Integer)spinnerArticulos.getValue() <= 0) {
            JOptionPane.showConfirmDialog(this, "Ingrese el número de articulos", "Error: Inicio de Sesión", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else {
            dialogLogin.setVisible(false);
            labelUsername.setText(username);
            labelArticulos.setText(Integer.toString(articulos));
//            modelo.addRow(articulos);
            this.setVisible(true);
        }
    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void btnLlenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarTablaActionPerformed
   //   rellenarTabla();
    }//GEN-LAST:event_btnLlenarTablaActionPerformed

    private void btnConnectjdbcConnect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectjdbcConnect
        String user = txUser.getText();
        String passwd = "";
        String host = txtHost.getText();
        String dbname = txtDbName.getText();
        for (char x : txtPasswd.getPassword()) {
            passwd = passwd + x;
        }
      //  connect(user, passwd, host, dbname);

        btnConnect.setEnabled(false);
    }//GEN-LAST:event_btnConnectjdbcConnect

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnLlenarTabla;
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JDialog dialogLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArticulos;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelInput;
    private javax.swing.JSpinner spinnerArticulos;
    private javax.swing.JTable tableInput;
    private javax.swing.JTextField textFieldUsername;
    private javax.swing.JTextField txUser;
    private javax.swing.JTextField txtDbName;
    private javax.swing.JTextField txtHost;
    private javax.swing.JPasswordField txtPasswd;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
