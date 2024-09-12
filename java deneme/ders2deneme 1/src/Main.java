import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    //kullanıcı tarafında girilen 10 sayıyı toplayan uygulama
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Sayilari giriniz: ");


            int a=0;
            for (int i=0; i<10 ; i++){
                int sayi = scanner.nextInt();
                a=a+sayi;
                System.out.println("Son sayınız : " + a);


            }
*/

        //en büyük ortak bölen bulma
/*
        Scanner sc = new Scanner(System.in);
            System.out.println("Sayi girin : ");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();

        int Enbuyukbolen=1;  int k=2;

        while(k<=sayi1 && k<=sayi2){

            if(sayi1%k==0 && sayi2%k==0){

                Enbuyukbolen= k;
                k++;
            }
            System.out.println("sayi "+Enbuyukbolen);
        }
*/
      /*  //ekrana 0 girilene kadar sayıları toplayan program

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Sayilari yazın: ");
        int sayi1= sc.nextInt();
        int toplam=0;
        while(sayi1 != 0 ){

            toplam = toplam + sayi1;
            System.out.println("toplam sayi : "+toplam);
           sayi1 = sc.nextInt();
        }
*/

           // for(int i=0; i <10 ; i++){
            //        System.out.println("BMU111");
            //}
        /*    int sayac = 0;

            while(sayac<10){

                System.out.println("bmu 111 -- " + sayac);

            sayac++;}
*/

/*
        for (int i = 32; i < 256; i++) {
            char c = (char) i;
            System.out.println(c);
        }*/
       /* Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();
int toplam=0;
        for(int i =0; i<=sayi1; i++){
        toplam = toplam+i;
            System.out.println("sayi " + toplam);
        }*/
// 0 - 100 arasındaki tek ve çift sayıalrın toplamı
     //Scanner sc = new Scanner(System.in);
   //  System.out.println("Sayilerinizi giriniz : ");

     //int sayi1 = sc.nextInt();
    /* int sayac=0; int toplamtek =0; int toplamcift=0;
     while (sayac <= 100) {
            toplamcift = toplamcift+sayac;
        }else{
            toplamtek = toplamtek+sayac;
        }
      sayac++;
     }
     System.out.println("Sayılar tek " + toplamtek + " toplam cift " + toplamcift);
    */
    // 0 - 1000 arasındaki tek ve çiftleri ekrana yazdıran

       /* int sayac = 0;

        while (sayac < 1000) {

            if(sayac%2==0){
                System.out.println("çitf " + sayac);

            }else{
                System.out.println("tek" + sayac);
            }
        sayac++;
        }*/


/*
        int x = 1, y = 1;
        for (int z = 1; z <= 5; z++) {
            if ((++x > 3) && (++y > 2)) {
                x++;
                y += 5;
                --y;
            }
            System.out.println(x + " " + y);
        }*/
/*
        int sayac =0;
        int sayi =2;
        //int sayac;
        for(int i =0; i<10 ; i++){

            sayi = sayi*2;
            sayac++;
        }
        int ortalama=0;

        ortalama= sayi / sayac;

/*
        System.out.println(ortalama);*/
// 1000 ila 2000 arasında girilen sayının basamaklarının toplamının ortalaması
   /*         Scanner scan = new Scanner(System.in);
            System.out.println("Sayi gir: ");
            int sayi = scan.nextInt();
            int deger1=(sayi/1000)%10;
            int deger2=(sayi/100)%10;
            int deger3=(sayi/10)%10;
            int deger4=sayi%10;

            double toplam;
            toplam = deger1 + deger2 + deger3 + deger4;
            double cikti;
            cikti = toplam/4;

            System.out.println(cikti);



int sayi =2;
double toplam =2;
double ortalama=0;

for(int i=0; i < 10; i++){

    sayi = sayi *2;
    toplam = toplam + sayi;
System.out.println(toplam);


}
ortalama = toplam/10;
System.out.println(ortalama);


        int carpim1, toplam1=0, carpim2 = 1, toplam2;
        for (int n = 1; n <= 3; n++) {
            carpim1 = 1;
            for (int m = 1; m <= 4; m++) {
                carpim1 *= (n+m);
            }
            toplam1 += carpim1;
        }
        for (int n = 1; n <= 4; n++) {
            toplam2 = 0;
            for (int m = 1; m <= 3; m++) {
                toplam2 += (m*n);
            }
            carpim2 *= toplam2;
        }
        System.out.println(toplam1+carpim2);
*/





    }


    }


