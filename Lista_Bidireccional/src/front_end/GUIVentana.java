// Piña Becerra Victor Osvaldo

package front_end;

import back_end.ListaBidireccional;
import back_end.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GUIVentana extends javax.swing.JFrame {
    
    private ListaBidireccional miLista = new ListaBidireccional();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUIVentana.class.getName());

    
    public GUIVentana() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private Producto crearProductoFormulario() {
        int c = Integer.parseInt(txtCod.getText().trim());
        String n = txtNom.getText().trim();
        double p = Double.parseDouble(txtPrec.getText().trim());
        return new Producto(c, n, p);
    }
    
    
    private void actualizarTablaGUI() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < miLista.getTamano(); i++) {
            Producto p = miLista.mostrarPorPosicion(i);
            Object[] fila = { i, p.codigo(), p.nombre(), p.precio() };
            modelo.addRow(fila);
        }
    }
    
    
    private void limpiar() {
        txtCod.setText("");
        txtNom.setText("");
        txtPrec.setText("");
        txtPos.setText("");
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtPrec = new javax.swing.JTextField();
        txtPos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnInsIni = new javax.swing.JButton();
        btnInsFin = new javax.swing.JButton();
        btnInsPos = new javax.swing.JButton();
        btnRemIni = new javax.swing.JButton();
        btnRemFin = new javax.swing.JButton();
        btnRemPos = new javax.swing.JButton();
        btnMosIni = new javax.swing.JButton();
        btnMosFin = new javax.swing.JButton();
        btnMosPos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnBuscarPos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Precio:");

        jLabel4.setText("Posicion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        btnInsIni.setText("Ins. Inicio");
        btnInsIni.addActionListener(this::btnInsIniActionPerformed);

        btnInsFin.setText("Ins. Final");
        btnInsFin.addActionListener(this::btnInsFinActionPerformed);

        btnInsPos.setText("Ins. Posicion");
        btnInsPos.addActionListener(this::btnInsPosActionPerformed);

        btnRemIni.setText("Rem. Inicio");
        btnRemIni.addActionListener(this::btnRemIniActionPerformed);

        btnRemFin.setText("Rem. Final");
        btnRemFin.addActionListener(this::btnRemFinActionPerformed);

        btnRemPos.setText("Rem. Posición");
        btnRemPos.addActionListener(this::btnRemPosActionPerformed);

        btnMosIni.setText("Ver Inicio");
        btnMosIni.addActionListener(this::btnMosIniActionPerformed);

        btnMosFin.setText("Ver Final");
        btnMosFin.addActionListener(this::btnMosFinActionPerformed);

        btnMosPos.setText("Ver Posición");
        btnMosPos.addActionListener(this::btnMosPosActionPerformed);

        btnBuscar.setText("Buscar Codigo");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnVaciar.setText("Vaciar Lista");
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);

        btnBuscarPos.setText("Buscar Posicion");
        btnBuscarPos.addActionListener(this::btnBuscarPosActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsIni)
                        .addGap(43, 43, 43)
                        .addComponent(btnInsFin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRemPos)
                        .addGap(34, 34, 34)
                        .addComponent(btnMosIni)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInsPos)
                    .addComponent(btnMosFin))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMosPos)
                    .addComponent(btnRemIni))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBuscar)
                        .addGap(43, 43, 43)
                        .addComponent(btnVaciar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnRemFin)
                        .addGap(38, 38, 38)
                        .addComponent(btnBuscarPos)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsIni)
                    .addComponent(btnInsFin)
                    .addComponent(btnInsPos)
                    .addComponent(btnRemIni)
                    .addComponent(btnRemFin)
                    .addComponent(btnBuscarPos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemPos)
                    .addComponent(btnMosIni)
                    .addComponent(btnMosFin)
                    .addComponent(btnMosPos)
                    .addComponent(btnBuscar)
                    .addComponent(btnVaciar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posicion", "Codigo", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsIniActionPerformed
    try {
            Producto p = crearProductoFormulario();
            miLista.insertarAlPrincipio(p);
            actualizarTablaGUI();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnInsIniActionPerformed

    private void btnInsFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsFinActionPerformed
    try {
            Producto p = crearProductoFormulario();
            miLista.insertarAlFinal(p);
            actualizarTablaGUI();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnInsFinActionPerformed

    private void btnInsPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsPosActionPerformed
    try {
            Producto p = crearProductoFormulario();
            int pos = Integer.parseInt(txtPos.getText().trim());
            miLista.insertarPorPosicion(p, pos);
            actualizarTablaGUI();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al insertar por posicion: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnInsPosActionPerformed

    private void btnRemIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemIniActionPerformed
    try {
            Producto prod = miLista.removerAlPrincipio();
            actualizarTablaGUI();
            JOptionPane.showMessageDialog(this, "Removido del inicio:\n" + prod);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnRemIniActionPerformed

    private void btnRemFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemFinActionPerformed
    try {
            Producto prod = miLista.removerAlFinal();
            actualizarTablaGUI();
            JOptionPane.showMessageDialog(this, "Removido del final:\n" + prod);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    }//GEN-LAST:event_btnRemFinActionPerformed

    private void btnRemPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemPosActionPerformed
    try {
            int pos = Integer.parseInt(txtPos.getText().trim());
            Producto prod = miLista.removerPorPosicion(pos);
            actualizarTablaGUI();
            JOptionPane.showMessageDialog(this, "Removido de posicion " + pos + ":\n" + prod);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    
    
    }//GEN-LAST:event_btnRemPosActionPerformed

    private void btnMosIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosIniActionPerformed
    try {
            Producto p = miLista.mostrarAlPrincipio();
            JOptionPane.showMessageDialog(this, "Primer elemento:\n" + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnMosIniActionPerformed

    private void btnMosFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosFinActionPerformed
    try {
            Producto p = miLista.mostrarAlFinal();
            JOptionPane.showMessageDialog(this, "Ultimo elemento:\n" + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    
    }//GEN-LAST:event_btnMosFinActionPerformed

    private void btnMosPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosPosActionPerformed
    try {
            int pos = Integer.parseInt(txtPos.getText().trim());
            Producto p = miLista.mostrarPorPosicion(pos);
            JOptionPane.showMessageDialog(this, "Elemento en posicion " + pos + ":\n" + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_btnMosPosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    try {
            int cod = Integer.parseInt(txtCod.getText().trim());
            String res = miLista.buscarPorCodigo(cod);
            if (res != null) {
                JOptionPane.showMessageDialog(this, res);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontro el producto con codigo: " + cod);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo numerico valido para buscar");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
    miLista.vaciar();
        actualizarTablaGUI();
        JOptionPane.showMessageDialog(this, "La lista fue vaciada con exito.");
    
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnBuscarPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPosActionPerformed
    try {
        int pos = Integer.parseInt(txtPos.getText().trim());
        String res = miLista.buscarPorPosicion(pos);
        JOptionPane.showMessageDialog(this, res);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnBuscarPosActionPerformed

    
    public static void main(String args[]) {
        
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new GUIVentana().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarPos;
    private javax.swing.JButton btnInsFin;
    private javax.swing.JButton btnInsIni;
    private javax.swing.JButton btnInsPos;
    private javax.swing.JButton btnMosFin;
    private javax.swing.JButton btnMosIni;
    private javax.swing.JButton btnMosPos;
    private javax.swing.JButton btnRemFin;
    private javax.swing.JButton btnRemIni;
    private javax.swing.JButton btnRemPos;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtPrec;
    // End of variables declaration//GEN-END:variables
}
