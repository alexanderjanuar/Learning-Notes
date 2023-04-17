/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandlingGUI;

/**
 *
 * @author USER
 */
class UserDefinedException extends Exception {

    public UserDefinedException(String str) {
        // Calling constructor of parent Exception  
        super(str);
    }
}

public class Exeption {

    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException ude) {
            System.out.println("Caught the exception");
            // Print the message from MyException object  
            System.out.println(ude.getMessage());
        } finally {
            System.out.println("terima kasih telah menjalankan program");
        }
    }
}
