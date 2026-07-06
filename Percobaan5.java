/**
 * PERCOBAAN 5
 * Jalankan program ini, lalu berikan analisa penggunaan try-catch-nya.
 *
 * ANALISA:
 * - bil/0 menimbulkan ArithmeticException, ditangkap oleh catch pertama
 *   (catch(ArithmeticException e)) karena tipenya paling cocok/spesifik.
 * - e.getMessage() menampilkan pesan singkat dari exception tersebut
 *   (untuk ArithmeticException pada pembagian oleh nol biasanya
 *   menampilkan teks "/ by zero").
 * - e.printStackTrace() dan e.printStackTrace(System.out) sama-sama
 *   mencetak jejak (stack trace) lengkap dari mana exception itu
 *   berasal (nama class, method, dan baris kode) - berguna untuk
 *   proses debugging. Bedanya, printStackTrace() default menulis ke
 *   System.err (error stream), sedangkan printStackTrace(System.out)
 *   dipaksa menulis ke System.out (output stream biasa).
 * - Karena exception sudah ditangani di catch pertama, catch kedua
 *   (catch(Exception e)) tidak akan pernah dieksekusi pada kasus ini.
 */
public class Percobaan5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Pesan error:  ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
