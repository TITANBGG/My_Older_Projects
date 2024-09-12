import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz.");
        double ucret = scanner.nextDouble();

        double kdv= 0.18;
        double fiyat = kdv*ucret;

        System.out.println("ödeyeceğiniz kdv ücreti " + fiyat  +"TL' dir");
          double odenen=0;

          odenen = ucret - fiyat;



        System.out.println("Vergisiz Ödeyeceğiniz Ücret " + odenen + "TL' dir" );

        }
    }
