package PhaseOne;

import PhaseOne.PaymentServices.OnSiteOrderService;
import PhaseOne.PaymentServices.OnlineOrderService;
import PhaseOne.PaymentServices.OrderService;
import PhaseOne.PaymentServices.PhoneOrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = null;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }
        }
        //Step2 : Select Payment Method
        System.out.println("Select Your Payment Method:");
        System.out.println("1 for online");
        System.out.println("2 for on-site");
        System.out.println("3 for phone order");

        customerAnswerForPaymentMethod = scanner.nextInt();
        String orderType;
        switch (customerAnswerForPaymentMethod) {
            case 1:
                orderType = "online";
                break;
            case 2:
                orderType = "onsite";
                break;
            case 3:
                orderType = "phone";
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method: " + customerAnswerForPaymentMethod);
        }

        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(orderType);
        orderService.orderRegister(customerName);
        //Step3 : pay price
        System.out.println("Pay Price:");
        orderService.orderPayment(order.getTotalPrice());
        //Finally Print Bill
        System.out.println(order);
    }
}
