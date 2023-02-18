/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DasarDasarJava;

/**
 *
 * @author USER
 */
public class Perulangan {

    static void For() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka : " + i);
        }
    }

    static void ForBersarang() {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    static void While() {
        int value = 1;
        while (value <= 10) {
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }
    }

    static void DoWhile() {
        int value = 1;
        do {
            System.out.println("Angka : " + value);
            value++;
        } while (value <= 10);
    }

    public static void main(String[] args) {
    }
}
