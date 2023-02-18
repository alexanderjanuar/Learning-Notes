/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DasarDasarJava;

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputOuput {

    static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }

    static void bufferedReader() {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        int value = 0;
        int anotherValue = 0;

        try {
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah : " + resul);

    }

    public static void main(String[] args) {
    }
}
