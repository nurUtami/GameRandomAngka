package com.blogspot.utami96.app12141428;
public class Random {
    
    // deklarasi variabel
    String nama;
    int level = 1;
    int kesempatan = 5;
    int tebak;
    int banyak=0;
    int random, score=0, totScore;
    char jawab;
    
    //method setter
     public void setNama(String nama) { 
        this.nama = nama;
    }

    public void setTebak(short tebak) {
        this.tebak = tebak;
    }
    public void acak(){
        random=(int)(Math.random() * level * 100);
        
    }
    
    //metod getter
    public int Level(){
        return level * 100;
    }
    
    public int kesempatan(){
        kesempatan = 5;
        return kesempatan;
    }
   
    
    //method utk menyeleksi hasil tebakan
    public void hasilTebakan() {
      kesempatan--; // nilai kesempatan akan berkurang
      banyak++; // nilai banyak bertambah
      
        System.out.println("Tebakan anda : " + tebak);
        if (tebak<random){
            System.out.print("Tebakan Anda telalu kecil!");
        }
        if (tebak>random){
            System.out.print("Tebakan Anda telalu besar!");
        }
        if (tebak==random) {
            System.out.print("Selamat Anda berhasil menebak sebanyak " + banyak + " kali tebakan");
        }
        
        if (kesempatan>=1){
            System.out.println("Anda mempunyai kesempatan " + kesempatan + " kali lagi.");
            
        }if(kesempatan ==0){
            System.out.println("\n Game Over!");
            System.out.println("Angka yang benar adalah : "+random);
            System.exit(0);}
            
    }
    
    //method utk menghitung score
    public void Score() {
        if (banyak == 1){
            score= 100*level;
        }
        if (banyak == 2){
            score= 70*level;
        }
        if (banyak == 3){
            score= 50*level;
        }
        if (banyak == 4){
            score= 30*level;
        }
        System.out.println(nama + "\t\t: " + score);  
    }
    
    public void totScore(){
    totScore = totScore+score;
        System.out.println("Score Total \t: "+totScore);
    }
}
