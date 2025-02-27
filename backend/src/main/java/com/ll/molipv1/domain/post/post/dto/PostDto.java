package com.ll.molipv1.domain.post.post.dto;

import com.ll.molipv1.domain.post.post.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Long id;
    private String subject;
    private String body;
    private String authorName;

    public PostDto(Post post) {
        this.id = post.getId();
        this.subject = post.getSubject();
        this.body = post.getBody();
        this.authorName = post.getMember().getNickname();
    }
}
