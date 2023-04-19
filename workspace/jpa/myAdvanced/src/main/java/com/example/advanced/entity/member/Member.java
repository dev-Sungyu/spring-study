package com.example.advanced.entity.member;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter @ToString
@Table(name = "TBL_MEMBER")
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String memberId;
    private String memberPassword;
    private String memberEmail;
    private String memberAddress;
    private String memberAddressDetail;
    private String memberPostcode;
}
