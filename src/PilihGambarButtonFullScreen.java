
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irwan
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButtonFullScreen
     */
    public PilihGambarButtonFullScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        BukuJava1BT = new javax.swing.JButton();
        KapalBT = new javax.swing.JButton();
        BukuJava2BT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ImagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java buku.jpg"))); // NOI18N
        ImagePanel.add(jLabel1, "0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kapal bajak laut.jpg"))); // NOI18N
        ImagePanel.add(jLabel2, "1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buku Java2.JPG"))); // NOI18N
        ImagePanel.add(jLabel3, "2");

        getContentPane().add(ImagePanel, java.awt.BorderLayout.CENTER);

        BukuJava1BT.setText("Buku Java 1");
        BukuJava1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BukuJava1BTActionPerformed(evt);
            }
        });
        ButtonPanel.add(BukuJava1BT);

        KapalBT.setText("Kapal");
        KapalBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KapalBTActionPerformed(evt);
            }
        });
        ButtonPanel.add(KapalBT);

        BukuJava2BT.setText("Buku Java 2");
        BukuJava2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BukuJava2BTActionPerformed(evt);
            }
        });
        ButtonPanel.add(BukuJava2BT);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ButtonPanel.add(jButton4);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BukuJava2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BukuJava2BTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "2");
    }//GEN-LAST:event_BukuJava2BTActionPerformed

    private void BukuJava1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BukuJava1BTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "0");
    }//GEN-LAST:event_BukuJava1BTActionPerformed

    private void KapalBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KapalBTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "1");
    }//GEN-LAST:event_KapalBTActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
                
                GraphicsDevice device = 
                        GraphicsEnvironment.getLocalGraphicsEnvironment() .getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BukuJava1BT;
    private javax.swing.JButton BukuJava2BT;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton KapalBT;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
