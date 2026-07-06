import java.io.*;

/**
 * PERCOBAAN 8 - SEBELUM DIPERBAIKI
 * methodB() melakukan 20/0 yang menimbulkan ArithmeticException.
 * Karena tidak ada try-catch sama sekali di sini, exception ini
 * akan langsung menghentikan program (program crash) dan mencetak
 * stack trace ke layar. Baris "Method B" dan seterusnya tidak akan
 * pernah tercetak.
 */
class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

public class Percobaan8_Sebelum {
    public static void main(String[] args) throws IOException {
        Test3 c = new Test3();
        c.methodA();
        c.methodB();
    }
}
