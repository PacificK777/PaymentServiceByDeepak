package com.payment.paymentservice_deepak.paymentgateway;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.param.PaymentLinkCreateParams;
import org.springframework.beans.factory.annotation.Value;

public class StripePaymentGateway implements PaymentGateway{
    @Value("${STRIPE_KEY-SECRET}")
    private String StripeKey;

    @Override
    public String generatePaymentLink(String orderid, Long amount, String phoneNo, String email) throws StripeException {

        Stripe.apiKey = StripeKey;

        PaymentLinkCreateParams params =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice("price_1MoC3TLkdIwHu7ixcIbKelAC")
                                        .setQuantity(1L)
                                        .build()
                        )
                        .build();

        PaymentLink paymentLink = PaymentLink.create(params);

        return "";
    }
}
