/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.hitung.rumus;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ProgramHitungRumus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persegi rumus1 = new Persegi("Biru");
        PersegiPanjang rumus2 = new PersegiPanjang("Merah");
        Segitiga rumus3 = new Segitiga("Kuning");
        Trapesium rumus4 = new Trapesium("Hijau");
        
        System.out.println("PROGRAM MENGHITUNG RUMUS BANGUN DATAR DAN RUANG");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. SEGITIGA");
        System.out.println("4. TRAPESIUM");
        System.out.println("5. LINGKARAN");
        System.out.println("6. KUBUS");
        System.out.println("7. BALOK");
        System.out.println("8. KERUCUT");
        
        System.out.print("Tentukan pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.print("Masukkan sisi: ");
            int sisi = input.nextInt();
            rumus1.setSisi(sisi);
            System.out.println("Luas Persegi: " + rumus1.luas());
            System.out.println("Keliling Persegi: " + rumus1.keliling());
        }else if(pilihan == 2){
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();
            rumus2.setPanjang(panjang);
            rumus2.setLebar(lebar);
            System.out.println("Luas Persegi Panjang: " + rumus2.luas());
            System.out.println("Keliling Persegi Panjang: " + rumus2.keliling());
        }else if(pilihan == 3){
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            rumus3.setAlas(alas);
            rumus3.setTinggi(tinggi);
            System.out.println("Luas Segitiga: " + rumus3.luas());
            System.out.println("Keliling Segitiga: " + rumus3.keliling());
        }else if(pilihan == 4){
            System.out.print("Masukkan alas atas: ");
            double alas_a = input.nextDouble();
            System.out.print("Masukkan alas bawah: ");
            double alas_b =  input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            rumus4.setAlas_a(alas_a);
            rumus4.setAlas_b(alas_b);
            rumus4.setTinggi(tinggi);
            System.out.println("Luas Trapesium: " + rumus4.luas());
            System.out.println("Keliling Trapesium: " + rumus4.keliling());
        }
        
       
        
        
        }
    }
    

