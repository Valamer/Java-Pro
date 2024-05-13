package coffee.order;

import java.util.LinkedList;

public class CoffeeOrderBoard {
    LinkedList<Order> Orders = new LinkedList();

    public void add (String orderer){
        if (Orders.isEmpty()){
            Orders.add(new Order(0,orderer));
        } else {
        Orders.add(new Order(Orders.getLast().getId() + 1, orderer));
        }
    }
    public Order deliver () {
        return Orders.pollFirst();
    }
    public Order deliver (int orderId) {
        for (Order order : Orders) {
            if (order.getId() == orderId) {
                Orders.remove(order);
                return order;
            }
        }
        return null;
    }
    public void draw (){
        System.out.println("Orders at board:");
        Orders.forEach((order) -> System.out.println(order.getId() + " | " + order.getName()));
    }
}
