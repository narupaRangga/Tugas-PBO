package tugas1_pbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class liga extends javax.swing.JFrame{
    private DefaultTableModel model;
    private PreparedStatement stst;
    private ResultSet rs;
    koneksi k = new koneksi();

    public liga() {
    initComponents();
//    model = new DefaultTableModel(new String[]{"Nama Klub", "Kota", "Pelatih", "Liga"}, 0);
//    jTable1.setModel(model);
    loadData();
    }
    
   
     @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combokota = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        text_pelatih = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        text_nama = new javax.swing.JTextField();
        btnhapus = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SISTEM PENDATAAN KLUB LIGA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 450, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Klub");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Kota");

        combokota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung", "Jakarta", "Samarinda", "Solo", "Malang", "Kupang", "Manukwari", "Surabaya" }));
        combokota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        combokota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combokotaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pelatih ");

        text_id.setEditable(false);
        text_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        text_id.setEnabled(false);

        text_pelatih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Liga");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Liga 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Liga 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Liga 3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID");

        text_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))
                            .addComponent(combokota, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combokota)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 280));

        btnhapus.setBackground(new java.awt.Color(255, 204, 204));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, -1));

        btnubah.setBackground(new java.awt.Color(255, 204, 204));
        btnubah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        getContentPane().add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        btntambah.setBackground(new java.awt.Color(255, 204, 204));
        btntambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Klub", "Kota", "Pelatih", "Liga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Nama Klub");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Kota");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Pelatih");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Liga");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 370, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
       try {
            stst = k.getConnection().prepareStatement("delete from tbpenliga where id_klub=?");
            stst.setString(1, text_id.getText());
            stst.executeUpdate();
            loadData();
            JOptionPane.showMessageDialog(null,"data berhasil dihapus");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"data gagal dihapus");
       } 
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    
    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
    String id = text_id.getText();
    String namaKlub = text_nama.getText();
    String kota = (String) combokota.getSelectedItem();
    String pelatih = text_pelatih.getText();
    String liga = "";
    if (jRadioButton1.isSelected()) liga = "Liga 1";
    else if (jRadioButton2.isSelected()) liga = "Liga 2";
    else if (jRadioButton3.isSelected()) liga = "Liga 3";
    model.addRow(new Object[]{namaKlub, kota, pelatih, liga});

    
    Connection con = null;
    try {
        con = k.getConnection();
        String sql = "INSERT INTO tbpenliga (nama_klub, kota, pelatih, liga) VALUES (?, ?, ?, ?)";
        stst = con.prepareStatement(sql);
        stst.setString(1, namaKlub);
        stst.setString(2, kota);
        stst.setString(3, pelatih);
        stst.setString(4, liga);
        stst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        loadData();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal menambahkan data");
    } finally {
        try {
            if (stst != null) stst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }
    }
    }//GEN-LAST:event_btntambahActionPerformed

    private void combokotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combokotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combokotaActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        String id = text_id.getText();
        String namaKlub = text_nama.getText();
        String kota = (String) combokota.getSelectedItem();
        String pelatih = text_pelatih.getText();
        String liga = "";
        if (jRadioButton1.isSelected()) liga = "Liga 1";
        else if (jRadioButton2.isSelected()) liga = "Liga 2";
        else if (jRadioButton3.isSelected()) liga = "Liga 3";

        try {
            stst = k.getConnection().prepareStatement( "UPDATE tbpenliga SET nama_klub = ?, kota = ?, pelatih = ?, liga = ? WHERE id_klub = ?");
            stst.setString(1, namaKlub);
            stst.setString(2, kota);
            stst.setString(3, pelatih);
            stst.setString(4, liga);
            stst.setString(5, id);
            stst.executeUpdate();
            loadData();

            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui");
            }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btnubahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int selectedIndex = jTable1.getSelectedRow();

        text_id.setText(model.getValueAt(selectedIndex, 0).toString());
        text_nama.setText(model.getValueAt(selectedIndex, 1).toString());
        combokota.setSelectedItem(model.getValueAt(selectedIndex, 2).toString());
        text_pelatih.setText(model.getValueAt(selectedIndex, 3).toString());
        String liga = model.getValueAt(selectedIndex, 4).toString();
        if (liga.equals("Liga 1")) {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        } else if (liga.equals("Liga 2")) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(true);
            jRadioButton3.setSelected(false);
        } else if (liga.equals("Liga 3")) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(true);
        }
        text_id.setText(model.getValueAt(selectedIndex, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void loadData() {
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Nama Klub");
        model.addColumn("Kota");
        model.addColumn("Pelatih");
        model.addColumn("Liga");
        jTable1.setModel(model);
        Connection con = null;
        try {
            String sql = "SELECT * FROM tbpenliga";
            this.stst = k.getConnection().prepareStatement(sql);
            this.rs = stst.executeQuery();
            while (rs.next()) {
                Object[] row = {
                    rs.getString("id_klub"),
                    rs.getString("nama_klub"),
                    rs.getString("kota"),
                    rs.getString("pelatih"),
                    rs.getString("liga")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stst != null) stst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new liga().setVisible(true);
            }
        });
    }
    


  
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combokota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_pelatih;
    // End of variables declaration//GEN-END:variables

}