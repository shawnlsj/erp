package com.bluesky.erp.user.service;

import com.bluesky.erp.user.service.dto.UserRegistrationDto;

public interface UserService {
    void register(UserRegistrationDto userRegistrationDto);
}
