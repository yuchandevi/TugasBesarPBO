package view;

import controller.ControllerSignUp;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Aplikasi;
import model.Gudang;
import model.Penyedia;
import model.Petugas;

public class Menu_Sign_up extends javax.swing.JFrame {

    //attribut
    private ControllerSignUp csu;
    private Gudang gudang;
    private Penyedia penyedia;
    private Petugas petugas;
    private Aplikasi aplikasi;
    
    //konstruktor
    public Menu_Sign_up() {
        initComponents();
        csu = new ControllerSignUp(this);
    }
    public Menu_Sign_up(Aplikasi app) {
        initComponents();
        csu = new ControllerSignUp(this);
        csu.setAplikasi(app);
    }
    public Menu_Sign_up(ControllerSignUp csu) {
        initComponents();
        this.csu = csu;
        this.csu.setMsu(this);
        aplikasi = csu.getAplikasi();
    }
    
    /* untuk pindah panel */
    public JComboBox getCmbPilihMenu(){
        return this.cmbPilihMenu;
    }    
    public JPanel getMenuTambahPenyedia(){
        return this.Menu_tambah_penyedia;
    }
    public JPanel getMenuHapusPenyedia(){
        return this.Menu_hapus_penyedia;
    }
    public JPanel getMenuLihatPenyedia(){
        return this.Menu_lihat_penyedia;
    }
    public JPanel getMenuTambahPetugas(){
        return this.Menu_tambah_petugas;
    }
    public JPanel getMenuHapusPetugas(){
        return this.Menu_hapus_petugas;
    }
    public JPanel getMenuLihatPetugas(){
        return this.Menu_lihat_petugas;
    }
    public JPanel getMenuTambahGudang(){
        return this.Menu_tambah_gudang;
    }
    public JPanel getMenuHapusGudang(){
        return this.Menu_hapus_gudang;
    }
    public JPanel getMenuLihatGudang(){
        return this.Menu_lihat_gudang;
    }
    
    /* untuk tambah penyedia */
    public JTextField getTxtNamaPenyedia(){
        return this.txtNamaPenyedia;
    }
    public JTextField getTxtIdPenyedia(){
        return this.txtIdPenyedia;
    }
    public JButton getBtnTambahPenyedia(){
        return this.btnTambahPenyedia;
    }
    
    /* untuk lihat penyedia */
    public JComboBox getCmbPilihIdPenyedia(){
        return this.cmbPilihIdPenyedia;
    }
    public JLabel getLblNamaPenyedia(){
        return this.lblNamaPenyedia;
    }
    public JLabel getLblIdPenyedia(){
        return this.lblIdPenyedia;
    }
    
    /* untuk hapus penyedia */
    public JComboBox getCmbHapusIdPenyedia(){
        return this.cmbHapusPenyedia;
    }
    public JTable getTblPenyedia(){
        return this.tblPenyedia;
    }
    
    /* untuk tambah petugas */
    public JTextField getTxtNamaPetugas(){
        return this.txtNamaPetugas;
    }
    public JTextField getTxtIdPetugas(){
        return this.txtIdPetugas;
    }
    public JButton getBtnTambahPetugas(){
        return this.btnTambahPetugas;
    }

    /* untuk lihat petugas */
    public JComboBox getCmbPilihIdPetugas(){
        return this.cmbPilihIdPetugas;
    }
    public JLabel getLblNamaPetugas(){
        return this.lblNamaPetugas;
    }
    public JLabel getLblIdPetugas(){
        return this.lblIdPetugas;
    }
    
    /* untuk hapus petugas */
    public JComboBox getCmbHapusIdPetugas(){
        return this.cmbPilihIdPetugasHapus;
    }
    public JTable getTblPetugas(){
        return this.tblHapusPetugas;
    }
    
    /* untuk tambah gudang */
    public JTextField getTxtNamaGudang(){
        return this.txtNamaGudang;
    }
    public JTextField getTxtIdGudang(){
        return this.txtIdGudang;
    }
    public JTextField getTxtJumlahStok(){
        return this.txtKapasitasGudang;
    }
    public JButton getBtnTambahGudang(){
        return this.btnTambahGudang;
    }
    
