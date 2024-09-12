import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("R Direnç girin: ");
        double R =scanner.nextDouble();

        System.out.println("I akımı girin: ");

        double I = scanner.nextDouble();

        double V = 0;

        V = R*I;

        System.out.println("Voltaj değeri " + V + "Volt'tur");






        }
   }
