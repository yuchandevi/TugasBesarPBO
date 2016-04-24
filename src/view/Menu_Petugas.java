package view;

import controller.ControllerPetugas;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Aplikasi;
import model.Petugas;

public class Menu_Petugas extends javax.swing.JFrame {
    
    //attribut
    private Petugas petugas;
    private Aplikasi aplikasi;
    private ControllerPetugas cp;
    
    //konstruktor
    public Menu_Petugas() {
        initComponents();
    }
    public Menu_Petugas(Petugas p, Aplikasi app) {
        initComponents();
        this.petugas = p;
        this.aplikasi = app;
        this.cp = new ControllerPetugas(petugas,aplikasi,this);
    }
    
    /* untuk pindah panel */
    public JComboBox getCmbPilihMenu(){
        return this.cmbPilihMenuPetugas;
    }    
    public JPanel getMenuTambahBarang(){
        return this.Menu_tambah_barang;
    }    
    public JPanel getMenuHapusBarang(){
        return this.Menu_hapus_barang;
    }    
    public JPanel getMenuLihatBarang(){
        return this.Menu_lihat_barang;
    }
    public JPanel getMenuEditBarang(){
        return this.Menu_edit_barang;
    }
    
    /* untuk menu tambah barang */
    public JTextField getNamaBarangTambah(){
        return this.txtNamaBarang;
    }    
    public JTextField getJumlahBarangTambah(){
        return this.txtJumlahBarang;
    }    
    public JTextField getNamaPeyediaTambah(){
        return this.txtNamaPenyedia;
    }

    /* untuk menu hapus barang */
    public JTable getTableHapus(){
        return this.tableHapusBarang;
    }    
    public JComboBox getCmbHapus(){
        return this.cmbHapusBarang;
    }
    
    /* untuk menu lihat barang */
    public JComboBox getCmbLihat(){
        return this.cmbLihatBarang;
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
    
    /*untuk menu edit barang */
    public JTextField getNamaBarangEdit(){
        return this.txtNamaBarangCari;
    }    
    public JTextField getJumlahBarangEdit(){
        return this.txtJumlahBarangBaru;
    }
    public JTable getTableEdit(){
        return this.tblBarangEdit;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPilihMenuPetugas = new javax.swing.JComboBox();
        btnPilih = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Menu_tambah_barang = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtJumlahBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNamaPenyedia = new javax.swing.JTextField();
        Menu_hapus_barang = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHapusBarang = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cmbHapusBarang = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        Menu_edit_barang = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBarangEdit = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNamaBarangCari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtJumlahBarangBaru = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Menu_lihat_barang = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbLihatBarang = new javax.swing.JComboBox();
        btnLihat = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNamaBarang = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblIdBarang = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblJumlah = new javax.swing.JLabel();
        btnBackToLogin = new javax.swing.JButton();

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
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 36)); // NOI18N
        jLabel1.setText("Selamat Datang!");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        jLabel2.setText("-Petugas-");

        jLabel3.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        jLabel3.setText("Silahkan Pilih Menu:");

        cmbPilihMenuPetugas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu Tambah Barang", "Menu Hapus Barang", "Menu Edit Barang", "Menu Lihat Barang" }));

