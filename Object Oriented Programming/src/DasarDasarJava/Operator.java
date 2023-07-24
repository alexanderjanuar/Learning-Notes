/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DasarDasarJava;

public class Operator {

    static void assignment() {
        int value = 2;
        int anotherValue = 19;
        System.out.println("Data pada value adalah ->> " + value);
        System.out.println("Data pada anotherValue adalah ->> " + anotherValue);
    }

    static void arimatika() {
        System.out.println("Operasi Penjumlahan");
        int hasilPenjumlahan = 5 + 1;
        System.out.println("Hasil 5 + 1 = " + hasilPenjumlahan);
        System.out.println();

        System.out.println("Operasi Pengurangan");
        int hasilPengurangan = 4 - 1;
        System.out.println("Hasil 4 - 1 = " + hasilPengurangan);
        System.out.println();

        System.out.println("Operasi Pengalian");
        int hasilPengalian = 5 * 5;
        System.out.println("Hasil 5 * 5 = " + hasilPengalian);
        System.out.println();

        System.out.println("Operasi Pembagian");
        int hasilPembagian = 20 / 2;
        System.out.println("Hasil 20 / 2 = " + hasilPembagian);
        System.out.println();

        System.out.println("Operasi Habis bagi");
        int hasilSisa = 8 % 2;
        System.out.println("Hasil 8 % 2 = " + hasilSisa);
        int hasilSisaLain = 9 % 2;
        System.out.println("Hasil 9 % 2 = " + hasilSisaLain);
        System.out.println();
    }

    static void unary() {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }

    static void perbandingan() {
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;
        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah " + result);
        System.out.println();
    }

    static void conditional() {
        int value = 4;
        int anotherValue = 5;
        
        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;
        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        
        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;
        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
    }

    public static void main(String[] args) {
        arimatika();
    }
}
