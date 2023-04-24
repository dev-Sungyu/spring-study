package com.example.test.entity;


import com.example.test.entity.member.Challenge;
import com.example.test.entity.member.Member;
import com.example.test.repository.member.MemberDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
@Slf4j
public class MemberTests {
    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void saveTest(){
        Member member = new Member();
        Challenge challenge = new Challenge();

        member.setName("이순철");
        member.setEmail("qwert123@naver.com");
        member.setPassword("qwert123!");
        member.setPhoneNumber("010-1234-1234");
        member.setStatus("1");

        challenge.setChallengeTitle("챌린지 제목1");
        challenge.setChallengeContent("챌린지 내용1");
        challenge.setChallengeStatus("1");

    }

    @Test
    public void findByIdTest(){
        memberDAO.findById(1L).map(Member::toString).ifPresent(log::info);
    }

    @Test
    public void findAllTest(){
        memberDAO.findAll().stream().map(Member::toString).forEach(log::info);
    }

    @Test
    public void deleteTest(){
        memberDAO.findById(1L).ifPresent(memberDAO::delete);
    }




}