    /* untuk lihat gudang */
    public JComboBox getCmbPilihIdGudang(){
        return this.cmbPilihIdGudang;
    }
    public JLabel getLblNamaGudang(){
        return this.lblNamaGudang;
    }
    public JLabel getLblIdGudang(){
        return this.lblIdGudang;
    }
    public JLabel getLblJumlahStokGudang(){
        return this.lblJumlahStok;
    }
    
    /* untuk hapus gudang */
    public JComboBox getCmbHapusIdGudang(){
        return this.cmbPilihIdGudangHapus;
    }
    public JTable getTblGudang(){
        return this.tblHapusGudang;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbPilihMenu = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        Menu_tambah_penyedia = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaPenyedia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdPenyedia = new javax.swing.JTextField();
        btnTambahPenyedia = new javax.swing.JButton();
        Menu_lihat_penyedia = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbPilihIdPenyedia = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNamaPenyedia = new javax.swing.JLabel();
        btnLihat = new javax.swing.JButton();
        lblIdPenyedia = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Menu_hapus_penyedia = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmbHapusPenyedia = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        btnHapusPenyedia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenyedia = new javax.swing.JTable();
        Menu_tambah_petugas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNamaPetugas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtIdPetugas = new javax.swing.JTextField();
        btnTambahPetugas = new javax.swing.JButton();
        Menu_lihat_petugas = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cmbPilihIdPetugas = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblNamaPetugas = new javax.swing.JLabel();
        btnLihatPetugas = new javax.swing.JButton();
        lblIdPetugas = new javax.swing.JLabel();
        Menu_hapus_petugas = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cmbPilihIdPetugasHapus = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        btnHapusPetugas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHapusPetugas = new javax.swing.JTable();
        Menu_tambah_gudang = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIdGudang = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtKapasitasGudang = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtNamaGudang = new javax.swing.JTextField();
        btnTambahGudang = new javax.swing.JButton();
        Menu_lihat_gudang = new javax.swing.JPanel();
        lblNamaGudang = new javax.swing.JLabel();
        btnLihatGudang = new javax.swing.JButton();
        lblIdGudang = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cmbPilihIdGudang = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblJumlahStok = new javax.swing.JLabel();
        Menu_hapus_gudang = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        cmbPilihIdGudangHapus = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHapusGudang = new javax.swing.JTable();
        btnPilih = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu SIGN UP");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setText("SIGN UP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Silahkan Pilih Menu: ");

        cmbPilihMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu Tambah Penyedia", "Menu Lihat Penyedia", "Menu Hapus Penyedia", "Menu Tambah Petugas", "Menu Lihat Petugas", "Menu Hapus Petugas", "Menu Tambah Gudang", "Menu Lihat Gudang", "Menu Hapus Gudang" }));
        cmbPilihMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPilihMenuActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setText("Menu Tambah Penyedia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nama Penyedia: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Id Penyedia:  ");

        txtIdPenyedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPenyediaActionPerformed(evt);
            }
        });

        btnTambahPenyedia.setText("tambah");
        btnTambahPenyedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPenyediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_tambah_penyediaLayout = new javax.swing.GroupLayout(Menu_tambah_penyedia);
        Menu_tambah_penyedia.setLayout(Menu_tambah_penyediaLayout);
        Menu_tambah_penyediaLayout.setHorizontalGroup(
            Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                .addGroup(Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNamaPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPenyedia))))
                    .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnTambahPenyedia)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        Menu_tambah_penyediaLayout.setVerticalGroup(
            Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_penyediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(Menu_tambah_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnTambahPenyedia)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_tambah_penyedia, "card2");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel8.setText("Menu Lihat Penyedia");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nama: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Id Penyedia:");

        lblNamaPenyedia.setText("jLabel11");

        btnLihat.setText("Lihat");
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        lblIdPenyedia.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Silahkan Pilih ID Penyedia");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("DATA PENYEDIA");

        javax.swing.GroupLayout Menu_lihat_penyediaLayout = new javax.swing.GroupLayout(Menu_lihat_penyedia);
        Menu_lihat_penyedia.setLayout(Menu_lihat_penyediaLayout);
        Menu_lihat_penyediaLayout.setHorizontalGroup(
            Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cmbPilihIdPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLihat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdPenyedia)
                                    .addComponent(lblNamaPenyedia)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        Menu_lihat_penyediaLayout.setVerticalGroup(
            Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7))
                    .addGroup(Menu_lihat_penyediaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(60, 60, 60)
                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPilihIdPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblNamaPenyedia)))
                .addGap(30, 30, 30)
                .addGroup(Menu_lihat_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihat)
                    .addComponent(jLabel10)
                    .addComponent(lblIdPenyedia))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_lihat_penyedia, "card3");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Menu Hapus Penyedia");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Pilihi ID Penyedia yang Ingin di Hapus");

        btnHapusPenyedia.setText("Hapus");
        btnHapusPenyedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPenyediaActionPerformed(evt);
            }
        });

        tblPenyedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "ID Penyedia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPenyedia);
        if (tblPenyedia.getColumnModel().getColumnCount() > 0) {
            tblPenyedia.getColumnModel().getColumn(0).setResizable(false);
            tblPenyedia.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout Menu_hapus_penyediaLayout = new javax.swing.GroupLayout(Menu_hapus_penyedia);
        Menu_hapus_penyedia.setLayout(Menu_hapus_penyediaLayout);
        Menu_hapus_penyediaLayout.setHorizontalGroup(
            Menu_hapus_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel15)
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_hapus_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                        .addGroup(Menu_hapus_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapusPenyedia)
                            .addComponent(cmbHapusPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Menu_hapus_penyediaLayout.setVerticalGroup(
            Menu_hapus_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(66, 66, 66)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_hapus_penyediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_penyediaLayout.createSequentialGroup()
                        .addComponent(cmbHapusPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapusPenyedia))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_hapus_penyedia, "card4");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel17.setText("Menu Tambah Petugas");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Nama Petugas: ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Id Petugas:  ");

        txtIdPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPetugasActionPerformed(evt);
            }
        });

        btnTambahPetugas.setText("tambah");
        btnTambahPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPetugasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_tambah_petugasLayout = new javax.swing.GroupLayout(Menu_tambah_petugas);
        Menu_tambah_petugas.setLayout(Menu_tambah_petugasLayout);
        Menu_tambah_petugasLayout.setHorizontalGroup(
            Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                .addGroup(Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPetugas))))
                    .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnTambahPetugas)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        Menu_tambah_petugasLayout.setVerticalGroup(
            Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_petugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(47, 47, 47)
                .addGroup(Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(Menu_tambah_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnTambahPetugas)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_tambah_petugas, "card5");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel20.setText("Menu Lihat Petugas");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Silahkan Pilih ID petugas");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("DATA Petugas");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Nama: ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Id petugas:");

        lblNamaPetugas.setText("jLabel11");

        btnLihatPetugas.setText("Lihat");
        btnLihatPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatPetugasActionPerformed(evt);
            }
        });

        lblIdPetugas.setText("jLabel12");

        javax.swing.GroupLayout Menu_lihat_petugasLayout = new javax.swing.GroupLayout(Menu_lihat_petugas);
        Menu_lihat_petugas.setLayout(Menu_lihat_petugasLayout);
        Menu_lihat_petugasLayout.setHorizontalGroup(
            Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_petugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(cmbPilihIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLihatPetugas))
                .addGap(96, 96, 96)
                .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_lihat_petugasLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdPetugas)
                            .addComponent(lblNamaPetugas)))
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_lihat_petugasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        Menu_lihat_petugasLayout.setVerticalGroup(
            Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_petugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(60, 60, 60)
                .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPilihIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(lblNamaPetugas)))
                .addGap(30, 30, 30)
                .addGroup(Menu_lihat_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihatPetugas)
                    .addComponent(jLabel24)
                    .addComponent(lblIdPetugas))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_lihat_petugas, "card6");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Menu Hapus Petugas");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Pilihi ID Petugas yang Ingin di Hapus");

        btnHapusPetugas.setText("Hapus");
        btnHapusPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPetugasActionPerformed(evt);
            }
        });

        tblHapusPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "ID Petugas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHapusPetugas);
        if (tblHapusPetugas.getColumnModel().getColumnCount() > 0) {
            tblHapusPetugas.getColumnModel().getColumn(0).setResizable(false);
            tblHapusPetugas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout Menu_hapus_petugasLayout = new javax.swing.GroupLayout(Menu_hapus_petugas);
        Menu_hapus_petugas.setLayout(Menu_hapus_petugasLayout);
        Menu_hapus_petugasLayout.setHorizontalGroup(
            Menu_hapus_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel27)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_hapus_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                        .addGroup(Menu_hapus_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapusPetugas)
                            .addComponent(cmbPilihIdPetugasHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Menu_hapus_petugasLayout.setVerticalGroup(
            Menu_hapus_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(66, 66, 66)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_hapus_petugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_petugasLayout.createSequentialGroup()
                        .addComponent(cmbPilihIdPetugasHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapusPetugas))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_hapus_petugas, "card7");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setText("Menu Tambah Gudang");

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel30.setText("ID gudang : ");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel31.setText("Kapasitas gudang : ");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel32.setText("Nama gudang :");
        jLabel32.setToolTipText("");

        btnTambahGudang.setText("Tambah");
        btnTambahGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahGudangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_tambah_gudangLayout = new javax.swing.GroupLayout(Menu_tambah_gudang);
        Menu_tambah_gudang.setLayout(Menu_tambah_gudangLayout);
        Menu_tambah_gudangLayout.setHorizontalGroup(
            Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_gudangLayout.createSequentialGroup()
                .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_tambah_gudangLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel29))
                    .addGroup(Menu_tambah_gudangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtKapasitasGudang, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(txtNamaGudang))))
                    .addGroup(Menu_tambah_gudangLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnTambahGudang)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        Menu_tambah_gudangLayout.setVerticalGroup(
            Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_gudangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(60, 60, 60)
                .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtIdGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtKapasitasGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(Menu_tambah_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtNamaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnTambahGudang)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_tambah_gudang, "card8");

        lblNamaGudang.setText("jLabel11");

        btnLihatGudang.setText("Lihat");
        btnLihatGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatGudangActionPerformed(evt);
            }
        });

        lblIdGudang.setText("jLabel12");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Silahkan Pilih indeks Gudang");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("DATA GUDANG");

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel37.setText("Menu Lihat Gudang");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Nama: ");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Id Gudang:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Jumlah:");

        lblJumlahStok.setText("jLabel43");

        javax.swing.GroupLayout Menu_lihat_gudangLayout = new javax.swing.GroupLayout(Menu_lihat_gudang);
        Menu_lihat_gudang.setLayout(Menu_lihat_gudangLayout);
        Menu_lihat_gudangLayout.setHorizontalGroup(
            Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_lihat_gudangLayout.createSequentialGroup()
                .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(cmbPilihIdGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnLihatGudang)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Menu_lihat_gudangLayout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblJumlahStok))
                                .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIdGudang))
                                .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addGap(49, 49, 49)
                                    .addComponent(lblNamaGudang)))))
                    .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
        );
        Menu_lihat_gudangLayout.setVerticalGroup(
            Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                        .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Menu_lihat_gudangLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel35))
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPilihIdGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamaGudang)))
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihatGudang)
                    .addComponent(jLabel39)
                    .addComponent(lblIdGudang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_lihat_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(lblJumlahStok))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_lihat_gudang, "card9");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Menu Hapus Gudang");

        cmbPilihIdGudangHapus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Pilihi ID gudang  yang Ingin di Hapus");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblHapusGudang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "ID Gudang", "Kapasitas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHapusGudang);
        if (tblHapusGudang.getColumnModel().getColumnCount() > 0) {
            tblHapusGudang.getColumnModel().getColumn(0).setResizable(false);
            tblHapusGudang.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout Menu_hapus_gudangLayout = new javax.swing.GroupLayout(Menu_hapus_gudang);
        Menu_hapus_gudang.setLayout(Menu_hapus_gudangLayout);
        Menu_hapus_gudangLayout.setHorizontalGroup(
            Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                .addGroup(Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel40))
                    .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                                .addGroup(Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHapus)
                                    .addComponent(cmbPilihIdGudangHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        Menu_hapus_gudangLayout.setVerticalGroup(
            Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(66, 66, 66)
                .addGroup(Menu_hapus_gudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_hapus_gudangLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPilihIdGudangHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapus))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_hapus_gudang, "card10");

        btnPilih.setText("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1)
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cmbPilihMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPilih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbPilihMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnPilih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPilihMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPilihMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPilihMenuActionPerformed

    private void txtIdPenyediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPenyediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPenyediaActionPerformed

    private void txtIdPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPetugasActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        csu.pilihPanel();
    }//GEN-LAST:event_btnPilihActionPerformed

    private void btnTambahPenyediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPenyediaActionPerformed
        csu.tambahPenyedia();
    }//GEN-LAST:event_btnTambahPenyediaActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        csu.lihatPenyedia();
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnHapusPenyediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPenyediaActionPerformed
        csu.hapusPenyedia();
    }//GEN-LAST:event_btnHapusPenyediaActionPerformed

    private void btnLihatPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatPetugasActionPerformed
        csu.lihatPetugas();
    }//GEN-LAST:event_btnLihatPetugasActionPerformed

    private void btnHapusPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPetugasActionPerformed
        csu.hapusPetugas();
    }//GEN-LAST:event_btnHapusPetugasActionPerformed

    private void btnTambahPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPetugasActionPerformed
        csu.tambahPetugas();
    }//GEN-LAST:event_btnTambahPetugasActionPerformed

    private void btnTambahGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahGudangActionPerformed
        csu.tambahGudang();
    }//GEN-LAST:event_btnTambahGudangActionPerformed

    private void btnLihatGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatGudangActionPerformed
        csu.lihatGudang();
    }//GEN-LAST:event_btnLihatGudangActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        csu.hapusGudang();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        csu.backToLogin();
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu_hapus_gudang;
    private javax.swing.JPanel Menu_hapus_penyedia;
    private javax.swing.JPanel Menu_hapus_petugas;
    private javax.swing.JPanel Menu_lihat_gudang;
    private javax.swing.JPanel Menu_lihat_penyedia;
    private javax.swing.JPanel Menu_lihat_petugas;
    private javax.swing.JPanel Menu_tambah_gudang;
    private javax.swing.JPanel Menu_tambah_penyedia;
    private javax.swing.JPanel Menu_tambah_petugas;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapusPenyedia;
    private javax.swing.JButton btnHapusPetugas;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnLihatGudang;
    private javax.swing.JButton btnLihatPetugas;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnTambahGudang;
    private javax.swing.JButton btnTambahPenyedia;
    private javax.swing.JButton btnTambahPetugas;
    private javax.swing.JComboBox cmbHapusPenyedia;
    private javax.swing.JComboBox cmbPilihIdGudang;
    private javax.swing.JComboBox cmbPilihIdGudangHapus;
    private javax.swing.JComboBox cmbPilihIdPenyedia;
    private javax.swing.JComboBox cmbPilihIdPetugas;
    private javax.swing.JComboBox cmbPilihIdPetugasHapus;
    private javax.swing.JComboBox cmbPilihMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdGudang;
    private javax.swing.JLabel lblIdPenyedia;
    private javax.swing.JLabel lblIdPetugas;
    private javax.swing.JLabel lblJumlahStok;
    private javax.swing.JLabel lblNamaGudang;
    private javax.swing.JLabel lblNamaPenyedia;
    private javax.swing.JLabel lblNamaPetugas;
    private javax.swing.JTable tblHapusGudang;
    private javax.swing.JTable tblHapusPetugas;
    private javax.swing.JTable tblPenyedia;
    private javax.swing.JTextField txtIdGudang;
    private javax.swing.JTextField txtIdPenyedia;
    private javax.swing.JTextField txtIdPetugas;
    private javax.swing.JTextField txtKapasitasGudang;
    private javax.swing.JTextField txtNamaGudang;
    private javax.swing.JTextField txtNamaPenyedia;
    private javax.swing.JTextField txtNamaPetugas;
    // End of variables declaration//GEN-END:variables
}
