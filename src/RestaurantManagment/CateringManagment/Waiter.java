package RestaurantManagment.CateringManagment;

import RestaurantManagment.StaffManagment.Exception.InvalidDateException;
import RestaurantManagment.StaffManagment.Exception.InvalidIncomeException;
import RestaurantManagment.StaffManagment.Exception.NationalCodeException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter extends RestaurantStaff {
    private List<RestaurantOrder> restaurantOrders = new ArrayList<>();

    public Waiter(String firstName, String lastName, String nationalCode, BigDecimal income, Date startDate, Date endDate) throws InvalidDateException, InvalidIncomeException, NationalCodeException {
        super(firstName, lastName, nationalCode, income, startDate, endDate);
    }
}
