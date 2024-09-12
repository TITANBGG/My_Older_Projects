import java.util.PrimitiveIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Bir Fahrenayt Degeri girin Sayi Giriniz: ");

                double sayi = scanner.nextDouble();

                sayi= sayi - 32 ;
                sayi = sayi*0.5555;


        System.out.println("Cantigrad Değeriniz: " +sayi);


    }
}