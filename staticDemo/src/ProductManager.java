package staticDemo.src;

public class ProductManager {
    public void add(Product product){
        //ProductValidator validator=new ProductValidator(); bunun yerine isValidi static tanımlayıp çağırırız.
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else System.out.println("Ürün bilgileri geçersizdir.");

    }
}
