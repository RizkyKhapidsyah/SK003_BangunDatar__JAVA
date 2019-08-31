package com.rizkykhapidsyah.javafundamental.bangundatar;

public class Lingkaran implements BangunDatar {

    private double pi = 3.1415;

    Lingkaran() {

    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    //Methode Overload
    public double luas(int r) {
        return (pi * r * r);
    }

    //Methode Overload
    public double keliling(int r) {
        return (2 * pi * r);
    }
}
