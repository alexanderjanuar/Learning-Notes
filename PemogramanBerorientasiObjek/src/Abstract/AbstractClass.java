/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author USER
 */
abstract class Hewan {
   private String nama;

   public Hewan(String nama) {
      this.nama = nama;
   }

   public String getNama() {
      return nama;
   }

   public abstract void bersuara();
}

class Anjing extends Hewan {
   public Anjing(String nama) {
      super(nama);
   }

   public void bersuara() {
      System.out.println("Guk guk!");
   }
}

class Kucing extends Hewan {
   public Kucing(String nama) {
      super(nama);
   }

   public void bersuara() {
      System.out.println("Meong!");
   }
}

public class AbstractClass {
   public static void main(String[] args) {
      Hewan anjingSaya = new Anjing("Rover");
      Hewan kucingSaya = new Kucing("Whiskers");

      System.out.println(anjingSaya.getNama() + ": ");
      anjingSaya.bersuara();

      System.out.println(kucingSaya.getNama() + ": ");
      kucingSaya.bersuara();
   }
}

