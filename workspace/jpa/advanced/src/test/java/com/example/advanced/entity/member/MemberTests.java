package com.example.advanced.entity.member;


import com.example.advanced.repository.member.MemberDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class MemberTests {
    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void save(){
        File file = new File();
        Member member = new Member();
        MemberAddress memberAddress = new MemberAddress();


        member.setMemberId("오르미");
        member.setMemberEmail("qwert1234@naver.com");
        member.setMemberPassword("qwert1234");
        memberAddress.setMemberAddress("경기도 하남시");
        memberAddress.setMemberAddressDetail("미사");
        memberAddress.setMemberPostcode("400");
        member.setMemberAddress(memberAddress);
        file.setFileName("123");
        file.setFilePath("2023/04/19");
        file.setFileSize(1024L);
        file.setFileUuid("123123123");
    }

    public void findById(){

    }


}
