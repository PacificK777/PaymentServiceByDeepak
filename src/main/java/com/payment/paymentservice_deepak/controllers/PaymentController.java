package com.payment.paymentservice_deepak.controllers;

import com.payment.paymentservice_deepak.dtos.InitiatePaymentRequestDto;
import com.payment.paymentservice_deepak.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
 @RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping("/")
    public String intiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException {
        return paymentService.initiatePayment(requestDto.getOrderId(),
                requestDto.getAmount(),
                requestDto.getPhoneNo(),
                requestDto.getEmail());
    }
}
