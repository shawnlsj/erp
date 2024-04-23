package com.bluesky.erp.user.domain;

import com.bluesky.erp.common.auditing.BaseTimeAndModifierEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class User extends BaseTimeAndModifierEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
     
    private String password;

    private String nickname;

    public static User from(String username, String password, String nickname) {
        User user = new User();
        user.username = username;
        user.password = password;
        user.nickname = nickname;
        return user;
    }
}
