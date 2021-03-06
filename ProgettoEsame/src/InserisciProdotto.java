
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;










public class InserisciProdotto extends javax.swing.JFrame {

    
    public InserisciProdotto() {
        initComponents();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //init components di netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        fcod = new javax.swing.JTextField();
        fnome = new javax.swing.JTextField();
        fcolore = new javax.swing.JTextField();
        ftaglia = new javax.swing.JTextField();
        fprezzo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btndel = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnResetta = new javax.swing.JButton();

        setTitle("Gestione magazzino");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Empire-Apparell-.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Admin_Panel_icona (1).png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 70));
        jPanel1.add(fcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, -1));
        jPanel1.add(fnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 210, -1));
        jPanel1.add(fcolore, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, -1));
        jPanel1.add(ftaglia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, -1));
        jPanel1.add(fprezzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CodProdotto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 60, 30));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Colore");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Taglia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, 30));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Prezzo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, 30));

        btndel.setForeground(new java.awt.Color(0, 0, 0));
        btndel.setText("Rimuovi");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 210, -1));

        btnadd.setForeground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Aggiungi");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/panel_icona (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 110, 110));

        btnResetta.setForeground(new java.awt.Color(0, 0, 0));
        btnResetta.setText("Resetta");
        btnResetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResettaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        setSize(new java.awt.Dimension(614, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        
        
        theQuery("delete from prodotto where codprodotto = "+fcod.getText());
        
    }//GEN-LAST:event_btndelActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
  
       //metodo insert
       
       
       theQuery("insert into prodotto (nome,colore,taglia,prezzo,codprodotto) values('"+fnome.getText()+"','"+fcolore.getText()+"','"+ftaglia.getText()+"','"+fprezzo.getText()+"','"+fcod.getText()+"')");                    
       
    }//GEN-LAST:event_btnaddActionPerformed

    
    
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        new AdminPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    
    private void btnResettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResettaActionPerformed
        //RESETTA TUTTE LE JTEXTFIELD
        fnome.setText("");
        fcolore.setText("");
        ftaglia.setText("");
        fprezzo.setText("");
        fcod.setText("");
    }//GEN-LAST:event_btnResettaActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //metodo per le query del magazzino
  public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/prodotto","root","");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(InserisciProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserisciProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserisciProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserisciProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserisciProdotto().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnResetta;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JTextField fcod;
    private javax.swing.JTextField fcolore;
    private javax.swing.JTextField fnome;
    private javax.swing.JTextField fprezzo;
    private javax.swing.JTextField ftaglia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
