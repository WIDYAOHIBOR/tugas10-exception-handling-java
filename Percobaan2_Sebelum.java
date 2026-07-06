/**
 * PERCOBAAN 2 - SEBELUM DIPERBAIKI
 * Array greeting cuma punya 3 elemen (index 0-2), tapi loop while
 * jalan sampai i<4, jadi pas i=3 akan error index out of bounds.
 */
public class Percobaan2_Sebelum {
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while (i < 4) {
            System.out.println(greeting[i]);
            i++;
        }
    }
}
