package com.rizkykhapidsyah.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Kamus */
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        //Program
        //Panggil Method
        mainMenu();

        //Kondisional Untuk Pilihan Menu Yang Dimasukkan:
        switch (pilihan) {
            case '1': {
                System.out.print("Masukkan Panjang (P) Persegi Panjang  : ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan Lebar (L) Persegi Panjang    : ");
                s2 = scanner.nextInt();

                System.out.println("Luas Persegi Panjang      = " + opersegi.luas(s1, s2));
                System.out.println("Keliling Persegi Panjang  = " + opersegi.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukkan Alas Segitiga Siku    : ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan Tinggi Segitiga Siku  : ");
                s2 = scanner.nextInt();

                System.out.println("Luas Segitiga       = " + osegitiga.luas(s1, s2));
                System.out.println("Keliling Segitiga   = " + osegitiga.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukkan Jari-Jari Lingkaran   = ");
                r = scanner.nextInt();

                System.out.println("Luas Lingkaran      = " + olingkaran.luas(r));
                System.out.println("Keliling Lingkaran  = " + olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("Tidak Ada Pilihan.");
                break;
            }
        }
    }

    public static void mainMenu() {
        //Pilihan Menu
        System.out.println("------------------------");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("------------------------");
        System.out.print("Masukkan Menu : ");

        pilihan = scanner.next().charAt(0);
    }
}
