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
public class MainProgram {
    public void o() {
       System.out.println("=======COBA CLASS PENYEDIA========");
       Penyedia p = new Penyedia("Chandra",1301140277);
       p.setNama("nori");
       p.setId(113449392);
       System.out.println(p.getNama());
       System.out.println(p.getId());
       p.Createbarang(112, 12,"Galon");
       p.Createbarang(113, 4, "Kursi");
       System.out.println(p.getBarang(0).getNama_barang());
       System.out.println(p.getBarang(0).getJumlah_stok());
       System.out.println(p.getBarang(1).getJumlah_stok());
       System.out.println(p.getBarang(1).getNama_barang());
      // p.removeBarang(0);
       System.out.println(p.getBarang(0).getNama_barang());
       System.out.println("=======COBA CLASS PETUGAS========");
       Gudang G = new Gudang(112,20,"Gudang Barang");
       Petugas pt = new Petugas("Kadek",1103120069);
       pt.setNama("Abi");
       pt.setId(130);
       pt.setG(G);
       System.out.println(pt.getNama());
       System.out.println(pt.getId());
       pt.addBarang("Galon", 10, p);
       pt.addBarang("Kursi", 2, p);
       System.out.println(pt.getBarang(0).getNama_barang());
       System.out.println(pt.getBarang(1).getNama_barang());
       pt.editBarang("Galon", 3);
       System.out.println("jumlah baru: "+pt.getBarang(0).getJumlah_stok());
       System.out.println("kapasitas sebelum di hapus: "+pt.getG().getKapasitas());
       pt.removeBarang(0);
       System.out.println("Barang ada: "+pt.getBarang(0).getNama_barang());
       System.out.println("kapasitas baru: "+pt.getG().getKapasitas());
       
    }
}
