package com.koreait.facebook.user.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Data

public class UserEntity {
    private int iuser;
    private String email;
    private String pw;
    private String nm;
    private String tel;
    private String authCd;
    private String mainProfile;
    private String regdt;
}
