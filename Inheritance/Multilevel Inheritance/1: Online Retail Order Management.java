import java.time.LocalDate;

// Base class
class Order {
    String orderId;
    LocalDate orderDate;

    Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main class
public class OnlineRetailSystem {
    public static void main(String[] args) {
        Order o1 = new Order("ORD101", LocalDate.of(2025, 9, 1));
        ShippedOrder o2 = new ShippedOrder("ORD102", LocalDate.of(2025, 9, 5), "TRK9999");
        DeliveredOrder o3 = new DeliveredOrder("ORD103", LocalDate.of(2025, 9, 7), "TRK5555", LocalDate.of(2025, 9, 10));

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

