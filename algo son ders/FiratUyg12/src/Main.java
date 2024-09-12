public class Main {
    public static void main(String[] args) {
        //      Kendisine parametre olarak gelen pozitif tam sayıya karşılık gelen fibonacci sayisini hesaplayan kodu yaziniz.
        //      Önemli
        //      1   1    2   3  5  8  13  21

        int a = 1, b = 1, c = 1, n = 6;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
