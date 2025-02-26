package com.ll.molipv1.domain.post.post.controller;

import com.ll.molipv1.domain.post.post.entity.Post;
import com.ll.molipv1.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class ApiV1PostController {
    private final PostService postService;

    @GetMapping
    public List<Post> list() {
        List<Post> postList = postService.findAll();
        return postList;
    }
}
