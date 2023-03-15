package interfaces.src;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new SqlICustomerDal());


        customerManager.add();


    }
}
