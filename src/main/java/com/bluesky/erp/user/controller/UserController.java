package com.bluesky.erp.user.controller;

import com.bluesky.erp.common.api.response.Response;
import com.bluesky.erp.user.controller.dto.JoinForm;
import com.bluesky.erp.user.service.UserService;
import com.bluesky.erp.user.service.dto.UserRegistrationDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public Response<Void> join(@Valid JoinForm joinForm) {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto(
                joinForm.username(),
                joinForm.password(),
                joinForm.nickname());
        userService.register(userRegistrationDto);
        return Response.success();
    }
}
