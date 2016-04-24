/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Windows
 */
public class Barang {
    private long id;
    private int jumlah_stok;
    private String nama_barang;

    /**
     * @return the id
     */
    public Barang(){
    }
    
    public Barang(long id, int jumlah_stok, String nama_barang){
        this.id = id;
        this.jumlah_stok=jumlah_stok;
        this.nama_barang=nama_barang;
    }
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
     * @return the jumlah_stok
     */
    public int getJumlah_stok() {
        return jumlah_stok;
    }

    /**
     * @param jumlah_stok the jumlah_stok to set
     */
    public void setJumlah_stok(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    /**
     * @return the nama_barang
     */
    public String getNama_barang() {
        return nama_barang;
    }

    /**
     * @param nama_barang the nama_barang to set
     */
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
    
}
