/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Entity_Client;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


/**
 *
 * @author GARRY
 */
public class ListTicket extends javax.swing.JFrame {

    /**
     * Creates new form LIstTicket
     */
    private List<tickets> tiketList = new ArrayList<>();
    
    public ListTicket(List<tickets> tiketList) {
        initComponents();
        this.tiketList = tiketList;
        loadComboBox();
        jComboBoxKonser.addActionListener(e -> updateHarga());
        jComboBoxJenisKursi.addActionListener(e -> updateHarga());
    }
    
    private void updateHarga() {
    String konserDipilih = (String) jComboBoxKonser.getSelectedItem();
    String jenisDipilih = (String) jComboBoxJenisKursi.getSelectedItem();

    if (konserDipilih != null && jenisDipilih != null) {
        for (tickets t : tiketList) {
            if (t.getNamaKonser().equals(konserDipilih) && t.getJenis().equals(jenisDipilih)) {
                jLabelHargaTiket.setText(String.valueOf(t.getHarga()));
                return;
            }
        }
    }
}
    
    private void loadComboBox() {
    Set<String> konserSet = new HashSet<>();
    Set<String> jenisSet = new HashSet<>();

    for (tickets t : tiketList) {
        konserSet.add(t.getNamaKonser());
        jenisSet.add(t.getJenis());
    }

    jComboBoxKonser.removeAllItems();
    for (String konser : konserSet) {
        jComboBoxKonser.addItem(konser);
    }

    jComboBoxJenisKursi.removeAllItems();
    for (String jenis : jenisSet) {
        jComboBoxJenisKursi.addItem(jenis);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCheckout = new javax.swing.JButton();
        jLabelListTicket = new javax.swing.JLabel();
        jLabelJenisKursi = new javax.swing.JLabel();
        jComboBoxJenisKursi = new javax.swing.JComboBox<>();
        jLabelKonser = new javax.swing.JLabel();
        jLabelHarga = new javax.swing.JLabel();
        jLabelJumlah = new javax.swing.JLabel();
        jTextFieldJumlah = new javax.swing.JTextField();
        jComboBoxKonser = new javax.swing.JComboBox<>();
        jLabelHargaTiket = new javax.swing.JLabel();
        jButtonDetailTiket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCheckout.setText("Checkout");
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        jLabelListTicket.setBackground(new java.awt.Color(255, 102, 102));
        jLabelListTicket.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelListTicket.setText("LIST TICKET");
        jLabelListTicket.setToolTipText("");

        jLabelJenisKursi.setBackground(new java.awt.Color(255, 102, 102));
        jLabelJenisKursi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJenisKursi.setText("Jenis Kursi:");
        jLabelJenisKursi.setToolTipText("");

        jLabelKonser.setBackground(new java.awt.Color(255, 102, 102));
        jLabelKonser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelKonser.setText("Pilih Konser:");
        jLabelKonser.setToolTipText("");

        jLabelHarga.setBackground(new java.awt.Color(255, 102, 102));
        jLabelHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHarga.setText("Harga:");
        jLabelHarga.setToolTipText("");

        jLabelJumlah.setBackground(new java.awt.Color(255, 102, 102));
        jLabelJumlah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJumlah.setText("Jumlah:");
        jLabelJumlah.setToolTipText("");

        jComboBoxKonser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKonserActionPerformed(evt);
            }
        });

        jLabelHargaTiket.setText("-");

        jButtonDetailTiket.setText("Detail Tiket");
        jButtonDetailTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailTiketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKonser)
                            .addComponent(jLabelJenisKursi)
                            .addComponent(jLabelJumlah))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxJenisKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxKonser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelHargaTiket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelHarga)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addComponent(jLabelListTicket)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDetailTiket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCheckout)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelListTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKonser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxKonser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJenisKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJenisKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelHargaTiket))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckout)
                    .addComponent(jButtonDetailTiket))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        String konserDipilih = (String) jComboBoxKonser.getSelectedItem();
        String jenisDipilih = (String) jComboBoxJenisKursi.getSelectedItem();
        String jumlahStr = jTextFieldJumlah.getText();

        if (jumlahStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jumlah tiket harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int jumlahBeli;
        try {
            jumlahBeli = Integer.parseInt(jumlahStr);
            if (jumlahBeli <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah tiket harus lebih dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah tiket harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (tickets t : tiketList) {
            if (t.getNamaKonser().equals(konserDipilih) && t.getJenis().equals(jenisDipilih)) {
                if (jumlahBeli <= t.getJumlah()) {
                    new Checkout(t, jumlahBeli).setVisible(true); 
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Jumlah tiket yang diminta melebihi stok tersedia (" + t.getJumlah() + ").", "Stok Tidak Cukup", JOptionPane.WARNING_MESSAGE);
                }
                return;
            }
        }
    }//GEN-LAST:event_jButtonCheckoutActionPerformed

    private void jComboBoxKonserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKonserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKonserActionPerformed

    private void jButtonDetailTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailTiketActionPerformed
        String konserDipilih = (String) jComboBoxKonser.getSelectedItem();
        String jenisDipilih = (String) jComboBoxJenisKursi.getSelectedItem();
        tickets tiketTerpilih = null;
        for (tickets t : tiketList) {
            if (t.getNamaKonser().equals(konserDipilih) && t.getJenis().equals(jenisDipilih)) {
                tiketTerpilih = t;
                break;
            }
        }
        
        String detail = "Nama Konser: " + tiketTerpilih.getNamaKonser() + "\n"
                      + "Jenis Kursi: " + tiketTerpilih.getJenis() + "\n"
                      + "Harga: Rp" + tiketTerpilih.getHarga() + "\n"
                      + "Jumlah Tersedia: " + tiketTerpilih.getJumlah();
        

        new TicketDetails(detail).setVisible(true);  
    }//GEN-LAST:event_jButtonDetailTiketActionPerformed

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
            java.util.logging.Logger.getLogger(ListTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                List<tickets> daftarTiket = new ArrayList<>();
                new ListTicket(daftarTiket).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonDetailTiket;
    private javax.swing.JComboBox<String> jComboBoxJenisKursi;
    private javax.swing.JComboBox<String> jComboBoxKonser;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelHargaTiket;
    private javax.swing.JLabel jLabelJenisKursi;
    private javax.swing.JLabel jLabelJumlah;
    private javax.swing.JLabel jLabelKonser;
    private javax.swing.JLabel jLabelListTicket;
    private javax.swing.JTextField jTextFieldJumlah;
    // End of variables declaration//GEN-END:variables
}
