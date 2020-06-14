package RestaurantManagment.CateringManagment;

import RestaurantManagment.StaffManagment.Exception.InvalidDateException;
import RestaurantManagment.StaffManagment.Exception.InvalidIncomeException;
import RestaurantManagment.StaffManagment.Exception.NationalCodeException;
import RestaurantManagment.StaffManagment.Staff;

import java.math.BigDecimal;
import java.util.Date;

public abstract class RestaurantStaff extends Staff {
    public RestaurantStaff(String firstName, String lastName, String nationalCode, BigDecimal income, Date startDate, Date endDate) throws InvalidDateException, InvalidIncomeException, NationalCodeException {
        super(firstName, lastName, nationalCode, income, startDate, endDate);
    }
}
