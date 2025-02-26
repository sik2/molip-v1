package com.ll.molipv1.domain.post.post.service;


import com.ll.molipv1.domain.member.member.entity.Member;
import com.ll.molipv1.domain.post.post.entity.Post;
import com.ll.molipv1.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;
    private final ApplicationEventPublisher publisher;

    @Transactional
    public Post write(Member member, String subject, String body) {
        Post post = Post.builder()
                        .member(member)
                        .subject(subject)
                        .body(body)
                        .build();

        postRepository.save(post);

        return post;
    }

    public long count() {
        return postRepository.count();
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }
}