package com.example.task03;

public class Complex {
    private double re;
    private double im;

    Complex() {
        this.re = 0;
        this.im = 0;
    }

    Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public Complex add(Complex b) {
        double real = this.re + b.re;
        double imaginary = this.im + b.im;
        return new Complex(real, imaginary);
    }

    public Complex mult(Complex b) {
        double real = this.re * b.re - this.im * b.im;
        double imaginary = this.re * b.im + b.re * this.im;
        return new Complex(real, imaginary);
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

}