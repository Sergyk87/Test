package Task3;

public class OrderProcessor {
    private DeliveryService deliveryService;

    public OrderProcessor(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void processOrder(Order order) {
// Логика обработки заказа...
        deliveryService.scheduleDelivery(order);
    }
}
