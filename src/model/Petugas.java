package model;

import javax.swing.JOptionPane;

public class Petugas extends Orang {

    //attribuy
    private Gudang G = null;
    
    //konstruktor
    public Petugas(String nama, long id){
        super(nama,id);
    }    
    public Petugas(){
    }
    
    //method
    public void addBarang(String nama, int jumlah, Penyedia p){
        for(int i=0 ; i < p.getDaftarBarang().size(); i++){ //perulangan dilakukan sebanyak jumlah barang yang ada di penyedia
            if (p.getDaftarBarang().get(i).getNama_barang().equals(nama)){//p.getDaftarBarang()[i] adalah algoritma untuk mendapatkan barang dari indeks ke i dengan 3 atribut. bila di dot get nama artinya untuk mendapatkan nama dari suatu barang tersebut.
                Barang b = new Barang();
                b.setId(p.getDaftarBarang().get(i).getId()); // create objek barang, barang sudah di dapatkan dari penyedia
                b.setNama_barang(p.getDaftarBarang().get(i).getNama_barang());
                b.setJumlah_stok(p.getDaftarBarang().get(i).getJumlah_stok());
                if (jumlah <= b.getJumlah_stok()) {
                    b.setJumlah_stok(jumlah); // mengeset jumlah barang yang akan di terima petugas dari penyedia. dengan menggunakan jumlah barang si petugas.
                    getG().addBarang(b);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,"Jumlah Melebihi Kapasitas Penyedia !","Error !",0);
                }
            }  
        }
    }    
    @Override
    public void removeBarang(int Indeks){
        getG().setKapasitas(getG().getKapasitas()+getG().getBarang(Indeks).getJumlah_stok());
        getG().removeBarang(Indeks);
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
                    if(br.getJumlah_stok() < stok_lama){
                        getG().setKapasitas(getG().getKapasitas()+(stok_lama-br.getJumlah_stok()));
                    } else if(br.getJumlah_stok() > stok_lama){
                        getG().setKapasitas(getG().getKapasitas()-(br.getJumlah_stok()-stok_lama));
                    }
                    JOptionPane.showMessageDialog(null,"Edit Barang Berhasil","Sukses !",1);
                   break;
               }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Jumlah Melebihi Kapasitas Gudang, Kapasitas Gudang : "+getG().getKapasitas(),"Error !",0);
        }
    }    
    @Override
    public Barang getBarang(int Indeks){
       return(getG().getBarang(Indeks));
    }
    
    //setter getter
    public Gudang getG() {
        return G;
    }
    public void setG(Gudang G) {
        this.G = G;
    }
}
