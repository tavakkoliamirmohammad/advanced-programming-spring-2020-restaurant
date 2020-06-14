package RestaurantManagment.OrderManagment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Order {
    private Date orderTime;
    private int orderNumber;
    private List<OrderDescription> orderDescriptions = new ArrayList<>();

    public Order(int orderNumber) {
        this.orderTime = new Date();
        this.orderNumber = orderNumber;
    }

    public Order(Date orderTime, int orderNumber) {
        this.orderTime = orderTime;
        this.orderNumber = orderNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<OrderDescription> getOrderDescriptions() {
        return orderDescriptions;
    }
}
