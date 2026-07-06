/**
 * PERCOBAAN 3 - SESUDAH DIPERBAIKI (versi 1: catch generik Exception)
 */
public class Percobaan3_Sesudah {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        }
        catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
