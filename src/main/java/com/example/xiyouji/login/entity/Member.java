package com.example.xiyouji.login.entity;

import com.example.xiyouji.result_rank_comment.entity.BaseTime;
import com.example.xiyouji.result_rank_comment.entity.Comment;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nickName;

    @Builder
    public Member(String nickName) {
        this.nickName = nickName;
    }

}
