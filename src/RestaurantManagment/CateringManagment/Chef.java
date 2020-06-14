package RestaurantManagment.CateringManagment;

import RestaurantManagment.StaffManagment.Exception.InvalidDateException;
import RestaurantManagment.StaffManagment.Exception.InvalidIncomeException;
import RestaurantManagment.StaffManagment.Exception.NationalCodeException;

import java.math.BigDecimal;
import java.util.Date;

public class Chef extends RestaurantStaff {

    public Chef(String firstName, String lastName, String nationalCode, BigDecimal income, Date startDate, Date endDate) throws InvalidDateException, InvalidIncomeException, NationalCodeException {
        super(firstName, lastName, nationalCode, income, startDate, endDate);
    }
}
