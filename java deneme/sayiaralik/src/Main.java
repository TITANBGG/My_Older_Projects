import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen Sayinizi Giriniz " );

        int n = scanner.nextInt();

        if(n<100 && 1<n){

            System.out.println("Sayiniz 1 ile 100 arasındadır. ");

        }else System.out.println("Sayiniz 100 ve 1 arasında değil ");

    }
}