/**
 * PERCOBAAN 1 - SEBELUM DIPERBAIKI
 * Jalankan program ini dulu, amati error yang muncul di terminal.
 *
 * Array 'a' ukurannya 5, jadi index yang valid cuma 0 sampai 4.
 * Baris a[5]=100 mengakses index ke-6 yang tidak ada -> error.
 */
public class Percobaan1_Sebelum {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[5] = 100;
    }
}
