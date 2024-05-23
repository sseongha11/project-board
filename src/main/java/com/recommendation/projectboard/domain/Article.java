package com.recommendation.projectboard.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id; // Article ID
    private String title; // Article title
    private String content; // Article content
    private String hashtag; // Article hashtag

    private LocalDateTime createdAt; // Article creation date
    private String createdBy; // Article creator
    private LocalDateTime modifiedAt; // Article update date
    private String modifiedBy; // Article updater

}
