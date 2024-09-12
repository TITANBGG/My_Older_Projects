import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //sayi 3 e ve 5 e bölünmeli

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayinizi giriniz: ");

        int n = scanner.nextInt();

        if(n%3==0 && n%5==0) {

            System.out.println("Sayi hem 3 e hem 5 e bölünür. ");

        }else System.out.println("Sayi 3 e ya da 5 e bölünmemekte. ");



    }
}