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

    Gudang G = new Gudang(112,20,"Gudang Barang");
    
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
    
    public void addBarang(String nama, int jumlah, Penyedia p){
        for(int i=0 ; i < p.getIndex(); i++){
            if (p.getDaftarBarang()[i].getNama_barang().equals(nama)){//p.getDaftarBarang()[i] adalah algoritma untuk mendapatkan barang dari indeks ke i dengan 3 atribut. bila di dot get nama artinya untuk mendapatkan nama dari suatu barang tersebut.
                Barang b = p.getDaftarBarang()[i]; // create objek barang, barang sudah di dapatkan dari penyedia
                if (jumlah < b.getJumlah_stok()) {
                    b.setJumlah_stok(jumlah); // mengeset jumlah barang yang akan di terima petugas dari penyedia. dengan menggunakan jumlah barang si petugas.
                    G.addBarang(b);
                    break;
                }
                
                
            } 
            
        }
    }
    
    public void hapusBarang(String nama){
        int temp = 0;
        Barang br = new Barang();
        for(int i=0 ; i< G.getIndeks(); i++){
           if (G.getBarangGudang()[i].getNama_barang().equals(nama)){
               temp = i;
               br = G.getBarangGudang()[i];
               break;
           }
        }
        for(int i=temp ; i< G.getIndeks(); i++){
           G.getBarangGudang()[i] = G.getBarangGudang()[i+1];  
        }
        G.setIndeks(G.getIndeks()-1);
        G.setKapasitas(G.getKapasitas()+br.getJumlah_stok());
    }
    
    public void editBarang(String nama, int jumlah){
        int stok_lama = 0;
        int temp = 0;
        Barang br = new Barang();
        if (jumlah < G.getKapasitas()){
        for(int i=0 ; i< G.getIndeks(); i++){
           if (G.getBarangGudang()[i].getNama_barang().equals(nama)){
               temp = i;
               br = G.getBarangGudang()[i];
               stok_lama = G.getBarangGudang()[i].getJumlah_stok();
               break;
           }
        }
        br.setJumlah_stok(jumlah);
        G.getBarangGudang()[temp] = br;
        if(br.getJumlah_stok() < stok_lama){
            G.setKapasitas(G.getKapasitas()+(stok_lama-br.getJumlah_stok()));
        } else if(br.getJumlah_stok() > stok_lama){
           G.setKapasitas(G.getKapasitas()-(br.getJumlah_stok()-stok_lama));
        }
    }
  }
    
    public void lihatBarang(String nama){
        int temp = 0;
        Barang br = new Barang();
        for(int i=0 ; i< G.getIndeks(); i++){
           if (G.getBarangGudang()[i].getNama_barang().equals(nama)){
               temp = i;
               br = G.getBarangGudang()[i];
               System.out.println("Nama: "+br.getNama_barang());
               break;
           }
        }
    }
}
