/**
 * PERCOBAAN 7
 * Jalankan program ini, lalu berikan analisa penggunaan try-catch-nya.
 *
 * ANALISA:
 * - Program sengaja melempar (throw) sebuah Exception baru dengan pesan
 *   "Here's my Exception" di dalam blok try.
 * - Karena langsung dilempar di dalam try yang sama, catch(Exception e)
 *   langsung menangkapnya tanpa harus menunggu error nyata terjadi.
 * - e.getMessage() menampilkan pesan yang tadi dimasukkan saat exception
 *   dibuat ("Here's my Exception").
 * - e.toString() menampilkan representasi teks lengkap dari exception,
 *   biasanya berformat "namaClassException: pesan", misalnya
 *   "java.lang.Exception: Here's my Exception".
 * - e.printStackTrace() mencetak jejak lengkap (stack trace) exception
 *   tersebut, menunjukkan di baris dan method mana exception itu
 *   dilempar - berguna untuk melacak sumber masalah saat debugging.
 */
public class Percobaan7 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my Exception");
        }
        catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():" + e.getMessage());
            System.out.println("e.toString():" + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
