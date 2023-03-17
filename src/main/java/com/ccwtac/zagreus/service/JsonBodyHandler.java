package com.ccwtac.zagreus.service;

import java.net.http.HttpResponse;

public class JsonBodyHandler<T> implements HttpResponse.BodyHandler<T> {
    public JsonBodyHandler(T paymentClass) {

    }

    @Override
    public HttpResponse.BodySubscriber<T> apply(HttpResponse.ResponseInfo responseInfo) {
        return null;
    }
}
