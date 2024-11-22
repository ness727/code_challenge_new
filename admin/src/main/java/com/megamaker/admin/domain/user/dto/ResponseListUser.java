package com.megamaker.admin.domain.user.dto;

import com.megamaker.admin.domain.user.Role;
import com.megamaker.admin.securityconfig.Provider;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ResponseListUser {
    private Long id;

    private Provider provider;

    private String providerId;

    private String providerNickname;

    private String nickname;

    private Integer solveCount;

    private Integer score;

    private Role role;
}