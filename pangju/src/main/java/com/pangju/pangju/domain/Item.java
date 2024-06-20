package com.pangju.pangju.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
    private int id;
    private String mainCategory;
    private String subCategory;
    private String status; // 상태 (찾는 중, 찾기 완료)
    private String content; // 제목
    private String description; // 내용
    private String image;
    private int heartCount;
    private int chatCount;

    public Item(int id, String mainCategory, String subCategory, String status, String content, String description, String image, int heartCount, int chatCount) {
        this.id = id;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.status = status;
        this.content = content;
        this.description = description;
        this.image = image;
        this.heartCount = heartCount;
        this.chatCount = chatCount;
    }
}
