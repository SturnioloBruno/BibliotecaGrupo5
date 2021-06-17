/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo5.vistas;

import bibliotecagrupo5.modelo.Autor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author @LXWeber Leandro Xavier Weber
 */
public class viewListarLibros extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewBuscarLibro
     */
    public viewListarLibros() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jrbNombre = new javax.swing.JRadioButton();
        jtfNombre = new javax.swing.JTextField();
        jrbAutor = new javax.swing.JRadioButton();
        jrbAño = new javax.swing.JRadioButton();
        jrbEditorial = new javax.swing.JRadioButton();
        jcbEditorial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLibros = new javax.swing.JTable();
        jlTitulo = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jrbTipo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jcbAutor = new javax.swing.JComboBox<>();
        jcbAño = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Buscar Libro");

        buttonGroup1.add(jrbNombre);
        jrbNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrbNombre.setSelected(true);
        jrbNombre.setText("Título");

        jtfNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        buttonGroup1.add(jrbAutor);
        jrbAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrbAutor.setText("Autor");
        jrbAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAutorActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbAño);
        jrbAño.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrbAño.setText("Año");
        jrbAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAñoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbEditorial);
        jrbEditorial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrbEditorial.setText("Editorial");
        jrbEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditorialActionPerformed(evt);
            }
        });

        jcbEditorial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbEditorial.setEnabled(false);

        jtLibros.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Autor", "Titulo", "Editorial", "Año", "Tipo", "Ejemplares"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLibros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtLibros);

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Libros");

        jcbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbTipo.setEnabled(false);

        buttonGroup1.add(jrbTipo);
        jrbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrbTipo.setText("Tipo");
        jrbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTipoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tanto titulos como palabras clave");

        jbBorrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbBorrar.setText("Borrar");

        jcbAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbAutor.setEnabled(false);

        jcbAño.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcbAño.setEnabled(false);

        jbBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jbBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbAutor, 0, 180, Short.MAX_VALUE)
                                    .addComponent(jcbAño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbAño)
                                    .addComponent(jrbAutor))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEditorial)
                                    .addComponent(jrbTipo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jrbNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbEditorial))
                            .addComponent(jcbAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbTipo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbAutor)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbAño)
                            .addComponent(jcbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbNombre)
                    .addComponent(jbBuscar))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public JComboBox<Autor> getJcbAutor(){
        return jcbAutor;
    }
    
    public JComboBox<Integer> getJcbAño(){
        return jcbAño;
    }
    
    public JComboBox<String> getJcbEditorial(){
        return jcbEditorial;
    }
    
    public JComboBox<String> getJcbTipo(){
        return jcbTipo;
    }
    
    public JTextField getJtfNombre(){
        return jtfNombre;
    }
    
    public JRadioButton getJrbAutor(){
        return jrbAutor;
    }
    
    public JRadioButton getJrbAño(){
        return jrbAño;
    }
    
    public JRadioButton getJrbEditorial(){
        return jrbEditorial;
    }
    
    public JRadioButton getJrbNombre(){
        return jrbNombre;
    }
    
    public JRadioButton getJrbTipo(){
        return jrbTipo;
    }
    
    public JButton getJbBorrar(){
        return jbBorrar;
    }
    
    public JButton getJbBuscar(){
        return jbBuscar;
    }
    
    public JTable getJtListado() {
        return jtLibros;
    }
    private void jrbAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAutorActionPerformed

    private void jrbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAñoActionPerformed

    private void jrbEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditorialActionPerformed

    private void jrbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<Autor> jcbAutor;
    private javax.swing.JComboBox<Integer> jcbAño;
    private javax.swing.JComboBox<String> jcbEditorial;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbAutor;
    private javax.swing.JRadioButton jrbAño;
    private javax.swing.JRadioButton jrbEditorial;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JRadioButton jrbTipo;
    private javax.swing.JTable jtLibros;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
