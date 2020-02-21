
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Domenico Letizia
 */
public class Magazzino extends javax.swing.JFrame {

    /**
     * Creates new form Magazzino
     */
    public Magazzino() {
        initComponents();
        Visualizza_Prodotti_In_JTable();
    }

    
    
    
    
    
    
    
    //CONNESSIONE AL DATABASE
	
	public Connection getConnection()
	   {
	       Connection con;
	       try {
	           con = DriverManager.getConnection("jdbc:mysql://localhost/prodotto", "root","");
	           return con;
	       } catch (Exception e) {
	           e.printStackTrace();
	           return null;
	       }
	   }
        
        
        
        
        
        
        
        
        // PRENDE LA LISTA DI PRODOTTI DAL DATABASE
	   public ArrayList<Prodotto> getProdottiList()
	   {
	       ArrayList<Prodotto> prodottiList = new ArrayList<Prodotto>();
	       Connection connection = getConnection();
	       
	       String query = "SELECT * FROM  `prodotto` ";
	       Statement st;
	       ResultSet rs;
	       
	       try {
	           st = connection.createStatement();
	           rs = st.executeQuery(query);
	           Prodotto prodotto;
	           while(rs.next())
	           {
	               prodotto = new Prodotto(rs.getString("NOME"),rs.getString("COLORE"),rs.getString("TAGLIA"),rs.getFloat("PREZZO"),rs.getInt("CODPRODOTTO"));
	               prodottiList.add(prodotto);
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	       return prodottiList;
	   }
           
           
           
           
           
           
           
           
           
           
           // Display Data In JTable
   
   public void Visualizza_Prodotti_In_JTable()
   {
       ArrayList<Prodotto> list = getProdottiList();
       DefaultTableModel model = (DefaultTableModel)jTable_Visualizza_Prodotti.getModel();
       Object[] row = new Object[5];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getNome();
           row[1] = list.get(i).getColore();
           row[2] = list.get(i).getTaglia();
           row[3] = list.get(i).getPrezzo();
           row[4] = list.get(i).getCodProdotto();
           
           model.addRow(row);
       }
    }
   
   
   
   
   
   
   
    //initComponents
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Visualizza_Prodotti = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Magazzino");
        setAlwaysOnTop(true);
        setBackground(java.awt.SystemColor.textHighlight);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Visualizza_Prodotti.setBackground(java.awt.SystemColor.activeCaption);
        jTable_Visualizza_Prodotti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Colore", "Taglia", "Prezzo", "CodProdotto"
            }
        ));
        jScrollPane1.setViewportView(jTable_Visualizza_Prodotti);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 7, 560, 570));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Empire-Apparell-.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Admin_Panel_icona (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/freccia_gif (1).gif"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/magazzino_2_icona (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/magazzino_3_icona (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/database_icona (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        setSize(new java.awt.Dimension(993, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new AdminPanel().setVisible(true);
        this.dispose(); //chiude il jframe
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Magazzino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magazzino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magazzino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magazzino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Magazzino().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Visualizza_Prodotti;
    // End of variables declaration//GEN-END:variables
}
