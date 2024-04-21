package com.bluesky.erp.common.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Response<T>(String message, T response) {

    private static final String SUCCESS_MESSAGE = "success";

    public static <T> Response<T> success() {
        return success(null);
    }

    public static <T> Response<T> success(T response) {
        return new Response<>(SUCCESS_MESSAGE, response);
    }

    public static <T> Response<T> failure(String message) {
        return failure(message, null);
    }

    public static <T> Response<T> failure(String message, T response) {
        return new Response<>(message, response);
    }
}
