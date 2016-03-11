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
public class Petugas extends Orang {

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
        super.id = id;
    }
    
    public Petugas(String nama, long id){
        super(nama,id);
    }
    
    public Petugas(){
    }
    
    public void addBarang(){
    }
    
    public void hapusBarang(){
    }
    
    public void editBarang(){
    }
    
    public void lihatBarang(){
    }
}
