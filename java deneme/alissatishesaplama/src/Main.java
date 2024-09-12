import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Alış fiyatımızı kullanıcıdan alacağız.
        System.out.println("Alış fiyatınızı Giriniz: ");

        double alisfiyati = scanner.nextDouble();

        System.out.println("Ülkenizin Vergi oranını giriniz: ");

        double vergi = scanner.nextDouble();
        System.out.println("Kar yüzdeliğinizi Giriniz: örnek 0.018 ");

        double Kar = scanner.nextDouble();

            double  oran=0;
        oran = alisfiyati*vergi;

        alisfiyati=alisfiyati+oran;


        System.out.println("alış fiyatına vergi eklemiş hali : " + alisfiyati);

        double oran1=0;
        oran1 = alisfiyati*Kar;

        alisfiyati=alisfiyati+oran1;

        System.out.println("Kar oranıyla ve vergiyle beraber son satış fiyat : " + alisfiyati);












    }
}