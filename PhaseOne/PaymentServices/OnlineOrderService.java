package PhaseOne.PaymentServices;

public class OnlineOrderService implements OrderService {
    @Override
    public void onSiteOrderRegister(String customerName) {
        // Not Implemented
    }

    @Override
    public void onlineOrderRegister(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
        // Not Implemented
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void phoneOrderRegister(String customerName) {
        // Not Implemented
    }

    @Override
    public void phoneOrderPayment(int foodPrice) {
        // Not Implemented
    }

}