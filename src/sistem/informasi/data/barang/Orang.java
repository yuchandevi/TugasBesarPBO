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
    public abstract String getNama();

    /**
     * @param nama the nama to set
     */
    public abstract void setNama(String nama);

    /**
     * @return the id
     */
    public abstract long getId();

    /**
     * @param id the id to set
     */
    public abstract void setId(long id);
  
  
}
