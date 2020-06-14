package RestaurantManagment.StaffManagment;

import RestaurantManagment.StaffManagment.Exception.InvalidDateException;
import RestaurantManagment.StaffManagment.Exception.InvalidIncomeException;
import RestaurantManagment.StaffManagment.Exception.NationalCodeException;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Staff extends Person {
    private BigDecimal income;
    private Date startDate;
    private Date endDate;

    public Staff(String firstName, String lastName, String nationalCode, BigDecimal income, Date startDate, Date endDate) throws InvalidDateException, InvalidIncomeException, NationalCodeException {
        super(firstName, lastName, nationalCode);
        this.income = income;
        this.startDate = startDate;
        this.endDate = endDate;
        if (!dateValidation()) {
            throw new InvalidDateException("start date is invalid");
        }
        if (!incomeValidation()) {
            throw new InvalidIncomeException();
        }
    }

    private boolean dateValidation() {
        return endDate.after(startDate);
    }

    private boolean incomeValidation() {
        return income.signum() >= 0;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isEmployed() {
        return endDate.after(new Date());
    }
}
