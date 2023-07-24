/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;



interface Sound {
    public void makeSound();
}

class Car implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Brmmmm");
    }
}

class Cat implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Box{
    static void print(){
        System.out.println("Ini adalah kotak");
    }
}

/**
 *
 * @author USER
 */

public class interFace {
    
    public static void main(String[] args) {
         Box kotak = new Box();
         //kotak.print();
         
         Box.print();
    }

}
