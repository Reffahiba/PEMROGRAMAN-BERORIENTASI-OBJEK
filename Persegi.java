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
public class Persegi extends Rumus{
    private int sisi;

    public Persegi(String color) {
        super(color);
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        return sisi*sisi;
    }
    
    @Override
    public double keliling(){
        return 4*sisi;
    }
    
    
    
}
