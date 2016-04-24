package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null,"Tambah Data Barang Berhasil !","Sukses !",1);
        }else{
            JOptionPane.showMessageDialog(null,"Kapasitas Gudang Penuh !","Error !",0);
        }
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public String getNama_gudang() {
        return nama_gudang;
    }
    public void setNama_gudang(String nama_gudang) {
        this.nama_gudang = nama_gudang;
    }
    public ArrayList<Barang> getBarangGudang() {
        return barangGudang;
    }
    public Barang getBarang(int Indeks){
        return(barangGudang.get(Indeks));
    }    
    public void removeBarang(int Indeks){
        barangGudang.remove(Indeks);
    }
}
