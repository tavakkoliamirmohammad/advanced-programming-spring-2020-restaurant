package RestaurantManagment.StaffManagment;

import RestaurantManagment.StaffManagment.Exception.NationalCodeException;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String nationalCode;


    public Person(String firstName, String lastName, String nationalCode) throws NationalCodeException {
        this.firstName = firstName;
        this.lastName = lastName;
        setNationalCode(nationalCode);
    }

    public void setNationalCode(String nationalCode) throws NationalCodeException {
        if (!nationalCodeValidation(nationalCode)) {
            throw new NationalCodeException();
        }
        this.nationalCode = nationalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private boolean nationalCodeValidation(String nationalCode) {
        return nationalCode.length() == 10;
    }
}
