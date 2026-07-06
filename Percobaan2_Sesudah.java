/**
 * PERCOBAAN 2 - SESUDAH DIPERBAIKI
 *
 * PERHATIAN / CATATAN PENTING sebelum menjalankan:
 * Program versi "perbaikan" ini sebenarnya punya bug klasik yang
 * cukup terkenal: dia bisa jadi INFINITE LOOP (loop tanpa henti)!
 *
 * Alasannya: kalau index kelebihan (i=3), catch akan me-reset i=0
 * lagi, lalu loop mulai dari awal, terus kena index kelebihan lagi
 * di i=3, direset lagi ke 0, begitu terus tanpa pernah berhenti.
 *
 * Ini justru pelajaran penting dari percobaan ini: menangkap
 * exception dan "mereset" begitu saja TANPA memperbaiki penyebab
 * aslinya (kondisi while yang salah, harusnya i<3 bukan i<4)
 * bisa menimbulkan masalah baru yang lebih parah dari error aslinya.
 *
 * Kalau kamu coba jalankan program ini, program akan terus mencetak
 * "Resetting index value" tanpa henti. Tekan Ctrl + C di terminal
 * untuk menghentikannya secara paksa kalau ini terjadi.
 */
public class Percobaan2_Sesudah {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World!",
            "No, I mean it!",
            "HELLO WORLD!"
        };
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0;
            }
        }
    }
}
