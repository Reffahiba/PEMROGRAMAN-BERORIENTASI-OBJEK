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
public class Segitiga extends Rumus{
    private double alas;
    private double tinggi;

    public Segitiga(String color) {
        super(color);
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double luas(){
        return (alas*tinggi) / 2;
    }
    
    public double keliling(){
        double sisi_3 = Math.pow(alas, 2) + Math.pow(tinggi, 2);
        return alas + tinggi + Math.sqrt(sisi_3);
    }
}
