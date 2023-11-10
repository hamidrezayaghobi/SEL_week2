package PaymentServices;

public class PaymentMethodFactory {
    public PaymentMethod createPaymentMethod(String orderType) {
        if ("online".equalsIgnoreCase(orderType)) {
            return new OnlineOrderService();
        } else if ("onsite".equalsIgnoreCase(orderType)) {
            return new OnSiteOrderService();
        } else if ("phone".equalsIgnoreCase(orderType)) {
            return new PhoneOrderService();
        } else {
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}