import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * PERCOBAAN 10
 * Program ini menulis data ke file "books.txt" menggunakan
 * RandomAccessFile, lalu membaca sebagian datanya kembali.
 * Kalau terjadi masalah baca/tulis file (IOException), pesan
 * "Indeks melebihi batas" akan tercetak.
 *
 * CATATAN: file "books.txt" akan otomatis dibuat di folder tempat
 * program ini dijalankan.
 */
public class Percobaan10 {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};
        try {
            RandomAccessFile books = new RandomAccessFile("books.txt", "rw");
            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());
            books.close();
        }
        catch (IOException e) {
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}
