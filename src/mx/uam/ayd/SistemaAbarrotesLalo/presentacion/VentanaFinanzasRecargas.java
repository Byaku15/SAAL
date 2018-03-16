/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Reporte;

/**
 *
 * @author alumnocbi
 */
public class VentanaFinanzasRecargas extends javax.swing.JFrame {
ControlVentas controlVenta1=new ControlVentas();
listener listener1= new listener();
ControlReporte controlReporte1= new ControlReporte();
    /**
     * Creates new form VentanaFinanzasRecargas
     * @param controlVenta1
     */
    public VentanaFinanzasRecargas(ControlVentas controlVenta1) {
        this.controlVenta1=controlVenta1;     
        addWindowListener(listener1);
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

        jTextFieldVenta = new javax.swing.JTextField();
        jComboBoxDatos = new javax.swing.JComboBox<>();
        jButtonVolverAlMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPeriodoTiempo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumeroRecargas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCompañiaMax = new javax.swing.JTextField();
        jTextFieldCompañiaMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Administrador de Abarrotes Lalo");

        jTextFieldVenta.setEditable(false);

        jComboBoxDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Productos", "Recargas" }));
        jComboBoxDatos.setSelectedIndex(2);
        jComboBoxDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDatosActionPerformed(evt);
            }
        });

        jButtonVolverAlMenu.setText("Volver al menú");
        jButtonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAlMenuActionPerformed(evt);
            }
        });

        jLabel5.setText("M.N");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Finanzas");

        jLabel2.setText("¿Qué datos deseas consultar? ");

        jLabel3.setText("Periodo de tiempo");

        jComboBoxPeriodoTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Mes", "Año" }));
        jComboBoxPeriodoTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoTiempoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Número de recargas");

        jTextFieldNumeroRecargas.setEditable(false);

        jLabel8.setText("Compañia con menos ventas");

        jLabel7.setText("Compañia con mas ventas");

        jTextFieldCompañiaMax.setEditable(false);
        jTextFieldCompañiaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCompañiaMaxActionPerformed(evt);
            }
        });

        jTextFieldCompañiaMin.setEditable(false);
        jTextFieldCompañiaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCompañiaMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroRecargas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jTextFieldCompañiaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                    .addComponent(jTextFieldCompañiaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNumeroRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCompañiaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldCompañiaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        jLabel1.setText("Ganancias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxPeriodoTiempo, 0, 108, Short.MAX_VALUE)
                                .addComponent(jComboBoxDatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverAlMenu)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPeriodoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButtonVolverAlMenu)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAlMenuActionPerformed
        dispose();
        controlVenta1.finalizaControl();
    }//GEN-LAST:event_jButtonVolverAlMenuActionPerformed

    private void jComboBoxDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDatosActionPerformed
        String seleccion = jComboBoxDatos.getSelectedItem().toString();
        if (seleccion.equals("Productos")) {
            dispose();
            try {
                controlVenta1.consultarProductos("Dia");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (seleccion.equals("Todo")) {
            dispose();
            try {
                controlVenta1.consultarTodo("Dia");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBoxDatosActionPerformed

    private void jComboBoxPeriodoTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoTiempoActionPerformed
        Reporte reporte1;
        String seleccion=jComboBoxPeriodoTiempo.getSelectedItem().toString();
        try {
            reporte1= controlReporte1.consultarRecargas(seleccion);
            llenaCampos(reporte1);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxPeriodoTiempoActionPerformed

    private void jTextFieldCompañiaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompañiaMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompañiaMinActionPerformed

    private void jTextFieldCompañiaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompañiaMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompañiaMaxActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFinanzasRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasRecargas().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasRecargas().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasRecargas().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaFinanzasRecargas().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverAlMenu;
    private javax.swing.JComboBox<String> jComboBoxDatos;
    private javax.swing.JComboBox<String> jComboBoxPeriodoTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCompañiaMax;
    private javax.swing.JTextField jTextFieldCompañiaMin;
    private javax.swing.JTextField jTextFieldNumeroRecargas;
    private javax.swing.JTextField jTextFieldVenta;
    // End of variables declaration//GEN-END:variables

    /**
     * LLena las celdas de texto de la ventana con la informacion correspondiente
     * @param Reporte
     */
    void llenaCampos(Reporte reporte1) {
              
       jTextFieldVenta.setText(String.valueOf(reporte1.getGananciaRecargas()));
       jTextFieldNumeroRecargas.setText(String.valueOf(reporte1.getNumRecargas()));
       jTextFieldCompañiaMax.setText(String.valueOf(reporte1.getCompañiaMax()));
       jTextFieldCompañiaMin.setText(String.valueOf(reporte1.getCompañiaMin()));
       
    }
}