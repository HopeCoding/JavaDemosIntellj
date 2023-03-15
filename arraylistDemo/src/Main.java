package arraylistDemo.src;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList();


        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size()); Boyutunu söyler
        //System.out.println(sayilar.get(2)); 2.indexi getirir.
        //sayilar.set(0,100); 0.indexi 100 yap
        //sayilar.remove(0); // 0.indexi direk uçur yani 1.index 0 olur.
        //sayilar.clear();
        //System.out.println(sayilar.get(0));

        for(Object i:sayilar){
            System.out.println(i);

        }


    }
}
