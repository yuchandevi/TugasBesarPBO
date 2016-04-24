package model;

import java.util.ArrayList;

public class Penyedia extends Orang { 
   private ArrayList<Barang> daftarBarang = new ArrayList();
   
   public Penyedia(){
   }
   
    public Penyedia(String nama, long id){
        super(nama,id);
    }
   
    public void Createbarang(long id, int jumlah_stok, String nama_barang){
        Barang b = new Barang(id,jumlah_stok,nama_barang);
        daftarBarang.add(b);
    }
    
    public void lihatBarang(String nama){
        for (int i=0; i<daftarBarang.size(); i++){
            if (daftarBarang.get(i).getNama_barang().equals(nama)){
                System.out.println("Nama yang anda cari: "+daftarBarang.get(i).getNama_barang());
                break;
            }
        }
    }
    
    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
    
    @Override
    public Barang getBarang(int Indeks){
        Barang barangKetemu;
        barangKetemu = daftarBarang.get(Indeks);
        return(barangKetemu);
    }
    
    @Override
    public void removeBarang(int Indeks){
        daftarBarang.remove(Indeks);
    }
}

