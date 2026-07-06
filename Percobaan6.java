/**
 * PERCOBAAN 6
 * Jalankan program ini, lalu berikan analisa penggunaan try-catch-nya.
 *
 * CATATAN: Di soal aslinya, ada baris "System.out.println("Ini tidak
 * lagi dicetak");" persis SETELAH baris "throw t;". Baris itu disebut
 * "unreachable statement" (kode yang tidak akan pernah bisa dijalankan),
 * karena begitu "throw t" dieksekusi, method langsung berhenti dan
 * melempar exception - baris apapun setelahnya di method yang sama
 * TIDAK PERNAH tereksekusi. Bahkan, Java sebenarnya menolak meng-compile
 * kode yang punya baris tidak terjangkau seperti itu (compile error:
 * "unreachable statement"). Makanya baris tersebut sengaja saya jadikan
 * komentar saja di bawah ini, supaya program bisa dijalankan, sekaligus
 * menjelaskan poin pembelajarannya.
 *
 * ANALISA:
 * - Method demo() secara sengaja membuat objek NullPointerException lalu
 *   melemparnya dengan "throw t" (bukan menunggu error terjadi sendiri).
 * - Karena demo() tidak menangani exception itu sendiri (tidak ada
 *   try-catch di dalam demo()), exception akan "menjalar" (propagate)
 *   ke method yang memanggilnya, yaitu main().
 * - Di main(), pemanggilan demo() dibungkus try-catch yang menangkap
 *   NullPointerException, sehingga program tidak crash, dan pesan
 *   "Ada pesan error: ..." tercetak, bukan "Selesai" (karena baris
 *   System.out.println("Selesai") ada SETELAH demo() dalam try yang
 *   sama, jadi tidak akan tereksekusi karena try sudah keburu lompat
 *   ke catch begitu demo() melempar exception).
 */
public class Percobaan6 {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan (unreachable, sengaja dikomentari):
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        }
        catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}
