import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan1, bilangan2;

        System.out.println("Masukkan dua bilangan");
        System.out.println("Masukkan bilangan pertama");
        System.out.println("Masukkan bilangan kedua");
        bilangan1 = Integer.parseInt(input.nextLine());
        bilangan2 = Integer.parseInt(input.nextLine());
        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan pertama genap");
        } else {
            System.out.println("Bilangan pertama ganjil");
        }
        if (bilangan2 % 2 == 0) {
            System.out.println("Bilangan kedua genap");
        } else {
            System.out.println("Bilangan kedua ganjil");
        }
        if (bilangan1 > bilangan2) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (bilangan2 > bilangan1) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("kedua bilangan sama besar");
            }
        }
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasiljumlah;

            hasiljumlah = bilangan1 + bilangan2;
            System.out.println("hasil penjumlahan" + hasiljumlah);
        } else {
            if (bilangan1 % 2 != 0) {
                int hasilkali;

                hasilkali = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian: " + hasilkali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
