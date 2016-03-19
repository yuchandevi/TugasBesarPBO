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
public abstract class Orang {
    protected String nama;
    protected long id;
  
    public Orang(){
  
    }
  
    public Orang(String nama, long id){
        this.nama = nama;
        this.id = id;
    }
  
    /**
     * @return the nama
     */
    public String getNama(){
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     * @return the id
     */
    public long getId(){
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public  void setId(long id){
        this.id= id;
    }
    
    public abstract void lihatBarang(String nama);
}
