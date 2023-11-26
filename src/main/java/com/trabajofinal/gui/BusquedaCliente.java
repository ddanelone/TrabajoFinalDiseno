/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trabajofinal.gui;

import com.trabajofinal.controllers.BusquedaClienteController;
import java.awt.image.BufferedImage;

/**
 *
 * @author franco
 */
public class BusquedaCliente extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaCliente
     */
    public BusquedaCliente() {
        super("Buscar cliente");
       // Establece un ícono transparente para evitar que se muestre el ícono de Java
        BufferedImage transparentImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(transparentImage);

        initComponents();
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        BusquedaClienteController busquedaClienteController = new BusquedaClienteController(this);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_busqueda_cliente_apellido = new javax.swing.JTextField();
        txt_busqueda_cliente_nombre = new javax.swing.JTextField();
        txt_busqueda_cliente_nro_doc = new javax.swing.JTextField();
        txt_busqueda_cliente_nro_cte = new javax.swing.JTextField();
        cmb_busqueda_cliente_cond = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_busq_cliente_buscar = new javax.swing.JButton();
        btn_busq_cliente_limpiar = new javax.swing.JButton();
        btn_busq_cliente_cancelar = new javax.swing.JButton();
        btn_busq_cliente_select = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_busqueda_cliente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_busqueda_cliente_tipo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Ingrese los datos del cliente:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 27, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Numero de documento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Numero de cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, -1));

        txt_busqueda_cliente_apellido.setBackground(new java.awt.Color(220, 220, 220));
        txt_busqueda_cliente_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txt_busqueda_cliente_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 200, 30));

        txt_busqueda_cliente_nombre.setBackground(new java.awt.Color(220, 220, 220));
        txt_busqueda_cliente_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txt_busqueda_cliente_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 30));

        txt_busqueda_cliente_nro_doc.setBackground(new java.awt.Color(220, 220, 220));
        txt_busqueda_cliente_nro_doc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txt_busqueda_cliente_nro_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        txt_busqueda_cliente_nro_cte.setBackground(new java.awt.Color(220, 220, 220));
        txt_busqueda_cliente_nro_cte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txt_busqueda_cliente_nro_cte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 209, 30));

        cmb_busqueda_cliente_cond.setBackground(new java.awt.Color(220, 220, 220));
        cmb_busqueda_cliente_cond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(cmb_busqueda_cliente_cond, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 200, 30));

        btn_busq_cliente_buscar.setBackground(new java.awt.Color(220, 220, 220));
        btn_busq_cliente_buscar.setText("Buscar");
        btn_busq_cliente_buscar.setAlignmentX(0.5F);
        btn_busq_cliente_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busq_cliente_buscarActionPerformed(evt);
            }
        });

        btn_busq_cliente_limpiar.setBackground(new java.awt.Color(220, 220, 220));
        btn_busq_cliente_limpiar.setText("Limpiar");
        btn_busq_cliente_limpiar.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_busq_cliente_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_busq_cliente_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_busq_cliente_buscar)
                .addGap(18, 18, 18)
                .addComponent(btn_busq_cliente_limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 112, -1, -1));

        btn_busq_cliente_cancelar.setBackground(new java.awt.Color(255, 128, 146));
        btn_busq_cliente_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_busq_cliente_cancelar.setText("Cancelar");
        btn_busq_cliente_cancelar.setAlignmentX(0.5F);
        btn_busq_cliente_cancelar.setMaximumSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_cancelar.setMinimumSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_cancelar.setPreferredSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busq_cliente_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_busq_cliente_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 115, 30));

        btn_busq_cliente_select.setBackground(new java.awt.Color(52, 162, 224));
        btn_busq_cliente_select.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_busq_cliente_select.setText("Seleccionar");
        btn_busq_cliente_select.setAlignmentX(0.5F);
        btn_busq_cliente_select.setMaximumSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_select.setMinimumSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_select.setPreferredSize(new java.awt.Dimension(82, 21));
        btn_busq_cliente_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busq_cliente_selectActionPerformed(evt);
            }
        });
        jPanel1.add(btn_busq_cliente_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 115, 30));

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table_busqueda_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_busqueda_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Cliente", "Tipo Doc", "N° Documento", "Apellido", "Nombre", "CUIL", "Cond. IVA", "E-Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_busqueda_cliente);
        if (table_busqueda_cliente.getColumnModel().getColumnCount() > 0) {
            table_busqueda_cliente.getColumnModel().getColumn(0).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(1).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(2).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(3).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(4).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(5).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(6).setResizable(false);
            table_busqueda_cliente.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, "card3");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 276, -1, 221));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/El-asegurado.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 90, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Condicion IVA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, -1));

        cmb_busqueda_cliente_tipo1.setBackground(new java.awt.Color(220, 220, 220));
        cmb_busqueda_cliente_tipo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(cmb_busqueda_cliente_tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_busq_cliente_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busq_cliente_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_busq_cliente_cancelarActionPerformed

    private void btn_busq_cliente_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busq_cliente_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_busq_cliente_selectActionPerformed

    private void btn_busq_cliente_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busq_cliente_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_busq_cliente_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_busq_cliente_buscar;
    public javax.swing.JButton btn_busq_cliente_cancelar;
    public javax.swing.JButton btn_busq_cliente_limpiar;
    public javax.swing.JButton btn_busq_cliente_select;
    public javax.swing.JComboBox<String> cmb_busqueda_cliente_cond;
    public javax.swing.JComboBox<String> cmb_busqueda_cliente_tipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_busqueda_cliente;
    public javax.swing.JTextField txt_busqueda_cliente_apellido;
    public javax.swing.JTextField txt_busqueda_cliente_nombre;
    public javax.swing.JTextField txt_busqueda_cliente_nro_cte;
    public javax.swing.JTextField txt_busqueda_cliente_nro_doc;
    // End of variables declaration//GEN-END:variables
}
