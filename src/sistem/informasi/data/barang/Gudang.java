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
public class Gudang {
    private long id;
    private int kapasitas;
    private String nama_gudang;
    private ArrayList<Barang>  barangGudang = new ArrayList();
      
    public Gudang(){
    }
    
    public Gudang(long id, int kapasitas, String nama_gudang){
        this.id = id;
        this.kapasitas = kapasitas;
        this.nama_gudang = nama_gudang;
    }
    
    public void addBarang(Barang b){
        if (kapasitas >= b.getJumlah_stok()){
            barangGudang.add(b);
            kapasitas = kapasitas-b.getJumlah_stok();
        }
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the kapasitas
     */
    public int getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    /**
     * @return the nama_gudang
     */
    public String getNama_gudang() {
        return nama_gudang;
    }

    /**
     * @param nama_gudang the nama_gudang to set
     */
    public void setNama_gudang(String nama_gudang) {
        this.nama_gudang = nama_gudang;
    }

    /**
     * @return the barangGudang
     */
    public ArrayList<Barang> getBarangGudang() {
        return barangGudang;
    }
}
