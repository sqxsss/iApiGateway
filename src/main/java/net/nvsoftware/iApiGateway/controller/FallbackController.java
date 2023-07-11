package net.nvsoftware.iApiGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/orderServiceFallback")
    public String orderServiceFallback(){
        return "OrderService down";
    }

    @GetMapping("/productServiceFallback")
    public String productServiceFallback(){
        return "ProductService down";
    }

    @GetMapping("/paymentServiceFallback")
    public String paymentServiceFallback(){
        return "PaymentService down";
    }
}
