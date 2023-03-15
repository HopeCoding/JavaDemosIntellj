package methods2.src;

public class Main {

    public static void main(String[] args) {
        int sayi=topla(15,7);
        int toplam = topla2(2, 5, 6, 7, 10);
        System.out.println(sayi);

        System.out.println(toplam);

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int total = 0;
        for (int s : sayilar) {
            total = s + total;
        }
        return total;
    }
}
