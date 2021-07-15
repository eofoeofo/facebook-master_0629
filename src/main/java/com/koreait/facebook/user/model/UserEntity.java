package com.koreait.facebook.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // 빌더패턴 필요한 생성자만 만들어 줌
@NoArgsConstructor // 기본 생성자만드는거
@AllArgsConstructor

public class UserEntity {
    private int iuser;
    private String provider;
    private String email;
    private String pw;
    private String nm;
    private String tel;
    private String authCd;
    private String mainProfile;
    private String regdt;
}
