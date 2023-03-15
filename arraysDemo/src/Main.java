package arraysDemo.src;

public class Main {

    public static void main(String[] args) {
        String[] ogrler=new String[3];

        ogrler[0]="Eray";
        ogrler[1]="Umut";
        ogrler[2]="Deniz";


        /*for(int i=0;i< ogrler.length;i++){
            System.out.println(ogrler[i]);
        }* Öğrencileri yazdırır ama daha kısa yoluda var.
        */

        for(String ogr:ogrler){
            System.out.println(ogr);
        }


    }
}
