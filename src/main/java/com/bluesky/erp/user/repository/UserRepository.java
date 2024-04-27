package com.bluesky.erp.user.repository;

import com.bluesky.erp.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByNickname(String nickname);
}
