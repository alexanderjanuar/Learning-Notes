/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesModifierEncapsulation.packages1;

/**
 *
 * @author USER
 */
class Mahasiswa {

    private String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    //Bisa diakses oleh siapa saja, diluar atau didalam pacakages
    public void PublictampilNama() {
        System.out.println(this.nama);
    }

    //Bisa diakses didalam packages yang sama
    void DefaulttampilNama() {
        System.out.println(this.nama);
    }

    //Hanya Bisa diakses didalam class itu sendiri
    private void PrivatetampilNama() {
        System.out.println(this.nama);
    }

    //Bisa diakses didalam packages yang sama atau subclass dari class itu sendiri
    protected void ProtectedtampilNama() {
        System.out.println(this.nama);
    }

    //Setter
    void setNama(String nama) {
        this.nama = nama;
    }

    //Getter
    String getNama() {
        return this.nama;
    }
}

public class main {

    public static void main(String[] args) {
        Mahasiswa alex = new Mahasiswa("Alex");

        // Tidak akan error, karena "default" dapat diakses didalam package yang sama
        alex.DefaulttampilNama();

        // Tidak akan error, karena "protected" dapat diakses didalam package yang sama
        alex.ProtectedtampilNama();

        // Tidak akan error, karena "public" dapat diakses didalam package yang sama
        alex.PublictampilNama();
        
        // Error, karena "private " hanya dapat diakses di kelas itu sendiri
        alex.PrivatetampilNama();
    }
    
    private static void PrivateSayHello(){
        System.out.println("Helloo");
    }
    
    static void DefaultSayHello(){
        System.out.println("Helloo");
    }
    
    protected static void ProtectedSayHello(){
        System.out.println("Helloo");
    }
    
    public static void PublicSayHello(){
        System.out.println("Helloo");
    }
}
