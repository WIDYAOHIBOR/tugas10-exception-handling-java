/**
 * PERCOBAAN 3 - SESUDAH DIPERBAIKI (versi 2: multi-catch spesifik)
 * Menunjukkan cara menangani exception dengan catch yang lebih spesifik
 * (ArithmeticException) sebelum catch umum (Exception).
 */
public class Percobaan3_Sesudah_MultiCatch {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        }
        catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
