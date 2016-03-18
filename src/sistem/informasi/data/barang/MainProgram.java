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
public class MainProgram {
    public static void main(String[] args) {
       System.out.println("=======COBA CLASS PENYEDIA========");
       Penyedia p = new Penyedia("Chandra",1301140277);
       p.setNama("nori");
       p.setId(113449392);
       System.out.println(p.getNama());
       System.out.println(p.getId());
       p.Createbarang(112, 12,"Galon");
       p.Createbarang(113, 4, "Kursi");
       System.out.println(p.getDaftarBarang()[0].getNama_barang());
       System.out.println(p.getDaftarBarang()[0].getJumlah_stok());
       System.out.println(p.getDaftarBarang()[1].getNama_barang());
       System.out.println(p.getDaftarBarang()[1].getJumlah_stok());
       System.out.println("=======COBA CLASS PETUGAS========");
       Petugas pt = new Petugas("Kadek",1103120069);
       pt.setNama("Abi");
       pt.setId(130);
       System.out.println(pt.getNama());
       System.out.println(pt.getId());
       pt.addBarang("Galon", 10, p);
       pt.addBarang("Kursi", 2, p);
       pt.lihatBarang("Galon");
       pt.lihatBarang("Kursi");
       pt.editBarang("Galon", 3);
       System.out.println("jumlah baru: "+pt.G.getBarangGudang()[0].getJumlah_stok());
       System.out.println("kapasitas sebelum di hapus: "+pt.G.getKapasitas());
       pt.hapusBarang("Galon");
       System.out.println("Barang ada: "+pt.G.getBarangGudang()[0].getNama_barang());
       System.out.println("kapasitas baru: "+pt.G.getKapasitas());
       
    }
}
