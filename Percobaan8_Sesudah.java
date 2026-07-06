import java.io.*;

/**
 * PERCOBAAN 8 - SESUDAH DIPERBAIKI
 * Sekarang pemanggilan methodB() dibungkus try-catch-finally, jadi
 * ketika terjadi error (ArithmeticException dari 20/0), program tidak
 * crash. Blok finally akan SELALU dijalankan, baik terjadi error
 * maupun tidak.
 */
class Test3b {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

public class Percobaan8_Sesudah {
    public static void main(String[] args) {
        Test3b o = new Test3b();
        o.methodA();
        try {
            o.methodB();
        }
        catch (Exception e) {
            System.out.println("Error di Method B");
        }
        finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}
