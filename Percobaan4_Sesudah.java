/**
 * PERCOBAAN 4 - SESUDAH DIPERBAIKI
 * Urutan statement di dalam try ditukar: bil/0 diakses duluan,
 * jadi sekarang ArithmeticException yang terjadi lebih dulu,
 * dan baris b[3] tidak akan pernah tereksekusi.
 *
 * Ini menunjukkan bagaimana urutan pernyataan di dalam try
 * menentukan exception mana yang tertangkap lebih dulu, dan bahwa
 * begitu satu exception terjadi, sisa baris di try langsung dilewati.
 */
public class Percobaan4_Sesudah {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        }
        catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Melebihi jumlah array");
        }
        catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
