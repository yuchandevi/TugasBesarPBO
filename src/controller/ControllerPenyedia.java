package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Aplikasi;
import model.Penyedia;
import view.Menu_Login;
import view.Menu_Penyedia;

public class ControllerPenyedia {
    
    //attribut
    private Penyedia pny;
    private Menu_Penyedia mpny;
    private Aplikasi app;
    
    //constructor
    public ControllerPenyedia(){
    }
    public ControllerPenyedia(Penyedia pny, Menu_Penyedia mpny, Aplikasi app){
        this.pny = pny;
        this.mpny = mpny;
        this.app = app;
    }

    //setter getter
    public Penyedia getPny() {
        return pny;
    }
    public void setPny(Penyedia pny) {
        this.pny = pny;
    }
    public Menu_Penyedia getMpny() {
        return mpny;
    }
    public void setMpny(Menu_Penyedia mpny) {
        this.mpny = mpny;
    }
    
    /* method untuk pilih panel */
    public void pilihPanel(){
        if(String.valueOf(mpny.getCmbPilihMenu().getSelectedItem()).equals("Menu Buat Barang")){
            mpny.getMenuBuatBarang().setVisible(true);
            mpny.getMenuHapusBarang().setVisible(false);
            mpny.getMenuLihatBarang().setVisible(false);
        }else if(String.valueOf(mpny.getCmbPilihMenu().getSelectedItem()).equals("Menu Hapus Barang")){
            tampilBarangkeTable();
            tampilIndexkeCmb();
            mpny.getMenuBuatBarang().setVisible(false);
            mpny.getMenuHapusBarang().setVisible(true);
            mpny.getMenuLihatBarang().setVisible(false);
        }else if(String.valueOf(mpny.getCmbPilihMenu().getSelectedItem()).equals("Menu Lihat Barang")){
            tampilIndexkeCmbLihat();
            mpny.getMenuBuatBarang().setVisible(false);
            mpny.getMenuHapusBarang().setVisible(false);
            mpny.getMenuLihatBarang().setVisible(true);
        }
    }
    
    /* method untuk create barang */
    public void buatBarang(){
        try{
            String nama_barang = mpny.getNamaTambah().getText();
            long id_barang = Long.parseLong(mpny.getIdTambah().getText());
            int jumlah_barang = Integer.parseInt(mpny.getJumlahTambah().getText());
            pny.Createbarang(id_barang, jumlah_barang, nama_barang);
            JOptionPane.showMessageDialog(mpny,"Barang Berhasil Ditambahkan","Sukses !",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(mpny,e.getMessage(),"Error !",0);
        }
    }
    
    /* method untuk hapus barang */
    public void tampilBarangkeTable(){
        String[] kolom = {"Index", "Nama", "Id Barang", "Jumlah"};
        Object[][] objTable = new Object[pny.getDaftarBarang().size()][4];
        for(int i=0; i<pny.getDaftarBarang().size(); i++){
            String[] data = {
                String.valueOf(i),
                pny.getBarang(i).getNama_barang(),
                String.valueOf(pny.getBarang(i).getId()),
                String.valueOf(pny.getBarang(i).getJumlah_stok())
            };
            objTable[i] = data;
        }
        TableModel tm = new DefaultTableModel(objTable,kolom);
        mpny.getTableHapus().setModel(tm);
    }    
    public void tampilIndexkeCmb(){
        mpny.getCmbHapus().removeAllItems();
        for(int i=0; i<pny.getDaftarBarang().size(); i++){
            mpny.getCmbHapus().addItem(i);
        }
    }    
    public void hapusBarang(){
        try{
            int index = Integer.parseInt(String.valueOf(mpny.getCmbHapus().getSelectedItem()));
            pny.removeBarang(index);
            JOptionPane.showMessageDialog(mpny,"Barang Berhasil Dihapus","Sukses !",1);
            tampilBarangkeTable();
            tampilIndexkeCmb();
        }catch(Exception e){
            JOptionPane.showMessageDialog(mpny,"Barang Tidak Tersedia","Error !",0);
        }
    }
    
    /* method untuk lihat barang */
    public void tampilIndexkeCmbLihat(){
        mpny.getCmbLihat().removeAllItems();
        for(int i=0; i<pny.getDaftarBarang().size(); i++){
            mpny.getCmbLihat().addItem(i);
        }
    }    
    public void lihatBarang(){
        try{
            int index = Integer.parseInt(String.valueOf(mpny.getCmbLihat().getSelectedItem()));
            mpny.getLblNama().setText(pny.getBarang(index).getNama_barang());
            mpny.getLblId().setText(String.valueOf(pny.getBarang(index).getId()));
            mpny.getLblJumlah().setText(String.valueOf(pny.getBarang(index).getJumlah_stok()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(mpny,"Barang Tidak Tersedia","Error !",0);
        }
    }
    
    //method untuk back ke Login
    public void backToLogin(){
        Menu_Login mlogin = new Menu_Login(app);
        mlogin.setVisible(true);
        mpny.dispose();
    }
}
