package controller;

import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Penyedia;
import model.Petugas;
import view.Menu_Login;
import view.Menu_Penyedia;
import view.Menu_Petugas;
import view.Menu_Pilih_Gudang;
import view.Menu_Sign_up;

public class ControllerLogIn {
    
    //attribut
    private Penyedia penyedia;
    private Petugas petugas;
    private Aplikasi aplikasi;
    private Menu_Login mlogin;
    private ControllerSignUp csu;
    
    //konstruktor
    public ControllerLogIn(){
        
    }
    public ControllerLogIn(Menu_Login mlogin){
        this.mlogin = mlogin;
        this.aplikasi = mlogin.getAplikasi();
    }
    
    //ke menu sign up
    public void pindahSignUp(){
        Menu_Sign_up msu;
        if(aplikasi != null){
            System.out.println("masuk");
            msu = new Menu_Sign_up(aplikasi);
        }else{
            msu = new Menu_Sign_up();
        }
        msu.setVisible(true);
        mlogin.dispose();
    }
    
    //melakukan login
    public void login(){
        try{
            String username = mlogin.getTxtUsername().getText();
            long password = Long.parseLong(mlogin.getTxtPassword().getText());
            for(int i=0; i<aplikasi.getDaftarPenyedia().size(); i++){
                if(aplikasi.getDaftarPenyedia().get(i).getNama().equals(username) &&
                        aplikasi.getDaftarPenyedia().get(i).getId() == password){
                    JOptionPane.showMessageDialog(mlogin,"Login Penyedia Berhasil","Sukses !",1);
                    Menu_Penyedia mp = new Menu_Penyedia(aplikasi.getDaftarPenyedia().get(i), aplikasi);
                    mp.setVisible(true);
                    mlogin.dispose();
                    break;
                }
            }
            for(int i=0; i<aplikasi.getDaftarPetugas().size(); i++){
                if(aplikasi.getDaftarPetugas().get(i).getNama().equals(username) &&
                        aplikasi.getDaftarPetugas().get(i).getId() == password){
                    JOptionPane.showMessageDialog(mlogin,"Login Petugas Berhasil","Sukses !",1);
                    if(aplikasi.getDaftarPetugas().get(i).getG() == null){
                        Menu_Pilih_Gudang mp = new Menu_Pilih_Gudang(aplikasi.getDaftarPetugas().get(i), aplikasi);
                        mp.setVisible(true);
                        mlogin.dispose();
                    }else{
                        Menu_Petugas mp = new Menu_Petugas(aplikasi.getDaftarPetugas().get(i), aplikasi);
                        mp.setVisible(true);
                        mlogin.dispose();
                    }
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(mlogin,e.getMessage(),"Error !",0);
        }
    }
}
