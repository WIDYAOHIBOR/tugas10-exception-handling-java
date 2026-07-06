/**
 * PERCOBAAN 1 - SESUDAH DIPERBAIKI
 *
 * CATATAN: Di soal aslinya, class ini dinamai persis "Exception"
 * (sama seperti nama class bawaan Java java.lang.Exception).
 * Kalau dipakai apa adanya, program TIDAK BISA di-compile, karena
 * "catch(Exception e)" akan dianggap merujuk ke class "Exception"
 * buatan sendiri (bukan java.lang.Exception), padahal class buatan
 * sendiri itu bukan turunan Throwable, jadi tidak valid dipakai
 * di blok catch. Makanya di sini nama class-nya diganti jadi
 * Percobaan1_Sesudah supaya bisa dijalankan dengan benar.
 * Logika/isi programnya tetap persis sama seperti di soal.
 */
public class Percobaan1_Sesudah {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        }
        catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
