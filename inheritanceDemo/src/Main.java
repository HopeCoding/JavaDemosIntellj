package inheritanceDemo.src;

public class Main {

    public static void main(String[] args) {

        KrediUİ krediUİ=new KrediUİ();

        krediUİ.KrediHesapla(new TarimKrediManager());
        krediUİ.KrediHesapla(new OgretmenKrediManager());

    }
}
