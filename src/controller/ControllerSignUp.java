package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Aplikasi;
import model.Gudang;
import model.Penyedia;
import model.Petugas;
import view.Menu_Login;
import view.Menu_Sign_up;

public class ControllerSignUp {
    
    //attribut
    private Gudang gudang;
    private Penyedia penyedia;
    private Petugas petugas;
    private Menu_Sign_up msu;
    private Aplikasi aplikasi;
    
    //constructor
    public ControllerSignUp(){
        
    }
    public ControllerSignUp(Menu_Sign_up msu){
        this.msu = msu;
        this.aplikasi = new Aplikasi(this);
    }
    public ControllerSignUp(Menu_Sign_up msu, Aplikasi app){
        this.msu = msu;
        this.aplikasi = app;
    }

    //setter getter
    public Gudang getGudang() {
        return gudang;
    }
    public void setGudang(Gudang gudang) {
        this.gudang = gudang;
    }
    public Penyedia getPenyedia() {
        return penyedia;
    }
    public void setPenyedia(Penyedia penyedia) {
        this.penyedia = penyedia;
    }
    public Petugas getPetugas() {
        return petugas;
    }
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
    public Menu_Sign_up getMsu() {
        return msu;
    }
    public void setMsu(Menu_Sign_up msu) {
        this.msu = msu;
    }
    public Aplikasi getAplikasi(){
        return this.aplikasi;
    }
    public void setAplikasi(Aplikasi aplikasi){
        this.aplikasi = aplikasi;
    }
    
