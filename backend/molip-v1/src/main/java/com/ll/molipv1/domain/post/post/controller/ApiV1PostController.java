package com.ll.molipv1.domain.post.post.controller;

import com.ll.molipv1.domain.post.post.dto.PostDto;
import com.ll.molipv1.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class ApiV1PostController {
    private final PostService postService;

    @GetMapping
    public List<PostDto> list() {
        List<PostDto> postDtoList = postService.findAll().stream()
                .map(post -> new PostDto(post.getId(), post.getSubject(), post.getBody(), post.getMember().getNickname()))
                .collect(Collectors.toList());
        return postDtoList;
    }
}
