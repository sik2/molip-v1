package com.ll.molipv1.domain.post.post.entity;

import com.ll.molipv1.domain.member.member.entity.Member;
import com.ll.molipv1.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
@ToString(callSuper = true)
public class Post extends BaseEntity {
    private String subject;
    private String body;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}