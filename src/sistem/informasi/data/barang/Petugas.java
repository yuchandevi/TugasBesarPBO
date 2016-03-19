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

    private Gudang G = null;
    
    public Petugas(String nama, long id){
        super(nama,id);
    }
    
    public Petugas(){
    }
    
    public void addBarang(String nama, int jumlah, Penyedia p){
        for(int i=0 ; i < p.getDaftarBarang().size(); i++){ //perulangan dilakukan sebanyak jumlah barang yang ada di penyedia
            if (p.getDaftarBarang().get(i).getNama_barang().equals(nama)){//p.getDaftarBarang()[i] adalah algoritma untuk mendapatkan barang dari indeks ke i dengan 3 atribut. bila di dot get nama artinya untuk mendapatkan nama dari suatu barang tersebut.
                Barang b = p.getDaftarBarang().get(i); // create objek barang, barang sudah di dapatkan dari penyedia
                if (jumlah < b.getJumlah_stok()) {
                    b.setJumlah_stok(jumlah); // mengeset jumlah barang yang akan di terima petugas dari penyedia. dengan menggunakan jumlah barang si petugas.
                    getG().addBarang(b);
                    break;
                }
            }  
        }
    }
    
    public void hapusBarang(String nama){
        int temp = 0;
        Barang br = new Barang();
        for(int i=0 ; i<getG().getBarangGudang().size(); i++){
           if (getG().getBarangGudang().get(i).getNama_barang().equals(nama)){
               temp = i;
               br = getG().getBarangGudang().get(i); //tempat menyimpan sementara jumlah barang yang lama sebelum di hapus
               break;
           }
        }
        getG().getBarangGudang().remove(temp);
        getG().setKapasitas(getG().getKapasitas()+br.getJumlah_stok());
    }
    
    public void editBarang(String nama, int jumlah){
        int stok_lama = 0;
        int temp = 0;
        Barang br = new Barang();
        if (jumlah < getG().getKapasitas()){
            for(int i=0 ; i< getG().getBarangGudang().size(); i++){
               if (getG().getBarangGudang().get(i).getNama_barang().equals(nama)){
                   temp = i;
                   stok_lama = getG().getBarangGudang().get(i).getJumlah_stok();
                    getG().getBarangGudang().get(i).setJumlah_stok(jumlah);
                   br = getG().getBarangGudang().get(i);
                   break;
               }
            }
            
            if(br.getJumlah_stok() < stok_lama){
                getG().setKapasitas(getG().getKapasitas()+(stok_lama-br.getJumlah_stok()));
            } else if(br.getJumlah_stok() > stok_lama){
                getG().setKapasitas(getG().getKapasitas()-(br.getJumlah_stok()-stok_lama));
            }
        }
    }
    
    @Override
    public void lihatBarang(String nama){
        int temp = 0;
        Barang br = new Barang();
        for(int i=0 ; i< getG().getBarangGudang().size(); i++){
           if (getG().getBarangGudang().get(i).getNama_barang().equals(nama)){
               temp = i;
               br = getG().getBarangGudang().get(i);
               System.out.println("Nama: "+br.getNama_barang());
               break;
           }
        }
    }

    /**
     * @return the G
     */
    public Gudang getG() {
        return G;
    }

    /**
     * @param G the G to set
     */
    public void setG(Gudang G) {
        this.G = G;
    }
}
