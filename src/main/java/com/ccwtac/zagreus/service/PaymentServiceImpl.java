package com.ccwtac.zagreus.service;

import com.ccwtac.zagreus.model.Payment;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public Payment createSquarePayment(Payment payment) {
        try {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                        URI.create("https://connect.squareup.com/v2/payments"))
                .header("accept", "application/json")
                .header("Square-Version", "2023-03-15")
                .header("Authorization", "Bearer ACCESS_TOKEN")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<Class<Payment>> response = null;
            response = client.send(request, new JsonBodyHandler<>(Payment.class));
            System.out.println(response.body().get().title);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
