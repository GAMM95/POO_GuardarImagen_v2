package vista;

import Modelo.Fotos;
import Modelo.FotosDAO;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Consulta extends javax.swing.JFrame {

    public Consulta() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Formulario de Consulta");
        this.setSize(550, 450);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_foto = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_Consultar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consultar Imagen de Base de Datos");

        jLabel_foto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_nombre.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la imagen:");

        jButton_Consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Consultar.setText("Consultar");
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jButton_Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Regresar.setText("Regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        jButton_Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarActionPerformed
        if (txt_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Imgrese un ID para ejecutar consulta.");
        } else {
            String id_ing = "";
            id_ing = txt_ID.getText().trim().toString();

            int ID;
            ID = Integer.parseInt(id_ing);

            try {
                Fotos f = FotosDAO.getInstancia().buscarFoto(ID);
                txt_nombre.setText(f.getNombre());
                ImageIcon foto = FotosDAO.getInstancia().getFoto(ID);
                if (foto != null) {
                    Icon fotoDimensionada = new ImageIcon(foto.getImage().getScaledInstance(jLabel_foto.getWidth(), jLabel_foto.getHeight(), Image.SCALE_DEFAULT));
                    jLabel_foto.setIcon(fotoDimensionada);
                } else {
                    jLabel_foto.setIcon(null);
                }
                jLabel_foto.updateUI();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton_ConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
