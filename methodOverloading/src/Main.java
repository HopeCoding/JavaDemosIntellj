package methodOverloading.src;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        DortIslem hesapla=new DortIslem();

        System.out.println("Toplamak istediğiniz 3 sayı giriniz:");

        int s1=reader.nextInt();
        int s2=reader.nextInt();
        int s3=reader.nextInt();


        System.out.println(hesapla.topla(4,5));
        System.out.println(hesapla.topla(s1,s2,s3));


    }
}
