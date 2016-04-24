package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Aplikasi;
import model.Petugas;
import view.Menu_Login;
import view.Menu_Petugas;

public class ControllerPetugas {
    
    //attribut
    private Petugas petugas;
    private Aplikasi aplikasi;
    private Menu_Petugas mp;
    
    //konstruktor
    public ControllerPetugas(){
        
    }
    public ControllerPetugas(Petugas p, Aplikasi app, Menu_Petugas mp){
        this.petugas = p;
        this.aplikasi = app;
        this.mp = mp;
    }
    
    /* method untuk pilih panel */
    public void pilihPanel(){
        if(String.valueOf(mp.getCmbPilihMenu().getSelectedItem()).equals("Menu Tambah Barang")){
            mp.getMenuTambahBarang().setVisible(true);
            mp.getMenuHapusBarang().setVisible(false);
            mp.getMenuLihatBarang().setVisible(false);
            mp.getMenuEditBarang().setVisible(false);
        }else if(String.valueOf(mp.getCmbPilihMenu().getSelectedItem()).equals("Menu Hapus Barang")){
            tampilBarangkeTable();
            tampilIndexkeCmb();
            mp.getMenuTambahBarang().setVisible(false);
            mp.getMenuHapusBarang().setVisible(true);
            mp.getMenuLihatBarang().setVisible(false);
            mp.getMenuEditBarang().setVisible(false);
        }else if(String.valueOf(mp.getCmbPilihMenu().getSelectedItem()).equals("Menu Lihat Barang")){
            tampilIndexkeCmbLihat();
            mp.getMenuTambahBarang().setVisible(false);
            mp.getMenuHapusBarang().setVisible(false);
            mp.getMenuLihatBarang().setVisible(true);
            mp.getMenuEditBarang().setVisible(false);
        }else if(String.valueOf(mp.getCmbPilihMenu().getSelectedItem()).equals("Menu Edit Barang")){
            tampilBarangkeTableEdit();
            mp.getMenuTambahBarang().setVisible(false);
            mp.getMenuHapusBarang().setVisible(false);
            mp.getMenuLihatBarang().setVisible(false);
            mp.getMenuEditBarang().setVisible(true);
        }
    }
    
    //method untuk back ke Login
    public void backToLogin(){
        Menu_Login mlogin = new Menu_Login(aplikasi);
        mlogin.setVisible(true);
        mp.dispose();
    }
     
    //method tambah barang
    public void tambahBarang(){
        try{
            String nama_barang = mp.getNamaBarangTambah().getText();
            int jumlah_barang = Integer.parseInt(mp.getJumlahBarangTambah().getText());
            String nama_penyedia = mp.getNamaPeyediaTambah().getText();
            boolean penyedia_ketemu = false;
            for (int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
                if (aplikasi.getDaftarPenyedia().get(i).getNama().equals(nama_penyedia)){
                    petugas.addBarang(nama_barang, jumlah_barang, aplikasi.getDaftarPenyedia().get(i));
                    mp.getNamaBarangTambah().setText("");
                    mp.getJumlahBarangTambah().setText("");
                    mp.getNamaPeyediaTambah().setText("");
                    penyedia_ketemu = true;
                    break;
                }
            }
            if(penyedia_ketemu){
                JOptionPane.showMessageDialog(mp,"Barang Berhasil Ditambahkan","Sukses !",1);
            }else{
                JOptionPane.showMessageDialog(mp,"Penyedia Tidak Ditemukan","Error !",0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(mp,e.getMessage(),"Error !",0);
        }
    }
    
    //method lihat barang
    public void tampilIndexkeCmbLihat(){
        mp.getCmbLihat().removeAllItems();
        for(int i=0; i<petugas.getG().getBarangGudang().size(); i++){
            mp.getCmbLihat().addItem(i);
        }
    }    
    public void lihatBarang(){
        try{
            int index = Integer.parseInt(String.valueOf(mp.getCmbLihat().getSelectedItem()));
            mp.getLblNama().setText(petugas.getG().getBarangGudang().get(index).getNama_barang());
            mp.getLblId().setText(String.valueOf(petugas.getG().getBarangGudang().get(index).getId()));
            mp.getLblJumlah().setText(String.valueOf(petugas.getG().getBarangGudang().get(index).getJumlah_stok()));
            JOptionPane.showMessageDialog(mp,"Barang Berhasil Ditemukan","Sukses !",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(mp,"Barang Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk hapus barang */
    public void tampilBarangkeTable(){
        String[] kolom = {"Nama", "Id Barang", "Jumlah"};
        Object[][] objTable = new Object[petugas.getG().getBarangGudang().size()][4];
        for(int i=0; i<petugas.getG().getBarangGudang().size(); i++){
            String[] data = {
                petugas.getG().getBarang(i).getNama_barang(),
                String.valueOf(petugas.getG().getBarang(i).getId()),
                String.valueOf(petugas.getG().getBarang(i).getJumlah_stok())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        mp.getTableHapus().setModel(tm);
    }    
    public void tampilIndexkeCmb(){
        mp.getCmbHapus().removeAllItems();
        for(int i=0; i<petugas.getG().getBarangGudang().size(); i++){
            mp.getCmbHapus().addItem(i);
        }
    }    
    public void hapusBarang(){
        try{
            int index = Integer.parseInt(String.valueOf(mp.getCmbHapus().getSelectedItem()));
            petugas.removeBarang(index);
            JOptionPane.showMessageDialog(mp,"Barang Berhasil Dihapus","Sukses !",1);
            tampilBarangkeTable();
            tampilIndexkeCmb();
        }catch(Exception e){
            JOptionPane.showMessageDialog(mp,"Barang Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk edit barang */
    public void tampilBarangkeTableEdit(){
        String[] kolom = {"Nama", "Id Barang", "Jumlah"};
        Object[][] objTable = new Object[petugas.getG().getBarangGudang().size()][4];
        for(int i=0; i<petugas.getG().getBarangGudang().size(); i++){
            String[] data = {
                petugas.getG().getBarang(i).getNama_barang(),
                String.valueOf(petugas.getG().getBarang(i).getId()),
                String.valueOf(petugas.getG().getBarang(i).getJumlah_stok())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        mp.getTableEdit().setModel(tm);
    }
    public void editBarang(){
        try{
            String nama_barang = mp.getNamaBarangEdit().getText();
            int jumlah_barang = Integer.parseInt(mp.getJumlahBarangEdit().getText());
            petugas.editBarang(nama_barang, jumlah_barang);
            tampilBarangkeTableEdit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(mp,e.getMessage(),"Error !",0);
        }
    }
}
