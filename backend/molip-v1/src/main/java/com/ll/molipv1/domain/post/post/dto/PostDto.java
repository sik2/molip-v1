package com.ll.molipv1.domain.post.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Long id;
    private String subject;
    private String body;
    private String authorName;

    public PostDto(Long id, String subject, String body, String authorName) {
        this.id = id;
        this.subject = subject;
        this.body = body;
        this.authorName = authorName;
    }
}
