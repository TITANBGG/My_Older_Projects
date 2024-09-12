public class Main {
    public static void main(String[] args) {
        int sayi = 636, basamak, yeniSayi = 0;
        int temp = sayi;

        while (temp > 0) {
            basamak = temp % 10;
            temp /= 10;
            yeniSayi = yeniSayi * 10 + basamak;
        }

        if (sayi == yeniSayi) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom degil");
        }
    }
}