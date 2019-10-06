package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan menghitung dan menampilkan nilai jari-jari, luas, dan keliling lingkaran berdasarkan
 * nilai diameter yang dimasukkan
 *
 */

public class PerhitunganLingkaran {

    public static final float PHI = (float)3.14;

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void hitungLingkaran(float diameter) {
        float jariJari, luas, keliling;
        jariJari = diameter / 2;
        keliling = PHI * diameter;
        luas = (float) Math.pow(jariJari, 2) * PHI;

        System.out.println("===== Hasil perhitungan lingkaran =====");
        System.out.println(String.format("Jari-jari lingkaran = %.2f cm", jariJari));
        System.out.println(String.format("Luas lingkaran \t\t= %.2f cm", luas));
        System.out.println(String.format("Keliling lingkaran\t= %.2f cm", keliling));
    }

    public static void main(String[] args) {
        System.out.println("===== Perhitungan Lingkaran =====");
        System.out.print("Masukan nilai diameter lingkaran: ");
        Scanner scanner = new Scanner(System.in);
        String diameter = scanner.nextLine();

        while (!isInteger(diameter)) {
            System.out.println("Nilai diameter tidak sesuai!");
            System.out.print("\nMasukan nilai diameter lingkaran: ");
            diameter = scanner.nextLine();
        }
        hitungLingkaran(Float.valueOf(diameter));
    }
}