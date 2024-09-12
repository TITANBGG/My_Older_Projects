import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //cocuk sayisina göre maaş ekleme

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Çocuk Sayinizi Giriniz:");

        int n = scanner.nextInt();

        double maas= 100;

        if(n==1){
          maas= maas*1.05;
            System.out.println("Yeni miktarıyla maaşınız : " + maas);
        } else if (n==2) {
            maas= maas*1.10;
            System.out.println("Yeni miktarıyla maaşınız : " + maas);
        } else if (n>3 || n==3) {
            maas= maas*1.15;
            System.out.println("Yeni miktarıyla maaşınız : " + maas);

        }else System.out.println("Maaş Eklentisi yoktur" );


    }
}