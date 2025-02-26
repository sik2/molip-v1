package com.ll.molipv1.domain.post.post.controller;

import com.ll.molipv1.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiV1PostController {
    private final PostService postService;
}
