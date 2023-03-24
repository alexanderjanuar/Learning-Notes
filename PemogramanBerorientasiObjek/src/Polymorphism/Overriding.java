/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

abstract class Hero {
    abstract void Menyerang();
 }



class Marksman extends Hero {
    @Override
    void Menyerang() {
        System.out.println("Menyerang dari jarak jauh");
    }
}

class Fighter extends Hero {
    @Override
    void Menyerang() {
        System.out.println("Menyerang dari jarak jauh");
    }
}

/**
 *
 * @author USER
 */
public class Overriding {

}
