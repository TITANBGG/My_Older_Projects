/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizesonrasi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VizeSonrasi {

    
    public static void main(String[] args) {
        
        /*
        int matris [][] = {{-4,-2,-3},{5,6,7},{17,10,11}};
        int [] ebDizisi = new int [matris.length];
        
        for (int i = 0; i < matris.length; i++) {
            ebDizisi[i] = matris[i][0];
            for (int j = 0; j < matris[0].length; j++) {
                if(matris[i][j] > ebDizisi[i])
                    ebDizisi[i] = matris[i][j];
            }
        }
        
        for (int i = 0; i < ebDizisi.length; i++) {
            System.out.println(ebDizisi[i]);
        }
        */
        
        /*
        int matris [][] = {{1,2,3},{5,6,7},{17,10,11}};
        int toplam =0;
        for (int i = 0; i < matris.length; i++) {
           toplam += matris[i][i];
           toplam += matris[i][matris.length-1-i];
        }
        System.out.println(toplam);
        */
        /*
        int matris [][] = {{1,2,3},{5,6,7},{9,10,11}};
        int toplam =0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                if(i==j)
                  toplam += matris[i][j];  
            }
        }
        System.out.println(toplam);
        */
        /* 
        int matris [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int sonucMatris [][] = 
                new int[matris[0].length][matris.length];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                sonucMatris[j][i] = matris[i][j];
            }
        }
        
        for (int i = 0; i < sonucMatris.length; i++) {
            for (int j = 0; j < sonucMatris[0].length; j++) {
                System.out.print(sonucMatris[i][j]+"\t");
            }
            System.out.println("");
        }
        */
        
        /*
        int matris1 [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int matris2 [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int sonucMatris [][] = 
                new int[matris1.length][matris1[0].length];
        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                sonucMatris[i][j] = matris1[i][j] + matris2[i][j];
                System.out.print(sonucMatris[i][j]+"\t");
            }
            System.out.println("");
        }
        */


//Scanner klavye = new Scanner(System.in);
        
        /*
        int matris [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        //int dizi []= {1,2,3,4,5};
 
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                int r1 = (int)(Math.random()*(matris.length));
                int r2 = (int)(Math.random()*(matris[0].length));

                int temp = matris[i][j];
                matris[i][j] = matris[r1][r2];
                matris[r1][r2] = temp;
            }
            
            
        }
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        
        */
        /*
        //Satır toplamı
        int matris [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int toplam = 0;
        for (int j = 0; j < matris.length; j++) {
            toplam = 0;
            for (int i = 0; i < matris[j].length; i++) {
                toplam += matris[j][i];
            }
            System.out.println(toplam);
        }
       
        
        
        int dizi[]= new int[3];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }
    */
    }
    
}
