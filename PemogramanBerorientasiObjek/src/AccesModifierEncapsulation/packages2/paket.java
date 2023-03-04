/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesModifierEncapsulation.packages2;

import AccesModifierEncapsulation.packages1.main;

/**
 *
 * @author USER
 */
public class paket {

    public static void main(String[] args) {
        //Panggil fungsi dari kelas lain
        //Tidak akan error, "public" dapat digunakan walaupun berbeda package
        main.PublicSayHello();
        
        //Error karena hanya dapat dipanggil dari package yang sama
        main.DefaultSayHello();
        main.ProtectedSayHello();
        
        // Error, karena "private " hanya dapat diakses di kelas itu sendiri
        main.PrivateSayHello();

    }
}
