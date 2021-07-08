package com.koreait.facebook.user.model;

import lombok.Data;

@Data
public class UserDomain extends UserEntity {
    private int cntFeed; // 피드 카운트
    private int cntFollower; // 팔로워 카운트
    private int cntFollow; // 팔로우 카운트
    private int isYouFollowMe; // 상대방이 나를 팔로우
    private int isMeFollowYou; // 내가 상대방을 팔로우
}
