import java.awt.Component;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
    }

    
    
    
    
    
    
    
    
    
    
  //init components di netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperiore = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        jLabelIconaCredenziali = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabelmessaggio = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnResetta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSuperiore.setBackground(new java.awt.Color(0, 153, 153));
        jPanelSuperiore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Empire-Apparell-.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSuperioreLayout = new javax.swing.GroupLayout(jPanelSuperiore);
        jPanelSuperiore.setLayout(jPanelSuperioreLayout);
        jPanelSuperioreLayout.setHorizontalGroup(
            jPanelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperioreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanelSuperioreLayout.setVerticalGroup(
            jPanelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperioreLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperiore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, 30));

        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, -1));

        lblPassword.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, 30));

        jLabelIconaCredenziali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/login (1).png"))); // NOI18N
        jPanel2.add(jLabelIconaCredenziali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 150));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, 30));

        jLabelmessaggio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabelmessaggio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelmessaggio.setText("Inserire le credenziali d'accesso");
        jPanel2.add(jLabelmessaggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 230, -1));

        lblUsername.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("Username");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, 30));

        btnResetta.setForeground(new java.awt.Color(0, 0, 0));
        btnResetta.setText("Resetta");
        btnResetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResettaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResetta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 250));

        setSize(new java.awt.Dimension(532, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        //SE NON SI INSERISCE UNA DELLE SEGUENTI COMBINAZIONI NEL FRAME LOGIN NON SI ACCEDE AL PANNELLO PRINCIPALE
        String uname=Username.getText();
        String psd=Password.getText();

        if(uname.equals("marco99") && psd.equals("pass_marco99")) {
            new AdminPanel().setVisible(true);
            this.dispose();

        }
        if(uname.equals("chiara03") && psd.equals("chiararossi03")) {
            new AdminPanel().setVisible(true);
            this.dispose();
        }

        if(uname.equals("admin") && psd.equals("admin")) {
            new AdminPanel().setVisible(true);
            this.dispose(); //chiude il jframe all'apertura del pannello admin
        }

        if(uname.equals("Roberto88") && psd.equals("rob%88")) {
            new AdminPanel().setVisible(true);
            this.dispose();
        }
        Component frame = null;//inizializza la jdialog frame

        if(uname.equals("Mario_Verdi") && psd.equals("admin_mario93")) {
            new AdminPanel().setVisible(true);
            this.dispose();
        }
        //SE LE CREDENZIALI SONO ERRATE COMPARE UN MESSAGGIO DI ERRORE
        else
            JOptionPane.showMessageDialog(frame, "Credenziali errate!");
    }//GEN-LAST:event_btnLoginActionPerformed

    
    
    
    
    
    private void btnResettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResettaActionPerformed
        
        //METODO DEL BOTTONE RESETTA (PER LE TEXTFIELD USERNAME E PASSWORD)
        
        
        Username.setText("");
        Password.setText("");
        
        
        
    }//GEN-LAST:event_btnResettaActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //FUNZIONE MAIN
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnResetta;
    private javax.swing.JLabel jLabelIconaCredenziali;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelmessaggio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelSuperiore;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
