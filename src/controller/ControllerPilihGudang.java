package controller;

import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Petugas;
import view.Menu_Login;
import view.Menu_Petugas;
import view.Menu_Pilih_Gudang;

public class ControllerPilihGudang {
    
    //attribut
    private Petugas petugas;
    private Aplikasi app;
    private Menu_Pilih_Gudang mpg;
    
    //konstruktor
    public ControllerPilihGudang(){
        
    }
    public ControllerPilihGudang(Petugas p, Aplikasi app, Menu_Pilih_Gudang mpg){
        this.petugas = p;
        this.app = app;
        this.mpg = mpg;
    }
    
    //masukkan data ke cmb
    public void inputDataCmb(){
        for(int i=0; i<app.getDaftarGudang().size(); i++){
            mpg.getCmbPilihGudang().addItem(app.getDaftarGudang().get(i).getNama_gudang());
        }
    }
    
    //method untuk back ke Login
    public void backToLogin(){
        Menu_Login mlogin = new Menu_Login(app);
        mlogin.setVisible(true);
        mpg.dispose();
    }
    
    //method pilih gudang
    public void pilihGudang(){
        try{
            String nama_gudang = String.valueOf(mpg.getCmbPilihGudang().getSelectedItem());
            for(int i=0; i<app.getDaftarGudang().size(); i++){
                if(app.getDaftarGudang().get(i).getNama_gudang().equals(nama_gudang)){
                    petugas.setG(app.getDaftarGudang().get(i));
                    JOptionPane.showMessageDialog(mpg,"Gudang Berhasil Digunakan","Sukses !",1);
                    Menu_Petugas mp = new Menu_Petugas(petugas,app);
                    mp.setVisible(true);
                    mpg.dispose();
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(mpg,"Belum Ada Data Gudang","Error !",0);
        }
    }
}
