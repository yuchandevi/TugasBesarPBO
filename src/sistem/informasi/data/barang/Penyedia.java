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

    public void Createbarang(){
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
     * @param daftarBarang the daftarBarang to set
     */
   
}

