package RestaurantManagment.CateringManagment;

import RestaurantManagment.StaffManagment.Exception.NationalCodeException;
import RestaurantManagment.StaffManagment.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private boolean isVIP;
    private List<RestaurantOrder> restaurantOrders = new ArrayList<>();

    public Customer(String firstName, String lastName, String nationalCode) throws NationalCodeException {
        super(firstName, lastName, nationalCode);
        this.isVIP = false;
    }

    public Customer(String firstName, String lastName, String nationalCode, boolean isVIP) throws NationalCodeException {
        super(firstName, lastName, nationalCode);
        this.isVIP = isVIP;
    }
}
