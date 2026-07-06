/**
 * PERCOBAAN 9 - SEBELUM (isi asli, string "This is a string")
 * Program membalik (reverse) string yang diberikan.
 * Karena stringnya tidak kosong, method reverse() akan berjalan normal
 * tanpa exception, lalu blok finally tetap dijalankan di akhir.
 */
public class Percobaan9_Sebelum {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a string"));
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
