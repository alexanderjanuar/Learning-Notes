/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesModifierEncapsulation.packages1;

import AccesModifierEncapsulation.packages1.main;

/**
 *
 * @author USER
 */
public class main2 {

    public static void main(String[] args) {
        //Panggil fungsi dari kelas lain
        //Tidak akan error, karena masih berada di satu package yang sama
        main.DefaultSayHello();
        main.ProtectedSayHello();
        main.PublicSayHello();

        // Error, karena "private " hanya dapat diakses di kelas itu sendiri
        main.PrivateSayHello();
    }
}