        btnPilih.setText("pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.CardLayout());

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Mincho Light", 1, 18)); // NOI18N
        jLabel4.setText("Menu Tambah Barang");

        jLabel5.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel5.setText("Nama Barang :");

        jLabel6.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah Barang :");

        jLabel7.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        jLabel7.setText("Nama Penyedia :");

        javax.swing.GroupLayout Menu_tambah_barangLayout = new javax.swing.GroupLayout(Menu_tambah_barang);
        Menu_tambah_barang.setLayout(Menu_tambah_barangLayout);
        Menu_tambah_barangLayout.setHorizontalGroup(
            Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Menu_tambah_barangLayout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(jLabel4))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_tambah_barangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7)
                    .addGap(86, 86, 86)
                    .addComponent(txtNamaPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
            .addGroup(Menu_tambah_barangLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(btnTambah))
            .addGroup(Menu_tambah_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(88, 88, 88)
                .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Menu_tambah_barangLayout.setVerticalGroup(
            Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_tambah_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(52, 52, 52)
                .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_tambah_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNamaPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnTambah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_tambah_barang, "card2");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tableHapusBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nama ", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHapusBarang);

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
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_hapus_barang, "card3");

        tblBarangEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nama ", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBarangEdit);

        jLabel8.setFont(new java.awt.Font("Yu Mincho Light", 1, 24)); // NOI18N
        jLabel8.setText("Menu Edit Barang");

        jLabel9.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        jLabel9.setText("Input Data Edit Barang");

        jLabel10.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        jLabel10.setText("Nama Barang: ");

        jLabel11.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        jLabel11.setText("Jumlah Barang:");

        jLabel12.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        jLabel12.setText("List Barang");

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_edit_barangLayout = new javax.swing.GroupLayout(Menu_edit_barang);
        Menu_edit_barang.setLayout(Menu_edit_barangLayout);
        Menu_edit_barangLayout.setHorizontalGroup(
            Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_edit_barangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(29, 29, 29)
                                .addComponent(txtNamaBarangCari, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_edit_barangLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJumlahBarangBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Menu_edit_barangLayout.setVerticalGroup(
            Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_edit_barangLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNamaBarangCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Menu_edit_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtJumlahBarangBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_edit_barang, "card4");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Silahkan Pilih Index Barang");

        jLabel14.setFont(new java.awt.Font("Yu Mincho Light", 1, 24)); // NOI18N
        jLabel14.setText("Menu Lihat Barang");

        btnLihat.setText("Lihat");
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("DATA BARANG");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Nama: ");

        lblNamaBarang.setText("jLabel11");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Id barang:");

        lblIdBarang.setText("jLabel12");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Jumlah:");

        lblJumlah.setText("jLabel17");

        javax.swing.GroupLayout Menu_lihat_barangLayout = new javax.swing.GroupLayout(Menu_lihat_barang);
        Menu_lihat_barang.setLayout(Menu_lihat_barangLayout);
        Menu_lihat_barangLayout.setHorizontalGroup(
            Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_lihat_barangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(btnLihat)
                    .addComponent(cmbLihatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16))
                        .addGap(37, 37, 37)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaBarang)
                            .addComponent(lblIdBarang)
                            .addComponent(lblJumlah))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        Menu_lihat_barangLayout.setVerticalGroup(
            Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_lihat_barangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbLihatBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnLihat))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Menu_lihat_barangLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblNamaBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblIdBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_lihat_barangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblJumlah))))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jPanel1.add(Menu_lihat_barang, "card5");

        btnBackToLogin.setText("back to login");
        btnBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbPilihMenuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPilih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackToLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPilihMenuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPilih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackToLogin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        cp.pilihPanel();
    }//GEN-LAST:event_btnPilihActionPerformed

    private void btnBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToLoginActionPerformed
        cp.backToLogin();
    }//GEN-LAST:event_btnBackToLoginActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        cp.lihatBarang();
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        cp.tambahBarang();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        cp.hapusBarang();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cp.editBarang();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu_edit_barang;
    private javax.swing.JPanel Menu_hapus_barang;
    private javax.swing.JPanel Menu_lihat_barang;
    private javax.swing.JPanel Menu_tambah_barang;
    private javax.swing.JButton btnBackToLogin;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cmbHapusBarang;
    private javax.swing.JComboBox cmbLihatBarang;
    private javax.swing.JComboBox cmbPilihMenuPetugas;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdBarang;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblNamaBarang;
    private javax.swing.JTable tableHapusBarang;
    private javax.swing.JTable tblBarangEdit;
    private javax.swing.JTextField txtJumlahBarang;
    private javax.swing.JTextField txtJumlahBarangBaru;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaBarangCari;
    private javax.swing.JTextField txtNamaPenyedia;
    // End of variables declaration//GEN-END:variables
}
