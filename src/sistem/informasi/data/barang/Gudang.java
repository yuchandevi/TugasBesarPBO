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
public class Gudang {
    private long id;
    private int kapasitas;
    private String nama_gudang;
    private Barang[] barangGudang = new Barang[10];
    
    public Gudang(){
    }
    
    public Gudang(long id, int kapasitas, String nama_gudang){
        this.id = id;
        this.kapasitas = kapasitas;
        this.nama_gudang = nama_gudang;
    }
    
    public void addBarang(Barang b){
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
    public Barang[] getBarangGudang() {
        return barangGudang;
    }

    /**
     * @param barangGudang the barangGudang to set
     */
    public void setBarangGudang(Barang[] barangGudang) {
        this.barangGudang = barangGudang;
    }
    
    
}
