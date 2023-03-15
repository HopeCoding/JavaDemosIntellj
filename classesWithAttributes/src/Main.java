package classesWithAttributes.src;

public class Main {

    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","ASUS TUF GAMİNG",5000,3,"SİYAH");

        /*
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus TUF GAMİNG");

        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("SİYAH"); */


        ProductManager productManager=new ProductManager();
        productManager.Add(product);


        System.out.println(product.getKod());


    }
}
