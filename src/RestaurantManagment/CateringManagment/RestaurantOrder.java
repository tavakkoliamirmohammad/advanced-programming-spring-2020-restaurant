package RestaurantManagment.CateringManagment;

import RestaurantManagment.OrderManagment.Order;

public class RestaurantOrder extends Order {
    private OrderType orderType;
    private Table table;

    public RestaurantOrder(int orderNumber, Table table, OrderType orderType) {
        super(orderNumber);
        this.table = table;
        this.orderType = orderType;
    }
}
