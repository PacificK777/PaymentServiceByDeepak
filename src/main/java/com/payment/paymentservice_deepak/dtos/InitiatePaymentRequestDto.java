package com.payment.paymentservice_deepak.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private String orderId;
    private Long amount;
    private String phoneNo;
    private String email;
}
