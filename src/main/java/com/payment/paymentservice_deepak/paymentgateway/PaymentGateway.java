package com.payment.paymentservice_deepak.paymentgateway;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(String orderid, Long amount, String phoneNo, String email) throws RazorpayException, StripeException;
}
