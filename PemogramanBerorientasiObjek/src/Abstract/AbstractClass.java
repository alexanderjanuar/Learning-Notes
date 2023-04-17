/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author USER
 */
//Parent

//1. Menurunkan fungsi yang harus ditetapkan ke child class
//2. Gak bisa diinstansiasi
abstract class Hewan {
   String nama;
   public Hewan(String nama) {
      this.nama = nama;
   }

   public String getNama() {
      return nama;
   }
   abstract void bersuara();

//Child Class
class Anjing extends Hewan {
   public Anjing(String nama) {
      super(nama);
   }
   @Override
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
   public static void main(String[] args) {}
   
   
   
   
}}
   

      
   


