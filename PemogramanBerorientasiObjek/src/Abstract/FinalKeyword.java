/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author USER
 */

final class Lingkaran {
    private final double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class LingkaranWarna extends Lingkaran {
    // Class LingkaranWarna tidak dapat menjadi subclass dari class Lingkaran karena class Lingkaran sudah final
}

public class FinalKeyword {}
