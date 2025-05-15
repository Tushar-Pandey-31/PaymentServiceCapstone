package com.scaler.paymentservicejan31capstone.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelectorImpl implements PaymentGatewaySelector
{
    RazorpayGateway razorpayGateway;
    StripeGateway stripeGateway;

    public PaymentGatewaySelectorImpl(RazorpayGateway razorpayGateway, StripeGateway stripeGateway)
    {
        this.razorpayGateway = razorpayGateway;
        this.stripeGateway = stripeGateway;
    }

    @Override
    public PaymentGateway get()
    {
        //logic
        return stripeGateway;
    }
}
