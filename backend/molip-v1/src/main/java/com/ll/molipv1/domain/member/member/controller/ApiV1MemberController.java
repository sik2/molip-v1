package com.ll.molipv1.domain.member.member.controller;

import com.ll.molipv1.domain.member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiV1MemberController {
    private final MemberService memberService;
}
