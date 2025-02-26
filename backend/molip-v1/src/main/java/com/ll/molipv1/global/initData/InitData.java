package com.ll.molipv1.global.initData;

import com.ll.molipv1.domain.member.member.entity.Member;
import com.ll.molipv1.domain.member.member.service.MemberService;
import com.ll.molipv1.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

@Profile("!prod")
@Configuration
@RequiredArgsConstructor
@Slf4j
public class InitData {
    @Autowired
    @Lazy
    private InitData self;
    private final PostService postService;
    private final MemberService memberService;

    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            if (postService.count() > 0) return;
            if (memberService.count() > 0) return;
            self.work1();
//            self.work2();
        };
    }


    @Transactional
    public void work1() {
        Member member1 = memberService.join("user1", "1234", "user1");
        Member member2 = memberService.join("user2", "1234", "user2");
        Member member3 = memberService.join("user3", "1234", "user3");

        postService.write(member1,"subject1", "body1");
        postService.write(member2,"subject2", "body2");
        postService.write(member3,"subject3", "body3");
    }

    @Transactional
    public void work2() {

    }
}