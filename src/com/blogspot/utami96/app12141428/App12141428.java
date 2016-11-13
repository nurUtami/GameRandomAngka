package com.blogspot.utami96.app12141428;

import java.util.Scanner;//impor scanner

//class main
public class App12141428 {
    public static void main(String[] args) {
        
        
        Random hitung = new Random(); // instance of class
        
        // deklarasikan scanner
        Scanner inputString = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        
        System.out.println("Masukkan nama Anda untuk memulai atau tekan 'T' utuk keluar.");
        hitung.nama=inputString.nextLine();

        if (!"T".equals(hitung.nama))
        {   
            do{ // proses utk mengerjakan ketika ingin melakukan melanjutkan level
                hitung.acak(); // pemanggilan utk proses rendom
                System.out.println("\n ############################");
                System.out.println("## Level "+hitung.level);
                System.out.println("Selamat Datang "+hitung.nama);
                System.out.println("Silakan tebak angka 0 - "+hitung.Level());
                System.out.println("Anda mempunyai kesempatan menebak " + hitung.kesempatan() + " kali");
                
                 do{ // melakukan perulangan jika jawaban tidak tepat dan kesempatan >0
                    System.out.println();   
                    System.out.print("=> Masukkan tebakan : "); 
                    hitung.tebak = inputAngka.nextShort();
                    hitung.hasilTebakan();
                 }while(hitung.tebak!=hitung.random&&hitung.kesempatan>0);
                System.out.println("\n=>> Hasil Score <<=");
                
                hitung.Score(); // pemanggilan utk menampilkan score
                hitung.totScore(); // pemanggilan utk menampilkan score total
                System.out.println("##############################");
                System.out.println("Apakah anda ingin melanjutkan ke level berikutnya ? (y/t)");
                hitung.jawab=inputString.nextLine().charAt(0);
                
                // jika jawaban = y, maka akan masuk ke level berikutnya
                if(hitung.jawab=='y')
                    hitung.banyak=0;
                    hitung.level++; 
            }while(hitung.jawab=='y');
        
        }

    }
    
    
}
