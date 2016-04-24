package model;

import controller.ControllerLogIn;
import controller.ControllerSignUp;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplikasi {
    
    //attribut
    private ArrayList<Penyedia> daftarPenyedia = new ArrayList();
    private ArrayList<Petugas> daftarPetugas = new ArrayList();
    private ArrayList<Gudang> daftarGudang = new ArrayList();
    private ControllerSignUp csu;
    private ControllerLogIn cli;
    
    //constructor
    public Aplikasi(){
        
    }
    public Aplikasi(ControllerSignUp csu){
        this.csu = csu;
    }
    public Aplikasi(ControllerLogIn cli){
        this.cli = cli;
    }
    
    //setter getter
    public ArrayList<Penyedia> getDaftarPenyedia() {
        return daftarPenyedia;
    }
    public void setDaftarPenyedia(ArrayList<Penyedia> daftarPenyedia) {
        this.daftarPenyedia = daftarPenyedia;
    }
    public ArrayList<Petugas> getDaftarPetugas() {
        return daftarPetugas;
    }
    public void setDaftarPetugas(ArrayList<Petugas> daftarPetugas) {
        this.daftarPetugas = daftarPetugas;
    }
    public ArrayList<Gudang> getDaftarGudang() {
        return daftarGudang;
    }
    public void setDaftarGudang(ArrayList<Gudang> daftarGudang) {
        this.daftarGudang = daftarGudang;
    }
    public ControllerSignUp getCsu(){
        return this.csu;
    }
    public void setControlSignUp(ControllerSignUp csu){
        this.csu = csu;
    }
    
    //method penting
    public void addPetugas(String nama, long id){
       Petugas pe = new Petugas(nama,id);
       daftarPetugas.add(pe);
   }   
    public Petugas getPetugas(long id){
       int indeks = 0;
       for(int i=0; i<daftarPetugas.size() ; i++){
           if (daftarPetugas.get(i).getId() == id){
                indeks = i;
                break;
           }
       }
       return(daftarPetugas.get(indeks));
   }
    public void deletePetugas(long id){
      for (int i = 0; i<daftarPetugas.size(); i++){
          if(daftarPetugas.get(i).getId() == id){
              daftarPetugas.remove(i);
              break;
          }
      }
   }
      
    public void addPenyedia(String nama, long id){
       Penyedia pa = new Penyedia(nama,id);
       daftarPenyedia.add(pa);
    }   
    public Penyedia getPenyedia(long id){
        int indeks = 0;
        for(int i=0; i<daftarPenyedia.size(); i++){
            if (daftarPenyedia.get(i).getId() == id){
                indeks = i;
                break;
            }
        }
        return(daftarPenyedia.get(indeks));
    }    
    public void deletePenyedia(long id){
        for (int i = 0; i<daftarPenyedia.size(); i++){
            if(daftarPenyedia.get(i).getId() == id){
                daftarPenyedia.remove(i);
                break;
            }
        }
    }    
    
    public void addGudang(long id, int kapasitas, String nama_gudang){
       Gudang gd = new Gudang(id,kapasitas,nama_gudang);
       daftarGudang.add(gd);
   }   
    public Gudang getGudang(long id){
        int indeks = 0;
        for(int i=0; i<daftarGudang.size(); i++){
            if (daftarGudang.get(i).getId() == id){
                indeks = i;
                break;
            }
        }
        return(daftarGudang.get(indeks));
    }   
    public void deleteGudang(long id){
        for (int i = 0; i<daftarGudang.size(); i++){
            if(daftarGudang.get(i).getId() == id){
                daftarGudang.remove(i);
                break;
            }
        }
    }
   
    //method menu consol
    public void MenuAddPenyedia(){
       String nama;
       long id;
       
       Scanner a = new Scanner(System.in);
       System.out.print("Input Nama Penyedia: ");
       nama = a.next();
       System.out.print("Input Id Penyedia: ");
       id = a.nextLong();
       
       addPenyedia(nama,id);
   }   
    public void MenuAddPetugas(){
       String nama;
       long id;
       
       Scanner b = new Scanner(System.in);
       System.out.print("Input Nama Petugas: ");
       nama = b.next();
       System.out.print("Input id Penyedia: ");
       id = b.nextLong();
       
       addPetugas(nama,id);
   }   
    public void MenuLihatPetugas(){
       long id;
       
       Scanner c = new Scanner(System.in);
       System.out.print("id petugas yang ingin di lihat: ");
       id = c.nextLong();
       for (int i = 0; i<daftarPetugas.size(); i++){
           if (daftarPetugas.get(i).getId() == id){
               System.out.println("Petugas bernama: "+getPetugas(id).getNama());
           }else
               System.out.println("Tidak dapat petugas dengan ID tersebut");
       }
       
   }
    public void MenuHapusPetugas(){
       long id;
       
       Scanner c = new Scanner(System.in);
       System.out.print("Masukkan ID petugas yang ingin di hapus: ");
       id = c.nextLong();
       deletePetugas(id);
   }   
    public void MenuLihatPenyedia(){
       long id;
       Scanner c = new Scanner(System.in);
       System.out.print("Masukkan ID penyedia yang ingin di lihat: ");
       id = c.nextLong();
       for (int i = 0; i<daftarPenyedia.size() ;i++ )
            if (daftarPenyedia.get(i).getId() == id){
                System.out.println("Penyedia bernama: "+getPenyedia(id).getNama());
            }else
               System.out.println("Tidak terdapat penyedia dengan ID tersebut!");
            
   }   
    public void MenuHapusPenyedia(){
       long id;
       
       Scanner c = new Scanner(System.in);
       System.out.print("Masukkan ID penyedia yang ingin di hapus: ");
       id = c.nextLong();
       deletePenyedia(id);
   }   
    public void MenuTambahGudang(){
       long id;
       int kapasitas; 
       String nama_gudang;
       
       Scanner b = new Scanner(System.in);
       System.out.print("Input nama Gudang: ");
       nama_gudang = b.next();
       System.out.print("Input kapasitas Gudang: ");
       kapasitas = b.nextInt();
       System.out.print("Input id: ");
       id = b.nextLong();
       
       addGudang(id,kapasitas,nama_gudang);
   }   
    public void MenuLihatGudang(){
       long id;
       
       Scanner c = new Scanner(System.in);
       System.out.print("id Gudang yang ingin di lihat: ");
       id = c.nextLong();
       System.out.println("Nama Gudang yang ingin di lihat: "+getGudang(id).getNama_gudang());
   }   
    public void MenuHapusGudang(){
       long id;
       
       Scanner c = new Scanner(System.in);
       System.out.print("Masukkan ID gudang yang ingin di hapus: ");
       id = c.nextLong();
       deleteGudang(id);
   }   
    public void MenuPetugas(Petugas p){
        Scanner c = new Scanner(System.in);
        int pil;
       
        String nama_gudang;
        int indeks_gudang = -1;
        
        if(p.getG() == null){
            //tambahan
            System.out.print("Masukkan Nama Gudang yang Akan di Gunakan Petugas : ");
            nama_gudang = c.next();
            for(int i=0; i<daftarGudang.size(); i++){
                if(daftarGudang.get(i).getNama_gudang().equals(nama_gudang)){
                   indeks_gudang = i;
                   p.setG(daftarGudang.get(indeks_gudang));
                   break;
                }
            }
        }else{
            indeks_gudang = 0;
        }
        
        //tambahan
        if(indeks_gudang != -1){
            System.out.println("======MENU PETUGAS======");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Edit Barang");
            System.out.println("4. Lihat Barang");
            System.out.println("5. Back");
            System.out.println("Masukkan Pilihan: ");
            pil = c.nextInt();
            switch(pil){
                case 1: {
                    MenuTambahBarang(p);
                    MenuPetugas(p);
                    break;
                }
                case 2: {
                    MenuHapusBarang(p);
                    MenuPetugas(p);
                    break;
                }
                case 3: {
                    MenuEditBarang(p);
                    MenuPetugas(p);
                    break;
                }
                case 4: {
                    MenuLihatBarang(p);
                    MenuPetugas(p);
                    break;
                }
                case 5 :{
                    Main_Menu();
                    break;
                }
            }
            //tambahan
        }else{
            System.out.println("Gudang tidak Ditemukan !");
            Main_Menu();
        }
    }   
    public void MenuTambahBarang(Petugas p){
        Scanner c = new Scanner(System.in);
        String nama;
        int jumlah;
        String nama_penyedia;
        System.out.print("Masukkan Nama Barang: ");
        nama = c.next();
        System.out.print("Masukkan Jumlah Barang: ");
        jumlah = c.nextInt();
        System.out.print("Masukkan nama penyedia: ");
        nama_penyedia = c.next();
        for (int i=0; i<daftarPenyedia.size(); i++){
            if (daftarPenyedia.get(i).getNama().equals(nama_penyedia)){
                p.addBarang(nama, jumlah, daftarPenyedia.get(i));
                break;
            }
        }
    }   
    public void MenuHapusBarang(Petugas p){
        Scanner c = new Scanner(System.in);
        int pil;
        for(int i = 0; i<p.getG().getBarangGudang().size() ; i++){
            System.out.println(i +"."+p.getG().getBarangGudang().get(i).getNama_barang());
        }
        System.out.print("Masukkan pilihan indeks pilihan anda: ");
        pil = c.nextInt();
        p.removeBarang(pil);
    }   
    public void MenuEditBarang(Petugas p){
        String nama;
        int jumlah;
        Scanner c = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        nama = c.next();
        System.out.print("Masukkan jumlah: ");
        jumlah = c.nextInt();

        p.editBarang(nama, jumlah);
    }   
    public void MenuLihatBarang(Petugas p){
        Scanner c = new Scanner(System.in);
        int pil;
        System.out.println("Daftar Barang yang Ada : ");
        for(int i = 0; i<p.getG().getBarangGudang().size() ; i++){
            System.out.println(i +"."+p.getG().getBarangGudang().get(i).getNama_barang());
        }
        System.out.print("Masukkan pilihan indeks dari Barang anda: ");
        pil = c.nextInt();
        System.out.println("Informasi Barang : ");
        System.out.println("Nama   : "+p.getBarang(pil).getNama_barang());
        System.out.println("Id     : "+p.getBarang(pil).getId());
        System.out.println("Jumlah : "+p.getBarang(pil).getJumlah_stok());
    }
    public void Main_Menu(){
        
        Scanner s = new Scanner(System.in);
        
        int pilihan;
        
        System.out.println("====Main Menu====");
        System.out.println("1. Tambah Penyedia");
        System.out.println("2. Lihat Penyedia");
        System.out.println("3. Hapus Penyedia");
        
        System.out.println("4. Tambah Petugas");
        System.out.println("5. Lihat Petugas");
        System.out.println("6. Hapus Petugas");
        
        System.out.println("7. Tambah Gudang");
        System.out.println("8. Lihat Gudang");
        System.out.println("9. Hapus Gudang");
        
        System.out.println("10. Login");
        
        System.out.print("Masukkan Pilihan : ");
        pilihan = s.nextInt();
        
        switch(pilihan){
            
            case 1 :{
                MenuAddPenyedia();
                Main_Menu();
                break;
            }
            case 2 :{
                MenuLihatPenyedia();
                Main_Menu();
                break;
            }
            case 3 :{
                MenuHapusPenyedia();
                Main_Menu();
                break;
            }
            case 4 :{
                MenuAddPetugas();
                Main_Menu();
                break;
            }
            case 5 :{
                MenuLihatPetugas();
                Main_Menu();
                break;
            }
            case 6 :{
                MenuHapusPetugas();
                Main_Menu();
                break;
            }
            case 7 :{
                MenuTambahGudang();
                Main_Menu();
                break;
            }
            case 8 :{
                MenuLihatGudang();
                Main_Menu();
                break;
            }
            case 9 :{
                MenuHapusGudang();
                Main_Menu();
                break;
            }
            case 10 :{
                MenuLogin();
                break;
            }
        }
    }    
    public void MenuLogin(){
        Scanner s = new Scanner(System.in);
        String nama;
        long id;
        System.out.print("Nama  : ");
        nama = s.next();
        System.out.print("Id    : ");
        id = s.nextLong();
        
        int indeks_petugas = 0; 
        for(int i=0; i<daftarPetugas.size(); i++){
            if(daftarPetugas.get(i).getNama().equals(nama) && daftarPetugas.get(i).getId() == id){
                indeks_petugas = i;
                MenuPetugas(daftarPetugas.get(indeks_petugas));
                break;
            }
        }
        System.out.println("Bukan Petugas");
        
        int indeks_penyedia = 0; 
        for(int i=0; i<daftarPenyedia.size(); i++){
            if(daftarPenyedia.get(i).getNama().equals(nama) && daftarPenyedia.get(i).getId() == id){
                indeks_penyedia = i;
                MenuPenyedia(daftarPenyedia.get(indeks_penyedia));
                break;
            }
        }
        System.out.println("Bukan Penyedia");
        
        Main_Menu();
    }    
    public void MenuPenyedia(Penyedia p){
        Scanner c = new Scanner(System.in);
        int pil;
       
        //tambahan
        System.out.println("======MENU PENYEDIA======");
        System.out.println("1. Buat Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Lihat Barang");
        System.out.println("4. Back");
        System.out.println("Masukkan Pilihan: ");
        pil = c.nextInt();
        switch(pil){
            case 1: {
                MenuBuatBarangPenyedia(p);
                MenuPenyedia(p);
                break;
            }
            case 2: {
                MenuHapusBarangPenyedia(p);
                MenuPenyedia(p);
                break;
            }
            case 3: {
                MenuLihatBarangPenyedia(p);
                MenuPenyedia(p);
                break;
            }
            case 4 :{
                Main_Menu();
                break;
            }
        }
    }    
    public void MenuBuatBarangPenyedia(Penyedia p){
        Scanner s = new Scanner(System.in);
        String nama;
        long id;
        int jumlah;
        
        System.out.print("Masukkan Nama Barang      : ");
        nama = s.next();
        System.out.println("Masukkan Id Barang      : ");
        id = s.nextLong();
        System.out.println("Masukkan Jumlah Barang  : ");
        jumlah = s.nextInt();
        
        p.Createbarang(id, jumlah, nama);
    }
    public void MenuHapusBarangPenyedia(Penyedia p){
        Scanner s = new Scanner(System.in);
        int pil;
        
        System.out.println("Daftar Barang yang Bisa Di Hapus : ");
        for(int i=0; i<p.getDaftarBarang().size(); i++){
            System.out.println(i+". "+p.getDaftarBarang().get(i).getNama_barang());
        }
        System.out.print("Masukkan indeks yang mau di Hapus : ");
        pil = s.nextInt();
        
        p.removeBarang(pil);
    }    
    public void MenuLihatBarangPenyedia(Penyedia p){
        Scanner s = new Scanner(System.in);
        int pil;
        
        System.out.println("Daftar Barang : ");
        for(int i=0; i<p.getDaftarBarang().size(); i++){
            System.out.println(i+". "+p.getDaftarBarang().get(i).getNama_barang());
        }
        System.out.print("Masukkan indeks yang mau di Lihat : ");
        pil = s.nextInt();
        
        System.out.println("Nama    : "+p.getBarang(pil).getNama_barang());
        System.out.println("Id      : "+p.getBarang(pil).getId());
        System.out.println("Jumlah  : "+p.getBarang(pil).getJumlah_stok());
    }

}
