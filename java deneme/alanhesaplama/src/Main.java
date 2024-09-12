import javax.swing.text.TabableView;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin yükseklik uzunluğunu giriniz ");

        int kenar = scanner.nextInt();

        System.out.println("Taban Uzunluğunu Giriniz ");

        int taban  = scanner.nextInt();

        int deger=0;

        deger = kenar*taban;
        deger = deger/2;

        System.out.println("değeriniz: " + deger);



    }
}