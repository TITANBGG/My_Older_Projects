import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir Sayi Bulunuz: ");

        double sayi= scanner.nextDouble();

        if(sayi<0 && sayi!=0){

            System.out.println("Sayi Negatiftir.");
        } else if (sayi>0 && sayi!=0) {
            System.out.println("sayi Pozitiftir.");

        }else System.out.println("Sayi 0 dır.");

    }
}