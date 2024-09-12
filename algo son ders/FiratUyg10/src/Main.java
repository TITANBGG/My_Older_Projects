public class Main {
    public static void main(String[] args) {
        String[] dizi = {"bbb", "abate", "aaa", "cab", "bac"};
        char[] arananlar = {'a', 'b', 'c', 'd', 'e'};
        char aranan;

        for (int i = 0; i < dizi.length; i++) {
            String ifade = dizi[i];
            aranan = arananlar[i];
            for (int j = 0; j < ifade.length(); j++) {
                if (aranan == ifade.charAt(j)) {
                    System.out.println(ifade);
                    break;
                }
            }
        }
    }
}