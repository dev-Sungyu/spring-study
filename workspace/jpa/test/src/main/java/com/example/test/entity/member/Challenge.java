package com.example.test.entity.member;


import com.example.test.audit.Period;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "TBL_CHALLENGE")
public class Challenge extends Period {
    @Id
    @GeneratedValue
    private Long challengeId;
    @NotNull
    private String challengeTitle;
    @NotNull
    private String challengeContent;
    private String challengeStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;


}
