package loopDemo.src;

import com.sun.source.tree.WhileLoopTree;

public class Main {

    public static void main(String[] args) {
        //For
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("For Döngü bitmiştir\n");

        //While
        int eda = 22;
        while (eda < 24) {
            System.out.println("EDA UMUTU ÇOK SEVİYOR");
            eda++;
            System.out.println("EDA UMUTU ASLA BIRAKMIYCAK");
            eda++;
        }
        System.out.println("While Döngüsü bitmiştir");
        //Do-While
        int eda2= 22;
        do {
            System.out.println("EDA UMUTU ÇOK SEVİYOR");
            eda2++;
            System.out.println("EDA UMUTU ASLA BIRAKMIYCAK");
            eda2++;
        } while (eda2 < 24);

        System.out.println("Do-While Döngüsü bitmiştir");


    }
}
