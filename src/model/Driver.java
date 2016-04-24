package model;

import view.Menu_Login;

public class Driver {
    
    public static void main(String[] args) {
        
        Menu_Login mlogin = new Menu_Login();
        mlogin.setVisible(true);
        
        
        Aplikasi a = new Aplikasi();
        a.Main_Menu();
        
        
    }
}
