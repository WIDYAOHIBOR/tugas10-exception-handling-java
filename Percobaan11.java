/**
 * PERCOBAAN 11
 * Menunjukkan proses throw dan catch pada class custom (RangeErrorException)
 * yang extends Throwable langsung (bukan Exception).
 */
public class Percobaan11 {
    public static void main(String[] args) {
        int position = 1;
        try {
            if (position > 0) {
                throw new RangeErrorException("Position " + position);
            }
        }
        catch (RangeErrorException e) {
            System.out.println("Range error: " + e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}

class RangeErrorException extends Throwable {
    public RangeErrorException(String s) {
        super(s);
    }
}
