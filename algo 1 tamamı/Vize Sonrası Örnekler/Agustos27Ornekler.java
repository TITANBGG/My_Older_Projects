/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agustos27ornekler;

/**
 *
 * @author Lenovo
 */
public class Agustos27Ornekler {
    /*
    static int ustAl (int m, int n) {
        int us=1;
        for (int i = 0; i < n; i++) {
            us *= m;
        }
        return us;
    }
    
    static int faktoriyel(int m) {
        int f = 1;
        for (int i = 1; i <= m; i++) {
            f *= i;
        }
        return f;
    }
    */



   
    public static void main(String[] args) {

        /*
        double carpim = 1; double toplam = 0;
        for (int m = 1; m <= 3; m++) {
            carpim = 1;
            for (int n = 1; n <= 2; n++) {
                carpim *= ((double)ustAl(m, n)/faktoriyel(m));
            }
            toplam += carpim;
        }
        System.out.println(toplam);
        */
        
       /* int dizi [] = {3,6,1,9,7}; 
        int eb = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(eb < dizi[i])
                eb = dizi[i];
        }
        System.out.println(eb);
        
        
    
    int enbuyuk(int [] dizi) {
        int eb = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(eb < dizi[i])
                eb = dizi[i];
        }
        return eb;
    }
    */
        /*
        int y = 1;
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = 0;
            x += i;
        }
        System.out.println(x);
        
        
        
        
        
        int a = 5;
        
        System.out.println(carpi2(5));
        
        carpi2(a);
        System.out.println(a);
        
        
        System.out.println(a + " " + b);
        */
        /*
        // Dizide ortanca elemanı bulan kodu yazınız
        int [] dizi = {1,3,11,2,12}; //15,5,13,11
        int temp=0;
        
        // Sıralama alternatif 1: Selection sort 
        int ebi=0; // 12, 11, 1, 3, 2
        for (int i = 0; i < dizi.length; i++) {
            int eb = dizi[i];
            ebi = i;
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j] > eb) {
                    eb = dizi[j]; 
                    ebi = j;
                }
            }
            temp = dizi[i];
            dizi[i] = dizi[ebi];
            dizi[ebi] = temp;
        }
        // int [] dizi = {15,5,13,12,12};
        int sonuc;
        int ortancaIndis = dizi.length/2;
        if(dizi.length % 2 == 1) 
            sonuc = dizi[ortancaIndis];
        else {
            sonuc = (dizi[ortancaIndis] + dizi[ortancaIndis-1])/2;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]+" ");
        }
        
        System.out.println(sonuc);
        */    
        
        /* Sıralama alternatif 2: buble sort ile sıralama 
        for (int j = 0; j < dizi.length; j++) {
            for (int i = 0; i < dizi.length - 1; i++) {
                if(dizi[i]>dizi[i+1]) {
                    temp = dizi[i];
                    dizi[i] = dizi[i+1];
                    dizi[i+1] = temp;
                }
            } 
        }
        */
 
        
        
        /*
        //Dizideki elemanların toplamı toplam değişkenini
        //veren iki indisi bulunuz
        int [] dizi = {1,3,7,11};
        int toplam = 14;
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[i]+dizi[j] == toplam)
                    System.out.println(i+" "+j);
            }
        }
        */
        
        /*
        // Bir matris içerisinde dizide aranan tüm elemanlar
        // bulunuyorsa true, bulunmuyorsa false yazdırın
        int [][] matris = {{1,2,3},{4,5,6},{7,8,9}};
        int [] arananlar = {4,5,6,12}; int aranan;
        boolean bulundu; int sayac = 0;
        for (int k = 0; k < arananlar.length; k++) {
            aranan = arananlar[k];
            bulundu = false; int bulunanI=0; int bulunanJ=0;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if(matris[i][j] == aranan) {
                        bulundu = true;
                        bulunanI = i; bulunanJ = j;
                    }
                }
            }
            if(bulundu) {
                sayac ++;
            }
        }
        
        if(sayac == arananlar.length)
            System.out.println("Tüm elemanlar mevcut");
        else
            System.out.println("Bazı elemanlar eksik");
        */
        
        
        /*
        // Bir matris içerisinde dizide aranan herhangi bir elemanın
        // bulunuyorsa hangi indiste bulunduğunu bulan kodu yazınız.
        int [][] matris = {{1,2,3},{4,5,6},{7,8,9}};
        // 1 2 3
        // 4 5 6
        // 7 8 9 
        int [] arananlar = {4,5,6,12}; int aranan;
        boolean bulundu;
        for (int k = 0; k < arananlar.length; k++) {
            aranan = arananlar[k];
            bulundu = false; int bulunanI=0; int bulunanJ=0;
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    if(matris[i][j] == aranan) {
                        bulundu = true;
                        bulunanI = i; bulunanJ = j;
                    }
                }
            }
            if(bulundu)
                System.out.println(aranan + " " + bulunanI + " " 
                        + bulunanJ + " var");
            else
                System.out.println(aranan + " yok");
        }
*/
    }    
}
