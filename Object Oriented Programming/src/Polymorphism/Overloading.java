/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author USER
 */
public class Overloading {
    static void add(int a,int b){
        System.out.println("Hasil  Intger:" + (a+b));
    }
    
    
    static void add(double a,double b){
        System.out.println("Hasil Double :" + (a+b));
    }
    
    
    
    
    public static void main(String[] args) {
        add(1,2);
        add(1.5,1.6);
        
    }
    
    
}
