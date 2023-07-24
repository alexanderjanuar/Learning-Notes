/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleCrud;

import java.util.*;

class Dokter {

    String nama;
    String spesialis;
    int tahunPengalaman;

    public Dokter(String nama, String spesialis, int tahunPengalaman) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.tahunPengalaman = tahunPengalaman;
    }

    void display() {
        System.out.println("Nama Dokter             : " + this.nama);
        System.out.println("Spesialis Dokter        : " + this.spesialis);
        System.out.println("Tahun Pengalaman Dokter : " + this.tahunPengalaman + " tahun");

    }
}

/**
 *
 * @author USER
 */
public class main {

    static ArrayList<Dokter> listDokter = new ArrayList<Dokter>();

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //Only if use Netbeans IDE
    static void NetBeansclearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Tambah Data
        listDokter.add(new Dokter("Dr. Rama Dani Putra", "Dokter Umum", 6));
        listDokter.add(new Dokter("Dr. Hendry Agus", "Dokter Umum", 4));
        listDokter.add(new Dokter("Dr. Myra", "Dokter Syaraf", 12));

        int pilih;
        String next;
        Scanner edit = new Scanner(System.in);
        Scanner scanUbah = new Scanner(System.in);
        Scanner scanNext = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("|           Selamat Datang        |");
            System.out.println("|             Pilih Menu   |       ");
            System.out.println("===================================");

            System.out.println("| 1. Lihat Dokter                 |");
            System.out.println("| 2. Ubah Dokter                  |");
            System.out.println("| 3. Tambah Dokter                |");
            System.out.println("| 4. Hapus Dokter                 |");
            System.out.println("| 0. Keluar                       |");
            System.out.println("===================");

            System.out.print("| Pilih : ");
            Scanner scanPilih = new Scanner(System.in);
            pilih = scanPilih.nextInt();
            NetBeansclearScreen();

            switch (pilih) {
                //Pilih "Lihat"
                case 1:
                    System.out.println("=========================================");
                    System.out.println("|                Lihat Data             |");
                    System.out.println("=========================================");

                    //Iterasi Sepanjang ArrayList
                    for (int i = 0; i < listDokter.size(); i++) {
                        System.out.println("No : " + (i + 1));
                        listDokter.get(i).display();
                        System.out.println(" ");
                    }

                    System.out.println("<            Tekan Enter         >");
                    next = scanNext.nextLine();
                    NetBeansclearScreen();
                    break;

                //Pilih "Ubah"
                case 2:
                    System.out.println("=========================================");
                    System.out.println("|                Ubah  Data             |");
                    System.out.println("=========================================");

                    //Iterasi Sepanjang ArrayList
                    for (int i = 0; i < listDokter.size(); i++) {
                        System.out.println("No : " + (i + 1));
                        listDokter.get(i).display();
                        System.out.println(" ");
                    }
                    System.out.println("=========================================");
                    System.out.println("Pilih No. : ");
                    //Pilih Nomor Dokter yang ingin diubah
                    int ubah = scanUbah.nextInt();

                    //Tambah Percabangan
                    if ((ubah > 0) && (ubah < listDokter.size())) {

                        //Minta user menginputkan Data
                        System.out.print("Masukkan Nama             : ");
                        String ubahNama = edit.nextLine();
                        System.out.print("Masukkan Spesialis        : ");
                        String ubahSpesialis = edit.nextLine();
                        System.out.print("Masukkan Tahun Pengalaman : ");
                        int ubahTahun = edit.nextInt();

                        //Ubah Data
                        listDokter.get(ubah - 1).nama = ubahNama;
                        listDokter.get(ubah - 1).spesialis = ubahSpesialis;
                        listDokter.get(ubah - 1).tahunPengalaman = ubahTahun;

                        System.out.println("=========================================");
                        System.out.println("<               Data Diubah!            >");
                        System.out.println("<               Tekan Enter             >");
                        next = scanNext.nextLine();
                        NetBeansclearScreen();
                    } else {
                        //Jika user menginput nomor yant tidak tersedia
                        System.out.println("=========================================");
                        System.out.println("<       Masukkan Nomor Yang Valid!       >");
                        System.out.println("<               Tekan Enter             >");
                        NetBeansclearScreen();
                    }
                    break;

                //Pilih "Tambah"
                case 3:
                    System.out.println("=========================================");
                    System.out.println("|              Tambah  Data             |");
                    System.out.println("=========================================");

                    //Minta user menginputkan Data
                    System.out.print("| Masukkan Nama             : ");
                    String ubahNama = edit.nextLine();
                    System.out.print("| Masukkan Spesialis        : ");
                    String ubahSpesialis = edit.nextLine();
                    System.out.print("| Masukkan Tahun Pengalaman : ");
                    int ubahTahun = edit.nextInt();

                    //Tambah data ke dalam arraylist
                    listDokter.add(new Dokter(ubahNama, ubahSpesialis, ubahTahun));

                    System.out.println("=========================================");
                    System.out.println("<             Data Ditambah!            >");
                    System.out.println("<               Tekan Enter             >");
                    next = scanNext.nextLine();
                    NetBeansclearScreen();

                    break;

                //Pilih "Hapus"
                case 4:
                    System.out.println("=========================================");
                    System.out.println("|              Hapus  Data              |");
                    System.out.println("=========================================");

                    //Iterasi Sepanjang ArrayList
                    for (int i = 0; i < listDokter.size(); i++) {
                        System.out.println("No : " + (i + 1));
                        listDokter.get(i).display();
                        System.out.println(" ");
                    }
                    System.out.println("=========================================");

                    //Pilih Nomor Dokter yang ingin dihapus
                    System.out.println("Pilih No. : ");
                    int hapus = scanUbah.nextInt();

                    //Tambah Percabangan
                    if ((hapus > 0) && (hapus < listDokter.size())) {

                        listDokter.remove(hapus - 1);

                        System.out.println("=========================================");
                        System.out.println("<               Data Dihapus!           >");
                        System.out.println("<               Tekan Enter             >");
                        next = scanNext.nextLine();
                        NetBeansclearScreen();
                    } else {
                        //Jika user menginput nomor yant tidak tersedia
                        System.out.println("=========================================");
                        System.out.println("<       Masukkan Nomor Yang Valid!       >");
                        System.out.println("<               Tekan Enter             >");
                        NetBeansclearScreen();
                    }
                    break;

                case 0:
                    NetBeansclearScreen();
                    //Exit Program
                    System.exit(0);

                default:
                    System.out.println("=========================================");
                    System.out.println("<       Masukkan Nomor Yang Valid!       >");
                    System.out.println("<               Tekan Enter             >");
                    NetBeansclearScreen();
            }

        }

    }

}
