/**
 * PERCOBAAN 9 - SESUDAH (isi dari method reverse dihapus / dikosongkan)
 * Sesuai instruksi soal: "hapus isi dari method reverse ("This is a
 * string")" - artinya string yang dikirim ke reverse() diganti jadi
 * string kosong "".
 *
 * Karena panjang string sekarang 0, baris "if(s.length()==0)" akan
 * bernilai true, sehingga method melempar Exception baru. Exception ini
 * ditangkap oleh catch di main(), mencetak "The String was blank".
 * Blok finally tetap dijalankan di akhir, mencetak "All done".
 */
public class Percobaan9_Sesudah {
    public static void main(String[] args) {
        try {
            System.out.println(reverse(""));
        }
        catch (Exception e) {
            System.out.println("The String was blank");
        }
        finally {
            System.out.println("All done");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s.length() == 0) {
            throw new Exception();
        }
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
