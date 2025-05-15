package com.scaler.paymentservicejan31capstone.services;

import org.springframework.stereotype.Service;

@Service
public class RazorpayGateway implements PaymentGateway
{
    @Override
    public String generatePaymentLink() {
        return "";
    }
}
