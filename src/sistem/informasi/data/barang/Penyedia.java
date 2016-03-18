/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.barang;

/**
 *
 * @author Windows
 */
public class Penyedia extends Orang { 
   private Barang[] daftarBarang = new Barang[10];
   private int index;

   public Penyedia(){
   }
   
   public Penyedia(String nama, long id){
       super(nama,id);
   }
   
   public void Createbarang(long id, int jumlah_stok, String nama_barang){
       daftarBarang[index] = new Barang(id,jumlah_stok,nama_barang);
       index++;
   }
    
    @Override
    public String getNama() {
        return super.nama;
    }

    @Override
    public void setNama(String nama) {
        super.nama = nama;
    }

    @Override
    public long getId() {
        return super.id;
    }

    @Override
    public void setId(long id) {
        super.id=id;
    }

    /**
     * @return the daftarBarang
     */
    public Barang[] getDaftarBarang() {
        return daftarBarang;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @param daftarBarang the daftarBarang to set
     */
   
}

