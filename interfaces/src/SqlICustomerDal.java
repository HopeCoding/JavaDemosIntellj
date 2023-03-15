package interfaces.src;

public class SqlICustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Sql Eklendi");
    }
}
