package methods.src;

public class Main {

    public static void main(String[] args) {
        sayiBulma();

    }

    public static void sayiBulma(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;

        boolean var = false;

        for (int s : sayilar) {
            if (s == aranacak) var = true;

        }

        if (var) System.out.println(aranacak+" sayısı,sayıların içinde vardır.");
        else System.out.println(aranacak+"sayısı,sayıların arasında yoktur.");
    }
}
