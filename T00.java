//12S25041-Christa Naomi Silalahi
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan1, bilangan2;
        int hasilkali;
        int hasiljumlah;

        bilangan1 = Integer.parseInt(input.nextLine());
        bilangan2 = Integer.parseInt(input.nextLine());
        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (bilangan2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (bilangan1 > bilangan2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bilangan2 > bilangan1) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            hasiljumlah = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasiljumlah);
        } else {
            if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
                hasilkali = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian: " + hasilkali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
