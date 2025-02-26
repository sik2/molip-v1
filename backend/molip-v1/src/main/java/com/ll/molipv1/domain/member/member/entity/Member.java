package com.ll.molipv1.domain.member.member.entity;

import com.ll.molipv1.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
@ToString(callSuper = true)
public class Member extends BaseEntity {
    private String nickname;
    private String email;
    private String password;
}
