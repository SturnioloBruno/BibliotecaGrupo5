/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo5.vistas;

import bibliotecagrupo5.modelo.Lector;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author Laucha
 */
public class viewListarPrestamos extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewPrestamos
     */
    public viewListarPrestamos() {
        initComponents();
        JTextFieldDateEditor a = (JTextFieldDateEditor)jdcFecha.getDateEditor();
        a.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busqueda = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jbRegD = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPrestamos = new javax.swing.JTable();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jcbLectores = new javax.swing.JComboBox<>();
        jcbListas = new javax.swing.JComboBox<>();
        jrbLector = new javax.swing.JRadioButton();
        jrbFecha = new javax.swing.JRadioButton();
        jrbEstado = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Prestamos");

        jbRegD.setText("Registrar Devolucion");

        jbEliminar.setText("Eliminar");

        jtPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Prestamo", "DNI Lector", "N° Multa", "N° Ejemplar", "Retirado", "Devuelto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPrestamos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtPrestamos);

        jdcFecha.setDateFormatString("dd-MM-yyyy");
        jdcFecha.setEnabled(false);

        jcbLectores.setEnabled(false);

        jcbListas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vigentes", "Retrasos", "Historial" }));

        Busqueda.add(jrbLector);
        jrbLector.setText("Por Lector");
        jrbLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLectorActionPerformed(evt);
            }
        });

        Busqueda.add(jrbFecha);
        jrbFecha.setText("Por Fecha");

        Busqueda.add(jrbEstado);
        jrbEstado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRegD))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbLector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbListas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbFecha)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbLector)
                    .addComponent(jrbFecha)
                    .addComponent(jrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegD)
                    .addComponent(jbEliminar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbLectorActionPerformed

    public JButton getJbEliminar() {
        return jbEliminar;
    }

    public JButton getJbRegD() {
        return jbRegD;
    }

    public JComboBox<Lector> getJcbLectores() {
        return jcbLectores;
    }

    public JDateChooser getJdcFecha() {
        return jdcFecha;
    }

    public JTable getJtPrestamos() {
        return jtPrestamos;
    }

    public JComboBox<String> getJcbListas() {
        return jcbListas;
    }

    public JRadioButton getJrbEstado() {
        return jrbEstado;
    }

    public JRadioButton getJrbFecha() {
        return jrbFecha;
    }

    public JRadioButton getJrbLector() {
        return jrbLector;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegD;
    private javax.swing.JComboBox<Lector> jcbLectores;
    private javax.swing.JComboBox<String> jcbListas;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbFecha;
    private javax.swing.JRadioButton jrbLector;
    private javax.swing.JTable jtPrestamos;
    // End of variables declaration//GEN-END:variables
}
