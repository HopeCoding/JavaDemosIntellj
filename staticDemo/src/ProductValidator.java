package staticDemo.src;

public class ProductValidator {

    static {
        System.out.println("Static Yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
        //Yapıcı bloklar new olduğunda çalışıyor.
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else return false;






    }
}
