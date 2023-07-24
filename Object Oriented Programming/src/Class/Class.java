/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

class Buku {
    // Property/Atribut
    String namaBuku;
    Integer hargaBuku;
    String penulisBuku;

    //Constructor
    Buku(String nama, Integer hargaBuku, String penulisBuku) {
        this.namaBuku = nama;
        this.hargaBuku = hargaBuku;
        this.penulisBuku = penulisBuku;
    }

    //Method
    void display() {
        System.out.println("Nama Buku   : " + this.namaBuku);
        System.out.println("Harga Buku  : " + this.hargaBuku);
        System.out.println("Penulis Buku: " + this.penulisBuku);
    }
    
    void beliBuku(int jumlah){
        System.out.println("Membeli Buku sebanyak : " + jumlah);
    }
}

public class Class {

    public static void main(String[] args) {
        //Instansiasi
        Buku bukuAlex = new Buku("Pemograman Java", 200000, "Nanda");
        Buku bukuArif = new Buku("Pemograman Mobile", 300000, "Latifah");
        
        //Panggil Method
        //bukuAlex.display();
    }

}
