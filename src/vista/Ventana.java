package vista;

import Modelo.FotosDAO;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private FileInputStream fis;
    private int longitudBytes;

    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Formulario");
        this.setSize(550, 450);
    }

    //metodo para guardar
    public void GuardarImagen() {
        if (txt_nombre.getText().equals("")) {
            txt_nombre.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        } else {

            String nombre = txt_nombre.getText().trim();
            try {
                FotosDAO.getInstancia().insertarFoto(nombre, fis, longitudBytes);
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    //metodo Limpiar
    public void Limpiar() {
        txt_nombre.setText("");
        jLabel_foto.setText("Foto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_Guardar = new javax.swing.JButton();
        jButton_Consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Guardar Imagen en Base de Datos");

        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        jButton_Consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Consultar.setText("Ir a Consultar");
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la imagen:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Click en el cuadro para agregar foto");

        jLabel_foto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_foto.setToolTipText("");
        jLabel_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fotoMouseClicked
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int) se.getSelectedFile().length();
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(jLabel_foto.getWidth(), jLabel_foto.getHeight(), Image.SCALE_DEFAULT);
                jLabel_foto.setIcon(new ImageIcon(icono));
                jLabel_foto.updateUI();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error en el primer catch");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error en el segundo catch");
            }
        }
    }//GEN-LAST:event_jLabel_fotoMouseClicked

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        GuardarImagen();
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarActionPerformed
        Consulta consulta = new Consulta();
        consulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

}
