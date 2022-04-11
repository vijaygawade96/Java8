package OOP;

import java.util.Date;

public class OOPDemo {
    public static void main(String[] args) {
        Address myAddress=new Address("H2O Bar", "phase01", "411007", "Pimpari", "Maharashtra", "Behind Persistent", AddressType.Home);
        Employee e1=new Employee(10001, "Vijay R. Gawade", new Date(), myAddress, myAddress);
        System.out.println("E1= "+e1);
    }
}
