import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen Sicaklik değerini cantigrat değerinde giriniz. ");

        double n = scanner.nextDouble();

        if(n<0){
            System.out.println("Madde Katıdır.");
        } else if (0<n && n<100) {
            System.out.println("Madde sıvıdır");

        }else System.out.println("Madde gazdır ");


    }
}