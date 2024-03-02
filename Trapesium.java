/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.hitung.rumus;

/**
 *
 * @author ACER
 */
public class Trapesium extends Rumus{
    private double alas_a;
    private double alas_b;
    private double tinggi;
    
    public Trapesium(String color){
        super(color);
    }

    public double getAlas_a() {
        return alas_a;
    }

    public void setAlas_a(double alas_a) {
        this.alas_a = alas_a;
    }

    public double getAlas_b() {
        return alas_b;
    }

    public void setAlas_b(double alas_b) {
        this.alas_b = alas_b;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double luas(){
        return ((alas_a + alas_b) * tinggi) / 2;
    }
    
    public double keliling(){
        double sisi_3 = Math.pow(alas_a, 2) + Math.pow(alas_b, 2);
        return alas_a + alas_b + Math.sqrt(sisi_3) + Math.sqrt(sisi_3);
    }
    
}
