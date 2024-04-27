package com.bluesky.erp.user.service;

import com.bluesky.erp.common.exception.AlreadyExistsException;
import com.bluesky.erp.user.domain.User;
import com.bluesky.erp.user.repository.UserRepository;
import com.bluesky.erp.user.service.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(UserRegistrationDto userRegistrationDto) {
        boolean usernameExists = userRepository.existsByUsername(userRegistrationDto.username());
        if (usernameExists) {
            throw new AlreadyExistsException("아이디");
        }

        boolean nicknameExists = userRepository.existsByNickname(userRegistrationDto.nickname());
        if (nicknameExists) {
            throw new AlreadyExistsException("닉네임");
        }

        String encodedPassword = passwordEncoder.encode(userRegistrationDto.password());
        User user = User.from(userRegistrationDto.username(), encodedPassword, userRegistrationDto.nickname());
        userRepository.save(user);
    }
}
