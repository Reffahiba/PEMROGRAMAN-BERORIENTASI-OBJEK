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
public class PersegiPanjang extends Rumus{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(String color) {
        super(color);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return 2 * (panjang+lebar);
    }
    
}
