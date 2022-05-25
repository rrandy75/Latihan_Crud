
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rezky Randy
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        table();
    }
    Void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        
        try {
            String sql = "SELECT * FROM tb_mahasiswa WHERE nim like '%" + txCari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("alamat")
                });
                jTable2.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println("NIM SALAH");
        }
        return null;
    }
    void hapus(){
        txNim.setText("");
        txNama.setText("");
        txAlamat.setText("");
    }

    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nim");
        tbl.addColumn("Nama");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_mahasiswa");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("alamat")
                });
                jTable2.setModel(tbl);
            }
            JOptionPane.showMessageDialog((null), "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog((null), "Koneksi Error" + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txNim = new javax.swing.JTextField();
        txNama = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        txAlamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btSimpan = new javax.swing.JButton();
        btTampil = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btCari = new javax.swing.JButton();
        txCari = new javax.swing.JTextField();
        btLogout = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INFORMASI DATA MAHASISWA");

        jLabel2.setText("Nim");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        rbLaki.setText("Laki-Laki");

        rbPerempuan.setText("Perempuan");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btSimpan.setText("Simpan");
        btSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSimpanMouseClicked(evt);
            }
        });
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btTampil.setText("Tampil");
        btTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTampilMouseClicked(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditMouseClicked(evt);
            }
        });
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHapusMouseClicked(evt);
            }
        });

        btCari.setText("Cari");
        btCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCariMouseClicked(evt);
            }
        });

        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCari)
                                .addGap(18, 18, 18)
                                .addComponent(txCari, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btLogout))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btSimpan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(rbPerempuan)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbLaki)
                                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNim, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btTampil)
                                .addGap(53, 53, 53)
                                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btHapus)))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btTampil)
                    .addComponent(btEdit)
                    .addComponent(btHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCari)
                    .addComponent(txCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogout)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditActionPerformed

    private void btSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSimpanMouseClicked
              // TODO add your handling code here:
              
              String jk = null;
              
              if(rbLaki.isSelected()){
                  jk = "Laki-Laki";
              } else if(rbPerempuan.isSelected()){
                  jk = "Perempuan";
              }
              try {
                   String sql = "INSERT INTO tb_mahasiswa VALUES ('" + txNim.getText() + "','" + txNama.getText() + "','" + jk + "','" + txAlamat.getText() + "')";
                   
                   Connection con = (Connection) Koneksi.getConnection();
                   PreparedStatement pst = con.prepareStatement(sql);
                   pst.execute();
                   
                   JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_btSimpanMouseClicked

    private void btTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTampilMouseClicked
        // TODO add your handling code here:
        
        try {
            String sql = "SELECT * FROM tb_mahasiswa WHERE nim ='" + txNim.getText() + "'";
            
            Connection con = (Connection) Koneksi.getConnection();
                   PreparedStatement pst = con.prepareStatement(sql);
                   pst.execute();
                   
        } catch (Exception e) {
            
                    JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus ();
    }//GEN-LAST:event_btTampilMouseClicked

    private void btEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditMouseClicked
              // TODO add your handling code here:
              
                String jk = null;
              
              if(rbLaki.isSelected()){
                  jk = "Laki-Laki";
              } else if(rbPerempuan.isSelected()){
                  jk = "Perempuan";
              }
              
              try {
              
                  String sql = "UPDATE tb_mahasiswa SET nim ='" + txNim.getText() + "',nama ='" + txNama.getText() + "',jenis_kelamin ='" + jk + "',alamat ='" + txAlamat.getText() + "' WHERE nim='" + txNim.getText() + "'";
                   Connection con = (Connection) Koneksi.getConnection();
                   PreparedStatement pst = con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null, "Update Berhasil");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btEditMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        int baris = jTable2.rowAtPoint(evt.getPoint());
        String nim = jTable2.getValueAt(baris, 0).toString();
        txNim.setText(nim);
        String nama = jTable2.getValueAt(baris, 1).toString();
        txNama.setText(nama);
        String alamat = jTable2.getValueAt(baris, 3).toString();
        txAlamat.setText(alamat);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void btHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHapusMouseClicked
        // TODO add your handling code here:
        
        try {
            String sql = "DELETE FROM tb_mahasiswa WHERE nim ='" + txNim.getText() + "'";
            
             Connection con = (Connection) Koneksi.getConnection();
                   PreparedStatement pst = con.prepareStatement(sql);
                   pst.execute();
                   
                   JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btHapusMouseClicked

    private void btCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCariMouseClicked
        // TODO add your handling code here:
        
        cari();
        
    }//GEN-LAST:event_btCariMouseClicked

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Yakin Keluar Dari System?", "Yakin?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
          System.exit(0);
        }
    }//GEN-LAST:event_btLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCari;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextField txAlamat;
    private javax.swing.JTextField txCari;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txNim;
    // End of variables declaration//GEN-END:variables
}
