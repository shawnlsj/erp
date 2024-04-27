package com.bluesky.erp.common.exception;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String resourceName) {
        super("이미 사용 중인 " + resourceName + "입니다.");
    }
}
