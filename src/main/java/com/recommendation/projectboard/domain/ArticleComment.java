package com.recommendation.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id; // Article ID
    private Article article; // Article
    private String content; // Article comment content

    private LocalDateTime createdAt; // Article creation date
    private String createdBy; // Article creator
    private LocalDateTime modifiedAt; // Article update date
    private String modifiedBy; // Article updater
}
