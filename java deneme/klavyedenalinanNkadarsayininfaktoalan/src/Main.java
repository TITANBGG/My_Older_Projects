import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //klavyeden girilen n sayini faktöryelini alan program

        Scanner input = new Scanner(System.in);

        System.out.println("Sayininizi giriniz ");

        int N = input.nextInt();
        int carpim=1;
        for(int i =1; i<=N; i++){

        carpim=carpim*i;

        }System.out.println(carpim);

        }
    }
