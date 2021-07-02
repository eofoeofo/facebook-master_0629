package com.koreait.facebook.feed.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class FeedDomain2 extends FeedEntity {
    private String writer;
    private String mainProfile;
    private int favCnt;
    private int isFav;
    private List<FeedImgEntity> imgList;
    private FeedCmtDomain cmt; // 댓글을 여러개 보여줄꺼였으면 List로 처리
}
