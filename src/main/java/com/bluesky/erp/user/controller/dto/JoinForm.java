package com.bluesky.erp.user.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record JoinForm(

        @NotBlank
        String username,

        @NotBlank
        String password,

        @NotBlank
        String nickname
) {}
