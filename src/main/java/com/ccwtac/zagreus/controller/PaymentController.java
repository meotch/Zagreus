package com.ccwtac.zagreus.controller;

import com.ccwtac.zagreus.model.Product;
import com.ccwtac.zagreus.service.PaymentService;
import com.ccwtac.zagreus.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @GetMapping(value = { "", "/" })
//    public Iterable<Product> getProducts() {
//        return paymentService.getAllProducts();
//    }
}