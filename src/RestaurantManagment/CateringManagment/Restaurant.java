package RestaurantManagment.CateringManagment;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Menu> menus = new ArrayList<>();
    private String title;
    private String address;
    private String telephoneNumber;
    private List<RestaurantStaff> restaurantStaffs = new ArrayList<>();

    public Restaurant(List<Menu> menus, String title, String address, String telephoneNumber) {
        this.menus = menus;
        this.title = title;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public List<RestaurantStaff> getRestaurantStaffs() {
        return restaurantStaffs;
    }
}
