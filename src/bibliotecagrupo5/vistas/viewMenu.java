/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo5.vistas;

import bibliotecagrupo5.controlador.AutorData;
import bibliotecagrupo5.controlador.EjemplarData;
import bibliotecagrupo5.controlador.LectorData;
import bibliotecagrupo5.controlador.LibroData;
import bibliotecagrupo5.controlador.MultaData;
import bibliotecagrupo5.controlador.PrestamoData;

/**
 *
 * @author @LXWeber Leandro Xavier Weber
 */
public class viewMenu extends javax.swing.JFrame {
    private AutorData ad = new AutorData();
    private EjemplarData ed = new EjemplarData();
    private LectorData led = new LectorData();
    private LibroData lid = new LibroData();
    private MultaData md = new MultaData();
    private PrestamoData pd = new PrestamoData();
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
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAutor = new javax.swing.JMenu();
        jmiIngresarAutor = new javax.swing.JMenuItem();
        jmLibro = new javax.swing.JMenu();
        jmiIngresarLibro = new javax.swing.JMenuItem();
        jmiBuscarLibro = new javax.swing.JMenuItem();
        jmEjemplar = new javax.swing.JMenu();
        jmiIngrModifEjemplares = new javax.swing.JMenuItem();
        jmiBuscarBorrar = new javax.swing.JMenuItem();
        jmLector = new javax.swing.JMenu();
        jmiIngresarLector = new javax.swing.JMenuItem();
        jmPrestamo = new javax.swing.JMenu();
        jmiListarPrestamos = new javax.swing.JMenuItem();
        jmMulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmAutor.setText("Autor");
        jmAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmiIngresarAutor.setText("Ingresar Autor");
        jmAutor.add(jmiIngresarAutor);

        jMenuBar1.add(jmAutor);

        jmLibro.setText("Libro");
        jmLibro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmiIngresarLibro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmiIngresarLibro.setText("Ingresar Libro");
        jmLibro.add(jmiIngresarLibro);

        jmiBuscarLibro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmiBuscarLibro.setText("Buscar Libro");
        jmiBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarLibroActionPerformed(evt);
            }
        });
        jmLibro.add(jmiBuscarLibro);

        jMenuBar1.add(jmLibro);

        jmEjemplar.setText("Ejemplar");
        jmEjemplar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEjemplarActionPerformed(evt);
            }
        });

        jmiIngrModifEjemplares.setText("Ingresar / Modificar");
        jmEjemplar.add(jmiIngrModifEjemplares);

        jmiBuscarBorrar.setText("Buscar / Borrar");
        jmEjemplar.add(jmiBuscarBorrar);

        jMenuBar1.add(jmEjemplar);

        jmLector.setText("Lector");
        jmLector.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmiIngresarLector.setText("Ingresar Lector");
        jmLector.add(jmiIngresarLector);

        jMenuBar1.add(jmLector);

        jmPrestamo.setText("Prestamo");
        jmPrestamo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jmiListarPrestamos.setText("Listar Prestamos");
        jmiListarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarPrestamosActionPerformed(evt);
            }
        });
        jmPrestamo.add(jmiListarPrestamos);

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

    private void jmiBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiBuscarLibroActionPerformed

    private void jmEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEjemplarActionPerformed

    private void jmiListarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarPrestamosActionPerformed
        viewPrestamos vp = new viewPrestamos();
        
    }//GEN-LAST:event_jmiListarPrestamosActionPerformed

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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmAutor;
    private javax.swing.JMenu jmEjemplar;
    private javax.swing.JMenu jmLector;
    private javax.swing.JMenu jmLibro;
    private javax.swing.JMenu jmMulta;
    private javax.swing.JMenu jmPrestamo;
    private javax.swing.JMenuItem jmiBuscarBorrar;
    private javax.swing.JMenuItem jmiBuscarLibro;
    private javax.swing.JMenuItem jmiIngrModifEjemplares;
    private javax.swing.JMenuItem jmiIngresarAutor;
    private javax.swing.JMenuItem jmiIngresarLector;
    private javax.swing.JMenuItem jmiIngresarLibro;
    private javax.swing.JMenuItem jmiListarPrestamos;
    // End of variables declaration//GEN-END:variables
}
