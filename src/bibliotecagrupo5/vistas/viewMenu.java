/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo5.vistas;

/**
 *
 * @author @LXWeber Leandro Xavier Weber
 */
public class viewMenu extends javax.swing.JFrame {

    /**
     * Creates new form viewMenu
     */
    public viewMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAutor = new javax.swing.JMenu();
        jmLibro = new javax.swing.JMenu();
        jmiIngresarLibro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmEjemplar = new javax.swing.JMenu();
        jmLector = new javax.swing.JMenu();
        jmPrestamo = new javax.swing.JMenu();
        jmMulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmAutor.setText("Autor");
        jmAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.add(jmAutor);

        jmLibro.setText("Libro");
        jmLibro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmiIngresarLibro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmiIngresarLibro.setText("Ingresar Libro");
        jmLibro.add(jmiIngresarLibro);

        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem2.setText("Buscar Libro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmLibro.add(jMenuItem2);

        jMenuBar1.add(jmLibro);

        jmEjemplar.setText("Ejemplar");
        jmEjemplar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEjemplarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmEjemplar);

        jmLector.setText("Lector");
        jmLector.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.add(jmLector);

        jmPrestamo.setText("Prestamo");
        jmPrestamo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.add(jmPrestamo);

        jmMulta.setText("Multa");
        jmMulta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.add(jmMulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEjemplarActionPerformed

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
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmAutor;
    private javax.swing.JMenu jmEjemplar;
    private javax.swing.JMenu jmLector;
    private javax.swing.JMenu jmLibro;
    private javax.swing.JMenu jmMulta;
    private javax.swing.JMenu jmPrestamo;
    private javax.swing.JMenuItem jmiIngresarLibro;
    // End of variables declaration//GEN-END:variables
}