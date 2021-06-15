/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo5.vistas;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author @LXWeber Leandro Xavier Weber
 */
public class viewIngresarAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewIngresarAutor
     */
    public viewIngresarAutor() {
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

        jlApellido = new javax.swing.JLabel();
        jlFechaNac = new javax.swing.JLabel();
        jlNacionalidad = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfFechaNac = new javax.swing.JTextField();
        jtfNacionalidad = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ingresar Autor");

        jlApellido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlApellido.setText("Apellido:");

        jlFechaNac.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlFechaNac.setText("Fecha de Nacimiento:");

        jlNacionalidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlNacionalidad.setText("Nacionalidad:");

        jtfFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaNacActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Ingresar Autor");

        jlDni.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlDni.setText("DNI:");

        jbIngresar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlNombre.setText("Nombre:");

        jdcFecha.setDateFormatString("yyyy-mm-dd");

        jbLimpiar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre)
                            .addComponent(jtfDni))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitulo)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlFechaNac)
                        .addComponent(jtfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNacionalidad)
                    .addComponent(jtfNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIngresar)
                    .addComponent(jbLimpiar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getJbIngresar() {
        return jbIngresar;
    }

    public JButton getJbLimpiar() {
        return jbLimpiar;
    }
    
    public JTextField getJtfDni() {
        return jtfDni;
    }
    
    public JTextField getJtfNombre() {
        return jtfNombre;
    }
    
    public JTextField getJtfApellido() {
        return jtfApellido;
    }

    public JTextField getJtfFecha() {
        return jtfFechaNac;
    }
    
    public JDateChooser getJdcFecha() {
        return jdcFecha;
    }
    
    public JTextField getJtfNacionalidad() {
        return jtfNacionalidad;
    }

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtfFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFechaNacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbLimpiar;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlNacionalidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfFechaNac;
    private javax.swing.JTextField jtfNacionalidad;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
