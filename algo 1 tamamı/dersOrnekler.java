
package javaapplication35;

import java.util.Scanner;

public class JavaApplication35 {

  
    

    public static void main(String[] args) {
        /*
	// Soru: Dizide sondan başlayarak dizi[i] += dizi[i-1] şeklinde diziyi yeniden oluşturunuz. (ilk elemana dokunulmayacaktır)
		int dizi[] = {3, 5 , 2, 11, 28};
        
        for (int i = dizi.length-1; i > 0; i--) {
            dizi[i] = dizi[i] + dizi[i-1];
        }
        
        // Yazdırma işlemi
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
		*/
        
        /*
		// Soru: Verilen dizinin sıralı olup olmadığını bulan kodu yazınız.
        int dizi[] = {3, 5 , 2, 11, 28};
        boolean siraliMi = true;
        for (int i = 1; i < dizi.length; i++) {
            if(!(dizi[i] > dizi[i-1])) {
                siraliMi = false;
                break;
            }
        }
        System.out.println(siraliMi);
        */
		
        /*
		// Soru: Bir dizideki en büyük tek sayıyı bulan kodu yazınız.
        int [] dizi = {96,6,9,11,4,7,28};
        int ebTek = Integer.MIN_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>ebTek && dizi[i]%2==1)
                ebTek = dizi[i];
        }
        System.out.println(ebTek);
        */
		
		
        /*
		// Soru: --- Toplam-Çarpım sembolleri ile verilen ifade ---
        double toplam, carpim;
        toplam = 0;
        for (int k = 1; k <= 3; k++) {
            carpim = 1;
            for (int m = 1; m <= 4; m++) {
                double a = (Math.pow(m,k)/(m+1))+5;  
                carpim = carpim * a;
            }
            toplam = toplam + carpim;
        }
        System.out.println(toplam);
        */
		
		
        /*
		// Soru: --- Toplam-Çarpım sembolleri ile verilen ifade ---
        int carpim = 1, toplam;
        int distoplam =0;
        for (int i = 1; i <= 2; i++) {
            carpim = 1;
            for (int j = 1; j <= 3; j++) {     
                toplam = 0;
                for (int k = 1; k <= 4; k++) {
                    toplam = toplam + (i+j+k);
                }
                carpim = carpim * toplam;
            }
            distoplam += carpim;
        }
        */
		
		
        /*
		// Bir top 2 metre yükseklikten bırakılıyor. Her sıçramada bir öncekinin 0.8'i kadar yükseliyor. 3. kez yere değmesi ile toplam alınan mesafeyi hesaplayan kodu yazınız.
        double terim = 2;
        int N = 3;
        double toplam = terim;
        for (int i = 0; i < N-1; i++) {
            terim = terim * 0.8;
            toplam += terim * 2;
        }
        
        System.out.println(toplam);
        */
		
		
        /* Klavyeden girilen 10 adet x,y koordinatları için, (0,0) noktasına en uzak x,y ikilisini bulan kodu yazınız.
        Scanner in = new Scanner(System.in);
        double max = 0;
        int maxX, maxY;
        
        for (int i = 0; i < 10; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            double uzaklik = Math.sqrt(x*x + y*y);
            if(uzaklik > max) {
                max = uzaklik;
                maxX = x;
                maxY = y;
            }
        }
        */
        
        /*
		// Soru: String içerisinde yer alan küçük harf ve büyük harf sayısını hesaplayınız. Küçük harfleri yeni bir stringe ekleyiniz.
        String cumle = "AbbACDEaaebcdF"; 
        String yeni = "";
        int buyukHarf=0, kucukHarf = 0;
        for (int i = 0; i < cumle.length(); i++) {
            char k = cumle.charAt(i);
            if(k >= 'A' && k<='Z')
                buyukHarf ++;
            else if ( k >= 'a' && k<='z') { 
                kucukHarf ++;
                yeni += k;
            }
        }
        System.out.println(buyukHarf + ", " + kucukHarf);
        */
        
        /*
		// Soru: Sayının asal olup olmadığını, asal değilse en küçük hangi sayıya bölündüğünü bulan kodu yazınız.
        int bolen=0;
        int sayi = 267; 
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) {
                bolen = i;
                break;
            }
        }
        if(bolen == 0 )
            System.out.println("Asal");
        else
            System.out.println("Asal Değil çünkü " + bolen + " ile tam bölünüyor");
        */
        
		
		
        /*
        // Soru: 2, 4, 8, 10, 14, 16, 20, 22… ifadesinin ilk 10 teriminin toplamını hesaplayan kodu yazınız.
        int terim = 2, toplam=0;
        for (int i = 0; i < 10; i++) {
            toplam += terim;
            if(i%2 == 0)
                terim = terim + 2;
            else
                terim = terim + 4;
        }
        System.out.println(toplam);
        */
        
        
        /*
		// Soru: Klavyeden girilen iki String ifadede aynı indiste yer alan aynı harfleri yeni bir String'e atayan kodu yazınız.
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String yeni = "";
        
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i))
                yeni += str1.charAt(i);
        }
        System.out.println(yeni);
        */
        
        
        /*
		// Klavyeden girilen 30 sayı içerisinde en büyük, en küçüğünü bulan ve sayıların ortalamasını hesaplayan Java kodunu yazınız.
        Scanner in = new Scanner(System.in);
        int sayi, toplam = 0;
        int eb = Integer.MIN_VALUE, ek = Integer.MAX_VALUE;
        for (int i = 0; i < 30; i++) {
            sayi = in.nextInt();
            toplam += sayi;
            if(sayi < ek)
                ek = sayi;
            if(sayi > eb)
                eb = sayi;
        }
        System.out.println(eb+" "+ek+" "+ (double)toplam/30);
        */
        
        /*
		// Soru: Verilen integer sayının palindrom olup olmadığını bulan Java kodunu yazınız.
        int sayi = 646, basamak, yeniSayi = 0;
        int temp = sayi;
        while(temp > 0) {
            basamak = temp % 10;
            temp = temp / 10;
            yeniSayi = yeniSayi * 10 + basamak;
        }
        if(sayi == yeniSayi)
            System.out.println("Palindrom");
        else   
            System.out.println("Palindrom değil");
       */
	   
        /*
		//Soru: Kelimenin palindrom olup olmadığını bulan Java kodunu yazınız.
        String kelime = "abbcbbac";
        boolean palindrome = true;
        int i = 0;
        while ( i < kelime.length()/2) {
            if(kelime.charAt(i) != kelime.charAt(kelime.length()-1-i)) {
                palindrome = false;
                break;
            }
            i++;
        }
        if(palindrome) 
            System.out.println("Palindrom");
        else 
            System.out.println("Palindrom değil");
        */
        
            
        /*
		// Soru: Fİbonacci serisinde f(1)=1, f(2)=1, olup diğer terimler iki önceki terimin toplamı ile belirlenmektedir (f(n) = f(n-1)+f(n-2)). n değeri için fibonacci serisinin değerini hesaplatan Java kodunu yazınız. 
        int a=1, b=1, c=1, n=1;
        for(int i=0; i<n-2; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
        */
		
        
        /* 
		//	Soru: Bir String dizisi verilmektedir. Verilenen String dizisi içerisinde aranan karakter varsa ekranda yazdıran kodu yazınız.
        String [] dizi = {"bbb", "qwrt", "aaa","cab", "bac"};
        char aranan = 'a';
        
        for (int i=0; i<dizi.length; i++) {
            String ifade = dizi[i];
            for (int j = 0; j < ifade.length(); j++) {
				if(aranan == ifade.charAt(j)) {
					System.out.println(ifade);
					break;
				}
            }
        }
        */
        
        /*
		// Soru: ikili arama algoritmasının kodunu yazınız.
        int dizi [] = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        
        int aranan = 59;
        int low=0, mid, high=dizi.length-1;
        int indis = -1;
        while(high >= low) {
            mid = (low + high)/2;
            if(aranan == dizi[mid]) {
                indis = mid;
                break;
            }else if (aranan > dizi[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(indis > -1) 
            System.out.println("Aranan eleman " + indis + ". indiste");
        else 
            System.out.println("Aranan eleman bulunamadı");
        */
        
        /*
        // Soru: Takım isimleri ve puanları ayrı dizilerde tutulmaktadır. Puanları büyükten küçüğe olacak şekilde takım isimleri ve puanlar dizisini sıralayınız. Sıralı diziyi yazdırarak hangi takımın kaç puanı olduğunu gösterniz.
		String [] takimlar = {"GS","FB","BJK","TS"};
		int [] puanlar = {3,4,5,6};
        for (int i = 0; i < puanlar.length; i++) {
            int ebi = i;
            for (int j = i+1; j < puanlar.length; j++) {
                if(puanlar[j]>puanlar[ebi]) {
                    ebi = j;
                }
            }
            int gecici = puanlar[i]; 
            puanlar[i] = puanlar[ebi];
            puanlar[ebi] = gecici;
            
            String geciciTakim = takimlar[i];
            takimlar[i] = takimlar[ebi];
            takimlar[ebi] = geciciTakim;
        }
        for (int i = 0; i < puanlar.length; i++) {
            System.out.println(takimlar[i]+" - "+puanlar[i]);
            
        }
        */
        /*
		// Soru: Takımlar dizisinde bir ligdeki takımlar yer almaktadır. Ev sahibi-deplasman şeklinde her takım arasında 2'şer maç yapılmaktadır. Oynanacak maçları ekranda yazdırınız.
        String [] takimlar = {"GS","FB","BJK","TS"};
        for (int i = 0; i < takimlar.length; i++) {
            String takim = takimlar[i];
            for (int j = 0; j < takimlar.length; j++) {
                if(i!=j)
                    System.out.println(takim + " - " + takimlar[j]);
            }
        }
        */
        
        /* 
		//Soru: İki takımın skorları iki ayrı dizide verilmektedir. Her maç için skorlara göre Takım 1 kazandı, Takım 2 kazandı veya berabere kaldı şeklinde ekran çıktıları verecek Java kodunu yazınız.
		int [] skorlar1 = {3,1,0,2,4};
        int [] skorlar2 = {2,1,3,1,5};
        for (int i = 0; i < skorlar1.length; i++) {
            if(skorlar1[i] > skorlar2[i]) 
                System.out.printl("Takım 1 Kazandı");
            else if(skorlar1[i] == skorlar2[i])
                System.out.printl("Berabere bitti");
            else
                System.out.printl("Takım 2 Kazandı");
        }
        System.out.println(takim1 + " " + takim2 + " " + berabere);
		*/
		
		/*
		//Soru: İki takımın skorları iki ayrı dizide verilmektedir. Takım 1'in kazandığı, Takım 2'nin kazandığı ve berabere biten maç sayılarını hesaplatıp konsolda gösteriniz.
        int [] skorlar1 = {3,1,0,2,4};
        int [] skorlar2 = {2,1,3,1,5};
        int takim1 = 0, takim2 = 0, berabere = 0;
        for (int i = 0; i < skorlar1.length; i++) {
            if(skorlar1[i] > skorlar2[i]) 
                takim1 ++;
            else if(skorlar1[i] == skorlar2[i])
                berabere ++;
            else
                takim2 ++;
        }
        System.out.println(takim1 + " " + takim2 + " " + berabere);
        */
}
    
}
