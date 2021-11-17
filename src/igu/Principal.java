package igu;

import logica.Controladora;

public class Principal extends javax.swing.JFrame {

    Controladora control;

    public Principal(Controladora control) {
        this.control = control;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        numClient = new javax.swing.JLabel();
        txtNClient = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        raza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        nombreDueño = new javax.swing.JLabel();
        txtNomDuenio = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        alerginco = new javax.swing.JLabel();
        btnAlergico = new javax.swing.JComboBox<>();
        atencionEspecial = new javax.swing.JLabel();
        btnAtencionE = new javax.swing.JComboBox<>();
        observaciones = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(251, 172, 20));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(251, 172, 20));
        jPanel1.setForeground(new java.awt.Color(251, 172, 20));

        titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Peluquería Canina");

        numClient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numClient.setForeground(new java.awt.Color(0, 0, 0));
        numClient.setText("N° Cliente");

        txtNClient.setBackground(new java.awt.Color(255, 247, 225));
        txtNClient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNClient.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNClientActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(255, 247, 225));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        raza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        raza.setForeground(new java.awt.Color(0, 0, 0));
        raza.setText("Raza:");

        txtRaza.setBackground(new java.awt.Color(255, 247, 225));
        txtRaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        color.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        color.setForeground(new java.awt.Color(0, 0, 0));
        color.setText("Color:");

        txtColor.setBackground(new java.awt.Color(255, 247, 225));
        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nombreDueño.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreDueño.setForeground(new java.awt.Color(0, 0, 0));
        nombreDueño.setText("Nombre Dueño:");

        txtNomDuenio.setBackground(new java.awt.Color(255, 247, 225));
        txtNomDuenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setText("Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(255, 247, 225));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        alerginco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alerginco.setForeground(new java.awt.Color(0, 0, 0));
        alerginco.setText("Alérgico:");

        btnAlergico.setBackground(new java.awt.Color(255, 247, 225));
        btnAlergico.setEditable(true);
        btnAlergico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlergico.setForeground(new java.awt.Color(0, 0, 0));
        btnAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        btnAlergico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 247, 225))); // NOI18N
        btnAlergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlergicoActionPerformed(evt);
            }
        });

        atencionEspecial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        atencionEspecial.setForeground(new java.awt.Color(0, 0, 0));
        atencionEspecial.setText("Atención Especial:");

        btnAtencionE.setBackground(new java.awt.Color(255, 247, 225));
        btnAtencionE.setEditable(true);
        btnAtencionE.setForeground(new java.awt.Color(0, 0, 0));
        btnAtencionE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SI", "NO" }));
        btnAtencionE.setBorder(null);

        observaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        observaciones.setForeground(new java.awt.Color(0, 0, 0));
        observaciones.setText("Observaciones:");

        txtObservaciones.setBackground(new java.awt.Color(255, 247, 225));
        txtObservaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(255, 247, 225));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 247, 225));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numClient)
                            .addComponent(nombre))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono)
                            .addComponent(nombreDueño)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(raza)
                                .addComponent(color)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(observaciones))
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(alerginco)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atencionEspecial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtencionE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(591, 591, 591)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNClient, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtNomDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(numClient)
                        .addGap(27, 27, 27)
                        .addComponent(nombre)
                        .addGap(30, 30, 30)
                        .addComponent(raza)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alerginco)
                            .addComponent(btnAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atencionEspecial)
                            .addComponent(btnAtencionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(observaciones)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(color)
                        .addGap(18, 18, 18)
                        .addComponent(nombreDueño)
                        .addGap(31, 31, 31)
                        .addComponent(telefono))
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(txtNClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(251, 172, 20));
        jPanel2.setForeground(new java.awt.Color(251, 172, 20));

        imag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/perrochiquitilin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(imag, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imag, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNClientActionPerformed

    }//GEN-LAST:event_txtNClientActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnAlergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlergicoActionPerformed
        //guardar si es si o no
    }//GEN-LAST:event_btnAlergicoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNClient.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtNomDuenio.setText("");
        txtTelefono.setText("");
        btnAlergico.setSelectedItem(" ");
        btnAtencionE.setSelectedItem(" ");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String num_cliente = txtNClient.getText();
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String nombre_duenio = txtNomDuenio.getText();
        String telefono = txtTelefono.getText();
        Boolean alergico =  (Boolean) btnAlergico.getSelectedItem();
        Boolean antecion_especial = (Boolean) btnAtencionE.getSelectedItem();
        String observaciones = txtObservaciones.getText();
        
//Guardar todos los datos de la mascota y duenio
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerginco;
    private javax.swing.JLabel atencionEspecial;
    private javax.swing.JComboBox<String> btnAlergico;
    private javax.swing.JComboBox<String> btnAtencionE;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel color;
    private javax.swing.JLabel imag;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreDueño;
    private javax.swing.JLabel numClient;
    private javax.swing.JLabel observaciones;
    private javax.swing.JLabel raza;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNClient;
    private javax.swing.JTextField txtNomDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
