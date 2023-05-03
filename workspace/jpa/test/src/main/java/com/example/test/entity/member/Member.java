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
@Table(name = "TBL_MEMBER")
public class Member extends Period {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @Column(unique = true)
    @NotNull
    private String phoneNumber;
    @NotNull
    private String name;
    private String status;
}
