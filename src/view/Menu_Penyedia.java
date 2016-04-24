package view;

import controller.ControllerPenyedia;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Aplikasi;
import model.Penyedia;

public class Menu_Penyedia extends javax.swing.JFrame {
    
    //attribut
    private ControllerPenyedia cp;
    private Penyedia p;
    private Aplikasi aplikasi;
    
    //constructor
    public Menu_Penyedia() {
        initComponents();
        cp = new ControllerPenyedia();
        p = new Penyedia();
        cp.setMpny(this);
        cp.setPny(this.p);
    }    
    public Menu_Penyedia(Penyedia p, Aplikasi app){
        initComponents();
        this.p = p;
        this.cp = new ControllerPenyedia(this.p, this, app);
    }
    
    //method
    public Aplikasi getApp(){
        return this.aplikasi;
    }
    public void setApp(Aplikasi app){
        this.aplikasi = app;
    }
    
    /* untuk pindah panel */
    public JComboBox getCmbPilihMenu(){
        return this.cmbPilihPanel;
    }    
    public JPanel getMenuBuatBarang(){
        return this.Menu_buat_barang;
    }    
    public JPanel getMenuHapusBarang(){
        return this.Menu_hapus_barang;
    }    
    public JPanel getMenuLihatBarang(){
        return this.Menu_lihat_barang;
    }
    
    /* untuk menu tambah barang */
    public JTextField getNamaTambah(){
        return this.txtNamaBarang;
    }    
    public JTextField getIdTambah(){
        return this.txtIdBarang;
    }    
    public JTextField getJumlahTambah(){
        return this.txtJmlBarang;
    }
    
    /* untuk menu hapus barang */
    public JTable getTableHapus(){
        return this.tblHapusBarang;
    }    
    public JComboBox getCmbHapus(){
        return this.cmbHapusBarang;
    }
    
