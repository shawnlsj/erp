package com.bluesky.erp.user.service.dto;

public record UserRegistrationDto (
        String username,
        String password,
        String nickname
){}
