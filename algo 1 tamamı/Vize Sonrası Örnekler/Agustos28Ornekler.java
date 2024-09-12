/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agustos28ornekler;

import java.util.Random;


public class Agustos28Ornekler {
    
    // Soru 6: Verilen String matrisindeki elemanlardan rakam ile 
    // başlamayanları ekranda gösteriniz.
    /*
    public static void rakamlaBaslamayan(String [][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                String eleman = matris[i][j];
                
                char x = eleman.charAt(0);
                if (!(x >= '0' && x <= '9')){
                    System.out.println(eleman);
                }
            }
        }
    }
    */
    
    // Soru 5: 2 boyutlu string dizisi içindeki herbir 
    // string içinde rakam olmayanları ekrana yazan method 
    // yazınız (20P)
    /*
    public static void rakamVarMi(String [][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                String eleman = matris[i][j];
                
                for (int k = 0; k < eleman.length(); k++) {
                    char x = eleman.charAt(k);
                    if (!(x >= '0' && x <= '9')){
                        System.out.print(x);
                    }
                }
                System.out.println(""); 
            }
        }
    }
    */
    
    /*
    // Soru 4: Matris içerisindeki Stringlerdeki küçük, büyük ve rakam sayısı bulma
    public static int[] buyukKucukBul(String [][] matris) {
        // dizi[0]: Küçük harf sayısı, dizi[1]: büyük harf sayısı
        int dizi [] = new int [3];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                String eleman = matris[i][j];
                for (int k = 0; k < eleman.length(); k++) {
                    char x = eleman.charAt(k);
                    if(x >= 'a' && x <= 'z')
                        dizi[0] ++;
                    else if (x >= 'A' && x <= 'Z')
                        dizi[1] ++;
                    else if (x >= '0' && x <= '9')
                        dizi[2] ++;
                }
                
                
            }
        }
        return dizi;
    }
    */
    public static void main(String[] args) {
        
        // Random ile istenilen aralıkta tam sayı üretme
        int min = 50;
        int max = 100;
        
        // Math sınıfı ile random tamsayı üretme
        int r1 = min + (int)(Math.random() * (max-min+1));
           
        // Random sınıfı ile random tamsayı üretme
        Random r = new Random();
        int r2 = min + r.nextInt(max-min+1); 
        
        
        //Soru 6 main kısmı
        /*
        String [][] matris = {{"0abB","aa","Abb"},{"1cC","abc","Ab9"}};
        rakamlaBaslamayan(matris);
        */
        
        
        //Soru 5 main kısmı
        /*
        String [][] matris = {{"0abB","aa","Abb"},{"1cC","abc","Ab9"}};
        rakamVarMi(matris);
        */
        
        // Soru 4: main kısmı
        /*
        String [][] matris = {{"0abB","aa","Abb"},{"1cC","abc","Ab9"}};
        int dizi [] = buyukKucukBul(matris);
        System.out.println("Küçük harf sayısı: "+dizi[0]);
        System.out.println("Büyük harf sayısı: "+dizi[1]);
        System.out.println("Rakam sayısı: "+dizi[2]);
        */
        
        
        /* Soru 2 main kısmı
        int [][] matris = {{1,2,3}, {4,5,6}, {7,8,9}};
        int dizi [] = enBuyukleriBul(matris);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        */
        
        //Soru 3 main kısmı
        /*
        char [][] matris = {{'a','G','C'},{'B','l','Y'}};
        int dizi [] = buyukKucukBul(matris);
        System.out.println("Küçük harf sayısı: "+dizi[0]);
        System.out.println("Büyük harf sayısı: "+dizi[1]);
        */
    }
    
      // Soru 3:  İki boyutlu 6x5 elemanlı karakter dizisi içerisinde kaç tane küçük harf, kaç tane büyük harf olduğunu geri döndüren metodu yazınız. Not: İki sayısal değer geri dönecektir.
    /*  
        public static int[] buyukKucukBul(char [][] matris) {
        // dizi[0]: Küçük harf sayısı, dizi[1]: büyük harf sayısı
        int dizi [] = new int [2];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j] >= 'a' && matris[i][j] <= 'z')
                    dizi[0] ++;
                else if (matris[i][j] >= 'A' && matris[i][j] <= 'Z')
                    dizi[1] ++;
            }
        }
        return dizi;
    }
    */
    
  
    
    
    
    // Soru 2: matristeki satırların en büyüklerini döndüren fonksiyon
    /*
    public static int [] enBuyukleriBul(int [][] matris){
        int [] dizi = new int [matris.length];
        for (int i = 0; i < matris.length; i++) {
            int eb = matris[i][0];
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j] > eb)
                    eb = matris[i][j];
            }
            dizi[i] = eb;
        }
        return dizi;
    }
    */
    
    /* Soru: Ekran çıktısı
    public static int looping( int x, int y) {     
    int answer = 0; 
    for( int s = 0; ++s < x; ) 
       for( int z = 0; ++z < y; ){
            if(z++ < y || s++ < x)  
                 answer++;
            //System.out.println(s+" "+z+" "+answer);
       }
    return answer;
     }
    */
}
