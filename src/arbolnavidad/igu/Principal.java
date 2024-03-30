
package arbolnavidad.igu;


public class Principal extends javax.swing.JFrame {
    
    String emoji;    
    

    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumPisos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegalo = new javax.swing.JButton();
        btnPapaNoel = new javax.swing.JButton();
        btnEstrella = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArbol = new javax.swing.JTextArea();
        txtActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ARBOL DE NAVIDAD");

        jLabel2.setText("Numero de pisos igual o mayor a 4:");

        jLabel3.setText("Elija el diseño");

        btnRegalo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbolnavidad/imagenes/regalo.png"))); // NOI18N
        btnRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegaloActionPerformed(evt);
            }
        });

        btnPapaNoel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnPapaNoel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbolnavidad/imagenes/papa-noel.png"))); // NOI18N
        btnPapaNoel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapaNoelActionPerformed(evt);
            }
        });

        btnEstrella.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbolnavidad/imagenes/estrella.png"))); // NOI18N
        btnEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrellaActionPerformed(evt);
            }
        });

        txtArbol.setEditable(false);
        txtArbol.setColumns(20);
        txtArbol.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        txtArbol.setRows(5);
        jScrollPane1.setViewportView(txtArbol);

        txtActualizar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        txtActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbolnavidad/imagenes/actualizar.png"))); // NOI18N
        txtActualizar.setText("Actualizar");
        txtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnRegalo)
                        .addGap(18, 18, 18)
                        .addComponent(btnPapaNoel)
                        .addGap(18, 18, 18)
                        .addComponent(btnEstrella))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(txtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegalo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addComponent(btnPapaNoel)
                    .addComponent(btnEstrella))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegaloActionPerformed
        emoji = "🎁";
        dibujarArbol(emoji);
    }//GEN-LAST:event_btnRegaloActionPerformed

    private void btnPapaNoelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapaNoelActionPerformed
        emoji = "🎅";
        dibujarArbol(emoji);
    }//GEN-LAST:event_btnPapaNoelActionPerformed

    private void btnEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrellaActionPerformed
        emoji = "⭐";
        dibujarArbol(emoji);
    }//GEN-LAST:event_btnEstrellaActionPerformed

    private void txtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarActionPerformed
        txtNumPisos.setText("");
        txtNumPisos.setEditable(true);
        txtArbol.setText("");
        
        btnRegalo.setEnabled(true);
        btnPapaNoel.setEnabled(true);
        btnEstrella.setEnabled(true);
    }//GEN-LAST:event_txtActualizarActionPerformed

    public void dibujarArbol(String emoji) {
        txtNumPisos.setEditable(false);
        btnRegalo.setEnabled(false);
        btnPapaNoel.setEnabled(false);
        btnEstrella.setEnabled(false);
        
        int altura = Integer.parseInt(txtNumPisos.getText());
        for (int fila = 0; fila < altura; fila++) {
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                txtArbol.setText(txtArbol.getText() + "     ");
            }
            for (int dibujo = 0; dibujo < (fila * 2 + 1); dibujo++) {
                txtArbol.setText(txtArbol.getText() + emoji);
            }
            txtArbol.setText(txtArbol.getText() + "\n");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstrella;
    private javax.swing.JButton btnPapaNoel;
    private javax.swing.JButton btnRegalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtActualizar;
    private javax.swing.JTextArea txtArbol;
    private javax.swing.JTextField txtNumPisos;
    // End of variables declaration//GEN-END:variables
}
