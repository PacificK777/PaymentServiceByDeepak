package com.payment.paymentservice_deepak.services;

import com.payment.paymentservice_deepak.paymentgateway.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway =paymentGateway;
    }
    public String initiatePayment(String orderid, Long amount, String phoneNo, String email) throws RazorpayException {

//        Order order = orderService.getOrderDetails(orderid);
//        int amount = order.getAmount();
//        String productName = order.getProductName();
        // long amount = 293741L; //2937.41
        // long amount = 3242L; //32.42

            //Generate the payment link
        return paymentGateway.generatePaymentLink(orderid, amount, phoneNo, email);
    }
}
