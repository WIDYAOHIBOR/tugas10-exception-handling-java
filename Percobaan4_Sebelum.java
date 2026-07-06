/**
 * PERCOBAAN 4 - SEBELUM DIPERBAIKI
 * Di dalam try, b[3] diakses duluan (padahal array b cuma index 0-2),
 * jadi ArrayIndexOutOfBoundsException akan terjadi lebih dulu,
 * dan baris bil/0 di bawahnya tidak akan pernah tereksekusi
 * (karena try langsung lompat ke catch begitu ada error).
 */
public class Percobaan4_Sebelum {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(b[3]);
            System.out.println(bil / 0);
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
