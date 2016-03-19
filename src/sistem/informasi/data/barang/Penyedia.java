/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.barang;

import java.util.ArrayList;

/**
 *
 * @author Windows
 */
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
    
   @Override
    public void lihatBarang(String nama){
        for (int i=0; i<daftarBarang.size(); i++){
            if (daftarBarang.get(i).getNama_barang().equals(nama)){
                System.out.println("Nama yang anda cari: "+daftarBarang.get(i).getNama_barang());
                break;
            }
        }
    }
    
    /**
     * @return the daftarBarang
     */
    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}

