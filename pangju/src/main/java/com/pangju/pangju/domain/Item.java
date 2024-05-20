package com.pangju.pangju.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
    private String mainCategory;
    private String subCategory;
    private String status;
    private String content;
    private String description;
    private String image;
    private int heartCount;
    private int chatCount;

    public Item(String mainCategory, String subCategory, String status, String content, String description, String image, int heartCount, int chatCount) {
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
