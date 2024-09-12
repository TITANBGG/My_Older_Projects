public class Main {
    public static void main(String[] args) {
        // Kendisine parametre olarak gelen stringin palindrome olup olmadığını hesaplayınız.
        String kelime = "abbcbba";
        boolean palindrome = true;

        // Her iki uçtan karakterleri karşılaştırıyoruz.
        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - 1 - i)) {
                palindrome = false;
                break; // döngüde bozan durum varsa direk çıkış yapıyor yoksa kontrol etmeye devam ederdi.
            }
        }

        if (palindrome)
            System.out.println("Palindrom");
        else
            System.out.println("Palindrom degil");
    }
}
