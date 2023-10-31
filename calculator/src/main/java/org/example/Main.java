package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/**
 * KalkulatorSederhana adalah kelas untuk melakukan operasi dasar
 * penambahan, pengurangan, perkalian, dan pembagian.
 */
public class Main {

    /**
     * Metode untuk menambahkan dua angka.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil penambahan dari angka1 dan angka2.
     */
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    /**
     * Metode untuk mengurangkan dua angka.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil pengurangan dari angka1 dan angka2.
     */
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    /**
     * Metode untuk mengalikan dua angka.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil perkalian dari angka1 dan angka2.
     */
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    /**
     * Metode untuk membagi dua angka.
     *
     * @param angka1 Angka pembilang.
     * @param angka2 Angka penyebut.
     * @return Hasil pembagian dari angka1 oleh angka2.
     * @throws ArithmeticException jika angka penyebut adalah nol.
     */
    public static double bagi(double angka1, double angka2) {
        if (angka2 == 0) {
            throw new ArithmeticException("Pembagian oleh nol tidak diizinkan.");
        }
        return angka1 / angka2;
    }

    public static void main(String[] args) {
        double angka1 = 10.0;
        double angka2 = 5.0;

        double hasilTambah = tambah(angka1, angka2);
        double hasilKurang = kurang(angka1, angka2);
        double hasilKali = kali(angka1, angka2);

        System.out.println("Hasil Penambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);

        try {
            double hasilBagi = bagi(angka1, angka2);
            System.out.println("Hasil Pembagian: " + hasilBagi);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