    /* method untuk pilih panel */
    public void pilihPanel(){
        if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Tambah Penyedia")){
            msu.getMenuTambahPenyedia().setVisible(true);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Lihat Penyedia")){
            msu.getLblNamaPenyedia().setText("");
            msu.getLblIdPenyedia().setText("");
            tampilIndexkeCmbPilihIdPenyedia();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(true);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Hapus Penyedia")){
            tampilIndexkeCmbHapusPenyedia();
            tampilPenyediakeTableHapus();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(true);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Tambah Petugas")){
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(true);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Lihat Petugas")){
            msu.getLblNamaPetugas().setText("");
            msu.getLblIdPetugas().setText("");
            tampilIndexkeCmbPilihIdPetugas();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(true);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Hapus Petugas")){
            tampilIndexkeCmbHapusPetugas();
            tampilPetugaskeTableHapus();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(true);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Tambah Gudang")){
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(true);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(false);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Lihat Gudang")){
            msu.getLblNamaGudang().setText("");
            msu.getLblIdGudang().setText("");
            msu.getLblJumlahStokGudang().setText("");
            tampilIndexkeCmbPilihIdGudang();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(false);
            msu.getMenuLihatGudang().setVisible(true);
        }else if(String.valueOf(msu.getCmbPilihMenu().getSelectedItem()).equals("Menu Hapus Gudang")){
            tampilIndexkeCmbHapusGudang();
            tampilGudangkeTableHapus();
            msu.getMenuTambahPenyedia().setVisible(false);
            msu.getMenuHapusPenyedia().setVisible(false);
            msu.getMenuLihatPenyedia().setVisible(false);
            msu.getMenuTambahPetugas().setVisible(false);
            msu.getMenuHapusPetugas().setVisible(false);
            msu.getMenuLihatPetugas().setVisible(false);
            msu.getMenuTambahGudang().setVisible(false);
            msu.getMenuHapusGudang().setVisible(true);
            msu.getMenuLihatGudang().setVisible(false);
        }
    }
 
    /* method untuk tambah penyedia */
    public void tambahPenyedia(){
        try{
            String nama_penyedia = msu.getTxtNamaPenyedia().getText();
            long id_penyedia = Long.parseLong(msu.getTxtIdPenyedia().getText());
            boolean belum = true;
            for(int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
                if(aplikasi.getDaftarPenyedia().get(i).getId() == id_penyedia){
                    JOptionPane.showMessageDialog(msu,"Id Sudah Digunakan Penyedia Lain","Error !",0);
                    belum = false;
                    break;
                }
            }
            if(belum){
                aplikasi.addPenyedia(nama_penyedia, id_penyedia);
                JOptionPane.showMessageDialog(msu,"Penyedia Berhasil Ditambahkan","Sukses !",1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,e.getMessage(),"Error !",0);
        }
    }
    
    /* method untuk lihat penyedia */
    public void tampilIndexkeCmbPilihIdPenyedia(){
        msu.getCmbPilihIdPenyedia().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
            msu.getCmbPilihIdPenyedia().addItem(aplikasi.getDaftarPenyedia().get(i).getId());
        }
    }    
    public void lihatPenyedia(){
        try{
            long id_penyedia = Long.parseLong(String.valueOf(msu.getCmbPilihIdPenyedia().getSelectedItem()));
            msu.getLblNamaPenyedia().setText(aplikasi.getPenyedia(id_penyedia).getNama());
            msu.getLblIdPenyedia().setText(String.valueOf(aplikasi.getPenyedia(id_penyedia).getId()));
            JOptionPane.showMessageDialog(msu,"Penyedia Ditemukan","Sukses !",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Penyedia Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk hapus penyedia */
    public void tampilPenyediakeTableHapus(){
        String[] kolom = {"Nama", "Id Penyedia"};
        Object[][] objTable = new Object[aplikasi.getDaftarPenyedia().size()][3];
        for(int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
            String[] data = {
                aplikasi.getPenyedia(aplikasi.getDaftarPenyedia().get(i).getId()).getNama(),
                String.valueOf(aplikasi.getPenyedia(aplikasi.getDaftarPenyedia().get(i).getId()).getId())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        msu.getTblPenyedia().setModel(tm);
    }    
    public void tampilIndexkeCmbHapusPenyedia(){
        msu.getCmbHapusIdPenyedia().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
            msu.getCmbHapusIdPenyedia().addItem(aplikasi.getDaftarPenyedia().get(i).getId());
        }
    }    
    public void hapusPenyedia(){
        try{
            long id_penyedia = Long.parseLong(String.valueOf(msu.getCmbHapusIdPenyedia().getSelectedItem()));
            aplikasi.deletePenyedia(id_penyedia);
            JOptionPane.showMessageDialog(msu,"Penyedia Berhasil Dihapus","Sukses !",1);
            tampilPenyediakeTableHapus();
            tampilIndexkeCmbHapusPenyedia();
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Penyedia Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk tambah petugas */
    public void tambahPetugas(){
        try{
            String nama_petugas = msu.getTxtNamaPetugas().getText();
            long id_petugas = Long.parseLong(msu.getTxtIdPetugas().getText());
            boolean belum = true;
            for(int i=0; i<aplikasi.getDaftarPetugas().size(); i++){
                if(aplikasi.getDaftarPetugas().get(i).getId() == id_petugas){
                    JOptionPane.showMessageDialog(msu,"Id Sudah Digunakan Petugas Lain","Error !",0);
                    belum = false;
                    break;
                }
            }
            if(belum){
                aplikasi.addPetugas(nama_petugas, id_petugas);
                JOptionPane.showMessageDialog(msu,"Petugas Berhasil Ditambahkan","Sukses !",1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,e.getMessage(),"Error !",0);
        }
    }
    
    /* method untuk lihat petugas */
    public void tampilIndexkeCmbPilihIdPetugas(){
        msu.getCmbPilihIdPetugas().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarPetugas().size(); i++){
            msu.getCmbPilihIdPetugas().addItem(aplikasi.getDaftarPetugas().get(i).getId());
        }
    }    
    public void lihatPetugas(){
        try{
            long id_petugas = Long.parseLong(String.valueOf(msu.getCmbPilihIdPetugas().getSelectedItem()));
            msu.getLblNamaPetugas().setText(aplikasi.getPetugas(id_petugas).getNama());
            msu.getLblIdPetugas().setText(String.valueOf(aplikasi.getPetugas(id_petugas).getId()));
            JOptionPane.showMessageDialog(msu,"Petugas Ditemukan","Sukses !",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Petugas Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk hapus petugas */
    public void tampilPetugaskeTableHapus(){
        String[] kolom = {"Nama", "Id Petugas"};
        Object[][] objTable = new Object[aplikasi.getDaftarPetugas().size()][3];
        for(int i=0; i<aplikasi.getDaftarPetugas().size(); i++){
            String[] data = {
                aplikasi.getPetugas(aplikasi.getDaftarPetugas().get(i).getId()).getNama(),
                String.valueOf(aplikasi.getPetugas(aplikasi.getDaftarPetugas().get(i).getId()).getId())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        msu.getTblPetugas().setModel(tm);
    }    
    public void tampilIndexkeCmbHapusPetugas(){
        msu.getCmbHapusIdPetugas().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarPetugas().size(); i++){
            msu.getCmbHapusIdPetugas().addItem(aplikasi.getDaftarPetugas().get(i).getId());
        }
    }    
    public void hapusPetugas(){
        try{
            long id_petugas = Long.parseLong(String.valueOf(msu.getCmbHapusIdPetugas().getSelectedItem()));
            aplikasi.deletePetugas(id_petugas);
            JOptionPane.showMessageDialog(msu,"Petugas Berhasil Dihapus","Sukses !",1);
            tampilPetugaskeTableHapus();
            tampilIndexkeCmbHapusPetugas();
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Petugas Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk tambah gudang */
    public void tambahGudang(){
        try{
            String nama_gudang = msu.getTxtNamaGudang().getText();
            long id_gudang = Long.parseLong(msu.getTxtIdGudang().getText());
            int jumlah_stok = Integer.parseInt(msu.getTxtJumlahStok().getText());
            boolean belum = true;
            for(int i=0; i<aplikasi.getDaftarGudang().size(); i++){
                if(aplikasi.getDaftarGudang().get(i).getId() == id_gudang
                        || aplikasi.getDaftarGudang().get(i).getNama_gudang().equals(nama_gudang)){
                    JOptionPane.showMessageDialog(msu,"Id atau Nama Sudah Digunakan Gudang Lain","Error !",0);
                    belum = false;
                    break;
                }
            }
            if(belum){
                aplikasi.addGudang(id_gudang, jumlah_stok, nama_gudang);
                JOptionPane.showMessageDialog(msu,"Gudang Berhasil Ditambahkan","Sukses !",1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,e.getMessage(),"Error !",0);
        }
    }
    
    /* method untuk lihat gudang */
    public void tampilIndexkeCmbPilihIdGudang(){
        msu.getCmbPilihIdGudang().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarGudang().size(); i++){
            msu.getCmbPilihIdGudang().addItem(aplikasi.getDaftarGudang().get(i).getId());
        }
    }    
    public void lihatGudang(){
        try{
            long id_gudang = Long.parseLong(String.valueOf(msu.getCmbPilihIdGudang().getSelectedItem()));
            msu.getLblNamaGudang().setText(aplikasi.getGudang(id_gudang).getNama_gudang());
            msu.getLblIdGudang().setText(String.valueOf(aplikasi.getGudang(id_gudang).getId()));
            msu.getLblJumlahStokGudang().setText(String.valueOf(aplikasi.getGudang(id_gudang).getKapasitas()));
            JOptionPane.showMessageDialog(msu,"Gudang Ditemukan","Sukses !",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Gudang Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk hapus gudang */
    public void tampilGudangkeTableHapus(){
        String[] kolom = {"Nama", "Id Gudang", "Kapasitas"};
        Object[][] objTable = new Object[aplikasi.getDaftarGudang().size()][3];
        for(int i=0; i<aplikasi.getDaftarGudang().size(); i++){
            String[] data = {
                aplikasi.getGudang(aplikasi.getDaftarGudang().get(i).getId()).getNama_gudang(),
                String.valueOf(aplikasi.getGudang(aplikasi.getDaftarGudang().get(i).getId()).getId()),
                String.valueOf(aplikasi.getGudang(aplikasi.getDaftarGudang().get(i).getId()).getKapasitas())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        msu.getTblGudang().setModel(tm);
    }    
    public void tampilIndexkeCmbHapusGudang(){
        msu.getCmbHapusIdGudang().removeAllItems();
        for(int i=0; i<aplikasi.getDaftarGudang().size(); i++){
            msu.getCmbHapusIdGudang().addItem(aplikasi.getDaftarGudang().get(i).getId());
        }
    }    
    public void hapusGudang(){
        try{
            long id_gudang = Long.parseLong(String.valueOf(msu.getCmbHapusIdGudang().getSelectedItem()));
            aplikasi.deleteGudang(id_gudang);
            JOptionPane.showMessageDialog(msu,"Gudang Berhasil Dihapus","Sukses !",1);
            tampilGudangkeTableHapus();
            tampilIndexkeCmbHapusGudang();
        }catch(Exception e){
            JOptionPane.showMessageDialog(msu,"Gudang Tidak Tersedia","Error !",0);
        }
    }
    
    /* login */
    public void backToLogin(){
        Menu_Login mlogin = new Menu_Login(aplikasi);
        mlogin.setVisible(true);
        msu.dispose();
    }
}
