package RestaurantManagment.CateringManagment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private String title;
    private Date startTime;
    private Date endTime;
    private MenuType menuType;
    private List<Food> foods = new ArrayList<>();

    public Menu(String title, Date startTime, Date endTime, MenuType menuType) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.menuType = menuType;
    }

    public String getTitle() {
        return title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public List<Food> getFoods() {
        return foods;
    }
}
