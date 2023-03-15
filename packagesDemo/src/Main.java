package packagesDemo.src;//import matematik.DortIslem;
//import matematik.Logaritma;
import matematik.*; //Hepsini getirir.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);

        System.out.println("Adınız:");

        String isim= data.nextLine();

        System.out.println("Merhaba "+isim);


        DortIslem dortIslem=new DortIslem();

        System.out.println(dortIslem.topla(2,3));
        Logaritma logaritma=new Logaritma();




    }
}