    /* untuk menu lihat barang */
    public JComboBox getCmbLihat(){
        return cmbLihatBarang;
    }    
    public JLabel getLblNama(){
        return this.lblNamaBarang;
    }    
    public JLabel getLblId(){
        return this.lblIdBarang;
    }    
    public JLabel getLblJumlah(){
        return this.lblJumlah;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPilihPanel = new javax.swing.JComboBox();
        btnPilihMenuPenyedia = new javax.swing.JButton();
        Panel_utama = new javax.swing.JPanel();
        Menu_buat_barang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJmlBarang = new javax.swing.JTextField();
        btnBuat = new javax.swing.JButton();
        Menu_hapus_barang = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHapusBarang = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cmbHapusBarang = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        Menu_lihat_barang = new javax.swing.JPanel();
        lblNamaBarang = new javax.swing.JLabel();
        btnLihat = new javax.swing.JButton();
        lblIdBarang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbLihatBarang = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblJumlah = new javax.swing.JLabel();
        btnBackLogin = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Penyedia");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 36)); // NOI18N
        jLabel1.setText("Selamat Datang!");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        jLabel2.setText("-Penyedia-");

        jLabel3.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        jLabel3.setText("Silahkan Pilih Menu:");

        cmbPilihPanel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu Buat Barang", "Menu Hapus Barang", "Menu Lihat Barang" }));
        cmbPilihPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPilihPanelActionPerformed(evt);
            }
        });

        btnPilihMenuPenyedia.setText("pilih");
        btnPilihMenuPenyedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihMenuPenyediaActionPerformed(evt);
            }
        });

        Panel_utama.setBorder(javax.swing.BorderFactory.createTitledBorder("Layar Tampilan"));
        Panel_utama.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Yu Mincho Light", 1, 18)); // NOI18N
        jLabel4.setText("Menu Buat Barang");

        jLabel5.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel5.setText("Nama Barang :");

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel6.setText("ID Barang :");

        jLabel7.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel7.setText("Jumlah Barang :");

        btnBuat.setText("Buat");
        btnBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_buat_barangLayout = new javax.swing.GroupLayout(Menu_buat_barang);
        Menu_buat_barang.setLayout(Menu_buat_barangLayout);
        Menu_buat_barangLayout.setHorizontalGroup(
            Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_buat_barangLayout.createSequentialGroup()
                .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_buat_barangLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4))
                    .addGroup(Menu_buat_barangLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnBuat))
                    .addGroup(Menu_buat_barangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJmlBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(192, 192, 192))
        );
        Menu_buat_barangLayout.setVerticalGroup(
            Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_buat_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(52, 52, 52)
                .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_buat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJmlBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnBuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_utama.add(Menu_buat_barang, "card2");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblHapusBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nama ", "ID Barang", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHapusBarang);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Menu Hapus Barang");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Silahkan pilih indeks");

        javax.swing.GroupLayout Menu_hapus_barangLayout = new javax.swing.GroupLayout(Menu_hapus_barang);
        Menu_hapus_barang.setLayout(Menu_hapus_barangLayout);
        Menu_hapus_barangLayout.setHorizontalGroup(
            Menu_hapus_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_hapus_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(Menu_hapus_barangLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_hapus_barangLayout.setVerticalGroup(
            Menu_hapus_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(52, 52, 52)
                .addGroup(Menu_hapus_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_barangLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnHapus))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        Panel_utama.add(Menu_hapus_barang, "card3");

        lblNamaBarang.setText("jLabel11");

        btnLihat.setText("Lihat");
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        lblIdBarang.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Silahkan Pilih Index Barang");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("DATA BARANG");

        jLabel9.setFont(new java.awt.Font("Yu Mincho Light", 1, 24)); // NOI18N
        jLabel9.setText("Menu Lihat Barang");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nama: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Id barang:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Jumlah:");

        lblJumlah.setText("jLabel17");

        javax.swing.GroupLayout Menu_lihat_barangLayout = new javax.swing.GroupLayout(Menu_lihat_barang);
        Menu_lihat_barang.setLayout(Menu_lihat_barangLayout);
        Menu_lihat_barangLayout.setHorizontalGroup(
            Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_lihat_barangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(btnLihat)
                    .addComponent(cmbLihatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaBarang)
                            .addComponent(lblIdBarang)
                            .addComponent(lblJumlah))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        Menu_lihat_barangLayout.setVerticalGroup(
            Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbLihatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnLihat))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Menu_lihat_barangLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblNamaBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblIdBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblJumlah))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Panel_utama.add(Menu_lihat_barang, "card4");

        btnBackLogin.setText("Back");
        btnBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbPilihPanel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPilihMenuPenyedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(cmbPilihPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnPilihMenuPenyedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackLogin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void btnPilihMenuPenyediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihMenuPenyediaActionPerformed
        cp.pilihPanel();
    }//GEN-LAST:event_btnPilihMenuPenyediaActionPerformed

    private void btnBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatActionPerformed
        cp.buatBarang();
    }//GEN-LAST:event_btnBuatActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        cp.hapusBarang();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cmbPilihPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPilihPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPilihPanelActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        cp.lihatBarang();
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLoginActionPerformed
        cp.backToLogin();
    }//GEN-LAST:event_btnBackLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu_buat_barang;
    private javax.swing.JPanel Menu_hapus_barang;
    private javax.swing.JPanel Menu_lihat_barang;
    private javax.swing.JPanel Panel_utama;
    private javax.swing.JButton btnBackLogin;
    private javax.swing.JButton btnBuat;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnPilihMenuPenyedia;
    private javax.swing.JComboBox cmbHapusBarang;
    private javax.swing.JComboBox cmbLihatBarang;
    private javax.swing.JComboBox cmbPilihPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIdBarang;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblNamaBarang;
    private javax.swing.JTable tblHapusBarang;
    private javax.swing.JTextField txtIdBarang;
    private javax.swing.JTextField txtJmlBarang;
    private javax.swing.JTextField txtNamaBarang;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cmbPilihPanel
     */
    public javax.swing.JComboBox getCmbPilihPanel() {
        return cmbPilihPanel;
    }

    /**
     * @param cmbPilihPanel the cmbPilihPanel to set
     */
    public void setCmbPilihPanel(javax.swing.JComboBox cmbPilihPanel) {
        this.cmbPilihPanel = cmbPilihPanel;
    }
}
